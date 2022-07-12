import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Blockteil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{

    private int counter;
    private int counterLo;
    private Kontrollfeld kontrollfeld;
    private Blockteil blockA;
    private Blockteil blockB;
    private Blockteil blockC;
    private Blockteil blockD;
    private boolean dead;
    private List blocks = new ArrayList();

    public Block(Kontrollfeld k) {
        kontrollfeld = k;
        dead = false;
    }

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
        blocks.add(blockA);
        blocks.add(blockB);
        blocks.add(blockC);
        blocks.add(blockD);
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
    //by Jan
    public boolean compareLists(List l, List m){
        for(int i = 0; i <= l.size(); i++){
            for(int j = 0; j <= l.size(); j++){
                if(l.get(i) == m.get(j)){
                    return true;
                }
            }
        }
        return false;
    }
    //by Basti
    public void rotation(){
        if (Greenfoot.isKeyDown("a")){
            if(!dead) {
                if(blockA.getShape() != 0) {
                    List l0 = getWorld().getObjectsAt(getX(), getY(), null);
                    List l1 = getWorld().getObjectsAt(getX(), getY()+1, null);
                    List l2 = getWorld().getObjectsAt(getX(), getY()-1, null);
                    List l3 = getWorld().getObjectsAt(getX()+1, getY(), null);
                    List l4 = getWorld().getObjectsAt(getX()+1, getY()+1, null);
                    List l5 = getWorld().getObjectsAt(getX()+1, getY()-1, null);
                    List l6 = getWorld().getObjectsAt(getX()-1, getY(), null);
                    List l7 = getWorld().getObjectsAt(getX()-1, getY()+1, null);
                    List l8 = getWorld().getObjectsAt(getX()-1, getY()-1, null);
                }

                blockA.rotate("l");
                blockB.rotate("l");
                blockC.rotate("l");
                blockD.rotate("l");

            }
        }
        if (Greenfoot.isKeyDown("d")){
            if(!dead) {

                if(blockA.getShape() != 0) {
                    if (!getWorld().getObjectsAt(getX(), getY()-1, null).isEmpty()) {return;}
                    if (!getWorld().getObjectsAt(getX(), getY()+1, null).isEmpty()) {return;}
                    if (!getWorld().getObjectsAt(getX(), getY()+2, null).isEmpty()) {return;}

                }

                blockA.rotate("r");
                blockB.rotate("r");
                blockC.rotate("r");
                blockD.rotate("r");
            } 
        }
    }
    //by Lorenz
    public boolean großeobjekte(){
        if(isTouching(Block.class)){
            kontrollfeld.summon();
            dead = true;
            return true;
        }
        else {
            return false;
        }
    }
    //by Lorenz
    public boolean checkliegen(){
        //  || !getWorld().getObjectsAt(blockA.getX(), blockA.getY()-1, null).isEmpty() || !getWorld().getObjectsAt(blockB.getX(), blockB.getY()-1, null).isEmpty() || !getWorld().getObjectsAt(blockC.getX(), blockC.getY()-1, null).isEmpty() || !getWorld().getObjectsAt(blockD.getX(), blockD.getY()-1, null).isEmpty()

        if(blockA.isAtEdge()  || blockB.isAtEdge() || blockC.isAtEdge() || blockD.isAtEdge()) { 

            kontrollfeld.summon();
            dead = true;
            return true;
        }
        else{ return false;
        }
    }
    //by Lorenz
    public void fallen(){
        counterLo++;
        if(counter==79) {
            if(dead == false) {
                if(großeobjekte() == false) {
                    if(checkliegen() == false) {
                        setLocation(getX(), getY() + 1);
                        blockA.setLocation(blockA.getX(), blockA.getY() + 1);
                        blockB.setLocation(blockB.getX(), blockB.getY() + 1);
                        blockC.setLocation(blockC.getX(), blockC.getY() + 1);
                        blockD.setLocation(blockD.getX(), blockD.getY() + 1);
                    }
                    if(isTouching(Block.class)){
                        if(checkliegen() == false) {

                            setLocation(getX(), getY() - 1);
                            blockA.setLocation(blockA.getX(), blockA.getY() - 1);
                            blockB.setLocation(blockB.getX(), blockB.getY() - 1);
                            blockC.setLocation(blockC.getX(), blockC.getY() - 1);
                            blockD.setLocation(blockD.getX(), blockD.getY() - 1);
                        }
                    }
                } 
            }
            counter = 0;

        }

    }
}

