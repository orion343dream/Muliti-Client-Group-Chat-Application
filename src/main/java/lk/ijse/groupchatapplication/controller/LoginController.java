package lk.ijse.groupchatapplication.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    public TextField txtUserName;

    @FXML
    protected void loginOnAction() throws IOException {
        Stage stage = (Stage) txtUserName.getScene().getWindow();
        stage.setTitle("Chat Room");
        ChatController.userName = txtUserName.getText();
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/ChatForm.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
