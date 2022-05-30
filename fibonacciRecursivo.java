import java.util.Scanner;

public class Main
{  
    static int fibonnaciRecursivo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else {
            return fibonnaciRecursivo(n - 1) + fibonnaciRecursivo(n - 2);
        }
    } 
    
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);   
        int numero;
        System.out.println("Digite o numero:");
        numero = valor.nextInt();
        
        for (int i = 1; i <= numero; i++){
            System.out.println(fibonnaciRecursivo(i));
        }
    }
}