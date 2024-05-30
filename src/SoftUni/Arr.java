package SoftUni;


import java.util.Scanner;

//Да се напише програма, която създава масив с 20 елемента от целочислен тип и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5. Елементите на масива да се изведат на конзолата. на Java
public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = new int [20];

        for (int i = 0; i <array.length ; i++) {
            array[i]= i*5;

            }
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Element at index "+ i +" :" + array[i]);

        }

        }
    }

