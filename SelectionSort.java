import java.util.Arrays;

public class SelectionSort {

    public static int[] selection(int[] array,int i, int j, int tamanho){
    if(tamanho == 1)
        return array;
    if(array[i] > array[j]){
        metodoAuxialiar(array, i, j);
    }
    if (j == tamanho) {
        selection(array, i+1, j+2, tamanho);
    }
    else{
        selection(array, i, j+1, tamanho);
    }
    return selection(array, i, j, tamanho-1);
    }

    public static void metodoAuxialiar(int[] array,int i,int j){
        int atual = array[i];
        array[i] = array[j];
        array[j] = atual;
    }
    public static void main(String[] args) {
        int[] array = {1,10,2,3,0};


       selection(array, 0, 1, array.length-1);
       System.out.println(Arrays.toString(array));
    }
}
