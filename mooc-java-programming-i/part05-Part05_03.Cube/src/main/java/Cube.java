/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Cube {

    private int l;
    private int v;
    public Cube(int edgeLength) {
        this.v = edgeLength * edgeLength * edgeLength;
        this.l = edgeLength;
    }
    public int volume(){
        return this.v;
    }
    public String toString() {
        return "The length of the edge is " + this.l + " and the volume " + v;
    }
}