

public class SoldOutState implements IGumballMachine {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out, here's your quarter back");
    }
    
    public void insertDime() {
        System.out.println("You can't insert a dime, the machine is sold out, here's your dime back");
    }
    
    public void insertNickel() {
        System.out.println("You can't insert a nickel, the machine is sold out, here's your nickel back");
    }
 
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }
    
    public void ejectNickel() {
        System.out.println("Sorry, you already turned the crank");
    }
    
    public void ejectDime() {
        System.out.println("Sorry, you already turned the crank");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs, gumball machine is sold out!");
    }
 
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public boolean isGumballInSlot(){
        
        if(gumballMachine.getNumberofGumballsInSlot() == 0)
            return false;
        else
            return true;
        
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
    public String toString() {
        return "sold out";
    }
}
