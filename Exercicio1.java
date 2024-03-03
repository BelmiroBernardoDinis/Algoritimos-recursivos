


import java.util.Arrays;
 public class Exercicio1 {

  public static void repart(int[] array,int i,int numero){
    if(numero == 1){
      if(i < array.length){
        System.out.println(array[i]);
        repart(array, i+1,numero);
      }
    } 
    else{
      if(i >= 0){
        System.out.println(array[i]);
        repart(array, i-1, numero);
      }
    }
         
  }
    
public static void main(String[] args) {
 
        int[] a = {1,2,7,8,5,9,6};
        System.out.println("\tDigite o numero que pretende comparar com o elemento que esta no meio do array\t\n");
        System.out.println(Arrays.toString(a));
        System.out.println("\n Digite o numero : ");
        int numero = 7;
        int tamanho = a.length;
        int medio = tamanho/2;
        if(a[medio] < numero){
          numero = 1;
        }
        System.out.println("\nResultado do array processado é :");
       repart(a, medio, numero);
       System.out.println("\n\n");
    }

 
}