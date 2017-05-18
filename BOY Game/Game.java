
import java.awt.*;
import javax.swing.*;

/**
 * Class Game - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */

import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class Game extends JApplet //implements Runnable//, KeyListener
{
    //basic variables
    private final int APPLET_WIDTH = 1200;
    private final int APPLET_HEIGHT = 400;
    //if the game is in hallway mode or classroom mode
    private boolean inHallway = true;
    
    //Achievement boys
    //english
    /*private Achievement psat;
    private Achievement teacher;
    private Achievement sports;
    //math
    private Achievement club;
    private Achievement abroad;
    private Achievement APclass;
    //science
    private Achievement captain;
    private Achievement APscores;
    private Achievement nhs;
    //social science
    private Achievement letters;
    private Achievement intern;
    private Achievement scholar;
    //computer science
    private Achievement sat;
    private Achievement gpa;
    private Achievement essay;*/
    
    //college boys
    
    
    //girl
    
    
    private Hallway myHallway;
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        //Achievement boys
        //english
        /*psat = new Achievement(
        teacher = new Achievement(
        sports = new Achievement(
        //math
        club = new Achievement(
        abroad = new Achievement(
        APclass = new Achievement(
        //science
        captain = new Achievement(
        APscores = new Achievement(
        nhs = new Achievement(
        //social science
        letters = new Achievement(
        intern = new Achievement(
        scholar = new Achievement(
        //computer science
        sat = new Achievement(
        gpa = new Achievement(
        essay = new Achievement(*/
        
        //college boys
        
        
        //girl
        
        
        //background
        myHallway = new Hallway("graphics/maplestoryschool.png", 0, 0);
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }

    /* //this is the thread to make it animate
    public void run()
    {
        //put anyting that needs to be animated here before the repaint
        repaint();
        
        try{
            //this is 60 frames per second (1000/60)
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    */
    
    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
        //sets up the Thread
        //Thread thread = new Thread(this);
        //thread.start(); // this calls the run method
    }

    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        //Introduction Screen
        g.drawString("Welcome to the BOY game!!!", 20, 20);
        
        
        //Draw everything else
        
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
