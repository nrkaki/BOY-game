/**
 * Neha Kaki
 * Help
 */

public class Square
{
    public enum State
    {
        unexplored, //_
        onList, //o
        explored, //.
        finalPath, //x
    }
    
    //type of square
    int type;
    static int original;
    
    //defining four types
    int space = 0;
    int wall = 1;
    int start = 2;
    int end = 3;
    
    //where is this square?
    int row;
    int col;
    
    public Square(int r, int c, int t)
    {
        row = r;
        col = c;
        type = t;
        original = t;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public int getCol()
    {
        return col;
    }
    
    public int getType()
    {
        return type;
    }
    
    public void reset()
    {
        type = original;
    }
    
    String toString()
    {
        String s = "NOPEEE";
        
        switch (type)
        {
            case 1: s = "#"; break;
            case 2: s = "S"; break;
            case 3: s = "E"; break;
            
            case 0:
            switch (///)
            {
                case unexplored: s = "_"; break;
    }
}
