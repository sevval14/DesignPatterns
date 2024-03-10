package observerSwingExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {

	//ActionListener, özellikle düğme tıklamaları, menü öğesi seçimleri ve metin kutusu 
	//içeriği gibi kullanıcı etkileşimlerini dinlemek için kullanılır.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Don’t do it, you might regret it!");		
		
	}

}
