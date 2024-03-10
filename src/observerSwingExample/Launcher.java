package observerSwingExample;

import javax.swing.SwingUtilities;

public class Launcher {
	
	public static void main(String[] args) {
		
		// SwingUtilities.invokeLater kodun EDT ile çalıştırmak için kullanılır.
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				MainWindow mainWindow = new MainWindow();
				mainWindow.show();
			}
		});
	}

}
