
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City city = new City();
        Robot bot = new Robot(city, 1, 3, Direction.SOUTH);
        Robot bit = new Robot(city, 1, 3, Direction.SOUTH);
        bit.setColor(Color.ORANGE);
        new Wall(city, 1, 1, Direction.WEST);
        new Wall(city, 2, 1, Direction.WEST);
        new Wall(city, 3, 1, Direction.WEST);
        new Wall(city, 4, 1, Direction.WEST);
        new Wall(city, 5, 1, Direction.WEST);
        new Wall(city, 6, 1, Direction.WEST);
        new Wall(city, 7, 1, Direction.WEST);
        new Wall(city, 8, 1, Direction.WEST);
        new Wall(city, 9, 1, Direction.WEST);
        new Wall(city, 10, 1, Direction.WEST);
        new Wall(city, 1, 2, Direction.EAST);
        new Wall(city, 2, 2, Direction.EAST);
        new Wall(city, 3, 2, Direction.EAST);
        new Wall(city, 4, 2, Direction.EAST);
        new Wall(city, 5, 2, Direction.EAST);
        new Wall(city, 6, 2, Direction.EAST);
        new Wall(city, 7, 2, Direction.EAST);
        new Wall(city, 8, 2, Direction.EAST);
        new Wall(city, 9, 2, Direction.EAST);
        new Wall(city, 10, 2, Direction.EAST);
        new Wall(city, 1, 3, Direction.EAST);
        new Wall(city, 2, 4, Direction.NORTH);
        new Wall(city, 2, 5, Direction.NORTH);
        new Wall(city, 2, 6, Direction.NORTH);
        new Wall(city, 2, 7, Direction.NORTH);
        new Wall(city, 2, 7, Direction.EAST);
        new Wall(city, 3, 7, Direction.EAST);
        new Wall(city, 3, 7, Direction.SOUTH);
        new Wall(city, 3, 6, Direction.SOUTH);
        new Wall(city, 3, 5, Direction.SOUTH);
        new Wall(city, 3, 4, Direction.SOUTH);
        new Wall(city, 4, 3, Direction.EAST);
        new Wall(city, 5, 4, Direction.NORTH);
        new Wall(city, 5, 5, Direction.NORTH);
        new Wall(city, 5, 6, Direction.NORTH);
        new Wall(city, 5, 6, Direction.EAST);
        new Wall(city, 5, 6, Direction.SOUTH);
        new Wall(city, 5, 5, Direction.SOUTH);
        new Wall(city, 5, 4, Direction.SOUTH);
        new Wall(city, 6, 3, Direction.EAST);
        new Wall(city, 7, 3, Direction.EAST);
        new Wall(city, 8, 4, Direction.NORTH);
        new Wall(city, 8, 5, Direction.NORTH);
        new Wall(city, 8, 6, Direction.NORTH);
        new Wall(city, 8, 7, Direction.NORTH);
        new Wall(city, 8, 8, Direction.NORTH);
        new Wall(city, 8, 8, Direction.EAST);
        new Wall(city, 9, 8, Direction.EAST);
        new Wall(city, 9, 4, Direction.SOUTH);
        new Wall(city, 9, 5, Direction.SOUTH);
        new Wall(city, 9, 6, Direction.SOUTH);
        new Wall(city, 9, 7, Direction.SOUTH);
        new Wall(city, 9, 8, Direction.SOUTH);
        new Wall(city, 10, 3, Direction.EAST);
        new Wall(city, 10, 3, Direction.SOUTH);
        
        new Thing(city, 1, 2);
        new Thing(city, 2, 1);
        new Thing(city, 3, 2);
        new Thing(city, 4, 1);
        new Thing(city, 5, 1);
        new Thing(city, 4, 2);
        new Thing(city, 6, 2);
        new Thing(city, 8, 1);
        new Thing(city, 8, 2);
        new Thing(city, 9, 2);
        new Thing(city, 10, 1);
        new Thing(city, 10, 2);
        new Thing(city, 2, 3);
        new Thing(city, 3, 3);
        new Thing(city, 2, 4);
        new Thing(city, 2, 5);
        new Thing(city, 2, 6);
        new Thing(city, 3, 5);
        new Thing(city, 3, 7);
        new Thing(city, 5, 3);
        new Thing(city, 5, 4);
        new Thing(city, 5, 5);
        new Thing(city, 8, 3);
        new Thing(city, 8, 4);
        new Thing(city, 8, 8);
        new Thing(city, 9, 4);
        new Thing(city, 9, 5);
        new Thing(city, 9, 7);
        new Thing(city, 1, 4);
        new Thing(city, 1, 5);
        new Thing(city, 1, 7);
        new Thing(city, 2, 8);
        new Thing(city, 4, 5);
        new Thing(city, 4, 7);
        new Thing(city, 5, 7);
        new Thing(city, 5, 8);
        new Thing(city, 6, 6);
        new Thing(city, 6, 8);
        new Thing(city, 7, 5);
        new Thing(city, 7, 7);
        new Thing(city, 10, 4);
        new Thing(city, 10, 5);
        new Thing(city, 10, 7);
        
        bit.move();
        bit.move();
        bit.move();
        bit.move();
        bit.move();
        bit.move();
        bit.move();
        bit.move();
        bit.move();
        
        while(true){
        if(bot.frontIsClear()){
        bot.move();
        bot.turnLeft();
        if(bot.canPickThing())
        bot.pickThing();
        }
            if(!bot.frontIsClear()){
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
                if(bot.canPickThing())
        bot.pickThing();
            }
            if(bot.countThingsInBackpack()==16)
                break;
        }
        
        bot.move();
        bot.turnLeft();
        bot.move();
        bot.putThing();
        bit.pickThing();
        }
        }
