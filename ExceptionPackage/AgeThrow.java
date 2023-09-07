package ExceptionPackage;

public class AgeThrow {
    int age;
    public AgeThrow(int age)
    {
        this.age=age;
    }
    public void vote() throws AgelessException
    {
        if(age<18)
        {
            throw new AgelessException("Age greater than 18 require ");
        }
        else
        {
            System.out.println("voted");
        }
    }

}
