/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monoid.objects;

import java.util.Optional;

/**
 *
 * @author Narendran
 */
public class PersonWithOptionalCar {
    private Optional<CarWithOptionalInsurance> car;

    public Optional<CarWithOptionalInsurance> getCar() {
        return car;
    }

    public void setCar(Optional<CarWithOptionalInsurance> car) {
        this.car = car;
    }
}
