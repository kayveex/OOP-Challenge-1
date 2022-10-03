/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aldi
 */
import java.util.Scanner;

public class mainChallenge1 {
    public static void main(String[] args) {
        Vehicle fuelStatus = new Vehicle(0.6,2000);
        System.out.println("Fuel can be add:" +fuelStatus.addPetrol());
        System.out.println("Fill the fuel tank");
        fuelStatus.setFuelIT(fuelStatus.addPetrol());
        System.out.println("Distance can be driven now:" +fuelStatus.driveTo()+" KM");
    }
}
