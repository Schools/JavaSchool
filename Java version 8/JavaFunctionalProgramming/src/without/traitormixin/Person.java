/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without.traitormixin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Deformed POJO
 * @author Narendran
 */
public class Person
{
    
    PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    private String lastName;
    private String firstName;
    private int age;
    
    public Person(String fn, String ln, int a)
    {
        lastName = ln; firstName = fn; age = a;
    }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String newValue)
    {
        String old = firstName;
        firstName = newValue;
        pcs.firePropertyChange("firstName", old, newValue);
    }
    public String getLastName() { return lastName; }
    public void setLastName(String v) { lastName = v; }
    public int getAge() { return age; }
    public void setAge(int v) { age = v; }
    
    public void addPropertyChangeListener(PropertyChangeListener pcl)
    {
        pcs.addPropertyChangeListener(pcl);
    }
    public void removePropertyChangeListener(PropertyChangeListener pcl)
    {
        pcs.removePropertyChangeListener(pcl);
    }
}
