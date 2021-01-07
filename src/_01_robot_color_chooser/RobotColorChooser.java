//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;
 

public class RobotColorChooser {
	public static void main(String[] args)  {
		//1. Create a new Robot
		Robot jeff = new Robot();
		jeff.penDown();
		jeff.setSpeed (1999999999);
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 100; i++) {
			
		
		String bot =JOptionPane.showInputDialog("what color do you want robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
if(bot.equals("red")){
jeff.setPenColor(184,24,24);}
else if(bot.equals("orange")){
jeff.setPenColor(255,174,0);}
else if(bot.equals("yellow")){
jeff.setPenColor(255,274,0);}
else if(bot.equals("green")){
jeff.setPenColor(0,255,81);}
else if(bot.equals("blue")){
jeff.setPenColor(0,81,255);}
else if(bot.equals("purple")){
jeff.setPenColor(149,0,255);}
else if(bot.equals("black")){
jeff.setPenColor(0,0,0);} 
else if(bot.equals("white")){
jeff.setPenColor(255,255,255);} 
        //6. If the user doesn’t enter anything, choose a random color
else{
jeff.setRandomPenColor();}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		//done
		//4. Set the pen width to 10
		jeff.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
jeff.move(100);
jeff.turn(90);
jeff.move(100);
jeff.turn(90);
jeff.move(100);
jeff.turn(90);
jeff.move(100);
	}}
}