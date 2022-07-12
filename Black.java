import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Black extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Black()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 16, 50); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kontrollfeld kontrollfeld = new Kontrollfeld();
        addObject(kontrollfeld,4,1);
        kontrollfeld.summon();
    }
}
