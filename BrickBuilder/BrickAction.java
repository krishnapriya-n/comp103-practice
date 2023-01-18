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
 * BrickAction
 * Records information about an add, move, or delete action
 * in the BrickConstructor
 */
class BrickAction{

    private String actionStr; // "add", "move", or "delete"
    private Brick brick;   // the brick that was operated on
    private double x, y;   // the position the brick was moved from...

    /**
     * Construct a new BrickAction object with just the brick
     */
    public BrickAction(String actionStr, Brick brick){
        this.actionStr = actionStr;
        this.brick  = brick;
        Trace.println(actionStr + "brick at" + brick.getX() + "," + brick.getY());
    }

    /**
     * Construct a new BrickAction object with a brick and previous position
     */
    public BrickAction(String act, Brick brick, double x, double y){
        this.actionStr = act;
        this.brick = brick;
        this.x = x;
        this.y = y;
        Trace.println(actionStr+ "brick at" + brick.getX()+","+brick.getY()+
            " from "+x+","+y);
    }

    //getters

    /** Return the value of the action field */
    public String getActionStr(){return actionStr;}

    /** Return the value of the brick field */
    public Brick getBrick(){return brick;}

    /** Return the value of the x field */
    public double getX(){return x;}

    /** Return the value of the y field */
    public double getY(){return y;}

}