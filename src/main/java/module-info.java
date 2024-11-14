module jun.employee_management {
    
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    requires core.fx;
    requires transitive core.db;
       
    opens dev.jun to javafx.fxml;
    opens dev.jun.app to javafx.fxml;
   
    
    exports dev.jun;
    exports dev.jun.app;

}
