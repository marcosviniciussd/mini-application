module com.project.miniapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.miniapplication to javafx.fxml;
    exports com.project.miniapplication;
}