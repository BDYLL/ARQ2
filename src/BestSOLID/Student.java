package BestSOLID;

public final class Student extends Object {

    private final String name;
    private final int semester;

    public Student(String name, int semester) {
        this.name = name;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public String toString(){
        return name+" "+semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (semester != student.semester) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + semester;
        return result;
    }
}
