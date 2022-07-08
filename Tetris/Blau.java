import greenfoot.*;
/**
 * Write a description of class Blockv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blau extends Actor
{     
    public int counter;
    public int counter2;
    private int counterl;
    public Blau()
    {
        counter = 0;
    }

    public void act(){
        counter2++;
        if (counter == 7){
            rotation();
            counter2 = 0;
        } 
        counter++;
        if (counter == 8){
            moving();
            counter = 0;
        }
        counterl++;   
        if(counterl==79) {

                fallen(); 

            }
            else{ if(großeobjekte() == false){
                    fallen();}

            
            counterl = 0;
        }
        checkliegen();

        großeobjekte();
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

   

    public void fallen(){
        setLocation(getX(), getY() + 1);
        if(isTouching(Blau.class)){
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

        if(isTouching(Blau.class)){
            return true;

        }

        else {

            return false;
        }

    }

}
