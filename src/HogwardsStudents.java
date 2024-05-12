public class HogwardsStudents {
    private final String studentName;
    private int magicPower;
    private int transgressionPower;

    public HogwardsStudents(String studentName, int magicPower, int transgressionPower) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionPower = transgressionPower;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }


    public int getTransgressionPower() {
        return transgressionPower;
    }


    public void printStudents() {
        System.out.println(this);
    }

    public void compareStudents (HogwardsStudents secondStudent){
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
        return magicPower + transgressionPower;
    }

    @Override
    public String toString() {
        return "Имя студента: " + studentName +
                ". Сила магии: " + magicPower +
                ". Дальносить трансгрессии: " + transgressionPower;
    }
}
