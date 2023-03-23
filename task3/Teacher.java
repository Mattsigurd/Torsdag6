package task3;

import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();
    public Teacher(ArrayList<String> canTeach){
        super();
        this.canTeach = canTeach;
    }
    @Override
    public boolean addCourse(String course){
        if(canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }else {
            return false;
        }
    }
}
