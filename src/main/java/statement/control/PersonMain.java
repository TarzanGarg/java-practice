package statement.control;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(25);
        person1.setFirstName("Tarzan");
        person1.setLastName("Garg");

        Person person2 = new Person();
        person2.setAge(25);
        person2.setFirstName("Tarzan");
        person2.setLastName("Garg");

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}
