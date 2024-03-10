package observerSwingExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener{

	//ActionListener, özellikle düğme tıklamaları, menü öğesi seçimleri ve metin kutusu 
	//içeriği gibi kullanıcı etkileşimlerini dinlemek için kullanılır.

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Come on, do it!");
		
	}
	
}
