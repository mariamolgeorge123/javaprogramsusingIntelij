package Inheritance;

//public class NewLaptop {
public class NewLaptop extends Computer{
    int ramsize;

    public NewLaptop(String model, String screenSize, int ramsize) {
        super(model, screenSize);
        this.ramsize = ramsize;
    }
//    public NewLaptop(int ramsize) {
//        this.ramsize = ramsize;
//    }
    //    NewLaptop()
//    {
//        super();
//        ramsize=10;
//    }


    public void printdetails()
    {
super.printdetails();
        System.out.println("laptop details"+ramsize);
    }
}
