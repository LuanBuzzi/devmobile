import java.util.*;

public class Main {
    public static void main(String[] args) {
     
    /* 1 */  
     
   float altura = 20;
   float base = 30;
   
   float a = altura * base; 
      System.out.println("1) Fórmula A = " + a);
      
    /* 2 */
    
    int cavalo = 5; 
    int ferradura = cavalo * 4; 
    
    System.out.println("2) Há " + cavalo + " cavalos. Você deve comprar " + ferradura + " ferraduras.");
    
    /* Código antigo 
    int cavalo = 5;
    
    for(int i = 0; i <= cavalo; i++){
      int ferradura = i * 4;
    }
    
    */
    
    /* 3 */
    
    String nome = "Luan";
    int idade = 17;
    int dias = idade * 365;
    System.out.println("3) " + nome + " com " + idade + " anos, viveu " + dias + " dias.");
  
   /* 4 */
   
    double peso = 1.5;
    
    double preco = peso * 12;
    
      System.out.println("4) Seu prato pesou " + peso + "Kg. Você deve pagar o valor de R$" + preco);
    
    
  }
}
