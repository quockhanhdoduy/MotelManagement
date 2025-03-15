module com.ktpm.motelmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ktpm.motelmanagement to javafx.fxml;
    exports com.ktpm.motelmanagement;
    exports com.ktpm.motelmanagement.controllers;
    opens com.ktpm.motelmanagement.controllers to javafx.fxml;
}