import java.util.Scanner;

public class Anagrama {
     //abc => abc,acb,bac,bca,cab,cba

    public static void permuta(char[] ar, int num)
    {
        if(num == ar.length-1){
            System.out.println(ar);
        }
        for(int i=num ; i<ar.length; i++){
            auxiliar(ar,i,num);
            permuta(ar, num+1);
            auxiliar(ar,i,num);
        }
    }

    public static void auxiliar(char[] ar, int i,int num){
        char temp = ar[i];
        ar[i] =ar[num];
        ar[num] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        permuta(s.toCharArray(), 0);
        sc.close();
    }
}
