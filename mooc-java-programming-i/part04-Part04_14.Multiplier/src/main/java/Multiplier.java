/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Multiplier {


    private Integer multiplier;

    public Multiplier(int number){
        this.multiplier = number;
    }
    public int multiply(int number){
        return number * this.multiplier;
    }
}
