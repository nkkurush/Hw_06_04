import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1

        Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.
*/
        System.out.println("Task 1");
        int n = sc.nextInt();
        System.out.println(toCub(n));
  /*      2

        Напишите метод, который бы возвращал в консоль:

        true, если число больше 5
        и false, если число меньше 5
*/
        System.out.println("Task 2");
        int n2 = sc.nextInt();
        System.out.println(check(n2));
      /*  3

        Необходимо написать метод, который бы возвращал из 2 чисел меньшее число. Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
*/
        System.out.println("Task 3");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Min(a,b));
       /* 4

        Необходимо написать метод, который бы возводил число в степень. И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.
*/
        System.out.println("Task 4");
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        System.out.println(sum_kvad(toKvad(f1),toKvad(f2)));
  /*      5

        Условие задачи:
        Необходимо написать простой консольный калькулятор на Java.


                Метод int getInt() - должен считывать с консоли целое число и возвращать его
        Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
        Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
                Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.*/

        System.out.println("Task 5 Calculator");
        int d = getInt(sc.nextInt());
        int d2 = getInt(sc.nextInt());
        char operation = getOperation(sc.next().charAt(0));
        System.out.println(calc(d,d2,operation));
    }

    // МЕТОД ЗАДАНИИ 1
    public static int toCub(int n){
        return n*n*n;
    }
    //METOD ZADANYE 2
    public static boolean check(int n){
        if(n>5){
            return true;
        }
        return false;
    }
    // METOD ZADANYE 3
    public static int Min(int a,int b){
        return Math.min(a,b);
    }
    //zadanye 4
    public static int toKvad(int n){
        return n*n;
    }
    //zadanye 4
    public static int sum_kvad(int n,int n1){
        return n+n1;
    }
    //metodi zadaniya 5
    public static int getInt(int n){
        return n;
    }
    public static char getOperation(char operation){
        return operation;
    }
    public static int calc(int n1,int n2,char operation){
        int res = 0;
        switch (operation){
            case  '+':
                res= n1+n2;
                break;
            case '-':
                res= n1-n2;
                break;
            case '/':
                res= n1/n2;
                break;
            case '*':
                res= n1*n2;
                break;
        }
        return res;
    }
}