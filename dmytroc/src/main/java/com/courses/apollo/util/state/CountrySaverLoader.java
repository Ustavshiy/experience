package com.courses.apollo.util.state;

import com.courses.apollo.exception.CountryIOException;
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
    public Country loadCountry(String filename) throws CountryIOException {
        Country country;
        ObjectInputStream objectStream;
        try {
            objectStream = new ObjectInputStream(new FileInputStream(new File(filename)));
            country = (Country) objectStream.readObject();
            objectStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new CountryIOException(e.getMessage(), "Can't read country from file");
        }
        return country;
    }

    /**
     * Writes Country object to file.
     *
     * @param country  country object.
     * @param filename filename to save to.
     */
    public void saveCountry(Country country, String filename) throws CountryIOException {
        ObjectOutputStream objectStream;
        try {
            objectStream = new ObjectOutputStream(new FileOutputStream(new File(filename)));
            objectStream.writeObject(country);
            objectStream.close();
        } catch (IOException e) {
            throw new CountryIOException(e.getMessage(), "Can`t save country to file");
        }
    }
}