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
        //boolean sword;
        //sword = false;

        String cmd="ndfvfdbv";
        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }
              while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }
              while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }
              while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }
              while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }

        while(!cmd.equalsIgnoreCase("quit")){
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
              cmd = "dffe";
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
               System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "fsdfdss";
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
              System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
              cmd = "dsfsdfw";
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
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
            }
    }
}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                            }
                                                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                }
                                                                                    }
                                                            }
                                        }
                        }
            }
    }
}
}
