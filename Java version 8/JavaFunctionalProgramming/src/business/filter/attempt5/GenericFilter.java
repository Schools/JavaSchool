/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.filter.attempt5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Narendran
 */
public class GenericFilter {
    
     public static <T> List<T> filter(List<T> inventory, Predicate predicate) {
        List<T> result = new ArrayList(); // No diamond JAVA 8 Feature required on right side
        for(T e:inventory) {
            if(predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
