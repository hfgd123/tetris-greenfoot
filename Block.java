import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blockteil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    public Block(Kontrollfeld k) {
        
    }
    /**
     * Act - do whatever the Blockteil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void create(int x) {
        if(x == 0) {
            // O
            Blockteil a = new Blockteil(this);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this);
            getWorld().addObject(c, getX(), getY()+1);
            Blockteil d = new Blockteil(this);
            getWorld().addObject(d, getX()+1, getY()+1);
        } else if(x == 1) {
            // I
            Blockteil a = new Blockteil(this);
            getWorld().addObject(a, getX()+2, getY());
            Blockteil b = new Blockteil(this);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this);
            getWorld().addObject(c, getX(), getY());
            Blockteil d = new Blockteil(this);
            getWorld().addObject(d, getX()-1, getY());        
        } else if(x == 2) {
            // L
            Blockteil a = new Blockteil(this);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this);
            getWorld().addObject(c, getX()-1, getY());
            Blockteil d = new Blockteil(this);
            getWorld().addObject(d, getX()-1, getY()+1);
        } else if(x == 3) {
            // J
            Blockteil a = new Blockteil(this);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this);
            getWorld().addObject(c, getX()-1, getY());
            Blockteil d = new Blockteil(this);
            getWorld().addObject(d, getX()+1, getY()+1);
        } else if(x == 4) {
            // S
            Blockteil a = new Blockteil(this);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this);
            getWorld().addObject(c, getX(), getY()+1);
            Blockteil d = new Blockteil(this);
            getWorld().addObject(d, getX()-1, getY()+1);
        } else if(x == 5) {
            // Z
            Blockteil a = new Blockteil(this);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this);
            getWorld().addObject(b, getX()-1, getY());
            Blockteil c = new Blockteil(this);
            getWorld().addObject(c, getX(), getY()+1);
            Blockteil d = new Blockteil(this);
            getWorld().addObject(d, getX()+1, getY()+1);
        } else if(x == 6) {
            // T
            Blockteil a = new Blockteil(this);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this);
            getWorld().addObject(c, getX()-1, getY());
            Blockteil d = new Blockteil(this);
            getWorld().addObject(d, getX(), getY()+1);
        }
    }
}
