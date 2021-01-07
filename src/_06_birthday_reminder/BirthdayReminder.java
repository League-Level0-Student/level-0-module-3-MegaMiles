
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String Mom = "January 10th";
		String Dad = "march ?th";
		String Miles = "December 12th";
		String Mia = "August 15";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog(null,"What birthday do you want me to say?");
		// 3. Print out what the user typed
		if (Birthday.equalsIgnoreCase("Mom")) {
		JOptionPane.showMessageDialog(null,Mom);
		}
		else if(Birthday.equalsIgnoreCase("Dad")) {
		JOptionPane.showMessageDialog(null,Dad);	
	}
		else if(Birthday.equalsIgnoreCase("Miles")) {
		JOptionPane.showMessageDialog(null,Miles);	
		}
		else if(Birthday.equalsIgnoreCase("Mia")) {
		JOptionPane.showMessageDialog(null,Mia);;	
		}
		else {
		JOptionPane.showMessageDialog(null,"Thats not a birthday i know.");	
		}
		// 4. if user asked for "mom"
		//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
