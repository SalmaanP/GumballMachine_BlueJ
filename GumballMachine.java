

public class GumballMachine implements TestMethods {
 
    IGumballMachine soldOutState;
    IGumballMachine InadequateState;
    IGumballMachine AdequateState;
    IGumballMachine soldState;
 
    IGumballMachine state = soldOutState;
    int count = 0;
    int value = 0;
    int gumballs = 0;
    int change = 0;
    
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        InadequateState = new InadequateState(this);
        AdequateState = new AdequateState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = InadequateState;
        } else {
            state = soldOutState;
          }
        
    }
 
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    
    public void insertDime() {
        state.insertDime();
    }    
    
    public void insertNickel() {
        state.insertNickel();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(IGumballMachine state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0 && value > 49) {
            count = count - 1;
            gumballs += 1;
            value = value - 50;
            if(value > 0){
                System.out.println("Here's you change back " + value + " cents");
                change = value;
                value = 0;
            }
            if(value > 50 && count > 0)
                state = AdequateState;
            else
                state = InadequateState;
            } else {
                state = soldOutState;
            
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        if(count > 0){
            this.count = count;
            state = InadequateState;
        }
    }

    public IGumballMachine getState() {
        return state;
    }

    public IGumballMachine getSoldOutState() {
        return soldOutState;
    }

    public IGumballMachine getInadequateState() {
        return InadequateState;
    }

    public IGumballMachine getAdequateState() {
        return AdequateState;
    }

    public IGumballMachine getSoldState() {
        return soldState;
    }
 
    public int getNumberofGumballsInSlot(){        
        return this.gumballs;
    }
    
    public void setNumberofGumballsInSlot(int gumballs){
        this.gumballs = gumballs;
    }
    
    public int getMachineValue(){
        return this.value;
    }
    
    public void setMachineValue(int value){
        this.value += value;
    }
    
    public void takeGumballFromSlot(){
        
        state.takeGumballFromSlot();
        
    }
    
    public boolean isGumballInSlot(){
        
        return state.isGumballInSlot();
    }
    
    public int getChange(){
        return this.change;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
