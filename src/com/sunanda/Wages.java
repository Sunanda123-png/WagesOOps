package com.sunanda;

public class Wages {
    int IS_FULL_TIME = 1;
    public void calculation()
    {
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck==IS_FULL_TIME)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is not present");
        }
    }
}
class Empwages
{
    public static void main(String[] args)
    {
        Wages eWages=new Wages();
        eWages.calculation();
    }
}
