public class Test1 {

       public Test1(String name){
        this.name = name;
    }

    String name;
    int livesLeft;


    void meow(){
        System.out.println("meow");
    }

    // main methode is eigentlich immer seperat
    public static void main(String[] args){
        Test1 t1 = new Test1("bello");

        t1.livesLeft = 3;

        t1.meow();

    }

}
