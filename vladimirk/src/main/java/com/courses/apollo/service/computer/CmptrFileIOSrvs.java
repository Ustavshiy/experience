package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to save and load Computer object to/from file.
 */
public class CmptrFileIOSrvs {
    /**
     * Method to read(load) Computer object from given file.
     */
    public List<Computer> loadObjectsFromFile(String sourseFilePath) {
        List<Computer> computers = new ArrayList<>();
        try (FileInputStream flInptStrm = new FileInputStream(new File(sourseFilePath))) {
            while (true) {
                ObjectInputStream objtInptStream = new ObjectInputStream(flInptStrm);
                computers.add((Computer) objtInptStream.readObject());
            }
        } catch (IOException | ClassNotFoundException excp) {
            excp.printStackTrace();
        }
        return computers;
    }

    /**
     * Method to write(save) Computer object to file.
     */
    public void saveComputer(Computer computer, String pathToSaveFile) {
        try (FileOutputStream flOutptStream = new FileOutputStream(new File(pathToSaveFile))) {
            ObjectOutputStream objctOutptStrm = new ObjectOutputStream(flOutptStream);
            objctOutptStrm.writeObject(computer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}