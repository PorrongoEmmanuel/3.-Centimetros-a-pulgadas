import java.util.Scanner;

public class conversion {

    public void conversor(){
        double valorpulgada=2.54;
        double pulgadas,centimetros;

        Scanner t= new Scanner(System.in);

        System.out.println("valor en centimetros");
        centimetros= t.nextInt();

        pulgadas=centimetros*valorpulgada;
        System.out.println("valor en pulgadas: "+pulgadas);


    }

}
