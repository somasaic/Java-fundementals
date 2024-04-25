

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class School {
    
    String schoolName;
    int totalStudent;
    
    public School () {
        this.schoolName = "Java School";
    }    
    
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.totalStudent = 0;
    }
    
    void getSchoolName () {
        System.out.println("The school name is: " + this.schoolName);
    }
    
}

class Student extends School {
    
    String name;
    String address;
    private int roll;
    
    public Student(String schoolName, String name, String address) {
        super(schoolName);
        this.name = name;
        this.address = address;
    }
    
    void getRoll (String name) {
        
        System.out.println("The roll number of student "+ name+ " is:"+ this.roll);
        
    }
    
    void getName () {
        System.out.println("The student name is:" + this.name);
    }
    
    void getRoll () {
        System.out.println("The student roll number is:" + this.roll);
    }
    
    void setRoll (int roll) {
        if(roll <=0 ){
            System.out.println("Enter valid roll number!");
        } else {
            this.roll = roll;
        }
        
    }
    
    void getSchoolName () {
        System.out.println("The student "+ this.name +", school name is: " + this.schoolName);
    }
    
}

class oops {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        Student s1 = new Student("CN", "Sudhendra", "IN");
    
        // s1.name = "Coding Ninjas";
        
        // s1.roll = -10;
        
        s1.setRoll(20);
        
        s1.getName();
        
        s1.getRoll(s1.name);
        
        s1.getSchoolName();
    }
    
}


/*

interface User {
    String EntityType = "User";
    public String getUserDetails ();
}

abstract class School {
    
    String schoolName;
    
    public School () {
        this.schoolName = "Java School";
    }    
    
    public School(String schoolName) {
        this.schoolName = schoolName;
    }
    
    void getSchoolName () {
        System.out.println("The school name is: " + this.schoolName);
    }
    
    abstract String getRole ();
    
}

class Teacher extends School implements User {
    
    String name;
    String department;
    
    public Teacher (String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    String getRole () { return "Teacher"; }
    
    public String getUserDetails () {
        return "I am a teacher" ;
    }
    
    
}

class Student <A> extends School implements User {
    
    String name;
    String address;
    private A roll;
    static int totalStudent;
    
    public Student(String schoolName, String name, String address) {
        // super(schoolName);
        this.name = name;
        this.address = address;
        totalStudent++;
    }
    
    void getRoll (String name) {
        
        System.out.println("The roll number of student "+ name+ " is:"+ this.roll);
        
    }
    
    void getName () {
        System.out.println("The student name is:" + this.name);
    }
    
    void getRoll () {
        System.out.println("The student roll number is:" + this.roll);
    }
    
    void setRoll (A roll) throws Exception  {
        // if(roll <=0 ){
        //     throw new Exception("Roll no. less than 0");
        // } else {
        //     this.roll = roll;
        // }
        
    }
    
    void getSchoolName () {
        System.out.println("The student "+ this.name +", school name is: " + this.schoolName);
    }
    
    String getRole () { return "Student"; }
    
    public String getUserDetails () {
        return "I am a student." ;
    }
    
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        Student s1 = new Student<Integer>("CN", "Sudhendra", "IN");
        Student s2 = new Student<String>("CN", "Sudhendra", "IN");
    
        // s1.name = "Coding Ninjas";
        
        // s1.roll = -10;
        
        try {
            
            s1.setRoll(-20);
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        } finally {
            
            System.out.println("Finally will always run!");
            
        }
        
        
        s1.getName();
        
        s1.getRoll(s1.name);
        
        s1.getSchoolName();
        
        System.out.println("The total number of students:" + Student.totalStudent);
    }
    
    
}
  
 

 */