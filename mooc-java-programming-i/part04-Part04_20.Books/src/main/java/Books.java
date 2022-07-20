/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Books {
    private String name;
    private String pages;
    private String year;

    public Books(String name, String pages, String year){
        this.name = name;
        this.pages = pages;
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public String getPages(){
        return this.pages;
    }
    public String getYear(){
        return this.year;
    }


    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.year;
    }

}



