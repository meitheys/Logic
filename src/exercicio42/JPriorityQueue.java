package exercicio42;

import java.util.*;

/*

RULES
_________________________________________________________________________________
                                    RULES                                        |
                                                                                 |
*-|XXXX|-* = Shows how is the list now                                           |
ENTER = Put a new student in the list                                            |
SERVED = Removes the student with the most priority                              |
                                                                                 |
How does the priority works?                                                     |
First goes the ones with the highest CGPA (Grade).                               |
                                                                                 |
What if the CGPA is the same for more then one student?                          |
Then we compare the student's names and we put it in a alphabetical order.       |
                                                                                 |
What if the CGPA and the Name is the same?                                       |
Then we have another try that is to compare by the id, the lowest ID goes first. |
_________________________________________________________________________________|

Example:

ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35

*-|Mark -> John -> Shafaet|-*

SERVED
SERVED

*-|Shafaet|-*

ENTER Samiha 3.85 36

*-|Samiha -> Shafaet|-*

SERVED

*-|Shafaet|-*

ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50

*-|Anik -> Dan -> Ashley -> Maria -> Shafaet|-*

SERVED

*-|Dan -> Ashley -> Shafaet -> Maria|-*

*/
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

class Priorities {
    //Método que retorna a lista de estudantes
    public List <Student> getStudents(List <String> events) {
        //Compara a lista de acordo com o desejado
        PriorityQueue <Student> queue = new PriorityQueue(Comparator
                        .comparing(Student::getCgpa)
                        .reversed().thenComparing(Student::getName)
                        .thenComparing(Student::getId));
        List <Student> students = new ArrayList <Student> ();

        //Loopa até os eventos acabarem
        for (String i: events) {
            Scanner in =new Scanner(i);
            String event = in.next();
            //Verifica qual o tipo de evento que está entrando
            if (event.equals("ENTER")) {
                String nomeAluno = in.next();
                double cgpa = in.nextDouble();
                int idAluno = in.nextInt();
                //Adiciona a lista
                Student st = new Student(idAluno, nomeAluno, cgpa);
                queue.add(st);

            } else if (event.equals("SERVED")) {
                Student x = queue.poll();
            } in.close();
        }
        //O metodo .poll, tira o elemento das duas extremidades da queue.
        Student x = queue.poll();
        System.out.println(x + " <-- Esse é o X");
        System.out.println(queue + " <-- Essa é a queue");
        if (x == null) {
            return students;
        } else {
            while (x != null) {
                students.add(x);
                x = queue.poll();
            }
            return students;
        }
    }
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
