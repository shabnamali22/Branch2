package org.example;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }


    public boolean eat (String foodType){
        return true;
    }

}
