public class Person {
    private String name;

    //the Person constructor that accepts a `String` value and sets the person's name to the passed string
    public Person (String name) {
        this.name = name;
    }

        public String getName(){
    //return the person's name
            return this.name;
        }

        public void setName (String name){
    //change the name field to the passed value
            this.name = name;
        }

        public void sayHello () {
    //print a message to the console using the person's name
            System.out.println("Hello, my name is " + this.name);
        }

public Person(){

}

    //Create a `main` method
    public static void main(String[] args) {
        //Create a new `Person` object
        Person person = new Person("Jennifer");
        //Test the above methods
        System.out.println("Current name: " + person.getName());
        person.sayHello();

        person.setName("Bob");
        System.out.println("Updated name: " + person.getName());
        person.sayHello();


        //2. Understanding references
    Person person1 = new Person("John");
    Person person2 = new Person("John");
    System.out.println(person1.getName().equals(person2.getName()));
    System.out.println(person1 == person2);



//    Person person1 = new Person("John");
//    Person person2 = person1;
//System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

};

