package at.technikum.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {
    private static String defaultMessage = "everything operates as expected";

    private static String currentMessage = defaultMessage;

    public static String getDefaultMessage() {
        return defaultMessage;
    }

    public static String getCurrentMessage() {
        return currentMessage;
    }

    @GetMapping("/api/message")
    public String getMessage() {
        return currentMessage;
    }
}