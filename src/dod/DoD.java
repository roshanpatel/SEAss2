/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

/**
 *
 * @author tdahl01
 */
//version 1.1 is sword etc. in progress (not fully working)
//version 2.0 is the next fully working (stable) release.
public class DoD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.io.BufferedReader stdin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        World world = new World();
        Player player = new Player(world.locations.get(0));
        boolean sword;
        boolean lamp;
        sword = false;
        lamp = false;

        String cmd="";
        while(!cmd.equalsIgnoreCase("quit")){
            System.out.println("You are "+player.location.desc);
            System.out.println("What next?");
            try{
                cmd = stdin.readLine();
            }catch(java.io.IOException e){
                System.out.println(e);
            }

            if (player.locations.desc = location tr){
                sword = true;
            }

             if (player.locations.desc = location hc){
                lamp = true;
            }

            if (player.locations.desc = location dc && lamp = true && Sword = true){
                System.out.println("You have slayed the dragon! Congratulations!")
            }

            if(cmd.equalsIgnoreCase("n")){
                if(player.location.north!=null){
                    player.location = player.location.north;
                }else{
                    System.out.println("There is no exit to the north.");
                }
            }
            if(cmd.equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
            if(cmd.equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
            if(cmd.equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }
            if(cmd.equalsIgnoreCase("quit")){
                System.out.println("You quit.");
            }
        }
        System.out.println("Goodbye!");
        
    }
}
