/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itsoftsolutions.controller.helpingClasses;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Inzimam
 */
public class RoomLevel {
    
    private SimpleIntegerProperty floorLevel;
    private SimpleStringProperty numOfRoom;
    

    public RoomLevel(int floorLevel, String numOfRoom) {
        
        this.floorLevel = new SimpleIntegerProperty(floorLevel);
        this.numOfRoom = new SimpleStringProperty(numOfRoom);
    }   

    public Integer getFloorLevel() {
        return floorLevel.get();
    }

    public String getNumOfRoom() {
        return numOfRoom.get();
    }
    
}
