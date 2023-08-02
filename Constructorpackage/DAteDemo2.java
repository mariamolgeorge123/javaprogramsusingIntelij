package Constructorpackage;

public class DAteDemo2 {
    private int day;
    private int month;
    private int year;

    DAteDemo2()
    {
        day=1;
        month=8;
        year=2023;
    }
    DAteDemo2(int day,int month,int year)
    {
       this.day=day;
       this.month=month;
       this.year=year;
    }

    public DAteDemo2(int day, int month) {
        this.day=day;
        this.month=month;
    }
    public DAteDemo2(int day)
    {
        this.day=day;
    }

    public void printDate()
    {
        System.out.println(day+"/"+month+"/"+year);
        //java compiler create a default constructor
    }
    public static void main(String[] args) {
        DAteDemo2 d=new DAteDemo2();
        d.printDate();
        DAteDemo2 d1=new DAteDemo2(31,7,2023);
        d1.printDate();
        DAteDemo2 d3=new DAteDemo2(31,7);
        d3.printDate();
        DAteDemo2 d4=new DAteDemo2(31);
        d4.printDate();

    }
}
