package com.aniamadej.bank.Models;

import com.aniamadej.bank.Models.Forms.CreditQueryForm;

public class CreditResponseModel {
    CreditQueryForm form;

    int possibleInstallments;
    String response;
    String infoClass;

    public CreditResponseModel(){
        this.infoClass = "invisible";
    }

    public CreditResponseModel(CreditQueryForm form) {
        this.form = form;
        this.possibleInstallments = this.calculatePossibleInstallments();
        if(possibleInstallments>form.getNumberOfInstallments()){
            this.response = "Nie przydzielono kredytu! Spróbuj z inną ilością rat!";
            this.infoClass = "refuse";
        }
        if(possibleInstallments<=form.getNumberOfInstallments()){
            this.response = "Kredyt przydzielony!";
            this.infoClass = "approve";
        }
    }

    public CreditQueryForm getForm() {
        return form;
    }

    public void setForm(CreditQueryForm form) {
        this.form = form;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getInfoClass() {
        return infoClass;
    }

    public void setInfoClass(String infoClass) {
        this.infoClass = infoClass;
    }

    public int calculatePossibleInstallments(){
        double possibleInstallmentsCalculation =  form.getAmount()/form.getIncome();
        if (possibleInstallmentsCalculation != (int)possibleInstallmentsCalculation) possibleInstallmentsCalculation +=1;
        return (int)possibleInstallmentsCalculation;
    }

    public int getPossibleInstallments() {
        return possibleInstallments;
    }

    public void setPossibleInstallments(int possibleInstallments) {
        this.possibleInstallments = possibleInstallments;
    }
}
