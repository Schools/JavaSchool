/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package with.traitormixin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author 712926
 */
public interface PropertyListenerTrait {
    
    default PropertyChangeSupport getPropertyChangeSupport() {
        return new PropertyChangeSupport(this);
    }
    
    default void addPropertyChangeListener(PropertyChangeListener pcl)
    {
        getPropertyChangeSupport().addPropertyChangeListener(pcl);
    }
    default void removePropertyChangeListener(PropertyChangeListener pcl)
    {
        getPropertyChangeSupport().removePropertyChangeListener(pcl);
    }
    
    default void firePropertyChange(String propertyName, Object oldValue, Object newValue){
        getPropertyChangeSupport().firePropertyChange(propertyName, oldValue, newValue);
    }
}
