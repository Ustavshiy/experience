package com.courses.apollo.service.io;

import com.courses.apollo.model.motorcyclist.Motorcyclist;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Util class.
 */
public class SerializeMotorcyclist {

    /**
     * Method writes object in file.
     *
     * @param motorcyclist object to write.
     * @param file         way to write.
     */
    public void writeMotorcyclist(Motorcyclist motorcyclist, String file) throws IOException {
        String path = file.replaceAll("[\\\\][^\\\\]+$", "");
        if (!new File(path).exists()) {
            new File(path).mkdirs();
        }
        ObjectOutputStream write = null;
        try {
            write = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            write.writeObject(motorcyclist);
        } catch (IOException e) {
            throw new IOException();
        } finally {
            try {
                if (write != null) {
                    write.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Method to reestablish Motorcyclist from file.
     *
     * @param file way to file.
     * @return object.
     */
    public Motorcyclist reestablishMotorcyclist(String file) throws IOException {
        ObjectInputStream read = null;
        Motorcyclist motorcyclist = new Motorcyclist();
        try {
            read = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            motorcyclist = (Motorcyclist) read.readObject();

        } catch (IOException e) {
            throw new IOException();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return motorcyclist;
    }
}
