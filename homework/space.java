import java.util.Scanner;

public class space {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int earthWeight, planet;
        double planetWeight = 0.0;
        System.out.print("Пожалуйста, введите ваш текущий вес  на Земле: ");
        earthWeight = myScanner.nextInt();
        System.out.println();
        System.out.println("У меня есть информация по этим планетам:");
        System.out.println("   1. Венера.   2. Марс.     3. Юпитер.");
        System.out.println("   4. Сатурн.   5. Уран.     6. Нептун.");
        System.out.println();
        System.out.print("Какую планеты вы хотите посетить? ");
        planet = myScanner.nextInt();
        System.out.println();
        if (planet == 1) {
            planetWeight = earthWeight * 0.35;
        } else if (planet == 2) {
            planetWeight = earthWeight * 0.18;
        } else if (planet == 3) {
            planetWeight = earthWeight * 1.20;
        } else if (planet == 4) {
            planetWeight = earthWeight * 0.53;
        } else if (planet == 5) {
            planetWeight = earthWeight * 0.48;
        } else if (planet == 6) {
            planetWeight = earthWeight * 0.56;
        } else {
            System.out.println("Нет номера такой планеты.");
        }
        System.out.println("Твой вес будет.. " + planetWeight + " кг на этой планете.");
        myScanner.close();
    }
}