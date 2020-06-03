package encapsulation;

public class EncapTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Animesh");
        p1.setAge(40);
        p1.getName();
        p1.getAge();

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
