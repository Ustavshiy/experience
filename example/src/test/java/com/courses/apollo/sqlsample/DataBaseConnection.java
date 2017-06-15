package com.courses.apollo.sqlsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by User on 15.06.2017.
 */
public class DataBaseConnection {
    private static Connection connection = null;
    private final static String ADRESS = "jdbc:postgresql://localhost";
    private final static String DATABASE = "postgres";
    private final static String USER = "postgres";
    private final static String PASSWORD = "root";
    private final static String PORT = "5432";
    private final static String DRIVER = "org.postgresql.Driver";

    /**
     * Method that loads the specified driver
     *
     * @return void
     **/

    private static void loadDriver() {
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            errorHandler("Failed to load the driver " + DRIVER, e);
        }
    }

    /**
     * Method that loads the connection into the right property
     *
     * @return void
     **/

    private static void loadConnection() {
        try {
            connection = DriverManager.getConnection(getFormatedUrl(), USER, PASSWORD);
        } catch (SQLException e) {
            errorHandler("Failed to connect to the database " + getFormatedUrl(), e);
        }
    }

    /**
     * Method that shows the errors thrown by the singleton
     *
     * @param {String} Message
     * @return void
     * @option {Exception} e
     **/
    private static void errorHandler(String message, Exception e) {
        System.out.println(message);
        if (e != null) System.out.println(e.getMessage());
    }

    /**
     * Method that returns the formated URL to connect to the database
     *
     * @return {String}
     **/

    private static String getFormatedUrl() {
        return ADRESS + ":" + PORT + "/" + DATABASE;
    }

    /**
     * Static method that returns the instance for the singleton
     *
     * @return {Connection} connection
     **/

    public static Connection getConnection() {
        if (connection == null) {
            loadDriver();
            loadConnection();
        }
        return connection;
    }

    /**
     * Static method that close the connection to the database
     *
     * @return void
     **/

    public static void closeConnection() {
        if (connection == null) {
            errorHandler("No connection found", null);
        } else {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                errorHandler("Failed to close the connection", e);
            }
        }
    }


}
