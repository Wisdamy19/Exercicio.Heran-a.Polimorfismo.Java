package Contribuinte;

public class PessoaJuridica extends PessoaFisica {
    private int employees;

    public PessoaJuridica(String name, double annualIncome, int employees) {
        super(name, annualIncome, 0);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
    @Override
    protected double taxCost(){
        double tax = 0;
        if (employees < 15){
            tax = getAnnualIncome() * 0.16;
        }
        else {
            tax = getAnnualIncome() * 0.14;
        }
        return tax;
    }
    public String taxPaid(){
        return String.format("%s: %.2f", getName(), taxCost());
    }

}
