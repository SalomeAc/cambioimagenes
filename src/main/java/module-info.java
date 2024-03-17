module org.example.cambioimagenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cambioimagenes to javafx.fxml;
    exports org.example.cambioimagenes;
}