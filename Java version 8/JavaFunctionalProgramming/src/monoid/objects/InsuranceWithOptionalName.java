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
public class InsuranceWithOptionalName {
    private Optional<String> name;

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }
}
