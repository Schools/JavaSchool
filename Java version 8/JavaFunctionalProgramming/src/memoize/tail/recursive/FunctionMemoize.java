/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memoize.tail.recursive;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author Narendran
 */
public class FunctionMemoize {
//Function<Integer, Integer> f = x -> x * 2;
//Function<Integer, Integer> g = Memoizer.memoize(f); // different cache
//Function<Integer, Integer> h = Memoizer.memoize(f); // different cache


Integer longCalculation(Integer x) {
  try {
    Thread.sleep(1_000);
  } catch (InterruptedException ignored) {
  }
  return x * 2;
}
Function<Integer, Integer> f = this::longCalculation;
Function<Integer, Integer> g = Memoizer.memoize(f);

public void automaticMemoizationExample() {
  long startTime = System.currentTimeMillis();
  Integer result1 = g.apply(1);
  long time1 = System.currentTimeMillis() - startTime;
  startTime = System.currentTimeMillis();
  Integer result2 = g.apply(1);
  long time2 = System.currentTimeMillis() - startTime;
  System.out.println(result1);
  System.out.println(result2);
  System.out.println(time1);
  System.out.println(time2);
}


BiFunction<Integer, Integer, Integer> h = (x, y) -> x + y;
Function<Integer, Function<Integer, Integer>> hc = x -> y -> x + y;

}
