class Person {
    private String name;
    private float age;
    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
public class QueueTest {
    public static void main(String[] args) {
        Person[] persons = { new Person("ahmed", 19), new Person("khan", 22)};
        Integer[] ints = {4, 3, 2, 1};

        GenericQueue<Person> personQ = new GenericQueue<>(2);
        GenericQueue<Integer> intQ = new GenericQueue<>(10);

        for(Integer a : ints)
            intQ.enqueue(a);
        intQ.iterateAndPrint();
        System.out.println(intQ.front());
    }
}
