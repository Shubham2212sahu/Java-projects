package com.railworld;

public class MainAnimalClass {

    void doSomething(MainAnimal a) {
        	a.eat();
        	
        if (a instanceof Dogs) {
            Dogs d = (Dogs) a;
            d.bark();
        }
    }

    public static void main(String[] args) {
    	MainAnimalClass main = new MainAnimalClass();
        main.doSomething(new MainAnimal());
        main.doSomething(new Dogs());
    }
}
