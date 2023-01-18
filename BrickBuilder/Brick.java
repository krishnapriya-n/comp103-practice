/*
 * Code used for Week 1 of COMP103 T3 Lecture
 * from Victoria University of Wellington
 * 
 * Owner: Pondy
 * 
 * This code has been used for practicing by Krishna Priya N
 */

import ecs100.*;
import java.awt.Color;
import java.util.*;
import javax.swing.JColorChooser;

/**
 * A Brick
 * Has a color and a position.
 * Bricks have to be aligned with the grid
 */
class Brick{
    public static final int SIZE = 30;

    private Color color;
    private int left;   // position
    private int top;

    /**
     * Construct a new Brick object over the position (x,y)
     * Identifies the appropriate grid position for the Brick
     */
    public Brick(double x, double y, Color color){
        this.color = color;
        moveTo(x,y);
    }

    /**
     * Move the brick to the specified position
     */
    public void moveTo(double x, double y){
        left = ((int)x)/SIZE * SIZE;
        top =  ((int)y)/SIZE * SIZE;
    }

    /**
     * Is the position (x,y) on top of the brick
     */
    public boolean on(double x, double y){
        return (x>=left && x<left+SIZE && y>=top && y<top+SIZE);
    }

    /**
     * Draw the brick
     */
    public void draw(){
        UI.setColor(color.brighter());
        UI.fillRect(left, top, SIZE, SIZE);
        UI.setColor(color.darker());
        UI.setLineWidth(4);
        UI.drawRect(left+1, top+1, SIZE-2, SIZE-2);
    }

    /**
     * Return x position on the brick
     */
    public double getX(){
        return left+SIZE/2;
    }

    /**
     * Return y position on the brick
     */
    public double getY(){
        return top+SIZE/2;
    }

}