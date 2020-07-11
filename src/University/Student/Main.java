package University.Student;

public class Main {
    public static void main (String args[]){

        int numObjs = Student.getCountStudents();
        System.out.println("Students Objects:"+numObjs);

        Student s1 = new Student("ali", 15);
        System.out.println("Student:" + s1.toString() );

        numObjs = Student.getCountStudents();
        System.out.println("Students Objects:"+numObjs);

        Student s2 = new Student("usman", 49);
        System.out.println("Student:" +s2);	//implicit call to toString()

        numObjs = Student.getCountStudents();
        System.out.println("Students Objects:"+numObjs);

        s1 = null;

        System.gc(); // request the JVM to run the garbage collector But
        // there is no gaurantee that  garbage collector will run

        numObjs = Student.getCountStudents();
        System.out.println("Students Objects:"+numObjs);

    } //end of main
} //end of class
