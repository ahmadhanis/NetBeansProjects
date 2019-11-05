/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycleapp;

/**
 *
 * @author user
 */
class Bicycle {
    private String serialno;
    private String type, color;

    Bicycle(String serialno, String type, String color) {
        this.serialno = serialno;
        this.type = type;
        this.color = color;
    }
    String getSerial() {
        return serialno;
    }
    String getType() {
        return type;
    }
    String getColor() {
        return color;
    }
    void setType(String type) {
        this.type = type;
    }
    void setColor(String color) {
        this.color = color;
    }
}
