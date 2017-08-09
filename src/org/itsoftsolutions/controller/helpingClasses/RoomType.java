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
public class RoomType {
    
    private SimpleIntegerProperty roomNo;
    private SimpleStringProperty roomType;
    

    public RoomType(int floorLevel, String numOfRoom) {
        
        this.roomNo = new SimpleIntegerProperty(floorLevel);
        this.roomType = new SimpleStringProperty(numOfRoom);
    }   

    public Integer getFloorLevel() {
        return roomNo.get();
    }

    public String getNumOfRoom() {
        return roomType.get();
    }
    
}
