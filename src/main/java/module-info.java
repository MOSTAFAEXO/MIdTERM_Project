module com.example.midterm_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.midterm_project to javafx.fxml;
    exports com.example.midterm_project;
}