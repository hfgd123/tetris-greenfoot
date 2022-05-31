import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class block here.
 * 
 * @author (Lorenz) 
 * @version (a version number or a date)
 */
public class block extends Actor
{
    private int Form;
    private int counter;
    
    
      
    public block(){
        counter = 0;
        
        
    }
    
    
    public void act()
    {
     counter++;   
     if(counter==79) {
         fallen();
         counter = 0;
         
         
     }
    
    
    }
    
   
    public void fallen(){
       setLocation(getX(), getY() + 1);
        
        
        
    }
    
    public void checkliegen(){
      //if() {is.
          
          
          
      }
        
        
    }


}
