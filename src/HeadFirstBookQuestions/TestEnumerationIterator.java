package HeadFirstBookQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEnumerationIterator {

	public static void main(String[] args) {
		

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Selam 1 ");
        arrayList.add("Selam 2 ");
        arrayList.add("Selam 3 ");
        

        Iterator<String> iterator = arrayList.iterator();
        QuestionEnumerationIterator iteratorAdapter = new QuestionEnumerationIterator(iterator);

        
        System.out.println("\nEnumeration using Adapter:");
        while (iteratorAdapter.hasMoreElements()) {
            System.out.println(iteratorAdapter.nextElement());
        }
				
        Iterator<String> iteratorNormal = arrayList.iterator();
        
        System.out.println("Original Iterator:");
        while (iteratorNormal.hasNext()) {
            System.out.println(iteratorNormal.next());
        }
	}
}
