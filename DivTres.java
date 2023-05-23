import java.util.Scanner;
public class DivTres {
    public static void main(String[]args){
        int i,a;

        for(i = 2000;i<20000;i++){
            a = i;
             if(a % 2 == 0){
                if(a%3 == 0){
                    System.out.println(": "+a);
                }
             }    
        }
    }
}
