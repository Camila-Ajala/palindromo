import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num,n, aux,reverso;
        
      
        System.out.println("Insira uma quantidade de valores");
        n=teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            
        System.out.println("Insira um valor para: "+i);
        num=teclado.nextInt();
        
        aux=num;
        reverso=0;
        
        while(aux!=0){
            reverso=reverso*10;
            reverso+=aux%10;
            aux=aux/10;
        }
        if(reverso==num){
            System.out.println("é palindromo");
        }else{
            System.out.println("NÃO é palindromo");
    }
            
    }
        
}
}