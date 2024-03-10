package HeadFirstBookQuestions;

import java.util.Enumeration;
import java.util.Iterator;

public class QuestionEnumerationIterator implements Enumeration<String>{
	
    private Iterator<String> iterator;
	
	public QuestionEnumerationIterator(Iterator<String> iterator) {
		this.iterator=iterator;
	}


	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public String nextElement() {
		return iterator.next();
	}

}
