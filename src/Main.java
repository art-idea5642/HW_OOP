public class Main {
    public static void main(String[] args) {

        GryffindorStudents potter = new GryffindorStudents("Гарри Поттер", 85,
                90, 85, 95, 90);
        GryffindorStudents granger = new GryffindorStudents("Гермиона Грейнджер", 95,
                85, 90, 95, 85);
        GryffindorStudents weasley = new GryffindorStudents("Рон Уизли", 80,
                80, 85, 85, 90);
        SlytherinStudents malfoy = new SlytherinStudents("Драко Малфой", 90,
                85, 95, 90, 85, 90, 85);
        SlytherinStudents montague = new SlytherinStudents("Грэхэм Монтегю", 85,
                85, 90, 80, 90, 85, 90);
        SlytherinStudents goyle = new SlytherinStudents("Грегори Гойл", 80,
                90, 85, 85, 80, 90, 85);
        HufflepuffStudents smith = new HufflepuffStudents("Захария Смит", 80,
                85, 90, 95, 85);
        HufflepuffStudents diggory = new HufflepuffStudents("Седрик Диггори", 85,
                90, 95, 80, 90);
        HufflepuffStudents fletchley = new HufflepuffStudents("Джастин Финч-Флетчли", 90,
                90, 85, 85, 80);
        RavenclawStudents chang = new RavenclawStudents("Чжоу Чанг", 90,
                90, 95, 85, 85, 90);
        RavenclawStudents patil = new RavenclawStudents("Падма Патил", 85,
                85, 90, 90, 90, 85);
        RavenclawStudents belby = new RavenclawStudents("Маркус Белби", 80,
                80, 85, 90, 80, 80);

        potter.printStudents();

        potter.compareGryffindorStudents(weasley);

        malfoy.compareSlytherinStudents(montague);

        granger.compareStudents(malfoy);
    }
}