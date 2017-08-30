package BestSOLID;

public final class Subject extends Object {

    private final String name;
    private final int minimumSemester;


    public Subject(String name, int minimumSemester) {
        this.name = name;
        this.minimumSemester = minimumSemester;
    }

    public Subject(String name){
        this.name = name;
        this.minimumSemester=1;
    }

    @Override
    public String toString() {
        return name+" "+minimumSemester;
    }

    public String getName() {
        return name;
    }

    public int getMinimumSemester() {
        return minimumSemester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return name != null ? name.equals(subject.name) : subject.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
