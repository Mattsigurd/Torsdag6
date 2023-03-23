package task3;

import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> passedCourses = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();
    public Student(ArrayList<String> passedCourses){
        super();
        this.passedCourses = passedCourses;
    }
    @Override
    public boolean addCourse(String course){
        if(passedCourses.contains(course)){
            return false;
        }else {
            currentCourses.add(course);
            return true;
        }
    }
}
