package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcao = 0;
		Nodo raiz = null;
		OperacoesArvore arvore = new OperacoesArvore();
		do {
			System.out.println();
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Inserir nodo na árvore");
			System.out.println("2 - Mostrar maior número");
			System.out.println("3 - Mostrar menor número");
			System.out.println("4 - Mostrar nós folhas");
			System.out.println("5 - Mostrar ancestrais de um nó");
			System.out.println("6 - Mostrar nós descententes de um nó");
			System.out.println("7 - Mostrar subárvore da direita de um nó");
			System.out.println("8 - Mostrar a subárvore da esquerda de um nó");
			System.out.println("9 - Contar elementos na árvore");
			System.out.println("10 - Transformar árvore em lista encadeada");
			System.out.println("11 - Mostrar números pares");
			System.out.println("12 - Mostrar caminho prefixado à esquerda");
			System.out.println("13 - Mostrar caminho prefixado à direita");
			System.out.println("14 - Mostrar caminho central à esquerda");
			System.out.println("15 - Mostrar caminho central à direita");
			System.out.println("16 - Mostrar caminho pós-fixado a esquerda");
			System.out.println("17 - Mostrar caminho pós-fixado a direita");

			System.out.println("0 - Sair"); 	
			
			opcao = s.nextInt();
			
			switch (opcao) {
			case 1: {
				System.out.println("Informe o número a ser inserido na árvore: ");
				int numero = s.nextInt();
				raiz = arvore.inserir(raiz, numero);
				
				break;
			}
			case 2:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.mostrarMaiorNumero(raiz);
				}
				break;
			}
			case 3: {
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.mostrarMenorNumero(raiz);
				}
				break;
			}
			case 4: {
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.mostrarFolhas(raiz);
				}
				break;
			}
			case 5: {
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					System.out.println("Informe o número do nodo: ");
					int numero = s.nextInt();
					if(arvore.consultar(raiz, numero, false)) {
						arvore.mostrarAncestrais(raiz, numero);
					}else {
						System.out.println("O nodo não existe na árvore. ");
					}
				}
				break;
			}
			case 6: {
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					System.out.println("Informe o número do nodo: ");
					int numero = s.nextInt();
					if(arvore.consultar(raiz, numero, false)) {
						arvore.mostrarDescendentes(raiz, numero);
					}else {
						System.out.println("O nodo não existe na árvore. ");
					}
				}
				break;
			}
			case 7: {
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					System.out.println("Informe o número do nodo: ");
					int numero = s.nextInt();
					if(arvore.consultar(raiz, numero, false)) {
						arvore.mostrarSubarvoreDireita(raiz, numero);
					}else {
						System.out.println("O nodo não existe na árvore. ");
					}
				}
				break;
			}
			case 8: {
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					System.out.println("Informe o número do nodo: ");
					int numero = s.nextInt();
					if(arvore.consultar(raiz, numero, false)) {
						arvore.mostrarSubarvoreEsquerda(raiz, numero);
					}else {
						System.out.println("O nodo não existe na árvore. ");
					}
				}
				break;
			}
			case 9: {
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					System.out.println("O total de elementos na árvore é "+arvore.contarElementos(raiz));
					
				}
				break;
			}
			
			case 10:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					ListaEncadeada lista = new ListaEncadeada();
					arvore.converterParaLista(raiz, lista);
					lista.listar();
				}
				break;
			}
			case 11:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.mostrarPares(raiz);
				}
				break;
			}
			case 12:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.prefixadoEsquerda(raiz);
				}
				break;
			}
			case 13:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.prefixadoDireita(raiz);
				}
				break;
			}
			case 14:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.centralEsquerda(raiz);
				}
				break;
			}
			case 15:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.centralDireita(raiz);
				}
				break;
			}
			case 16:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.posFixadoEsquerda(raiz);
				}
				break;
			}
			case 17:{
				if(raiz == null) {
					System.out.println("Àrvore vazia");
				}else {
					arvore.posFixadoDireita(raiz);
				}
				break;
			}
			default:
				opcao = 0;
			}
			
		}while(opcao != 0);
		
	}

}
