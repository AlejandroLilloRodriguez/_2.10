package aplicacion;
import dominio.Ejercicio10;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    public static void main (String[]args){
        ArrayList lista= new ArrayList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(" "+Ejercicio10.listaPar(lista, n));
    }
}
