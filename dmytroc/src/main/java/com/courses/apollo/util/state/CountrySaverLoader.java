package com.courses.apollo.util.state;

import com.courses.apollo.model.state.Country;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Class to save and load Country object.
 */
public class CountrySaverLoader {
    /**
     * Reads Country object from file.
     *
     * @param filename filename to load from.
     * @return country object.
     */
    public Country loadCountry(String filename) throws ClassNotFoundException, IOException {
        Country country;
        ObjectInputStream objectStream;
        try {
            objectStream = new ObjectInputStream(new FileInputStream(new File(filename)));
            country = (Country) objectStream.readObject();
        } catch (IOException e) {
            throw e;
        }
        return country;
    }

    /**
     * Writes Country object to file.
     *
     * @param country  country object.
     * @param filename filename to save to.
     */
    public void saveCountry(Country country, String filename) throws IOException {
        ObjectOutputStream objectStream;
        try {
            objectStream = new ObjectOutputStream(new FileOutputStream(new File(filename)));
            objectStream.writeObject(country);
        } catch (IOException e) {
            throw e;
        }
    }
}