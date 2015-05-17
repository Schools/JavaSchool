/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.filter.attempt1;

import business.objects.Apple;
import java.util.ArrayList;
import java.util.List;

/**
 * Requirement : Filter only Green Apples
 * @author Narendran
 */
public class AppleFilter {
    
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList(); // No diamond JAVA 8 Feature required on right side
        for(Apple apple:inventory) {
            if("green".equalsIgnoreCase(apple.getColour())){
                result.add(apple);
            }
        }
        return result;
    }
    
}
