package observerJavaBeans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyBean {
	
    private String value;
    
	
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
 
        this.pcs.addPropertyChangeListener(listener);
    }
    
    

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    
    

    public String getValue() {
        return this.value;
    }
    

    public void setValue(String newValue) {
        String oldValue = this.value;
        this.value = newValue;
        //bir özelliğin değiştiğini duyurur 
        this.pcs.firePropertyChange("value", oldValue, newValue);
    }
}
