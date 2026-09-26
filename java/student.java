class Student {
    int id;
    String name;

    public void display(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }
}

public class S {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display(10, "rajiv");
    }
}
