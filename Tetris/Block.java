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
    private int counter;
    private int counterLo;
    /**
     * Act - do whatever the Blockteil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        counter();
        fallen();
    }
    // by Jan
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
    //by Pascal
    public void moving(){
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-1,getY());
        }

        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+1,getY());
        }
    }      
    //by Basti
    public void counter(){
        counter++;
        if (counter == 100){
            moving();
            rotation();
            counter = 0;
        }
    }
    //by Basti
    public void rotation(){
        if (Greenfoot.isKeyDown("a")){
            turn(-90);
        }
        if (Greenfoot.isKeyDown("d")){
            turn(90);
        }  
    }
    //by Lorenz
    public boolean großeobjekte(){
        if(isTouching(Block.class)){
            return true;
        }
        else {
            return false;
        }
    }
    //by Lorenz
    public boolean checkliegen(){
         if(isAtEdge()) { 
            return true;
        }
        else{ return false;
        }
    }
    //by Lorenz
    public void fallen(){
        counterLo++;
        if(counter==79) {
            if(checkliegen() == false){   
                setLocation(getX(), getY() + 1);
                if(isTouching(Block.class)){
                    setLocation(getX(), getY() - 1);
                }
            }
            else{ 
                if(großeobjekte() == false) {
                    setLocation(getX(), getY() + 1);
                    if(isTouching(Block.class)){
                        setLocation(getX(), getY() - 1);
                    }
                }
            }
            counter = 0;
        }
    }
}
