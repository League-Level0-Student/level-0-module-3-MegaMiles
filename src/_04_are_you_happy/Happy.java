package _04_are_you_happy;
import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
String Happy=JOptionPane.showInputDialog(null,"are you happy!!!!!!!!!!!!!!!");
if(Happy.equals("yes")) {
JOptionPane.showMessageDialog(null,"Keep Doing Whatever You are doing!");	
}
else {
String NotHappy=JOptionPane.showInputDialog("Do you WANT to be Happy?!?!");	

if(NotHappy.equals("yes")) {
JOptionPane.showMessageDialog(null,"Change Something!");		
}
if(NotHappy.equals("no")) {	
JOptionPane.showMessageDialog(null,"Keep Doing Whatever You are doing");	
}}
	
	
	
	
	
	
	
	
}
}
