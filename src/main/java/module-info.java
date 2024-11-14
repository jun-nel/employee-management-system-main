module jun.employee_management {
    
    requires javafx.controls;
    requires javafx.fxml;
    requires core.fx;
    requires core.db;
    requires javafx.graphics;

    opens dev.jun to javafx.fxml;
    opens dev.jun.app to java.fxml;
    

    
    exports dev.jun;
    exports dev.jun.app;

}
