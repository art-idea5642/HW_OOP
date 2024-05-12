public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudents(String studentName, int magicPower,
                              int transgressionPower, int nobility, int honor, int courage) {
        super(studentName, magicPower, transgressionPower);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }


    public int getCourage() {
        return courage;
    }

    public void compareGryffindorStudents(GryffindorStudents secondStudent){
        if (this.scoreSum() > secondStudent.scoreSum()){
            System.out.println("Сильнее студент " + this.getStudentName());
        }
        else if (this.scoreSum() < secondStudent.scoreSum()) {
            System.out.println("Сильнее студент " + secondStudent.getStudentName());
        }
        else {
            System.out.println("Студенты равны");
        }
    }


    private int scoreSum() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Благородство: " + nobility +
                ". Честь: " + honor +
                ". Смелость: " + courage;
    }

}
