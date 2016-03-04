
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pawar5658
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City test = new City();
        Robot rat = new Robot(test, 5, 4, Direction.NORTH);
        new Thing(test, 0, 0);
        
        while(rat.getDirection()!=Direction.WEST){
            rat.turnLeft();
        }
        
        while(rat.getAvenue()>0){
           rat.move();
        }
        
        while(rat.getDirection()!=Direction.NORTH){
            rat.turnLeft();
        }
        
        while(rat.getStreet()>0){
            rat.move();
        }
    
       


    }
    }
