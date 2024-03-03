public class Hanoi {
    public static void manipular(int discos, int primeiro, int segundo,int terceiro ){
        if(discos > 0){
            manipular(discos-1, primeiro, terceiro, segundo);
            System.out.printf("Mover de %d para %d\n", primeiro,terceiro);
            manipular(discos-1, segundo, primeiro, terceiro);
        } 
    }
    public static void main(String[] args) {
        int discos = 3;
        manipular(discos, 1, 2, 3);
        
    }
}
