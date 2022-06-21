import greenfoot.*;
/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{     
    public Block()
    {
    }
    public void act(){
        moving();
        rotation();
    }
    public void rotation(){
        if (Greenfoot.isKeyDown("a")){
        turn(-90);
     }
          if (Greenfoot.isKeyDown("d")){
        turn(90);
     }  
    }
    public void moving(){
     if (Greenfoot.isKeyDown("left")){
     setLocation(getX()-1,getY());
     }
 
     if (Greenfoot.isKeyDown("right")){
     setLocation(getX()+1,getY());
     }
    }      
}
