package first;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FirstApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Welcome to my app");  //Specify title of app
		frame.setSize(420,420);  //Set the dimensions of the gui frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of app on clicking close icon
		frame.setResizable(false); //Prevent from user changing size of screen
		frame.setVisible(true);
		ImageIcon image = new ImageIcon("logo.png");
		frame.setIconImage(image.getImage());  //Change icon of frame
		frame.getContentPane().setBackground(Color.green); //Change background color
		frame.getContentPane().setBackground(new Color(0,255,0)); //Set custom color with rgb values or write 0xFFFFFF hex values
	}

}
