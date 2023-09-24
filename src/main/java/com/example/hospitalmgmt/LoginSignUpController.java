package com.example.hospitalmgmt;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginSignUpController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ComboBox<String> userTypeComboBox;

    @FXML
    private VBox myVBox;

    @FXML
    private VBox myVBox2;

    @FXML
    private Hyperlink alreadySignedInLink;
    @FXML
    private ComboBox<String> userTypeSignInComboBox;

    @FXML
    private PasswordField newPassword;

    @FXML
    private PasswordField confirmPassword;


    @FXML
    private void loginButtonAction(ActionEvent event) {
    }
    @FXML
    private void signInButtonAction(ActionEvent event) {
    }


    @FXML
    private void signUpAction() {
       myVBox.setVisible(false);
       myVBox2.setVisible(true);

    }

    @FXML
    private void backToLoginAction() {
        myVBox.setVisible(true);
        myVBox2.setVisible(false);

    }

}

