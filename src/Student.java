public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course physic;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course physic, Course chemistry){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.physic = physic;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        this.mat.examNote = note1;
        this.physic.examNote = note2;
        this.chemistry.examNote = note3;
    }
    void addBulkPerformanceNote(int note1, int note2, int note3){
        this.mat.inClassPerformanceNote = note1;
        this.physic.inClassPerformanceNote = note2;
        this.chemistry.inClassPerformanceNote = note3;
    }

    void calcAverage (){
        double matAverage = this.mat.examNote * 0.8 + this.mat.inClassPerformanceNote * 0.2;
        double phyAverage = this.physic.examNote * 0.8 + this.physic.inClassPerformanceNote * 0.2;
        double cheAverage = this.chemistry.examNote * 0.8 + this.chemistry.inClassPerformanceNote * 0.2;
        this.average = (matAverage + phyAverage + cheAverage) / 3.0;
    }

    void isPass(){
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Average : " + this.average);
        if (this.isPass) {
            System.out.println("You passed class.");
        } else {
            System.out.println("You failed the class!");
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average >= 55;
    }

    void printNote(){
        System.out.println("=========================");
        System.out.println("Student Name: "+this.name);
        System.out.println(this.mat.name+": "+this.mat.examNote);
        System.out.println(this.physic.name+": "+this.physic.examNote);
        System.out.println(this.chemistry.name+": "+this.chemistry.examNote);
    }





}