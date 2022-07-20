/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Song {
    private String name;
    private Integer length; //in seconds

    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }
    public String name(){
        return name;
    }
    public int length(){
        return length;
    }
}
