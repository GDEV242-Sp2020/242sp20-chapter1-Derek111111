/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square background;
    private Square cloud;
    private Square sand;
    private Triangle roof;
    private Circle sun;
    private Person guy;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        cloud = new Square();
        sand = new Square();
        roof = new Triangle();  
        sun = new Circle();
        guy = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.moveHorizontal(-400);
            background.moveVertical(-400);
            background.changeSize(1000);
            background.changeColor("blue");
            background.makeVisible();
            
            sand.changeColor("tan");
            sand.moveHorizontal(-400);
            sand.moveVertical(100);
            sand.changeSize(1000);
            sand.makeVisible();
            
            cloud.changeColor("white");
            cloud.moveHorizontal(-250);
            cloud.moveVertical(250);
            cloud.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            guy.moveHorizontal(-100);
            guy.moveVertical(50);
            guy.changeSize(50,25);
            guy.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("white");
        sand.changeColor("white");
        sand.changeColor("black");
        guy.changeColor("white");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("blue");
        sand.changeColor("tan");
        cloud.changeColor("white");
        guy.changeColor("black");
        sun.changeColor("yellow");
    }
}
