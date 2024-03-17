package Contribuinte;

public class PessoaFisica {
    private String name;
    private double annualIncome;
    private double healthExpend;

    public PessoaFisica(String name, double annualIncome, double healthExpend) {
        this.name = name;
        this.annualIncome = annualIncome;
        this.healthExpend = healthExpend;
    }

    public String getName() {
        return name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public double getHealthExpend() {
        return healthExpend;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected double taxCost(double annualIncome, double healthExpend){
        double taxRate = annualIncome > 20000 ? 0.25 : 0.15;
        double healthDeduction = healthExpend > 0 ? healthExpend / 2 : 0;
        return (annualIncome * taxRate) - healthDeduction;
    }
    protected double taxCost(){
        return taxCost(getAnnualIncome(), getHealthExpend());
    }
    public String taxPaid(){
        return String.format("%s: $%.2f", getName(), taxCost(getAnnualIncome(), getHealthExpend()));
    }

}
