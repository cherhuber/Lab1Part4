/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cheryl
 */
public class RoomCarpet {
    RoomDimension size;
    double carpetCost;
    RoomCarpet(RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
    }
    public double getTotalCost(){
        double c = size.getArea() * carpetCost;
        return c;
    }
    @Override public String toString(){
        String s = String.format("%.2f", getTotalCost());
        return (s);
    }//toString 
}
