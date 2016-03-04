
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City castle = new City();
        Robot bot = new Robot(castle, 2, 1, Direction.NORTH);
        new Wall(castle, 1, 1, Direction.NORTH);
        new Wall(castle, 1, 1, Direction.EAST);
        new Wall(castle, 1, 1, Direction.WEST);
        new Wall(castle, 1, 1, Direction.SOUTH);
        new Wall(castle, 1, 4, Direction.NORTH);
        new Wall(castle, 1, 4, Direction.SOUTH);
        new Wall(castle, 1, 4, Direction.EAST);
        new Wall(castle, 1, 4, Direction.WEST);
        new Wall(castle, 4, 1, Direction.NORTH);
        new Wall(castle, 4, 1, Direction.SOUTH);
        new Wall(castle, 4, 1, Direction.EAST);
        new Wall(castle, 4, 1, Direction.WEST);
        new Wall(castle, 4, 4, Direction.WEST);
        new Wall(castle, 4, 4, Direction.EAST);
        new Wall(castle, 4, 4, Direction.SOUTH);
        new Wall(castle, 4, 4, Direction.NORTH);
        new Wall(castle, 2, 2, Direction.NORTH);
        new Wall(castle, 2, 3, Direction.NORTH);
        new Wall(castle, 2, 2, Direction.WEST);
        new Wall(castle, 3, 2, Direction.WEST);
        new Wall(castle, 3, 2, Direction.SOUTH);
        new Wall(castle, 3, 3, Direction.SOUTH);
        new Wall(castle, 2, 3, Direction.EAST);
        new Wall(castle, 3, 3, Direction.EAST);
        
        while(!bot.frontIsClear())
        { while(!bot.frontIsClear()){
            bot.turnLeft();
            bot.move();
        }
        
        while(bot.frontIsClear()){
            bot.turnLeft();
            bot.turnLeft();
            bot.turnLeft();
            bot.move();
            if(bot.frontIsClear())
            bot.move();}
        
            while(!bot.frontIsClear()){
                bot.turnLeft();
                bot.move();}
            
            while(bot.frontIsClear()){
            bot.turnLeft();
            bot.turnLeft();
            bot.turnLeft();
            bot.move();
            if(bot.frontIsClear())
            bot.move();}
            }
                
    }
}
