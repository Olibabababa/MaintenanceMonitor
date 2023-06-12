package at.technikum.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceControllerTest {
    @Test
    void defaultMessage(){
        assertEquals(MaintenanceController.getDefaultMessage(), MaintenanceController.getCurrentMessage());
    }

    @Test
    void SetMessage(){
        String example = "Apfel";
        MaintenanceController.setMessage(example);
        assertEquals(MaintenanceController.getCurrentMessage(), example);
    }

    @Test
    void resetMessage(){
        MaintenanceController.resetMessage();
        assertEquals(MaintenanceController.getCurrentMessage(), MaintenanceController.getDefaultMessage());
    }
}