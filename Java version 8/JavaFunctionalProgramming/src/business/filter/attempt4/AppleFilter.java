/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.filter.attempt4;

import business.objects.Apple;
import java.util.ArrayList;
import java.util.List;

/**
 * Requirement : more requirement changes in Apple filter - combination changes
 * @author Narendran
 */
public class AppleFilter {
    
    public static List<Apple> filter(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList(); // No diamond JAVA 8 Feature required on right side
        for(Apple apple:inventory) {
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
