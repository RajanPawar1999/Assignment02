
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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City bday = new City();
        Robot Raccoon = new Robot(bday, 2, 2, Direction.EAST);
        new Thing (bday, 2, 3);
        new Thing (bday, 2, 4);
        new Thing (bday, 2, 5);
        new Thing (bday, 2, 6);
        new Thing (bday, 2, 7);
        new Thing (bday, 2, 8);
        new Thing (bday, 2, 9);
        new Thing (bday, 2, 10);
        new Thing (bday, 2, 11);
        new Thing (bday, 2, 12);
        
        while(true){
            if(Raccoon.frontIsClear()){
                Raccoon.move();
            }
            if(Raccoon.canPickThing()){
                Raccoon.pickThing();
            }
            if(Raccoon.countThingsInBackpack()==7){
                break;
            }
        }
        Raccoon.move();
        Raccoon.move();
        Raccoon.move();
        Raccoon.move();
            
        
    }
}
