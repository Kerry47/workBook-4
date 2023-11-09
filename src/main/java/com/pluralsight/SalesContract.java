package com.pluralsight;

public class SalesContract extends Contract{
    private final double salesTaxAmount=.05;
    private final int recordingFee=100;
    private double processingFee;
    private double loanRate;
    private int loanTerm;
    private boolean isFinanced;

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, boolean isFinanced) {
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
        double fees = (getVehicleSold().getPrice() * salesTaxAmount) + processingFee + recordingFee;

        return isFinanced ? (getMonthlyPayment() * loanTerm) + fees :
                getVehicleSold().getPrice() + fees;
    }
    //(monthlyPayment * loanTerm) + processingFee +recordingFee +(salesTaxAmount *v.getPrice())

    @Override
    public double getMonthlyPayment() {
        if (!isFinanced){
            return 0;
        }
        double monthlyPayment= (getVehicleSold().getPrice())*(loanRate/12);
        return monthlyPayment;
    }

}
