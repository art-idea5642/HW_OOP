public class SlytherinStudents extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudents(String studentName, int magicPower, int transgressionPower,
                             int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, magicPower, transgressionPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void compareSlytherinStudents(SlytherinStudents secondStudent){
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
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Хитрость: " + cunning +
                ". Решительность: " + determination +
                ". Амбициозность" + ambition +
                ". Находчивость: " + resourcefulness +
                ". Жажда власти:" + lustForPower;
    }
}
