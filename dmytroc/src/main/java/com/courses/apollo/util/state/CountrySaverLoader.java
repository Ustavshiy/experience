package com.courses.apollo.util.state;

import com.courses.apollo.model.state.Country;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

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
    public Country loadCountry(String filename) throws Exception {
        File file = new File(filename);
        Country country = new Country();
        try (InputStream stream = new FileInputStream(file);
             ObjectInputStream objectStream = new ObjectInputStream(stream)) {
            country = (Country) objectStream.readObject();
        } catch (Exception e) {
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
    public void saveCountry(Country country, String filename) throws Exception {
        File file = new File(filename);
        try (OutputStream stream = new FileOutputStream(file);
             ObjectOutputStream objectStream = new ObjectOutputStream(stream)) {
            objectStream.writeObject(country);
        } catch (Exception e) {
            throw e;
        }
    }
}