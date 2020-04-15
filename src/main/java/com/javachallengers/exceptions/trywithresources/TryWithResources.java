package com.javachallengers.exceptions.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResources {

    public static void main(String... tryWithResources) {
        try (Connection connection = DriverManager.getConnection("dbURL")) {
            // Do the database logic
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
