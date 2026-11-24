package BASE02.methodStatic.staticMethodHidining;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.show(); // it will call the show method of the parent class

        Doctor d = new Doctor();
        d.show(); // it will call the show method of the child class

        Person p1 = new Doctor(); //*-------------- Point to note */
        p1.show(); // it will call the show method of the parent class as static methods are not overridden, they are hidden
    }
    
}
