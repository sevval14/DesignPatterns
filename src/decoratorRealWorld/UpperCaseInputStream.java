package decoratorRealWorld;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {
	
	public UpperCaseInputStream(InputStream in) {
		//ben super ile üs sınıfıma in adlı bir InputStream neseni geçiridim.
		super(in);
	}

	public int read() throws IOException {
		int c = super.read();
		//read() metodu, girdi akışından bir byte okur ve okuduğu byte'ın tamsayı değerini döndürür
		//Eğer girdi akışının sonuna ulaşılmışsa ve okuma işlemi tamamlanmışsa, -1 değeri döner.
		return (c == -1 ? c : Character.toUpperCase((char)c));
	}
}
		