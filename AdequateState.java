

import java.util.Random;

public class AdequateState implements IGumballMachine {
    GumballMachine gumballMachine;
 
    public AdequateState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setMachineValue(25);
        int value = gumballMachine.getMachineValue();
        System.out.println("Gumball Machine has " + value + " cents");
    }
    
    public void insertDime() {
        System.out.println("You inserted a dime");
        gumballMachine.setMachineValue(10);
        int value = gumballMachine.getMachineValue();
        System.out.println("Gumball Machine has " + value + " cents");
    }
    
    public void insertNickel() {
        System.out.println("You inserted a nickel");
        gumballMachine.setMachineValue(5);
        int value = gumballMachine.getMachineValue();
        System.out.println("Gumball Machine has " + value + " cents");
    }
 
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setMachineValue(-25);
        if(gumballMachine.getMachineValue() < 50){
            gumballMachine.setState(gumballMachine.getInadequateState());
            System.out.println("Gumball Machine has " + gumballMachine.getMachineValue() + " cents");
        }
    }
    
    public void ejectDime() {
        System.out.println("Dime returned");
        gumballMachine.setMachineValue(-10);
        if(gumballMachine.getMachineValue() < 50){
            gumballMachine.setState(gumballMachine.getInadequateState());
            System.out.println("Gumball Machine has " + gumballMachine.getMachineValue() + " cents");
        }
    }
    
    public void ejectNickel() {
        System.out.println("Nickel returned");
        gumballMachine.setMachineValue(-5);
        if(gumballMachine.getMachineValue() < 50){
            gumballMachine.setState(gumballMachine.getInadequateState());
            System.out.println("Gumball Machine has " + gumballMachine.getMachineValue() + " cents");
        }
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public void takeGumballFromSlot(){
        
        int gumballs = gumballMachine.getNumberofGumballsInSlot();
        if(gumballs != 0){
            
            System.out.println("You collected " + gumballs + " gumballs!");
            gumballMachine.setNumberofGumballsInSlot(0);
        } else {
            System.out.println("There are no gumballs in slot!");
        }
    }
    
    public boolean isGumballInSlot(){
        
        if(gumballMachine.getNumberofGumballsInSlot() == 0)
            return false;
        else
            return true;
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
