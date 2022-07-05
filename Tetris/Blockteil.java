import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blockteil extends Actor
{
    private Block block;
    private int shape;
    private int blocknr;

    public Blockteil(Block b, int s, int nr) {
        block = b;
        shape = s;
        blocknr = nr;
    }

    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
    /*
    public void rotate(String dir) {
    if(dir == "l") {
    if(shape == 0) {
    return;
    } else if(shape == 1) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 2) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 3) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 4) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 5) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 6) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else return;
    } else if (dir == "r") {
    if(shape == 0) {
    return;
    } else if(shape == 1) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 2) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 3) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 4) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 5) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else if(shape == 6) {
    if(blocknr == 0) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 1) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 2) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    } else if(blocknr == 3) {
    if (getWorld().getObjectsAt(x, y, null).isEmpty())
    {
    setLocation(x, y);
    }
    }
    } else return;
    } else return;
    }
     */
}