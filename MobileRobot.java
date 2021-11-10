package bsu.comp152;

import java.awt.*;
import java.awt.Robot;
import java.util.Scanner;

public class MobileRobot extends Robot {
    private String LocomotionType;
    private String name;

    public MobileRobot() throws AWTException {
    }

    public void move (float distance){
        System.out.println("You are moving "+distance+"using your"+locomotionType);
        powerLevel = amountMoved/5;

    }

    public void interactWithWorld(int){
        var inputReader = new Scanner(System.in);
        System.out.println("How far would you like to move?");
        move(float distance);
    }

    public performDemo(){
        recharge currentObject;

    }

    public move(){
        System.out.println("You are moving a default distance using your"+locomotionType);
        powerLevel = amountMoved/5;
    }
}
