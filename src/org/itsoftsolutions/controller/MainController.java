/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itsoftsolutions.controller;

import java.net.URL;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Inzimam
 */
public class MainController implements Initializable {

    @FXML
    private MenuItem restaurant_menu_item;

    @FXML
    private MenuItem create_vend_inv_menu_item;

    @FXML
    private MenuItem hr_setup_menu_item;

    @FXML
    private Menu hr_menu;

    @FXML
    private Menu help_menu;

    @FXML
    private MenuItem currency_menu_item;

    @FXML
    private MenuItem vender_setup_menu_item;

    @FXML
    private Menu about_menu;

    @FXML
    private MenuItem used_menu_item;

    @FXML
    private MenuItem lost_menu_item;

    @FXML
    private MenuItem other_services_menu_item;

    @FXML
    private Menu front_office_menu;

    @FXML
    private MenuItem exchange_menu_item;

    @FXML
    private MenuItem level_setup_menu_item;

    @FXML
    private MenuItem workshift_menu_item;

    @FXML
    private MenuItem travel_setup_menu_item;

    @FXML
    private MenuItem laundry_order_menu_item;

    @FXML
    private MenuItem guide_setup_menu_item;

    @FXML
    private MenuItem payroll_menu_item;

    @FXML
    private MenuItem inb_trans_menu_item;

    @FXML
    private Menu inventory_menu;

    @FXML
    private MenuItem minibar_menu_item;

    @FXML
    private Menu logout_menu;

    @FXML
    private MenuItem user_account_menu_item;

    @FXML
    private MenuItem status_menu_item;

    @FXML
    private Menu login_menu;

    @FXML
    private MenuItem return_menu_item;

    @FXML
    private MenuItem attendence_menu_item;

    @FXML
    private MenuItem demage_menu_item;

    @FXML
    private MenuItem laundry_new_order_menu_item;

    @FXML
    private Menu sale_menu;

    @FXML
    private Menu laundry_menu_item;

    @FXML
    private MenuItem Inventry_report_menu_item;

    @FXML
    private Menu front_office_setup_menu;

    @FXML
    private MenuItem note_menu_item;

    @FXML
    private Menu travel_menu;

    @FXML
    private Menu room_setup_menu;

    @FXML
    private MenuItem room_type_menu_item;

    @FXML
    private MenuItem report_menu_item;

    @FXML
    private Menu travel_setup_menu;

    @FXML
    private static Label username_label;

    @FXML
    private Label date_lebel;

    @FXML
    void login_menu_action(ActionEvent event) {

    }

    @FXML
    void logout_menu_action(ActionEvent event) {

    }

    @FXML
    void front_office_setup_menu_action(ActionEvent event) {

    }

    @FXML
    void level_setup_menu_item_action(ActionEvent event) {

        String fxmlPath = "/org/itsoftsolutions/view/floorSetup.fxml";
        String title = "Room Setup > Floor";
        boolean resizable = false;
        showWindow(title, fxmlPath, resizable);
    }

    @FXML
    void room_type_menu_item_action(ActionEvent event) {

        String fxmlPath = "/org/itsoftsolutions/view/roomTypeSetup.fxml";
        String title = "Room Setup > Room Type";
        boolean resizable = false;
        showWindow(title, fxmlPath, resizable);
    }

    @FXML
    void workshift_menu_item_action(ActionEvent event) {

    }

    @FXML
    void user_account_menu_item_action(ActionEvent event) {

    }

    @FXML
    void currency_menu_item_action(ActionEvent event) {

    }

    @FXML
    void exchange_menu_item_action(ActionEvent event) {

    }

    @FXML
    void status_menu_item_action(ActionEvent event) {

    }

    @FXML
    void minibar_menu_item_action(ActionEvent event) {

    }

    @FXML
    void laundry_new_order_menu_item_action(ActionEvent event) {

    }

    @FXML
    void laundry_order_menu_item_action(ActionEvent event) {

    }

    @FXML
    void restaurant_menu_item_action(ActionEvent event) {

    }

    @FXML
    void report_menu_item_action(ActionEvent event) {

    }

    @FXML
    void guide_setup_menu_item_action(ActionEvent event) {

    }

    @FXML
    void travel_setup_menu_item_action(ActionEvent event) {

    }

    @FXML
    void inb_trans_menu_item_action(ActionEvent event) {

    }

    @FXML
    void other_services_menu_item_action(ActionEvent event) {

    }

    @FXML
    void sale_menu_action(ActionEvent event) {

    }

    @FXML
    void vender_setup_menu_item_action(ActionEvent event) {

    }

    @FXML
    void create_vend_inv_menu_item_action(ActionEvent event) {

    }

    @FXML
    void note_menu_item_action(ActionEvent event) {

    }

    @FXML
    void used_menu_item_action(ActionEvent event) {

    }

    @FXML
    void demage_menu_item_action(ActionEvent event) {

    }

    @FXML
    void lost_menu_item_action(ActionEvent event) {

    }

    @FXML
    void return_menu_item_action(ActionEvent event) {

    }

    @FXML
    void Inventry_report_menu_item_action(ActionEvent event) {

    }

    @FXML
    void hr_setup_menu_item_action(ActionEvent event) {

    }

    @FXML
    void attendence_menu_item_action(ActionEvent event) {

    }

    @FXML
    void payroll_menu_item_action(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        setMenuIcons();
        login_menu.setDisable(true);
        setSystemTime();

    }

    private void setMenuIcons() {
        String imgPath = "/org/itsoftsolutions/view/images/";
        Image loginIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_account_box_black.png"));
        ImageView loginView = new ImageView(loginIcon);
//        downloadView.setFitWidth(15);
//        downloadView.setFitHeight(15);
        login_menu.setGraphic(loginView);

        Image logoutIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_logout_black.png"));
        ImageView logoutView = new ImageView(logoutIcon);
        logout_menu.setGraphic(logoutView);

        Image restaurentIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_restaurant_black.png"));
        ImageView restaurentView = new ImageView(restaurentIcon);
        restaurant_menu_item.setGraphic(restaurentView);

        Image barIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_local_bar_black.png"));
        ImageView barView = new ImageView(barIcon);
        minibar_menu_item.setGraphic(barView);

        Image travelIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_flight_takeoff_black.png"));
        ImageView travelView = new ImageView(travelIcon);
        travel_menu.setGraphic(travelView);

        Image reportIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_assessment_black.png"));
        ImageView reportView = new ImageView(reportIcon);
        sale_menu.setGraphic(reportView);

        Image frontIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_business_black.png"));
        ImageView frontView = new ImageView(frontIcon);
        front_office_menu.setGraphic(frontView);

        Image setupIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_build_black.png"));
        ImageView setupView = new ImageView(setupIcon);
        vender_setup_menu_item.setGraphic(setupView);
        room_setup_menu.setGraphic(setupView);
        travel_setup_menu.setGraphic(setupView);
        hr_setup_menu_item.setGraphic(setupView);
        level_setup_menu_item.setGraphic(setupView);
        guide_setup_menu_item.setGraphic(setupView);
        front_office_setup_menu.setGraphic(setupView);

        Image helpIcon = new Image(getClass().getResourceAsStream(imgPath + "ic_help_black.png"));
        ImageView helpView = new ImageView(helpIcon);
        help_menu.setGraphic(helpView);

        Image hrIcon = new Image(getClass().getResourceAsStream(imgPath + "man.png"));
        ImageView hrView = new ImageView(hrIcon);
        hr_menu.setGraphic(hrView);
    }

    private void setSystemTime() {
        GregorianCalendar calender = new GregorianCalendar();
        date_lebel.setText("" + calender.getTime());
    }

    public static Label getUsername_label() {
        return username_label;
    }

    private void showWindow(String title, String fxmlPath, boolean resizable) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.setResizable(resizable);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
