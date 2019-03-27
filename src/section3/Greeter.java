package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
		System.out.println("HELLO");	
		JOptionPane.showMessageDialog(null, "HELLO");
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "WASSSSSOOOP " +name);
}
}
