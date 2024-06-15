package staticlist;

public class CustomArrayList {
    private Object[] arr;

    private int count;

    private static final int INITIAL_CAPACITY = 4;


    public CustomArrayList() {

        arr = new Object[INITIAL_CAPACITY];

        count = 0;

    }

 //Метод за получаване на дължината
    public int getLength() {

        return count;

    }

      //Метод за добавяне на елемент

    public void add(Object item, Object o) {

        add(count, item);

    }
       //Метод за добавяне на елемент на определена позиция
    public void add(int index, Object item) {

        if (index > count || index < 0) {

            throw new IndexOutOfBoundsException(

                    "Invalid index: " + index);

        }

        Object[] extendedArr = arr;

        if (count + 1 == arr.length) {

            extendedArr = new Object[arr.length * 2];

        }


        System.arraycopy(arr, 0, extendedArr, 0, index);

        count++;

        System.arraycopy(

                arr, index, extendedArr, index + 1, count - index - 1);

        extendedArr[index] = item;

        arr = extendedArr;

    }
}



