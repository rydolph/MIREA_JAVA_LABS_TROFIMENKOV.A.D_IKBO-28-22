package ru.mirea.lab1;

import java.lang.*;
public class Ball{
    private String color;
    public Ball(String c){
        color = c;
    }
    public Ball(){
        color = "DD";
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String name){
        return name;
    }

    public String toString(){
        return this.color;
    }
}

