/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.objects;

/**
 *
 * @author Narendran
 */
public class Apple {
    
    private Long weight;
    private String colour;

    public Long getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Apple(Long weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Apple{" + "weight=" + weight + ", colour=" + colour + '}';
    }

}
