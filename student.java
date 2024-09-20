public class Student {
    public String name;
    public int st_id;
    public String faculty;
    public double gpa;

    public Student() {
        this.name = "Unknown";
        this.st_id = 0;
        this.faculty = "Unknown";
        this.gpa = 0.0;
    }
    public Student(String name, int st_id, String faculty, double gpa) {
        this.name = name;
        this.st_id = st_id;
        this.faculty = faculty;
        this.gpa = gpa;
    }
    public void info() {
        System.out.println("student name:" + this.name);
        System.out.println("id of student:" + this.st_id);
        System.out.println("faculty:" + this.faculty);
        System.out.println("gpa:" + this.gpa);
    }
    public void newgpa(double newgpa) {
        this.gpa = newgpa;
        System.out.println("new gpa:" + this.gpa);
    }
    public static void main(String[] smt) {
        Student student1 = new Student("Meerim", 230141002, "COMCEH-23", 3.2);
        student1.info();
        student1.newgpa(4.0);
        student1.info();

        Student student2 = new Student("Aminat", 235098009, "IEMIT-23", 3.8);
        student2.info();

        Student student3 = new Student("Amir", 24090021, "COMSE-24", 3.5);
        student3.info();

        Student student4 = new Student("Atak", 23090922, "COMFCI-23", 2.1);
        student4.info();

        Student student5 = new Student("Leyla", 24096726, "IEIR", 3.9);
        student5.info();
        student5.newgpa(3.0);
        student5.info();
        Student defaultStudent = new Student();
        defaultStudent.info();
    }
}
