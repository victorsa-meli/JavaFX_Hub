package com.exercicios.treinos;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.IOException;

public class MainController {

    @FXML
    private void shutdownAction() throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Desligar o computador");
        alert.setHeaderText(null);
        alert.setContentText("Voce gostaria de desligar agora ?");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                try {
                    Runtime.getRuntime().exec("shutdown -s -t 0");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @FXML
    private void exitAction() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ate logo!");
        alert.setHeaderText(null);
        alert.setContentText("Obrigado por usar o meu programa !");
        alert.showAndWait();
        System.exit(0);
    }
}
