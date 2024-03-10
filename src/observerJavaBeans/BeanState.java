package observerJavaBeans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BeanState {

	public static void main(String[] args) {
		MyBean bean = new MyBean();

        // PropertyChangeListener ekleyin
        PropertyChangeListener listener = new PropertyChangeListener() {
        	
        	//evt.getPropertyName() value değerini çıkardı çünkü MyBean kısmın fireProperty kısmında değişikliği valu olarak kaydettik
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName() +
                        " old value: " + evt.getOldValue() +
                        ", new value: " + evt.getNewValue());
            }
        };
        
        bean.addPropertyChangeListener(listener);

        bean.setValue("New Value");

     
        bean.setValue("Another Value");
        
        bean.setValue("Hey Value");
        
        
        //ben istediğim kadar listener eklemem yeterli bu PropertyChangeListener olarak ekliyorum sonra 
        //PropertyChangeSupport sayesinde eski ve yeni değeri dinliyor ve sisteme kaydeiyor.
    }
}
