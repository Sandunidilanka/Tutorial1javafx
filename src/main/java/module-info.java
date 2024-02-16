module com.example.week4design {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.week4design to javafx.fxml;
    exports com.example.week4design;
}