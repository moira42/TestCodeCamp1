package com.introToOOP;

public class ClassAConstructor {
    String maize;
    int grains;
    boolean yellow;

    public ClassAConstructor(String maize) {
       this.maize = maize;

    }
    public ClassAConstructor(String maize, int grains) {
       this.grains = grains;
    }
    public ClassAConstructor(String maize, int grains, boolean yellow) {
        this.yellow = yellow;
    }
    public void printClassA() {
        System.out.println(maize);
    }

}





