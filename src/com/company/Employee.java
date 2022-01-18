package com.company;

public class Employee extends Person implements Printable, ClickHandler {

    String Vgod;
    String zvet;

    @Override
    public void go() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void print() {
        System.out.println(name + " "+old);

    }

    @Override
    public void clik() {
        System.out.println("Сейчас " +Vgod+ ". "+ zvet);
    }
}
