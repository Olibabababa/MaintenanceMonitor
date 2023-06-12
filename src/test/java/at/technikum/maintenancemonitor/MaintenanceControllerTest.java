package at.technikum.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceControllerTest {
    @Test
    void defaultMessage(){
        assertEquals(MaintenanceController.getDefaultMessage(), MaintenanceController.getCurrentMessage());
    }
}