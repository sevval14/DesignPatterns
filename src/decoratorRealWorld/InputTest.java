package decoratorRealWorld;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class InputTest {

	public static void main(String[] args) {
		
		int c;
		
		try {
			//tek tek byte byte okumaka yerine bufferedInputStream kalıp bir şekilde bakar.
			
			InputStream	inputStream = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("src/decoratorRealWorld/test.txt")));
			
			while((c = inputStream.read()) >=0) {
				//okuma işlemi bitince c  -1 e eşit olucak o yüzden 0 dan büyük diyoz
				System.out.print((char) c);
			}
			
		} catch (FileNotFoundException e) {
			//dosya adı veya yol yanlışsa veya dosya sistemine erişim izniniz yoksa bu istisna oluşabilir.
			throw new RuntimeException();
		}catch (IOException e) {	
			//Dosya okuma veya yazma sırasında oluşan hataları da kapsar.
			throw new RuntimeException();
		}
	}
}
