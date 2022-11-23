module com.example.p2test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.p2test to javafx.fxml;
    exports com.example.p2test;
}