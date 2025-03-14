import java.util.Random;


public class exemplo5 {

   //public static Random geradorAleat = new Random();
    public static void main(String[] args) {
        for (int i = 1; i <=10; i+= 1) {
           // double aleatorio = (int) Math.floor(Math.random() * 6 ) + 1 ;
           Random geradorAleat = new Random();
           int aleatorio = geradorAleat.nextInt(6) +1 ;
            System.out.println(aleatorio);
        }
    }
}
