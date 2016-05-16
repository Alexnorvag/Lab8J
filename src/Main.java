import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by norvag on 16.05.2016.
 * На прямой гоночной трассе стоит N автомобилей,
 * для каждого из которых известны начальное положение и скорость.
 * Определить, сколько произойдет обгонов.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Количество автомобилей: ");
        int numAuto = Integer.parseInt(reader.readLine());

        AutoCharacter[] auto = new AutoCharacter[numAuto];
        for (int i = 0; i < auto.length; i++) {
            System.out.print("Скорость auto[" + (i+1) + "]: ");
            int speed = Integer.parseInt(reader.readLine());

            System.out.print("Начальное положение auto[" + (i+1) + "]: ");
            int startPoint = Integer.parseInt(reader.readLine());

            auto[i] = new AutoCharacter(speed,startPoint);
        }

        System.out.print("Время: ");
        int time = Integer.parseInt(reader.readLine());

        for (int i = 0; i < auto.length; i++) {
            auto[i].setNewPoint((auto[i].getSpeed() * time) + auto[i].getStartPoint());
        }

        int counter = 0;
        for (int i = 0; i < auto.length; i++) {
            for (int j = auto.length-1; j > i; j--) {
                if (auto[i].getStartPoint() < auto[j].getStartPoint() && auto[i].getNewPoint() > auto[j].getNewPoint()) {
                    counter++;
                }
            }
        }

        System.out.println("Количество обгонов: " + counter);
    }
}
