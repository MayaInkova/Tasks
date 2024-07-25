package exam01;

import java.util.Date;

//Изведете текущата дата и време на конзолата.
//Създайте обект от клас StringBuilder.
//Добавете текста "Numbers: " към StringBuilder.
//Изпълнете цикъл от 1 до 50000, като в рамките на цикъла добавяте всяко число (като текст) към StringBuilder.
//След приключване на цикъла изведете първите 1024 символа от StringBuilder на конзолата.
//Отново изведете текущата дата и време на конзолата.

public class NumbersConcatenatorEllegant {
    public static void main(String[] args) {

        System.out.println(new Date());



        StringBuilder sb = new StringBuilder();

        sb.append("Numbers: ");



        for(int idx = 1; idx <= 50000; idx++) {

            sb.append(idx);

        }



        System.out.println(sb.substring(0, 1024));

        System.out.println(new Date());

    }

}

