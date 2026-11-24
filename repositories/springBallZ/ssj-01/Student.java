public class Student {
    private long registry;
    private String name;
    private double examGrade1;
    private double examGrade2;
    private double assignmentGrade;
    public double MINIMUN_GRADE = 7;

    public Student(long registry, String name, double examGrade1, double examGrade2, double assignmentGrade) {
        this.registry = registry;
        this.name = name;
        this.examGrade1 = examGrade1;
        this.examGrade2 = examGrade2;
        this.assignmentGrade = assignmentGrade;
    }

    public double mean(){
        return (((this.examGrade1 * 2.5) + (this.examGrade2 * 2.5) + (this.assignmentGrade * 2)) / (2.5 + 2.5 + 2));
    }

    public void finalExam(){
        double grade = Math.floor(mean() * 100) / 100.0;
        boolean aproved = false;
        if (grade >= MINIMUN_GRADE){
            System.out.println("APROVADO " + this.name + "; com nota " + grade);
            aproved = true;
        } else {
            System.out.println("SE LASCOU " + this.name + "; voce tirou " + grade + " e precisava de " + MINIMUN_GRADE + "; ainda faltam " + Math.floor((MINIMUN_GRADE - grade) * 100) / 100);
        }
    }
}
