/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cheryl
 */
import java.util.Scanner;

public class CarpetDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l,w,c;
        System.out.println("Please enter room dimensions in feet.");
        System.out.print("Enter length:");
        l = in.nextDouble();
        System.out.print("Enter width:");
        w = in.nextDouble();
        System.out.print("Enter cost per foot:");
        c = in.nextDouble();
        
        RoomDimension myRoom = new RoomDimension(l,w);
        RoomCarpet myCarpet = new RoomCarpet(myRoom,c);//$8 per sq foot
        System.out.print("The total cost of a "+myRoom+" sqft room would be $");
        System.out.println(myCarpet);
    }
    
}
