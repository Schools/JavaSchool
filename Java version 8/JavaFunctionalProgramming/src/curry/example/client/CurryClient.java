/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curry.example.client;

import curry.example.Convertor;
import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author Narendran
 */
public class CurryClient {
    
    public static void main(String[] args) {
       double result = Convertor.convert(10, 1.8, 32);
       System.out.println(result);
       
       //Temperature Convertor
       double cInF = Convertor.convert(10, 1.8, 32);
       System.out.println(cInF);
       
       //Currency Convertor
       double dollarToPounds = Convertor.convert(10, 0.6, 0);
       System.out.println(dollarToPounds);
       
       //Kilometer to Miles
       double kmToMiles = Convertor.convert(27, 0.62137, 0);
       System.out.println(kmToMiles);
       
       //Temperature Convertor
       DoubleUnaryOperator cInFFunc = Convertor.convert(1.8, 32);
       System.out.println(cInFFunc.applyAsDouble(10)); // Applicative Functors
       
       //Currency Convertor
       DoubleUnaryOperator dollarToPoundsFunc = Convertor.convert(0.6, 0);
       System.out.println(dollarToPoundsFunc.applyAsDouble(10)); // Applicative Functors
       
       //Kilometer to Miles
       DoubleUnaryOperator kmToMilesFunc = Convertor.convert(0.62137, 0);
       System.out.println(kmToMilesFunc.applyAsDouble(27)); // Applicative Functors
       
       
    }
}
