/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.filter.attempt4;

import business.objects.Apple;

/**
 *
 * @author Narendran
 */
public class AppleColourPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equalsIgnoreCase(apple.getColour());
    }
    
}
