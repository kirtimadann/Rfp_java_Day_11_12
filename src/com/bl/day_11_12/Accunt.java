package com.bl.day_11_12;

public class Accunt {
    private double balance;


    public Accunt(double inibalance){

        if(inibalance > 0.0)

            inibalance = 25000;

        System.out.println("total amount :" + inibalance);

    }

    public void credit( double amount){

        balance = balance + amount;
        System.out.println(balance);
    }

    public  void debit (double debitamount){

        if(debitamount > balance){

            debitamount = 0.0;

            System.out.println("check your balance");
        }

        balance = balance - debitamount;

        System.out.println(balance);

    }


    public  double getBalance(){

        return  balance;

    }


}
