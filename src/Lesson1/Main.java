package Lesson1;

public class Main {
    public static void main(String[] args) {

        // Создаем полосу препятствий
        Course course1 = new Course(new Barrier(170));

        // Создаем команды
        Team team1 = new Team("Команда 1", new People("Вася", 150), new People("Петя", 160),
                new People("Коля", 200), new People("Гена", 190));

        Team team2 = new Team("Команда 2", new People("Маша", 155), new People("Аня", 170),
                     new People("Света", 175), new People("Оля", 183));

        // Просим команду пройти полосу
        course1.doIt(team1);
        course1.doIt(team2);

        // Показываем результаты
        System.out.println("\nРЕЗУЛЬТАТЫ СОРЕВНОВАНИЯ\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
}
