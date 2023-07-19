package StaticExapmle;

public class Area {

    static double pi=3.14;
        double radius;

        double area;
        public Area(double radius)
        {
            this.radius=radius;
        }
        public double calculatearea()
        {
            area=pi*radius*radius;
            return area;
        }

    public static void main(String[] args) {
        Area a=new Area(5);
        System.out.println("Area is: "+a.calculatearea());


    }
}
