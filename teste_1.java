package prog2;
import java.util.Scanner;
public class notass {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite a quantidade de alunos voce deseja saber a media entre duas notas: ");
		int op; int cont=0;
		op= input.nextInt();
		while(cont<=op){
			System.out.println("digite a primeiro nota desse aluno: ");
			int n1= input.nextInt();
			System.out.println("digite a primeiro nota desse aluno");
			int n2= input.nextInt();
			int soma= n1+n2;
			int media = soma/2;
			System.out.printf(" as notas desse aluno foram %d e %d e sua media é igual a %d\n", n1,n2,media);
			if(media>=7) {
				System.out.println("ESTE ALUNO FOI APROVADO, VEM PROXIMO PERÍODO");
			}
			else if(media>=4) {
				System.out.println("É TU AINDA TEM CHANCES, TA NA FINAL CAMPEÃO");
			}
			else if(media<4) {
				System.out.println("EI DESSA VEZ DEU ERRADO PARA TI QUEM SABE SEMESTRE QUE VEM NÉ? DESISTE NÃO UMA HORA VAI.");
			}
			else {
				break;
			}
		
		}

	}

}
