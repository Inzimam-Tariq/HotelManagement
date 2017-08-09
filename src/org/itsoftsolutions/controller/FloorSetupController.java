/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itsoftsolutions.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import org.itsoftsolutions.controller.helpingClasses.RoomLevel;

/**
 *
 * @author Inzimam
 */
public class FloorSetupController implements Initializable {

    @FXML
    private TableColumn<RoomLevel, Integer> floor_level_col;

    @FXML
    private TableColumn<RoomLevel, String> num_room_col;

    @FXML
    private JFXButton cancel_btn;

    @FXML
    private JFXButton save_btn;

    @FXML
    private JFXButton close_btn;

    @FXML
    private TableView<RoomLevel> tabelView;

    @FXML
    private TextField num_level_input;

    @FXML
    private JFXButton level_save_btn;

    @FXML
    void num_level_input_action(ActionEvent event) {

    }

    @FXML
    void level_save_btn_action(ActionEvent event) {

        int level = Integer.parseInt(num_level_input.getText());        
        for (int i=1; i<=level; i++){
        data.add(new RoomLevel(i, ""));
        }
    }

    @FXML
    void save_btn_action(ActionEvent event) {

    }

    @FXML
    void cancel_btn_action(ActionEvent event) {

    }

    @FXML
    void close_btn_action(ActionEvent event) {

    }

    private ObservableList<RoomLevel> data = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        floor_level_col.setCellValueFactory(new PropertyValueFactory<>("floorLevel"));
        num_room_col.setCellValueFactory(new PropertyValueFactory<>("numOfRoom"));
        num_room_col.setCellFactory(TextFieldTableCell.<RoomLevel>forTableColumn());

        tabelView.setItems(data);

    }

}
