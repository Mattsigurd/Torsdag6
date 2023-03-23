package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> Persons = new ArrayList<Person>(10);
        ArrayList<String> pc = new ArrayList<String>();

        pc.add("Math");
        pc.add("English");
        pc.add("History");
        pc.add("Astronomy");

        String javacourse = new String("Java 1.0");
        ArrayList<String> pcj = new ArrayList<String>();
        pcj.add("Math");
        pcj.add("English");
        pcj.add("History");
        pcj.add("Astronomy");
        pcj.add(javacourse);

        Person p1 = new Student(pc);
        Person p2 = new Student(pc);
        Person p3 = new Student(pc);
        Person p4 = new Teacher(pc);
        Person p5 = new Student(pcj);
        Person p6 = new Teacher(pcj);

        Persons.add(p1);
        Persons.add(p2);
        Persons.add(p3);
        Persons.add(p4);
        Persons.add(p5);
        Persons.add(p6);

        for (int i = 0; i < Persons.size(); i++) {
            if (Persons.get(i) instanceof Student) {
                boolean reply = Persons.get(i).addCourse(javacourse);
                if(!reply){
                    System.out.println("This student has passed this course");
                }
            }else{
                boolean reply2 = Persons.get(i).addCourse(javacourse);
                if(!reply2){
                    System.out.println("This teacher cannot teach this subject");
                }
            }
        }
    }
}
