package observerSwingExample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow {
	
	private JFrame window;
	
	 public MainWindow() {
		 
		 window = new JFrame();
		 //Jframe ensure ceratimg window for java during use swing
		 window.setTitle("Observer Activity");
		 window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	     window.setSize(800, 500);
		 window.setLocationRelativeTo(null);
		 //null means. Windows should be in center of screen
	}
	 
	 
	 
	 
	public  void show() {
		JButton button = new JButton();
		//Dimensionun bir neseninin boyutuyla iligli olan GUI kütüphanlerinde kullanılır
		button.setPreferredSize(new Dimension(100, 30));
		button.setText("Button");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		window.setLayout(new FlowLayout()); 

		window.getContentPane().add(BorderLayout.CENTER, button);

		window.setVisible(true);
		
	}
}
