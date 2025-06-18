public class ClassAndObject {
    static class Department{
        String name;
        String deptCode;
    }

    static class Student{
        int rollNo;
        String name;
        Department dept;

        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Department: " + dept.name + " (" + dept.deptCode + ")");
        }
    }
    public static void main(String[] args) {
        Department csDept = new Department();
        csDept.name = "Computer Science";
        csDept.deptCode = "CS101";

        Student student = new Student();
        student.rollNo = 1;
        student.name = "Alice";
        student.dept = csDept;
        student.display();
        
    }
}