import exceptions.VendaBuidaException;
import market.Producte;
import market.Venda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producte> products = new ArrayList<Producte>();
        Venda venda = new Venda();
        venda.tryCalculateTotal();
        Producte p1 = new Producte("bubble", 1);
        Producte p2 = new Producte("trolley", 7);
        products.add(p1);
        products.add(p2);
        Venda segundaVenda = new Venda(products);
        segundaVenda.tryCalculateTotal();
        try {Producte absentProduct = products.get(2);}
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}