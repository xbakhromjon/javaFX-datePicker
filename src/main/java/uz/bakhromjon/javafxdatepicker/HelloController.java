package uz.bakhromjon.javafxdatepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private DatePicker datePicker;

    @FXML
    protected void displayDate(ActionEvent event) {
        LocalDate date = datePicker.getValue();
        String formatted = date.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        label.setText(formatted);
    }
}