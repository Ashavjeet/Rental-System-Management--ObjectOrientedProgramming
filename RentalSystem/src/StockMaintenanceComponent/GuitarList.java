/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockMaintenanceComponent;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class GuitarList {
public static ArrayList<Guitar> guitars = new ArrayList<Guitar>();
 
    
    public static void addGuitar(Guitar guitar){
        guitars.add(guitar);
    }

}
