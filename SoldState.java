

public class SoldState implements IGumballMachine {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    public void insertDime() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    public void insertNickel() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }
    
    public void ejectNickel() {
        System.out.println("Sorry, you already turned the crank");
    }
    
    public void ejectDime() {
        System.out.println("Sorry, you already turned the crank");
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getInadequateState());
        } else {
            System.out.println("There are no more gumballs in gumball machine!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
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
        return "dispensing a gumball";
    }
}


