public class RavenclawStudents extends HogwartsStudents {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudents(String studentName, int magicPower, int transgressionPower,
                             int intelligence, int wisdom, int wit, int creativity) {
        super(studentName, magicPower, transgressionPower);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void compareRavenclawStudents(RavenclawStudents secondStudent){
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
        return intelligence + wisdom + wit + creativity;
    }


    @Override
    public String toString() {
        return super.toString() +
                ". Ум: " + intelligence +
                ". Мудрость: " + wisdom +
                ". Остроумие: " + wit +
                ". Творчество: " + creativity;
    }
}
