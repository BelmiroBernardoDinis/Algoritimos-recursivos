import java.util.Arrays;

public class BubbleSort {
    public static int[] bubble(int[] array, int size){
    if(size == 1)
    return array;

    for(int i=0 ; i< size ; i++){
        if( array[i] > array[i+1]){
            int aux = array[i];
            array[i] = array[i+1];
            array[i+1] = aux;
        }
    }
    
        return  bubble(array, size-1);
        
    }
    public static void main(String[] args) {
     int[] array = {1,10,7,0,4,5};
     bubble(array,array.length-1);
     
     System.out.println(Arrays.toString(array));
    }
}
