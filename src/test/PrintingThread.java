package test;

public class PrintingThread extends Thread {
    CreateArr ob;

    public PrintingThread(CreateArr ob) {
        this.ob = ob;
    }
    @Override
    public void run() {
        print();
    }

    public void print() {
        int i;
        for (i = 0; i < ob.array.length; i++) {

            System.out.print(ob.array[i] + " ");
        }
    }
}
