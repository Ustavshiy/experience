package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.service.io.RWFileServise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Class to save and load Computer object to/from file.
 */
public class CmptrFileIOSrvs {

    /**
     * Method to read(load) Computer object from given file.
     */
    public Computer loadObjectsFromFile(String sourseFilePath, String exeptionsFilePath) {
        Computer comp = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(sourseFilePath));
            comp = (Computer) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
           new RWFileServise().writeFile(e.getClass().toString(), exeptionsFilePath, false);
        }
       return comp;
    }

    /**
     * Method to write(save) Computer object to file.
     */
    public void saveComputer(Computer comp, String pathToSaveFile, String exeptionsFilePath) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(pathToSaveFile)));
            oos.writeObject(comp);
            oos.close();
        } catch (IOException e) {
            new RWFileServise().writeFile(e.getClass().toString(), exeptionsFilePath, false);
        }
    }
}