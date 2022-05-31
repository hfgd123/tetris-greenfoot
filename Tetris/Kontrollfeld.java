import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kontrollfeld here.
 * 
 * @author Jan Lunz (hfgd123) 
 * @version (a version number or a date)
 */
public class Kontrollfeld extends Actor
{
    private int x_id;
    private int y_id;

    public void act()
    {
                
    }

    public void löschen() {
         getWorld().removeObject(getOneIntersectingObject(Block.class));
    }
}
