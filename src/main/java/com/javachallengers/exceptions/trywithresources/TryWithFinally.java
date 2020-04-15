package com.javachallengers.exceptions.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithFinally {

    public static void main(String... tryWithFinally) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("dbURL");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

}
