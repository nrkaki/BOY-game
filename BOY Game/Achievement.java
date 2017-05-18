/**
 * Write a description of class Achievement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 

import java.awt.event.KeyListener;

public class Achievement implements KeyListener
{
    private String name;
    private String description;
    private ArrayList<KeyEvent> combo;
    
    public Achievement (String call, String info, ArrayList<KeyEvent> combination)
    {
        name = call;
        description = info;
        combo = combination;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void keyPressed (KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.combo.get(0))
        {
            if (e.getKeyCode() == KeyEvent.combo.get(1))
            {
                if (e.getKeyCode() == KeyEvent.combo.get(2))
                {
                    if (e.getKeyCode() == KeyEvent.combo.get(3))
                    {
                        //inventory.addAchievement(this);
                    }
                }
            }
        }
    }
    
    
}
*/