package exercicio42;

import java.util.*;

class Student{
    public long id;
    public String name;
    public double cgpa;

    public Student(long id, String name, double cgpa){
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class Priorities{
    public List <Student> getStudents(List <String> acao) {
        PriorityQueue <Student> student_queue = new PriorityQueue(Comparator
                .comparing(Student::getCgpa)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getId));
        List < Student > students = new ArrayList < Student > ();
}

public class JPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}