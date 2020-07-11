package University.Student;

public class Student {
    private static int countStudents = 0;

    public static int getCountStudents() {
        return countStudents;
    }

    String name;
    int rollNo;

    public static void setCountStudents(int countStudents) {
        Student.countStudents = countStudents;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo>0) {
            this.rollNo = rollNo;
        }else {
            this.rollNo = 100;
        }
    }
    // Constructor that uses a default value instead of taking an argument.

    public Student() {
        this.name = "not set";
        this.rollNo = 100;
        countStudents += 1;
    }



    // parameterized Constructor for a new student
    public Student(String name, int rollNo) {
        setName(name);            //call to setter of name
        setRollNo(rollNo);           //call to setter of rollNo
        countStudents += 1;
    }

    // Copy Constructor for a new student
    public Student(Student s) {
        name = s.name;
        rollNo = s.rollNo;
        countStudents += 1;
    }
    // method used to display method on console

    public void print () {
        System.out.println("Student name:" +name+ ", roll no:" +rollNo);
    }

} // end of class

