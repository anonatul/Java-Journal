// Write a program to implement class and object concept
class Person {
    // Instance variables
    String name;
    int age;
  
    // Constructor method
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    // Instance method
    public void sayHello() {
      System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
  }

public class classandobj {
    
    public static void main(String[] args) {
        // Create a new Person object with name "Alice" and age 25
        Person person1 = new Person("Alice", 25);
        // Call the sayHello method of the person1 object
        person1.sayHello();
    
        // Create a new Person object with name "Bob" and age 30
        Person person2 = new Person("Bob", 30);
        // Call the sayHello method of the person2 object
        person2.sayHello();
      }

}
