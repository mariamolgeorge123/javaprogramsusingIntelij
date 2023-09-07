package ExceptionPackage;

public class AgeThrowRunner {
    public static void main(String[] args) throws AgelessException {
        AgeThrow a=new AgeThrow(30);
        a.vote();
        AgeThrow a1=new AgeThrow(10);
        a1.vote();
    }
}
