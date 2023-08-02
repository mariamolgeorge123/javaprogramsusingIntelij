package Constructorpackage;

public class DateDemo {
    private int day;
    private int month;
    private int year;
    public void printDate()
    {
        System.out.println(day+"/"+month+"/"+year);
        //java compiler create a default constructor
    }
    public static void main(String[] args) {
        DateDemo d=new DateDemo();
        d.printDate();

    }
}

