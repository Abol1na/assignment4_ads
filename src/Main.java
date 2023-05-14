import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random rand = new Random();

        Student student1 = new Student("Mike", 21);
        Student student2 = new Student("Sofia", 20);
        Student student3 = new Student("David", 23);

        table.put(new MyTestingClass(1, "object1"), student1);
        table.put(new MyTestingClass(2, "object2"), student2);
        table.put(new MyTestingClass(3, "object3"), student3);

        Student student = table.get(new MyTestingClass(2, "object2"));
        System.out.println("Student with key 2: " + student.getName() + " " + student.getAge());

        Student removedStudent = table.remove(new MyTestingClass(1, "object1"));
        System.out.println("Removed student: " + removedStudent.getName() + " " + removedStudent.getAge());

        boolean containsStudent = table.contains(student3);
        System.out.println("Contains student3: " + containsStudent);

        Student newStudent = new Student("Lucy", 22);
        table.put(new MyTestingClass(2, "object2"), newStudent);

        Student updatedStudent = table.get(new MyTestingClass(2, "object2"));
        System.out.println("Updated student with key 2: " + updatedStudent.getName() + " " + updatedStudent.getAge());

        containsStudent = table.contains(removedStudent);
        System.out.println("Contains removed student: " + containsStudent);


        for (int i = 0; i < 10000; i++) {
            MyTestingClass key2 = new MyTestingClass(rand.nextInt(1000), "name" + i);
            Student value = new Student("student" + i, rand.nextInt(20) + 18);
            table.put(key2, value);
        }

        table.printBucketSizes();
    }
}
