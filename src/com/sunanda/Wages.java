package com.sunanda;

public class Wages {
    public static final int PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_PER_HOUR_RATE=20;

    public void calculation()
    {
        int emp_hour=0;
        int emp_wages=0;
        int empCheck =(int) Math.floor(Math.random()*10)%3;
        switch(empCheck)
        {
            case IS_FULL_TIME:
                emp_hour=8;
                break;
            case PART_TIME:
                emp_hour=4;
                break;
            default:
                emp_hour=0;
                break;
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
