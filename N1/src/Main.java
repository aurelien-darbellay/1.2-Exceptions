import exceptions.VendaBuidaException;
import market.Producte;
import market.Venda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producte> products = new ArrayList<Producte>();
        Venda venda = new Venda();
        try{
            venda.calcularTotal();
            System.out.println(venda.getTotalValueSale());
        }
        catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
        Producte p1 = new Producte("bubble", 1);
        Producte p2 = new Producte("trolley", 7);
        products.add(p1);
        products.add(p2);
        Venda segundaVenda = new Venda(products);
        try{
            segundaVenda.calcularTotal();
            System.out.println(segundaVenda.getTotalValueSale());
        }
        catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
        try {Producte absentProduct = products.get(2);}
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}