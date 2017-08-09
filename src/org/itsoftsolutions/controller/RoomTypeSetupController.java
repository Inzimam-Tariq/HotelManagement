package org.itsoftsolutions.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import org.itsoftsolutions.controller.helpingClasses.RoomType;

/**
 * FXML Controller class
 *
 * @author Inzimam
 */
public class RoomTypeSetupController implements Initializable {

    @FXML
    private TableView<RoomType> tableView;
    @FXML
    private TableColumn<?, ?> roomNoCol;
    @FXML
    private TableColumn<?, ?> roomTypeCol;
    @FXML
    private TextField room_no_input;
    @FXML
    private TextField room_type_input;
    @FXML
    private JFXButton saveBtn;
    @FXML
    private JFXButton editBtn;
    @FXML
    private JFXButton closeBtn;
    @FXML
    private JFXButton cancelBtn;

    @FXML
    void saveBtnAction(ActionEvent event) {
        

    }

    @FXML
    void editBtnAction(ActionEvent event) {

    }

    @FXML
    void closeBtnAction(ActionEvent event) {

    }

    @FXML
    void cancelBtnAction(ActionEvent event) {

    }
    
    private ObservableList<RoomType> data = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        roomNoCol.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        roomTypeCol.setCellValueFactory(new PropertyValueFactory<>("roomType"));
//        num_room_col.setCellFactory(TextFieldTableCell.<RoomType>forTableColumn());

        tableView.setItems(data);
    }

}
