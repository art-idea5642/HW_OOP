public class HufflepuffStudents extends HogwartsStudents {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String studentName, int magicPower, int transgressionPower,
                              int hardWork, int loyalty, int honesty) {
        super(studentName, magicPower, transgressionPower);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void compareHufflepuffStudents(HufflepuffStudents secondStudent){
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
        return hardWork + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Трудолюбие: " + hardWork +
                ". Верность: " + loyalty +
                ". Честность: " + honesty;
    }
}
