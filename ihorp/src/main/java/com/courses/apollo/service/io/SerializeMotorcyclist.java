package com.courses.apollo.service.io;

import com.courses.apollo.model.motorcyclist.Motorcyclist;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
     * @param motorcyclist object to write.
     * @param file way to write.
     */
    public void writeMotorcyclist(Motorcyclist motorcyclist, String file) {
        ObjectOutputStream write = null;
        try {
            write = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            write.writeObject(motorcyclist);
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to reestablish Motorcyclist from file.
     * @param file way to file.
     * @return object.
     */
    public Motorcyclist reestablishMotorcyclist(String file) {
        ObjectInputStream read = null;
        Motorcyclist motorcyclist = new Motorcyclist();
        try {
            read = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            motorcyclist = (Motorcyclist) read.readObject();
            read.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return motorcyclist;
    }
}
