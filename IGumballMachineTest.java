

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IGumballTest.
 *
 * @author  Salmaan
 * @version (a version number or a date)
 */
public class IGumballMachineTest
{
   
    
    /**
     * Default constructor for test class IGumballTest
     */
    public IGumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void TestUnderNormalCircumstance(){
        
        GumballMachine gm = new GumballMachine(2);
        gm.insertQuarter();
        gm.insertDime();
        gm.insertDime();
        gm.insertNickel();
        gm.turnCrank();
        assertEquals(true, gm.isGumballInSlot());
               
    }
    
    @Test
    public void TestWithChange(){
    
        GumballMachine gm = new GumballMachine(1);
        gm.insertQuarter();
        gm.insertQuarter();
        gm.insertQuarter();
        gm.insertQuarter();
        gm.turnCrank();
        gm.takeGumballFromSlot();
        assertEquals(50, gm.getChange());               
    
    }
    
    @Test
    public void TestForDoubleCrank(){
    
        GumballMachine gm = new GumballMachine(1);
        gm.insertQuarter();
        gm.insertQuarter();
        gm.insertQuarter();
        gm.turnCrank();
        gm.takeGumballFromSlot();
        gm.turnCrank();
        assertEquals(false, gm.isGumballInSlot());
    
    }
    
    @Test
    public void TestForMultipleGumballs(){
    
        GumballMachine gm = new GumballMachine(2);
        gm.insertQuarter();
        gm.insertQuarter();
        gm.turnCrank();
        gm.insertQuarter();
        gm.insertQuarter();
        gm.turnCrank();
        assertEquals(2, gm.getNumberofGumballsInSlot());
    
    }
    
    @Test
    public void TestForInsufficientCoin(){
    
        GumballMachine gm = new GumballMachine(5);
        gm.insertDime();
        gm.insertNickel();
        gm.insertQuarter();
        //gm.turnCrank();
        assertEquals(40, gm.getMachineValue());
        System.out.println(gm.getMachineValue());
    
    }
}
