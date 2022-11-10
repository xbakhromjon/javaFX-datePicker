module uz.bakhromjon.javafxdatepicker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxdatepicker to javafx.fxml;
    exports uz.bakhromjon.javafxdatepicker;
}