/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldi
 */
public class Vehicle {
    private int fuelInTank;
    private double efficiency;
    private int tankSize;
    
    public Vehicle(double efficiency,int tankSize){
        this.fuelInTank = 0;
        this.efficiency = efficiency;
        this.tankSize = tankSize;
    }
    public int addPetrol(){
        return tankSize-fuelInTank;
    }
    public double driveTo(){
        return efficiency*fuelInTank;
    }
    public int getTankSize() {
        return tankSize;
    }
    public double getEff(){
        return efficiency;
    }
    public int getFuelIT(){
        return fuelInTank;
    }
    public void setFuelIT(int fuelInTank){
        this.fuelInTank = fuelInTank;
    }
}
