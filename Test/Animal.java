package Test;

interface Animal {
    int a=10;
    final int d=90;
    static int h=100;
    public static final int g=400;
//    private b=10;
//    protected c=10;
    public void eating(); //implicitly public and abstract
     abstract void play();


    void walk(); //implicitly public and abstract


    default void love()
    {
        System.out.println("they love each other");
    }

    static void cry()
    {
        System.out.println("Animal crying");
    }

    private void share()
    {
        System.out.println("share foood  . ");
    }
    private static void birth()
    {
        System.out.println("they give birth");
    }

//    public static void main(String[] args) {
//
//       // Animal.share();
//        Animal.birth();
//    }
}
