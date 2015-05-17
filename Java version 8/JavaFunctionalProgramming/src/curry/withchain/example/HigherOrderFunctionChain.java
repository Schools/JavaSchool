/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curry.withchain.example;

import business.objects.Apple;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Narendran
 */
public class HigherOrderFunctionChain {
 
    public static void main(String[] args) {
        List<Apple> inventory  = new ArrayList();
        Apple apple1 = new Apple(100L, "green");
        inventory.add(apple1);
        Apple apple2 = new Apple(120L, "green");
        inventory.add(apple2);
        Apple apple3 = new Apple(140L, "green");
        inventory.add(apple3);
        Apple apple4 = new Apple(100L, "red");
        inventory.add(apple4);
        Apple apple5 = new Apple(120L, "red");
        inventory.add(apple5);
        Apple apple6 = new Apple(140L, "red");
        inventory.add(apple6);
        Apple apple7 = new Apple(160L, "red");
        inventory.add(apple7);
        Apple apple8 = new Apple(170L, "red");
        inventory.add(apple8);
        Apple apple9 = new Apple(180L, "green");
        inventory.add(apple9);
        Apple apple10 = new Apple(180L, "red");
        inventory.add(apple10);
        
        List<Apple> filteredApples = inventory.stream().filter(t->"green".equalsIgnoreCase(t.getColour()))
                                                .filter(t->t.getWeight()>150L).collect(toList());
        
        List<Apple> filteredApples1 = inventory.parallelStream().filter(t->"green".equalsIgnoreCase(t.getColour()))
                                                .filter(t->t.getWeight()>150L).collect(toList());
        
        for(Apple apple:filteredApples)
        {
            System.out.println("Higher order function with currying and chaining");
            System.out.println(apple);
        }
    }
}
