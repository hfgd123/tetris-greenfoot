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

    public void summon() {
        int x = Greenfoot.getRandomNumber(6);
        Block a = new Block(this);
        getWorld().addObject(a, getX(), getY());
        a.create(x);
    }
}
