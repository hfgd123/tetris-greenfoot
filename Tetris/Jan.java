import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jan extends Actor
{
  
      public int counter;
      
      
    public void act()
    {  counter++;   
        if(counter==79) {

          

        if(großeobjekte() == false)
                  {  fallen();
                    counter = 0;
                }
            



    
    
    
    
    
    
    }
}
public void fallen(){
        setLocation(getX(), getY() + 1);
        if(isTouching(Jan.class)){
            setLocation(getX(), getY() - 1);
        }

    }
public boolean großeobjekte(){

        if(isTouching(Jan.class)){
            return true;

        }

        else {

            return false;
        }

    }
 public boolean checkliegen(){
        if(isAtEdge()) { 
            return true;

        }
        else{ return false;

        }
    }



}
