import java.util.Scanner;
public class Main {

//    static int[] array = {1,2,3,4,5,6,7,8,9,10};
//    public static void main(String[] args) {
//       printArray();
//        array[2] = inputNum();
//        printArray();
//
//
//    }
//    public static void printArray(){
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }
//    public static int inputNum(){
//        System.out.println("Введите число");
//        int input = new Scanner(System.in).nextInt();
//        return input;
//    }


    static int x=0;
    static int y=0;
    public static void main (String[] args) {
        while (true) {
            int command = inputCommand();
            int steps;
            if (command == 1) {
                y -= inputSteps();
                // вниз
            } else if (command == 2) {
                y += inputSteps();
                // вверх
            } else if (command == 3) {
                x +=inputSteps();
                // направо
            } else if (command == 4) {
                x -= inputSteps();
                // налево
            } else if (command == 5) {
                //печать
                print();
            } else {
                error();

            }

        }
    }

    private static void error() {
        System.out.println("Команда не верна");
    }

    private static void print() {
        System.out.println("Координаты: x" + x + ",y" + y);
    }

    private static int inputCommand (){
        System.out.println("Введите команду: \n1)пойти вниз \n2)пойти вверх \n3)пойти направо \n4)пойти налево \n5)печать координат робота:");
        return new Scanner(System.in).nextInt();}
    private static int inputSteps () {
        System.out.println("Введите колличество шагов: ");
        return new Scanner(System.in).nextInt();

    }
}
