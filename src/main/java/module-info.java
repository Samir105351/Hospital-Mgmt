module com.example.hospitalmgmt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hospitalmgmt to javafx.fxml;
    exports com.example.hospitalmgmt;
}