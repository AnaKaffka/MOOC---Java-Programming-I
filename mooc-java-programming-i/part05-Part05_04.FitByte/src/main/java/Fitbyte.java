/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Fitbyte {
    private int age;
    private int heartRest;


    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.heartRest = restingHeartRate;

    }

    public double targetHeartRate(double percentageOfMaximum){
        double heartMax = 206.3 - (0.711 * this.age);
        return ((heartMax - this.heartRest) * (percentageOfMaximum) + this.heartRest);
    }


}
