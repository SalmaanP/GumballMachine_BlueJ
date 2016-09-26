

public class InadequateState implements IGumballMachine {
    GumballMachine gumballMachine;
 
    public InadequateState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setMachineValue(25);
        int value = gumballMachine.getMachineValue();
        if(value > 49){
            System.out.println("Gumball Machine has " + value + " cents");
            gumballMachine.setState(gumballMachine.getAdequateState());
        } else {
            System.out.println("You need " + (50-value) + " cents more to get a gumball!");
        }
    }
    
    public void insertDime(){
        System.out.println("You inserted a dime");
        gumballMachine.setMachineValue(10);
        int value = gumballMachine.getMachineValue();
        if(value > 49){
            System.out.println("Gumball Machine has " + value + " cents");
            gumballMachine.setState(gumballMachine.getAdequateState());
        } else {
            System.out.println("You need " + (50-value) + " cents more to get a gumball!");
        }
    }
    
    public void insertNickel(){
        System.out.println("You inserted a nickel");
        gumballMachine.setMachineValue(5);
        int value = gumballMachine.getMachineValue();
        if(value > 49){
            System.out.println("Gumball Machine has " + value + " cents");
            gumballMachine.setState(gumballMachine.getAdequateState());
        } else {
            System.out.println("You need " + (50-value) + " cents more to get a gumball!");
        }
    }
 
    public void ejectQuarter() {
        
        if(gumballMachine.getMachineValue() >= 25){
            System.out.println("Quarter returned");
            gumballMachine.setMachineValue(-25);
            System.out.println("Gumball Machine has " + gumballMachine.getMachineValue() + " cents");
        }
    }
    
    public void ejectDime() {
        
        if(gumballMachine.getMachineValue() >= 10){
            System.out.println("Dime returned");
            gumballMachine.setMachineValue(-10);
            System.out.println("Gumball Machine has " + gumballMachine.getMachineValue() + " cents");
        }
    }
    
    public void ejectNickel() {
        
        if(gumballMachine.getMachineValue() >= 5){
            System.out.println("Nickel returned");
            gumballMachine.setMachineValue(-5);
            System.out.println("Gumball Machine has " + gumballMachine.getMachineValue() + " cents");
        }
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
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
        return "waiting for quarter";
    }
}
