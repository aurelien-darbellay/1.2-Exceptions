package market;

import exceptions.VendaBuidaException;

import java.util.ArrayList;

public class Venda {
    private final ArrayList<Producte> products;
    private double totalValueSale;

    public Venda() {
        this.products = new ArrayList<Producte>();
    }

    public Venda(ArrayList<Producte> products) {
        this.products = products;
    }

    public ArrayList<Producte> getProducts() {
        return products;
    }

    public double getTotalValueSale() {
        return totalValueSale;
    }

    public void setTotalValueSale(double totalValueSale) {
        this.totalValueSale = totalValueSale;
    }

    public void calcularTotal() throws VendaBuidaException{
        if (this.products.isEmpty()){throw new VendaBuidaException();}
        else {
            this.totalValueSale = 0;
            for (Producte product: products){
                this.totalValueSale += product.getPrice();
            }
        };
    }

    public void tryCalculateTotal(){
        try{
            calcularTotal();
            System.out.println(getTotalValueSale());
        }
        catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
    }

}
