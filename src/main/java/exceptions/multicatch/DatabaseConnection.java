package exceptions.multicatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String... multiCatchExample) {
        try {
            Connection connection = DriverManager.getConnection("DBURL");
            executeComplexLogic();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static void executeComplexLogic() { }
}

