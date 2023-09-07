package enumsdata;

public class EnumSizeData {
    class data
    {
        public enum size
        {
            S,L,XL;
        }


    }
    public static void main(String[] args) {
        System.out.println(data.size.XL);
        data.size s=data.size.L;
        switch (s)
        {
            case L:
                System.out.println("Large");
                break;
            case S:
                System.out.println("Small");
        }
        for(data.size d:data.size.values())
        {
            System.out.println(d);
        }
    }
}
