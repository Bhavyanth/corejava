package com.designpatterns.builderpattern;

public abstract class ColdDrink implements Item 
{ 
    @Override public Packing packing() { 
        return new Bottle(); 
    } 
    @Override public abstract float price(); 
}
