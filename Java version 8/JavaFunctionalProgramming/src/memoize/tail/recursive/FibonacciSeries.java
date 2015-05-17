/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memoize.tail.recursive;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Narendran
 */
public class FibonacciSeries {
    
    /*
     * Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * @return Fibonacci number
     */
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }
    
    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
           
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
          
        }
        return fibonacci; //Fibonacci number
      
    }   
 
    private static final Map<Integer,Integer> cache = new HashMap();
    
    /*
     * Java Program to calculate Fibonacci numbers with memorization
     * This is quite fast as compared to previous Fibonacci function
     * especially for calculating factorial of large numbers.
     */
    public static int improvedFibo(int number){
        Integer fibonacci = cache.get(number);
        if(fibonacci != null){
            return fibonacci; //fibonacci number from cache
        }
        //fibonacci number not in cache, calculating it
        fibonacci = fibonacci2(number);
        
        //putting fibonacci number in cache for future request 
        cache.put(number, fibonacci); 
        return fibonacci;
    }
    
    private static final Map<Integer,Integer> memo = new ConcurrentHashMap<>();
    static {
       memo.put(0,0); //fibonacci(0)
       memo.put(1,1); //fibonacci(1)
    }
    
    public static Integer newFibonacci(int x) {
        return memo.computeIfAbsent(x, n -> newFibonacci(n-1) + fibonacci(n-2));
        // it works if only one parameter is present for the function
        // what about more parameters?
        //Short answer: nothing. There are no such things in this world as functions with several arguments. 
        //Functions are applications of one set (the source set) to another set (the target set). So, they simply can't have several arguments.
        //But this does not solve our problem. What is the functional equivalent to a method with several arguments?
    }
}
