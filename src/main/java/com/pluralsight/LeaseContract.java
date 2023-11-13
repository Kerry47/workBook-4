package com.pluralsight;

public class LeaseContract extends Contract {
    private final int leaseTerm= 36;
    private final double leaseRate= .04;
    private double expectedEndingValue;


    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);

        //determine residual value
            //residualValue = vehiclePrice * expectedEndingValue
        //calculate monthly depreciation
            //monthlyDepreciation = (residualValue - any deductions) / leaseTerm
        //calculate monthly rent charge
            //monthlyRentCharge = monthlyDepreciation + residualValue * leaseRate
        //calculate monthly tax
            //
        //leaseFee = 0.07 * originalPrice
            //
    }

    /*
    @Override
    public double getTotalPrice() {
        return (getVehicleSold().getPrice() - expectedEndingValue) + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        int numberOfPayments = 36;
        double interestRate = 4.0 / 1200;
        double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
        monthlyPayment = Math.round(monthlyPayment * 100);
        monthlyPayment /= 100;
        return monthlyPayment;
    }
    */

    @Override
    public double getTotalPrice() {
    //Double totalPrice = leaseFee +
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        double financeRate = leaseRate * leaseTerm;
        return 0;
    }
}
