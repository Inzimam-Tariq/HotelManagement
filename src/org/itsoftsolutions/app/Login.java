/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itsoftsolutions.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Inzimam
 */
public class Login extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String imgPath = "/org/itsoftsolutions/view/images/";
        stage.setTitle("Hotel Management System");
        stage.getIcons().add(new Image(imgPath+"ic_del_black.png"));
        Parent root = FXMLLoader.load(getClass().getResource("/org/itsoftsolutions/view/login.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
