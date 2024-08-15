public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int inClassPerformanceNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.inClassPerformanceNote = 0;
    }

    void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch))
            this.courseTeacher = t;
        else
            System.out.println(t.name + "'s branch is " + t.branch+". That's why the process could not be completed.");
    }

    void printTeacher(Teacher t){
        if (this.courseTeacher != null){
            System.out.println("Course: "+this.name+"- Teacher: "+this.courseTeacher.name);
        }
        else {
            System.out.println("No academician has been assigned to the "+this.name);
        }
    }

}