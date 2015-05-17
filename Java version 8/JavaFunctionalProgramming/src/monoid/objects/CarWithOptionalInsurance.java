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
public class CarWithOptionalInsurance {
    private Optional<InsuranceWithOptionalName> insurance;

    public Optional<InsuranceWithOptionalName> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<InsuranceWithOptionalName> insurance) {
        this.insurance = insurance;
    }
}
