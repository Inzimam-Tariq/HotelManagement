/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itsoftsolutions.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.itsoftsolutions.controller.helpingClasses.FetchDBData;
import org.itsoftsolutions.controller.helpingClasses.ShowDialog;

/**
 *
 * @author Inzimam
 */
public class LoginController implements Initializable {

    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXPasswordField re_typePass;

    @FXML
    private JFXButton login;

    @FXML
    private JFXTextField user;

    @FXML
    private JFXButton signup;

    FetchDBData dBData;
    ShowDialog dialog;

    private WebView webLoader;


    @FXML
    void makeLogin(ActionEvent event) throws IOException {

        String username = user.getText().trim();
        String pass = password.getText().trim();
        String re_pass = re_typePass.getText().trim();

        if (dBData.getRowCount(dBData.getLoginTableName()) > 0) {
            ResultSet rs = dBData.getResultSet(dBData.getLoginTableName());
            String dbUName = null, dbUPass = null;
            try {
                while (rs.next()) {
                    dbUName = rs.getString("uname");
                    dbUPass = rs.getString("upass");
                }
            } catch (SQLException ex) {
                dialog.show(Alert.AlertType.ERROR,
                        "Error",
                        "Exception Getting Data",
                        "Invalid Table OR Column Reference");
            }

            if (username.equals(dbUName) && pass.equals(dbUPass)) {
                
                try {                    
                    Parent root = FXMLLoader.load(getClass().getResource("/org/itsoftsolutions/view/main.fxml"));
                    
                    Stage stage = new Stage();
                    stage.setMaximized(true);
                    stage.setTitle("Hotel Management Main");
                    stage.setScene(new Scene(root));
                    stage.show();
//                    MainController mc = new MainController();
//                    MainController.getUsername_label().setText(username);
                    ((Node) event.getSource()).getScene().getWindow().hide();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                dialog.show(Alert.AlertType.ERROR,
                        "Error",
                        "Validating Credentials",
                        "Incorrect Username OR Password!!");
            }
        } else {
            if (username.length() > 0 && pass.length() > 0 && re_pass.length() > 0) {
                if (pass.equals(re_pass)) {
                    boolean isSignupSuccess = dBData.StoreSignUpInfo(username, pass);
                    if (isSignupSuccess) {
                        dialog.show(Alert.AlertType.INFORMATION,
                                "INFORMATION",
                                "Signup Results",
                                "SignUP Successful!!!\n"
                                + "Enter your credentials again to login");
                        signup.toBack();
                        re_typePass.setVisible(false);
                        password.setText("");
                    } else {
                        dialog.show(Alert.AlertType.ERROR,
                                "Error",
                                "Signup Results",
                                "SignUp failure contact your software vender");
                    }
                } else {
                    dialog.show(Alert.AlertType.ERROR,
                            "Error",
                            "Credentials Validation",
                            "Your Re-type password does not match!");
                }
            } else {
                dialog.show(Alert.AlertType.WARNING,
                        "Error",
                        "Credentials Validation",
                        "Username and password is essential");
            }
        }
    }

    void loadWebPage(ActionEvent event
    ) {
        WebEngine webEngine = webLoader.getEngine();
        webEngine.load("http://javafx.com");
    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dialog = new ShowDialog();
        dBData = new FetchDBData();
        if (dBData.getRowCount(dBData.getLoginTableName()) > 0) {
            signup.toBack();
            re_typePass.setVisible(false);
        }
    }
}
