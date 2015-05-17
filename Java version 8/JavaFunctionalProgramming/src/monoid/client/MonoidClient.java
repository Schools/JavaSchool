/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monoid.client;

import java.util.Optional;
import monoid.objects.Car;
import monoid.objects.CarWithOptionalInsurance;
import monoid.objects.Insurance;
import monoid.objects.InsuranceWithOptionalName;
import monoid.objects.Person;
import monoid.objects.PersonWithOptionalCar;

/**
 *
 * @author Narendran
 */
public class MonoidClient {
    
    
    public static String getCarInsuranceWithDeepDoubts(Person person){
       if(person!=null) {
           Car car = person.getCar();
           if(car != null) {
               Insurance insurance = car.getInsurance();
               if(insurance!=null) {
                   return insurance.getName();
               }
           }
       }
        return "Unknown";
    }
    
    
    public static String getCarInsuranceWithManyChoice(Person person){
        
        if(person ==null) {
            return "Unknown";
        }
        
        Car car = person.getCar();
        if(car == null) {
            return "Unknown";
        }
        
        Insurance insurance = car.getInsurance();
        if(insurance==null) {
            return "Unknown";
        }
        
        return insurance.getName();
    }
    
    public static String getCarInsuranceWithMonoid(Optional<PersonWithOptionalCar> personwithoption){
        Optional<String> optionalName = personwithoption.flatMap(person -> person.getCar())
                .flatMap(car -> car.getInsurance())
                .map(insurance -> insurance.getName()).orElse(Optional.of("UnKnown"));
        return optionalName.get();
    }
    
    
    public static void main(String[] args) {
        Person person = new Person();
        Car car  = new Car();
        Insurance insurance = new Insurance();
        insurance.setName("INS1234");
        car.setInsurance(insurance);
        person.setCar(car);
        
        
        PersonWithOptionalCar person1 = new PersonWithOptionalCar();
        CarWithOptionalInsurance car1  = new CarWithOptionalInsurance();
        InsuranceWithOptionalName insurance1 = new InsuranceWithOptionalName();
        insurance1.setName(Optional.of("INS1234"));
        car1.setInsurance(Optional.of(insurance1));
        person1.setCar(Optional.of(car1));
        
        
        System.out.println(getCarInsuranceWithDeepDoubts(person));
        System.out.println(getCarInsuranceWithManyChoice(person));
        System.out.println(getCarInsuranceWithMonoid(Optional.of(person1)));
    }
}
