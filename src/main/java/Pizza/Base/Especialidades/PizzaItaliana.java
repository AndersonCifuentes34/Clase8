package Pizza.Base.Especialidades;

import Pizza.Base.Base;
import Pizza.Base.Pizza;

public class PizzaItaliana extends Pizza {
    public String getSalsa;
    private String salsa;
    
    public PizzaItaliana(String name, double price, String salsa, Base... toppings){
        super(name);
        this.salsa = salsa;
    }

    public PizzaItaliana(String PizzaItaliana) {
        super(PizzaItaliana);
    }

    public static String getSalsa() {
        System.out.println("salsa");
        return null;
    }
}
