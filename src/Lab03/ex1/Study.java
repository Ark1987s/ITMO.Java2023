package Lab03.ex1;

public class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        System.out.println(this.course);
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study studyText = new Study("Изучение Java - это просто!");
        studyText.printCourse();
    }
}
