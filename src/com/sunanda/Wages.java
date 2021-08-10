package com.sunanda;

public class Wages {
    int IS_FULL_TIME = 1;
    int EMP_PER_HOUR_RATE=20;

    public void calculation()
    {
        int emp_hour=0;
        int emp_wages=0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck==IS_FULL_TIME)
        {
            emp_hour=8;
        }

        else
        {
            emp_hour=0;
        }
        emp_wages=emp_hour*EMP_PER_HOUR_RATE;
        System.out.println("Employee wages"+emp_wages);
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
