package com.example.testjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtLogin;
    @FXML
    private TextField txtPassword;
    @FXML
    private Label txtMessage;

    @FXML
    private void doJob() {
        if (txtLogin.getText().equals("admin") && txtPassword.getText().equals("pass")) {
            txtMessage.setText("Hello Admin!");
        }
        else {
            txtMessage.setText("Ошибка авторизации!");
        }
    }
}