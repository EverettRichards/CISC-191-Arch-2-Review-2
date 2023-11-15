package edu.sdccd.cisc191.template;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

public class InvalidSubjectException extends Exception {
    public InvalidSubjectException(String message){
        super(message);
    }
}
