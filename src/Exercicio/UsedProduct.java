package Exercicio;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + String.format(", Manufacture Date: %s", getManufactureDate());
    }
}
