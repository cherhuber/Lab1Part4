/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cheryl
 */
public class RoomDimension {
    double length;
    double width;
    RoomDimension(double l, double w){
        length = l;
        width = w;
    }//Constructor
    public double getArea(){
        return length * width;
    }//getArea
    @Override public String toString(){
        return (String.format("%.2f",getArea()));
    }//toString  
}//RoomDimension Class


