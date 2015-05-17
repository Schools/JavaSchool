/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package with.traitormixin;

/**
 *
 * @author 712926
 */
public interface Floatable {
    default void floatOn() {
        System.out.println("I can Float!!!");
    }
}
