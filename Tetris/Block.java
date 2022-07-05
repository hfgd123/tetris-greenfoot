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
    private Blockteil blockA;
    private Blockteil blockB;
    private Blockteil blockC;
    private Blockteil blockD;

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
            Blockteil a = new Blockteil(this, 0, 0);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this, 0, 1);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this, 0, 2);
            getWorld().addObject(c, getX(), getY()+1);
            Blockteil d = new Blockteil(this, 0, 3);
            getWorld().addObject(d, getX()+1, getY()+1);
            blockA = a;
            blockB = b;
            blockC = c;
            blockD = d;
        } else if(x == 1) {
            // I
            Blockteil a = new Blockteil(this, 1, 0);
            getWorld().addObject(a, getX()+2, getY());
            Blockteil b = new Blockteil(this, 1, 1);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this, 1, 2);
            getWorld().addObject(c, getX(), getY());
            Blockteil d = new Blockteil(this, 1, 3);
            getWorld().addObject(d, getX()-1, getY());
            blockA = a;
            blockB = b;
            blockC = c;
            blockD = d;
        } else if(x == 2) {
            // L
            Blockteil a = new Blockteil(this, 2, 0);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this, 2, 1);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this, 2, 2);
            getWorld().addObject(c, getX()-1, getY());
            Blockteil d = new Blockteil(this, 2, 3);
            getWorld().addObject(d, getX()-1, getY()+1);
            blockA = a;
            blockB = b;
            blockC = c;
            blockD = d;
        } else if(x == 3) {
            // J
            Blockteil a = new Blockteil(this, 3, 0);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this, 3, 1);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this, 3, 2);
            getWorld().addObject(c, getX()-1, getY());
            Blockteil d = new Blockteil(this, 3, 3);
            getWorld().addObject(d, getX()+1, getY()+1);
            blockA = a;
            blockB = b;
            blockC = c;
            blockD = d;
        } else if(x == 4) {
            // S
            Blockteil a = new Blockteil(this, 4, 0);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this, 4, 1);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this, 4, 2);
            getWorld().addObject(c, getX(), getY()+1);
            Blockteil d = new Blockteil(this, 4, 3);
            getWorld().addObject(d, getX()-1, getY()+1);
            blockA = a;
            blockB = b;
            blockC = c;
            blockD = d;
        } else if(x == 5) {
            // Z
            Blockteil a = new Blockteil(this, 5, 0);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this, 5, 1);
            getWorld().addObject(b, getX()-1, getY());
            Blockteil c = new Blockteil(this, 5, 2);
            getWorld().addObject(c, getX(), getY()+1);
            Blockteil d = new Blockteil(this, 5, 3);
            getWorld().addObject(d, getX()+1, getY()+1);
            blockA = a;
            blockB = b;
            blockC = c;
            blockD = d;
        } else if(x == 6) {
            // T
            Blockteil a = new Blockteil(this, 6, 0);
            getWorld().addObject(a, getX(), getY());
            Blockteil b = new Blockteil(this, 6, 1);
            getWorld().addObject(b, getX()+1, getY());
            Blockteil c = new Blockteil(this, 6, 2);
            getWorld().addObject(c, getX()-1, getY());
            Blockteil d = new Blockteil(this, 6, 3);
            getWorld().addObject(d, getX(), getY()+1);
            blockA = a;
            blockB = b;
            blockC = c;
            blockD = d;
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
            //rotation();
            counter = 0;
        }
    }
    //by Basti
    /*public void rotation(){
        if (Greenfoot.isKeyDown("a")){
            blockA.rotate('l');
            blockB.rotate('l');
            blockC.rotate('l');
            blockD.rotate('l');
        }
        if (Greenfoot.isKeyDown("d")){
            blockA.rotate('r');
            blockB.rotate('r');
            blockC.rotate('r');
            blockD.rotate('r');
        }  
    }
    */
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
