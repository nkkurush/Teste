import java.util.*;


public class Dz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1

        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
        */
        System.out.println("Task 1");
        String[] arr = new String[10];
        for(int i=0; i<8; i++){
            arr[i] = sc.next();
        }
        for(int i=arr.length-1; i>-1; i--){
            System.out.println(arr[i]);
        }
        /*2
        1.1. Создай массив на 10 чисел
        1.2. Считай с консоли 10 чисел и заполни ими массив
        2. Найти максимальное число из элементов массива*/
        System.out.println("Task 2");
        int[] a = new int[10];
        int mx = -999999;
        for(int i=0 ;i<a.length; i++){
            a[i] = sc.nextInt();
            if(mx<a[i]){
                mx = a[i];
            }
        }
        System.out.println(mx);

        /*3
        СО ЗВЕЗДОЧКОЙ

        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк,
                индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.*/
        System.out.println("Task 3");
        String[] ar = new String[10];
        int[] num = new int[10];
        for(int i=0; i<10; i++){
            ar[i] = sc.next();
        }
        for(int i=0; i<10 ; i++){
            num[i] = ar[i].length();
            System.out.print(num[i] + " ");
        }
        System.out.println();
        /*4

        1. Создать массив на 10 чисел.
        2. Ввести с клавиатуры 10 чисел и записать их в массив.
        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.*/
        System.out.println("Task 4");
        int[] a2 = new int[10];
        for(int i=0; i<10 ; i++){
            a2[i] = sc.nextInt();
        }
        for(int i=a2.length-1; i>-1; i--){
            System.out.println(a2[i]);
        }
        /*5

        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
        System.out.println("Task 5");
        int[] num2 = new int[20];
        int[] n1 = new int[10];
        int[] n2 = new int[10];
        for(int i=0; i<20; i++){
            num2[i] = sc.nextInt();
            if(i<10){
                n1[i] = num2[i];
            }
            else{
                n2[i-10] = num2[i];
            }
        }
        for(int i=0; i<n2.length; i++){
            System.out.println(n2[i]);
        }
        /*6

        Создать массив на 20 чисел.
                Заполнить его числами с клавиатуры.
        Найти максимальное и минимальное числа в массиве.
                Вывести на экран максимальное и минимальное числа через пробел.
*/
        System.out.println("Task 6");
        int[] f = new int[20];
        int mn = 9999999,mx3 = -99999999;
        for(int i=0; i<f.length; i++){
            f[i] = sc.nextInt();
            if(mx3<f[i]){
                mx3 = f[i];
            }
            if(mn>f[i]){
                mn = f[i];
            }
        }
        System.out.println(mn + "  "+ mx3);
        /*7

        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.*/
        System.out.println("Task 7");
        int[] g = new int[20];
        for(int i=0; i<g.length; i++){
            g[i] = sc.nextInt();
        }
        for(int i=0; i<g.length; i++){
            for(int j=0; j<g.length; j++){
                if(g[i]>g[j]){
                    int t = g[i];
                    g[i] =g[j];
                    g[j] = t;
                }
            }
        }
        for(int i=0; i<g.length; i++){
            System.out.print(g[i] +" ");
        }
    }
}
