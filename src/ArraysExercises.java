import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        // Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element:
        Person[] people = new Person[3];
        people[0] = new Person("Hank");
        people[1] = new Person("Bobby");
        people[2] = new Person("Peggy");


        // Iterate through the array and print out the name of each person in the array:
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
//        for (Person person : people) {
//            System.out.println(person.getName());
//        }

        // It should accept an array of Person objects, as well as a single person object to add to the passed array.
        Person newPerson = new Person("Luanne");
        people = addPerson(people, newPerson);

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

        // It should return an array whose length is 1 greater than the passed array with the passed person object at the end of the array.
        // Create a static method named addPerson.
        public static Person[] addPerson (Person[]people, Person newPerson){
            // Create new array with increased length
            Person[] newArray = new Person[people.length + 1];
            // Copy existing elements to new array
            System.arraycopy(people, 0, newArray, 0, people.length);
            // Add new person at the end of new array
            newArray[newArray.length - 1] = newPerson;

            return newArray;
        }
    }





//        public static String [] addPerson(String[] Persons, Persons newPerson){
//            String[] updatedPersons = Arrays.copyOf(Persons,Persons.length + 1);
//            updatedPersons[updatedPersons.length - 1] = newPerson;
//            return updatedPersons;
//            Persons = Person.addPerson(Persons, )
//        }