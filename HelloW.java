import java.util.ArrayList;
import java.util.Scanner;

public class HelloW {
    public static void main(String[] args) {
        System.out.println("buenas");

        System.out.println("Hagamos un if sencillo?");

        int i = 0;
        do {
            i++;
            System.out.println(i);
        }while (i < 5);

        System.out.println("Haciendo pruebas de git aca con la lichus");


        //Mercadito
        Scanner sc = new Scanner(System.in);

        ArrayList<String> mercado = new ArrayList<>();

        System.out.println("Buen día, usted va al mercado, cuentas frutas diferentes va a llevar?");
        int numeroFrutas = sc.nextInt();

        AgregarFutasAlArray(sc, mercado, numeroFrutas);

        MostrarFrutas(mercado);


    }

    private static void AgregarFutasAlArray(Scanner sc, ArrayList<String> mercado, int numeroFrutas) {
        System.out.println("Escriba esa frutas que busca:");

        for (int j = 0; j <= numeroFrutas; j++){
            String fruta = sc.nextLine();
            mercado.add(fruta);
        }
    }

    private static void MostrarFrutas(ArrayList<String> mercado) {
        System.out.println("Las frutas que quiere son las siguientes:");

        for (String frutasQueridas : mercado) {
            System.out.println(frutasQueridas);
        }
    }
}
