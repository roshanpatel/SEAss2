/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dod;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roshan
 */
public class DoDTest {

    public DoDTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class DoD.
     */
    @Test
    public void testMain() {
 World world = new World();
        Player player = new Player(world.locations.get(0));

        String cmd="n";
        while(!cmd.equalsIgnoreCase("quit")){
            System.out.println("You are "+player.location.desc);
            System.out.println("What next?");

              cmd = "n";//hard-code value of command, as test needs to run automatically.

            if(cmd.equalsIgnoreCase("n")){
                if(player.location.north!=null){
                    player.location = player.location.north;
                }else{
                    System.out.println("There is no exit to the north.");
                }
            }
            System.out.println("You are "+player.location.desc);
            System.out.println("What next?");

            cmd = "n";

            if(cmd.equalsIgnoreCase("n")){
                if(player.location.north!=null){
                    player.location = player.location.north;
                }else{
                    System.out.println("There is no exit to the north.");
                }
            }
            System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
            
             cmd = "e";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }

            System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
            
              cmd = "quit";
            if(cmd.equalsIgnoreCase("quit")){
                System.out.println("You quit.");
            }
        }
        System.out.println("Goodbye!");

    }
}