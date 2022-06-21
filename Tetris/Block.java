import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class block here.
 * 
 * @author (Lorenz) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    private int Form;
    private int counter;

    public Block(){
        counter = 0;

    }

    public void act()
    {
        counter++;   
        if(counter==79) {

            if(checkliegen() == false){   
                fallen(); 

            }
            else{ if(großeobjekte() == false){
                    fallen();}}
            
        
            
            
            counter = 0;

        }
        checkliegen();

        großeobjekte();

    }

    public void fallen(){
        setLocation(getX(), getY() + 1);
        if(isTouching(Block.class)){
            setLocation(getX(), getY() - 1);
        }
        

    }

    public boolean checkliegen(){
        if(isAtEdge()) { 
            return true;

        }
        else{ return false;

        }
    }

    public boolean großeobjekte(){

        if(isTouching(Block.class)){
            return true;

        }

        else {

            return false;
        }

    }


}


