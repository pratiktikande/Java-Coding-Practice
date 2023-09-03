package Classes_and_Object_Programs;

public class DataHide {
    private String name;
    private int age;
    private String secret;

    // Constructor
    public DataHide(String name, int age, String secret) {
        this.name = name;
        this.age = age;
        this.secret = secret;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to show data hiding
    public void revealSecret() {
        System.out.println("My secret is: " + secret);
    }

    public static void main(String[] args) {
        // Create a new Person object
        DataHide person = new DataHide("John Doe", 30, "I like ice cream!");

        // Accessing data using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying data using setters
        person.setName("Jane Smith");
        person.setAge(25);

        // Accessing modified data using getters
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Trying to access the secret directly (which is hidden)
        // This will cause a compilation error
        // System.out.println("Secret: " + person.secret);

        // Accessing the secret through the revealSecret method
        person.revealSecret();
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande