package AccessSpecifierPackage;

class CarData
{
    private String name;
    private String brand;

    private String engine_Type;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public void setEngine_Type(String engine_Type)
    {
        this.engine_Type=engine_Type;
    }

    public String getName()
    {
        return name;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getEngine_Type()
    {
        return engine_Type;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", engine_Type='" + engine_Type + '\'' +
                '}';
    }
}
public class Car {
    public static void main(String[] args) {
        CarData data=new CarData();

        data.setName("Tesla");
        data.setBrand("S");
        data.setEngine_Type("S1");
        System.out.println(data.getName());
        System.out.println(data.getBrand());
        System.out.println(data.getEngine_Type());
        System.out.println(data);
    }


}
