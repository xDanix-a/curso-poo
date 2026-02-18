import java.util.Scanner;

public class Condicionales {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // Leer dos numeros y deducir si estan en orden creciente o decreciente
        int a = 0,  b =0;
        System.out.println("Digite a: "); // Solicitamos por tecldo el valor de 'a'
        a = sc.nextInt(); // capturamos por teclado el valor de 'a'
        System.out.println("Digite b: ");
        b = sc.nextInt();
        // Condicional para deducir si estan en orden creciente o decreciente
        if(a <= b){
            System.out.println("Orden creciente");
        }else{
            System.out.println("Orden decreciente");
        }
        sc.close();

    }
}