
/**
 * Write a description of interface IGumballMachine here.
 * 
 * @author Salmaan
 * @version (a version number or a date)
 */
public interface IGumballMachine extends State
{
    public void insertQuarter();
    public void insertDime();
    public void insertNickel();
    public void turnCrank();
    public boolean isGumballInSlot(); 
    public void takeGumballFromSlot();
}
