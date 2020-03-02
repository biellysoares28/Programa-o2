package teste01;
import java.util.Scanner;
public class Teste01 {
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       System.out.println("DIGITE QUANTOS ALUNOS VOCE DESEJA ADICIONAR NA SUA TURMA: ");
       int a = input.nextInt();
       String[] aluno = new String [a];
       int i = 0;
      while ( i!=a){
           System.out.println("digite o nome desse aluno para que o mesmo seja adicionado a turma\n:");
           String b = input.next();
           aluno[i]= b;
           i++;
         
       }
    }
    
}
