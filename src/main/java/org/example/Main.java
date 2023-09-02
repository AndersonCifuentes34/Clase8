package org.example;

import Pizza.Base.Base;
import Pizza.Base.Especialidades.PizzaItaliana;
import Pizza.Base.Pizza;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PizzaItaliana pizzaitaliana = new PizzaItaliana("Pizza Italiana", 25, "De Tomate");
        Pizza.addTopping(new Base("Salsa", 5));
        Pizza.addTopping(new Base("Queso mozzarella",    8));
        Pizza.addTopping(new Base("Champion", 5));
        Pizza.prepare();
        System.out.println("Salsa: " + pizzaitaliana.getSalsa());

        double precio = Pizza.getPizzaPrice();
        System.out.println("Precio: " + precio);

    }
}
