public class Student {
    private name;
    private studentID;
    private static int count = 0;

    public Student(String n, String id){
        this.name = n;
        this.studentID = id;
        count++;
    }

    public int getNumStudents(){
        return count;
    }
}