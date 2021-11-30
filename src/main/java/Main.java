import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        twoNumbers(5,4);
        isNegativeOrPositive(-1);
        integerNum(0);
        stringCount("I love Java", 5);
        isLeapYear(2400);

    }
    // Task 1.Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean twoNumbers(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        return false;

    }

    //Task 2.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное.Замечание: ноль считаем положительным числом.

    public static void isNegativeOrPositive(int num){
        if (num >= 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }

    //Task 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.


    public static boolean integerNum(int c){
        if (c < 0){
            return true;
        }
        return false;
    }


    //Task 4.Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void stringCount(String string, int count){
        for (int i = 0; i < count; i++){
            System.out.println(string);

        }
    }

    // Task 5*. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean isLeapYear(int year){

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Is leap year");
            return true;
        }
       if (year % 400 == 0){
            System.out.println("I leap year");
            return true;
        }
        if (year % 100 == 0){
            System.out.println("Is not leap year");
            return false;
        }
        System.out.println("Is not leap year");
        return false;
    }
}
