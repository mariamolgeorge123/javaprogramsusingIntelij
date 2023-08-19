package StaticExapmle;

public class MainStaic {
    public static void main(String[] args) {
        MyClass.staticMethod();
    }
}
class MyClass {
    int instanceVar = 42; // Non-static (instance) variable

    void instanceMethod() { // Non-static (instance) method
        System.out.println("Instance method called");
    }

    static void staticMethod() { // Static method
        System.out.println("Static method called");

        // Accessing instance variable and method through an instance
        MyClass myInstance = new MyClass();
        System.out.println("Instance variable: " + myInstance.instanceVar);
        myInstance.instanceMethod();
    }
}


