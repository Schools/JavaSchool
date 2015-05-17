/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without.traitormixin;

/**
 *
 * @author 712926
 */
public class SeaPlane implements Floatable, Flyable{

    Floatable floatable;
    Flyable flyable;

    public SeaPlane(Floatable floatable, Flyable flyable) {
        this.floatable = floatable;
        this.flyable = flyable;
    }
    
    // cut,copy & paste for another floatable
    @Override
    public void floatOn() {
        floatable.floatOn(); 
    }

    // cut,copy & paste for another flyable
    @Override
    public void fly() {
       flyable.fly(); 
    }
    
}
