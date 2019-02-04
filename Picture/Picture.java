
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square background;
    private Square bottom;
    private Circle wave1;
    private Circle wave2;
    private Circle wave3;
    private Circle wave4;
    private Circle wave5;
    private Circle wave6;
    private Square base;
    private Triangle roof;
    private Square boat;
    private Square boat2;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square door;
    private Square door2;
    private Circle doorknob;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background = new Square();
        background.changeSize(500);
        background.moveHorizontal(0);
        background.moveVertical(-10);
        background.changeColor("yellow");
        background.makeVisible();
        
        bottom = new Square();
        bottom.changeSize(500);
        bottom.moveHorizontal(0);
        bottom.moveVertical(170);
        bottom.changeColor("blue");
        bottom.makeVisible();
        
        wave1 = new Circle();
        wave1.changeSize(70);
        wave1.moveHorizontal(-20);
        wave1.moveVertical(120);
        wave1.changeColor("yellow");
        wave1.makeVisible();
        
        wave2 = new Circle();
        wave2.changeSize(70);
        wave2.moveHorizontal(40);
        wave2.moveVertical(120);
        wave2.changeColor("yellow");
        wave2.makeVisible();
        
        wave3 = new Circle();
        wave3.changeSize(70);
        wave3.moveHorizontal(100);
        wave3.moveVertical(120);
        wave3.changeColor("yellow");
        wave3.makeVisible();
        
        wave4 = new Circle();
        wave4.changeSize(70);
        wave4.moveHorizontal(160);
        wave4.moveVertical(120);
        wave4.changeColor("yellow");
        wave4.makeVisible();
        
        wave5 = new Circle();
        wave5.changeSize(70);
        wave5.moveHorizontal(220);
        wave5.moveVertical(120);
        wave5.changeColor("yellow");
        wave5.makeVisible();
        
        wave6 = new Circle();
        wave6.changeSize(70);
        wave6.moveHorizontal(280);
        wave6.moveVertical(120);
        wave6.changeColor("yellow");
        wave6.makeVisible();
        
        base = new Square();
        base.changeSize(150);
        base.moveHorizontal(80);
        base.moveVertical(70);
        base.changeColor("red");
        base.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(80, 190);
        roof.moveHorizontal(150);
        roof.moveVertical(-5);
        roof.changeColor("green");
        roof.makeVisible();
        
        boat = new Square();
        boat.changeSize(40);
        boat.moveHorizontal(60);
        boat.moveVertical(210);
        boat.changeColor("black");
        boat.makeVisible();
        
        boat2 = new Square();
        boat2.changeSize(40);
        boat2.moveHorizontal(200);
        boat2.moveVertical(210);
        boat2.changeColor("black");
        boat2.makeVisible();
        
        window = new Square();
        window.changeSize(40);
        window.moveHorizontal(180);
        window.moveVertical(90);
        window.changeColor("green");
        window.makeVisible();
        
        window2 = new Square();
        window2.changeSize(40);
        window2.moveHorizontal(95);
        window2.moveVertical(90);
        window2.changeColor("green");
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeSize(40);
        window3.moveHorizontal(95);
        window3.moveVertical(150);
        window3.changeColor("green");
        window3.makeVisible();
        
        window4 = new Square();
        window4.changeSize(40);
        window4.moveHorizontal(180);
        window4.moveVertical(150);
        window4.changeColor("green");
        window4.makeVisible();
        
        door = new Square();
        door.changeSize(30);
        door.moveHorizontal(140);
        door.moveVertical(190);
        door.changeColor("green");
        door.makeVisible();
        
        door2 = new Square();
        door2.changeSize(30);
        door2.moveHorizontal(140);
        door2.moveVertical(170);
        door2.changeColor("green");
        door2.makeVisible();
        
        doorknob = new Circle();
        doorknob.changeSize(10);
        doorknob.moveHorizontal(160);
        doorknob.moveVertical(200);
        doorknob.changeColor("black");
        doorknob.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(base != null)   // only if it's painted already...
        {
            base.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            background.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(base != null)   // only if it's painted already...
        {
            base.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            background.changeColor("yellow");
        }
    }

}
