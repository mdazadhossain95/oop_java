//package University.Inheritance;
//
//public class Teacher extends Employee{
//
//    private String qual;
//
//    //default constructor
//    public Teacher () {
//        //implicit call to superclass default construct
//        qual = "";
//    }
//
//    //parameterized constructor
//    public Teacher(int i, String n, String q){
//
//        super(i,n); //call to superclass const must be first line
//        qual = q;
//    }
//
//    //accessors for qual
//
//    public void setQual (String qual){
//        this.qual = qual;
//    }
//
//    public String getQual(){
//        return qual;
//    }
//
//
//    //overriding dispaly method of Employee class
//    public void display(){
//
//        System.out.println("in teacher's display method");
//
//        super.display(); //call to superclass display method
//
//        System.out.println("Teacher qualification:" + qual);
//    }
//
//    //overriding toString method of Employee class
//    public String toString() {
//
//        System.out.println("in teacher's toString method");
//
//        String emp = super.toString();
//
//        return emp +" qualification:" + qual;
//    }
//
//}// end of class
//
//
//
