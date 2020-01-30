package exceptions.trywithresources;

public class TryWithResourcesJava9 {

    void executeAction(AutoCloseable closeable) {
        try (closeable) {
            // Perform your logic
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
