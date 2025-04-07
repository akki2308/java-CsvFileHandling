public class A {
    String name;
    int age;

    private A(String name, int age){
        this.name = name;
        this.age = age;
    }
    static A instance = null;
    public static A getInstance(){
        if (instance == null){
            instance = new A("Akshit", 21);
        }
        return instance;
    }
}
