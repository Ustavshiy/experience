package com.courses.apollo.io;

import com.courses.apollo.model.AutoCloseableExample;
import com.courses.apollo.model.Student;
import org.junit.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by User on 10.04.2017.
 */
public class FileTest {

    public static final Integer STUDENT_PATRONYMIC_NAME = 3;

    @Test
    public void testFile() throws Exception {
        //System.out.println(System.getProperty("user.dir"));
        File folder = new File("src\\main\\resources\\temp.txt");
        folder.createNewFile();
    }

    @Test
    public void simpleTry() {
        try (AutoCloseableExample example = new AutoCloseableExample()) {

        }
    }

    @Test
    public void testOutputStreamFinally() {
        File file = new File("src\\main\\resources\\testTwo.txt");
        byte[] text = "How to download and save a file from Internet using Java?\n".getBytes(UTF_8);
        try (OutputStream stream = new FileOutputStream(file);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(stream);
             AutoCloseableExample example = new AutoCloseableExample()) {
            for (int i = 0; i < 100; i++) {
                bufferedOutputStream.write(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void testOutputStream() {
        File file = new File("src\\main\\resources\\test.txt");
        byte[] text = "How to download and save a file from Internet using Java?\n".getBytes(UTF_8);
        OutputStream stream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            stream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(stream);
            for (int i = 0; i < 1000000; i++) {
                if (i == 100) {
                    throw new IllegalArgumentException();
                }
                bufferedOutputStream.write(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void testInputStream() {
        List<Student> students = new ArrayList<>();
        File file = new File("src\\main\\resources\\temp.txt");
        try {
            InputStream stream = new FileInputStream(file);
            int result;
            int newLine = '\n';
            List<Character> characters = new ArrayList<>();
            while ((result = stream.read()) != -1) {
                char toAdd = (char) result;
                if (newLine != result) {
                    characters.add(toAdd);
                } else {
                    characters.remove(characters.size());
                    System.out.println(characters.toString());
                    characters.clear();
                }
                //System.out.println((char) result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readerTest() {
        List<Student> students = new ArrayList<>();
        File file = new File("src\\main\\resources\\temp.txt");
        try {
            Reader reader = Files.newBufferedReader(file.toPath());
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] pool = line.split(":");
                Student student = new Student();
                student.setStudentId(Integer.valueOf(pool[0]));
                student.setName(pool[1]);
                student.setSecondName(pool[2]);
                student.setPatronymicName(pool[STUDENT_PATRONYMIC_NAME]);
                students.add(student);
            }
            System.out.println(students);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testReadFromUrl() {
        try {
            URL url = new URL("http://storage.mp3.cc/download/57136103/Q3BiSWV6cmtUV2RHSHRUb0tFQ202Q3JYQThrY3VteEQ4bW5MV3pWMzlLUDc2T2lDOUhlSkxwcy9oMVNxNkZwZlVkb3VjUVpGREFXSmM1KzZDSDVkYTJwUWtacFd1dWc1bGgzblRKMnZaZEVoTzhqWWdFZnJRQi85OTlJT0hkWmI/alekseev-okeanami-stali_(mp3.cc).mp3");
            FileOutputStream outputStream = new FileOutputStream("wish.mp3");
            InputStream stream = url.openConnection().getInputStream();
            int res;
            while ((res = stream.read()) != -1) {
                outputStream.write(res);
            }
            outputStream.flush();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFIleTest() {
        File file = new File("src\\main\\resources\\write.txt");
        try {
            Writer writer = Files.newBufferedWriter(file.toPath(), UTF_8);;
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testJava8AndNio2() throws Exception {
        Files.readAllLines(Paths.get(new File("src\\main\\resources\\write.txt").toURI()))
                .forEach(System.out::println);
    }

    @Test
    public void randomAccessFile() throws Exception {
        File file = new File("src\\main\\resources\\write.txt");
        RandomAccessFile accessFile = new RandomAccessFile(file, "rw");
        accessFile.seek(1000);
        accessFile.write("Hello Class!!!!".getBytes(UTF_8));
        accessFile.close();
    }

    @Test
    public void readByteArray() throws Exception {
        File file = new File("src\\main\\resources\\write.txt");
        FileInputStream stream = new FileInputStream(file);
        byte[] bytes = new byte[24];
        List<String> strings = new ArrayList<>();
        int res;
        while ((res = stream.read(bytes)) != -1) {
            strings.add(new String(bytes, UTF_8));
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
