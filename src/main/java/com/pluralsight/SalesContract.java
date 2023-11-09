package com.pluralsight;

public class SalesContract extends Contract{
    private double processingFee;
    private double loanRate;
    private int loanTerm;
    private boolean isFinanced;
    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold,boolean isFinanced) {
        super(date, customerName, customerEmail, vehicleSold);


        if(vehicleSold.getPrice()>=10000){
            processingFee= 495;
            loanRate=.0425;
            loanTerm=48;
        }else{
            processingFee=295;
            loanRate=.0525;
            loanTerm= 24;
        }

    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        if (!isFinanced) return 0;

        return 100;
    }

}
