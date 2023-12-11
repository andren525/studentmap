import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class StudentMap {
    Map<String, Student> StudentData = new HashMap<>();
    public void addStudent(String name, Student newStudent){
        StudentData.put(name,newStudent);
    }
    public void removeStudent(String name){
        StudentData.remove(name);
    }
    public Student getStudent(String name){
        return StudentData.get(name);
    }
    public double getAverageGPA(){
        double gpa;
        gpa=0;
        double count;
        count =0;
        for (Map.Entry<String, Student> element : StudentData.entrySet()){
            gpa += element.getValue().gpa;
            count ++;
        }
        return gpa/count;
    }
}

class Student {
    private String name;
    private int age;
    public double gpa;
    public Student (String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
}