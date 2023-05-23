public class NumDivPorQuatroeSeis {
    public static void main(String[]args){
        int contador = 0;
        for(int i=1;i<=30000;i++){
            int a;
            a = i;
            if(a % 4 == 0 & a % 6 == 0){
                contador = contador + 1;
            }
        }
        System.out.println(""+contador);
    }
}
