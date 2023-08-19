package Test;

public class ConstrucExaml {
    int x;
//    protected ConstrucExaml() //ok
//     ConstrucExaml()//ok
//   private ConstrucExaml()//ok
//    public ConstrucExaml() //ok
//public static ConstrucExaml()    //can't do
  //  public static final ConstrucExaml() //can't do
//    public final ConstrucExaml() //can't do
public ConstrucExaml()
{
        x=100;
    }
    public void diaply()
    {
        System.out.println("x  "+x);
    }
    public static void main(String[] args) {
        ConstrucExaml ce=new ConstrucExaml();
        ce.diaply();

    }
}
