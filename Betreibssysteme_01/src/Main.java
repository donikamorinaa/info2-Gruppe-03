public class Main {

    public static void main (String [] args){
        MyThread a = new MyThread();
        MyThread b = new MyThread();


        a.start();
        b.start();

    }
}
