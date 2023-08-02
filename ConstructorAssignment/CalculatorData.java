package ConstructorAssignment;

public class CalculatorData {
    private double num1;
    private double num2;
    public CalculatorData(double num1,double num2)
    {
        this.num1=num1;
        this.num2=num2;

    }
    public double add()
    {
        return num1+num2;
    }
    public double subtract()
    {
        return num1-num2;
    }
    public double multiply()
    {
        return num1*num2;
    }
    public double divide(){
        return num1/num2;
    }

    public static void main(String[] args) {
        CalculatorData datas=new CalculatorData(10,94);
        System.out.println("Result of Addition : "+datas.add());
        System.out.println("Result of Subtraction : "+datas.subtract());
        System.out.println("Result of Multiplication : "+datas.multiply());
        System.out.println("Result of Division : "+datas.divide());

    }
}
