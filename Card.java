import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
   Message m;
    public void act() 
    {
         int mouseX, mouseY ;        
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        } 
    } 
    
    
    public void swiped()
    {
    Actor WorldActor=getOneIntersectingObject(this.getClass());
        if(WorldActor!=null)
         {  
         
      System.out.println("Card Swiped");
        //gb.act();
        Greenfoot.delay(50);
        return;
    }
 
}
}
