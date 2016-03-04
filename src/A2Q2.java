
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City six = new City();
        Robot jumpman = new Robot(six, 5, 1, Direction.EAST);
        new Wall(six, 5, 1, Direction.SOUTH);
        new Wall(six, 5, 2, Direction.SOUTH);
        new Wall(six, 5, 3, Direction.SOUTH);
        new Wall(six, 5, 4, Direction.SOUTH);
        new Wall(six, 5, 5, Direction.SOUTH);
        new Wall(six, 5, 6, Direction.SOUTH);
        new Wall(six, 5, 7, Direction.SOUTH);
        new Wall(six, 5, 8, Direction.SOUTH);
        new Wall(six, 5, 9, Direction.SOUTH);
        new Wall(six, 5, 1, Direction.EAST);
        new Wall(six, 5, 2, Direction.EAST);
        new Wall(six, 5, 4, Direction.EAST);
        new Wall(six, 5, 7, Direction.EAST);
        new Thing(six, 5, 9);
        
        while(true){
            if(jumpman.frontIsClear()){
            jumpman.move();
        }
            if( !jumpman.frontIsClear()){
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.turnLeft();
                jumpman.move();
                jumpman.turnLeft();
                jumpman.move();
                
                
                if(jumpman.canPickThing())
                    jumpman.pickThing();
                    break;
                
                }
            }
            
        
        
    }
    }
