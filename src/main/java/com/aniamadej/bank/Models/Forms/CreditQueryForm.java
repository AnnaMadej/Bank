package com.aniamadej.bank.Models.Forms;

public class CreditQueryForm {
    private double amount;
    private double income;
    private int numberOfInstallments;

    public CreditQueryForm() {
    }

    public CreditQueryForm(double amount, double income, int numberOfInstallments) {
        this.amount = amount;
        this.income = income;
        this.numberOfInstallments = numberOfInstallments;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

}
