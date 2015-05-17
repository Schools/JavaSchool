/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curry.example;

import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author Narendran
 */
public class Convertor {
    public static double convert(double amount, double factor, double base){
        return amount * factor + base;
    }
    
    //Higher Order Functions
    public static DoubleUnaryOperator convert(double factor, double base){
        return amount -> amount * factor + base;
    }
}
