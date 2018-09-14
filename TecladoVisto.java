import javax.swing.*;

public class TecladoVisto{
	public static void main(String[] args ){
		String name = "";
		name=JOptionPane.showInputDialog("Please enter your name");
		String msg = "Hello " + name + "!";
		JOptionPane.showMessageDialog(null, msg);
	}
}