package array;

import java.util.Scanner;

public class Tabela_nota {
	
		public static float [][]calcularMedia(float [][]arrayNotas, int quantidadeDeAlunos, int quantidadeDeNotas) {
			
			float [][]notasAlunos = new float [quantidadeDeAlunos][1];
			float total=0;
			
			for(int i = 0; i < quantidadeDeAlunos; i++) {
				for(int j = 0; j < quantidadeDeNotas; j++) {
					total = total + arrayNotas[i][j];
				}
				notasAlunos[i][0]= (total/quantidadeDeNotas);
			}

			return notasAlunos;
		}
		

		public static void main(String[] args) {
			int quantidadeDeAlunos, quantidadeDeNotas;
			float [][]arrayNotas;
			float [][]arrayNotasFinal;
			float notaTurma = 0, mediaTurma = 0;
			
			Scanner lerDados = new Scanner(System.in);
			
			System.out.println("Informe a quantidade de Alunos: ");
			quantidadeDeAlunos = lerDados.nextInt();
			
			System.out.println("Informe a quantidade de notas: ");
			quantidadeDeNotas = lerDados.nextInt();
			
			arrayNotas = new float[quantidadeDeAlunos][quantidadeDeNotas];
			
			for(int i = 0; i < quantidadeDeAlunos; i++) {
				for(int j = 0; j < quantidadeDeNotas; j++) {
					System.out.printf("\nInforme a quantidade de nota[%d] do aluno %d: ",j,i);
					arrayNotas[i][j] = lerDados.nextFloat(); 
				}
			}
			
			arrayNotasFinal = calcularMedia(arrayNotas, quantidadeDeAlunos, quantidadeDeNotas);
			
		    System.out.println("Medias: ");
			for(int i = 0; i < quantidadeDeAlunos; i++) {
				System.out.println(arrayNotasFinal[i][0]);
				notaTurma = notaTurma + arrayNotasFinal[i][0];
			}
			
			mediaTurma = notaTurma/quantidadeDeAlunos;
			System.out.println("media Turma: "+mediaTurma);
			lerDados.close();
		}
	}

