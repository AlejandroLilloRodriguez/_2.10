package dominio;
import java.util.ArrayList;
public class Ejercicio10 {
    public static ArrayList listaPar(ArrayList lista,int n){
        if(n==2){
            lista.add(n);
            return lista;
        }else
        if(n%2==0){
            lista.add(n);
            return listaPar(lista,n-1);
        }else{
            return listaPar(lista,n-1);
        }

    }
}
