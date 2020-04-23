import javax.swing.JOptionPane;

public class Your_own_adventure {
public static void main(String[] args) {
String fork = JOptionPane.showInputDialog("you are walking in the a dessreted area and then you hit a fork in the road, do you chose right or left?");
if (fork.equals("right")){	
String man = JOptionPane.showInputDialog("you continue walking and then you see a man do you run or fight him?");
if (man.equals("fight")){
JOptionPane.showMessageDialog(null,"End of your Adventure Try again(sad ending) ");
if (man.equals("run")) {
	JOptionPane.showMessageDialog(null,"You run so fast you run off a clif(sad ending) ");	
}
}
else {
	JOptionPane.showInputDialog(null,"you barley escape,End of adventure Try again(happy ending) ");
}
}	
if (fork.equals("left")) {
JOptionPane.showMessageDialog(null,"you continue walking and then... BAM you get hit by a miisle (sad ending) ");	
}

	
	
	
	
	
	
	
	
	
	
	
	
}
}
