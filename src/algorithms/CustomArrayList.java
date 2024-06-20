package algorithms;

public class CustomArrayList {
    private Object[] arr; // Масив за съхранение на елементите в списъка

    private int count; // Брояч за броя на елементите в списъка

    private static final int INITIAL_CAPACITY = 4; // Началният капацитет на масива

    // Инициализира списъка базиран на масив – заделя памет
    public CustomArrayList() {
        arr = new Object[INITIAL_CAPACITY]; // Създава нов масив с начален капацитет
        count = 0; // Задава брояча на 0, защото списъкът е празен
    }

    public int getLength() {
        return count; // Връща броя на елементите в списъка
    }

     // Добавя елемент към списъка


    public void add(Object item) {
        add(count, item); // Извиква метода add с текущия брой елементи като индекс
    }


    //  Вмъква указан елемент на дадена позиция в списъка


    public void add(int index, Object item) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index); // Изхвърля изключение, ако индексът е невалиден
        }

        Object[] extendedArr = arr; // Променлива за новия масив
        if (count + 1 == arr.length) {
            extendedArr = new Object[arr.length * 2]; // Удвоява размера на масива, ако е необходимо
        }

        // Копира елементите преди новата позиция
        System.arraycopy(arr, 0, extendedArr, 0, index);

        count++; // Увеличава броя на елементите

        // Копира елементите след новата позиция
        System.arraycopy(arr, index, extendedArr, index + 1, count - index - 1);

        extendedArr[index] = item; // Вмъква новия елемент на посочената позиция
        arr = extendedArr; // Присвоява новия масив към полето arr
    }
     //Връща индекса на първото срещане на указания елемент в този списък.


    public int indexOf(Object item) {
        if (item == null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null)
                    return i; // Връща индекса, ако елементът е null
            }
        } else {
            for (int i = 0; i < arr.length; i++)
                if (item.equals(arr[i]))
                    return i; // Връща индекса, ако е намерен елемент, който е равен на търсения
        }
        return -1; // Връща -1, ако елементът не е намерен
    }

    // Изчиства списъка

    public void clear() {
        arr = new Object[0]; // Присвоява нов празен масив на полето arr
        count = 0; // Нулира брояча
    }


    //  Проверява дали даден елемент съществува

    public boolean contains(Object item) {
        int index = indexOf(item); // Намира индекса на елемента
        boolean found = (index != -1); // Проверява дали елементът е намерен
        return found; // Връща резултата от проверката
    }

    public Object elementAt(int index) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index); // Изхвърля изключение, ако индексът е невалиден
        }
        return arr[index]; // Връща елемента на посочения индекс
    }

     //Премахва елемента на указаната позиция

    public Object remove(int index) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index); // Изхвърля изключение, ако индексът е невалиден
        }

        Object item = arr[index]; // Запазва премахнатия елемент

        // Премества елементите след премахнатия наляво
        System.arraycopy(arr, index + 1, arr, index, count - index - 1);

        arr[count - 1] = null; // Нулира последната позиция
        count--; // Намалява брояча

        return item; // Връща премахнатия елемент
    }


     //Премахва указания елемент и връща неговия индекс или -1,


    public int remove(Object item) {
        int index = indexOf(item); // Намира индекса на елемента

        if (index == -1) {
            return index; // Връща -1, ако елементът не е намерен
        }

        // Премества елементите след премахнатия наляво
        System.arraycopy(arr, index + 1, arr, index, count - index - 1);

        count--; // Намалява брояча

        return index; // Връща индекса на премахнатия елемент
    }
}
