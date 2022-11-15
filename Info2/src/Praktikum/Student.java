package Praktikum;
import java.util.Date;

public class Student {
    
    private static int studentCount=0;
    private String name;
    private int matrikelnummer;
    
    private final studiengang Studiengang;
    
    private Grade[] grades;
    
    
    

    public Student(String name, studiengang Studiengang){
        studentCount++;
        this.matrikelnummer = studentCount;
        this.name = name;
        this.studiengang = studiengang;
        this.grades = new Grade[25];
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public Studeingang getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(Studeingang studiengang) {
        this.studiengang = studiengang;
    }



   

}
