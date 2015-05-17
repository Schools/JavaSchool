/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.filter.attempt2;

import business.objects.Apple;
import java.util.ArrayList;
import java.util.List;

/**
 * Requirement : Filter Apples by Colour and Weight as and when required
 * @author Narendran
 */
public class AppleFilter {
    
    public static List<Apple> filterApplesByColour(List<Apple> inventory, String colour) {
        List<Apple> result = new ArrayList(); // No diamond JAVA 8 Feature required on right side
        for(Apple apple:inventory) {
            if(colour.equalsIgnoreCase(apple.getColour())){
                result.add(apple);
            }
        }
        return result;
    }
    
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, Long weight) {
        List<Apple> result = new ArrayList(); // No diamond JAVA 8 Feature required on right side
        for(Apple apple:inventory) {
            if(apple.getWeight()>weight){
                result.add(apple);
            }
        }
        return result;
    }
    
}
