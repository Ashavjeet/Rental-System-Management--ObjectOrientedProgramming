/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockMaintenanceComponent;

/**
 *
 * @author hp
 */
public class Guitar {

    private int serialNumber;
    private String colour;
    private String length;
    private GuitarStatus status;

    public Guitar(int serialNumber, String colour, String length, GuitarStatus status) {
        this.serialNumber = serialNumber;
        this.colour = colour;
        this.length = length;
        this.status = status;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public GuitarStatus getStatus() {
        return status;
    }

    public void setStatus(GuitarStatus status) {
        this.status = status;
    }
    
    
    
    void Display()
    {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Colour: " + colour);
        System.out.println("Length: " + length);
      
    }
    
    
    
}
