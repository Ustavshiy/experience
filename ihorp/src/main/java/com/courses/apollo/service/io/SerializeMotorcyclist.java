package com.courses.apollo.service.io;

import com.courses.apollo.model.motorcyclist.Motorcyclist;

import java.io.*;

/**
 *  Util class
 */
public class SerializeMotorcyclist {

    /**
     *
     * @param motorcyclist
     * @param file
     */
    public void writeMotorcyclist(Motorcyclist motorcyclist, String file) {
        ObjectOutputStream write = null;
        try {
            write = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            write.writeObject(motorcyclist);
            write.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param file
     * @return
     */
    public Motorcyclist reestablishMotorcyclist(String file) {
        ObjectInputStream read = null;
        Motorcyclist motorcyclist = new Motorcyclist();
        try {
            read = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            motorcyclist = (Motorcyclist) read.readObject();
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return motorcyclist;
    }
}
