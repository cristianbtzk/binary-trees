package exercicios;

public class OperacoesArvore {
	
	public Nodo inserir(Nodo aux, int numero) {
		if(aux == null) {
			aux = new Nodo();
			aux.numero = numero;
			aux.esquerda = null;
			aux.direita = null;
			System.out.println("Valor inserido.");
		}else {
			if(numero < aux.numero) {
				aux.esquerda = inserir(aux.esquerda, numero);
			}else {
				aux.direita = inserir(aux.direita, numero);
			}
		}
		
		return aux;
	}
	
	// Caminhamentos
	
	public void prefixadoEsquerda(Nodo aux) {
		if(aux != null) {
			System.out.print(aux.numero + " ");
			prefixadoEsquerda(aux.esquerda);
			prefixadoEsquerda(aux.direita);
		}
	}
	
	public void prefixadoDireita(Nodo aux) {
		if(aux != null) {
			System.out.print(aux.numero + " ");
			prefixadoDireita(aux.direita);
			prefixadoDireita(aux.esquerda);

		}
	}
	
	public void centralEsquerda(Nodo aux) {
		if(aux != null) {
			centralEsquerda(aux.esquerda);
			System.out.print(aux.numero + " ");
			centralEsquerda(aux.direita);

		}
	}
	public void centralDireita(Nodo aux) {
		if(aux != null) {
			centralDireita(aux.direita);
			System.out.print(aux.numero + " ");
			centralDireita(aux.esquerda);

		}
	}
	public void posFixadoEsquerda(Nodo aux) {
		if(aux != null) {
			posFixadoEsquerda(aux.esquerda);
			posFixadoEsquerda(aux.direita);
			System.out.print(aux.numero + " ");

		}
	}
	public void posFixadoDireita(Nodo aux) {
		if(aux != null) {
			posFixadoDireita(aux.direita);
			posFixadoDireita(aux.esquerda);
			System.out.print(aux.numero + " ");

		}
	}
	
	
	
	
	
	// Métodos
	
	public boolean consultar(Nodo aux,int num, boolean achou){
		if (aux !=null && !achou){
			if (aux.numero == num){
				achou = true;
			}
			else if (num < aux.numero)
					achou = consultar(aux.esquerda,num,achou);
				else
					achou = consultar(aux.direita,num,achou);	
		}
		return achou;
	}
	
	public void mostrarAncestrais(Nodo aux, int numero) {
		if(aux.numero != numero) {
			System.out.println(aux.numero+ " é ancestral de "+numero);
			
			if(numero < aux.numero) {
				mostrarAncestrais(aux.esquerda, numero);
			}else {
				mostrarAncestrais(aux.direita, numero);
			}
		}
	}
	
	public void mostrarDescendentes(Nodo aux, int numero) {
		if(aux.numero == numero) {
			listarFilhos(aux.esquerda, numero);
			listarFilhos(aux.direita, numero);

		}else {
			if(numero < aux.numero) {
				mostrarDescendentes(aux.esquerda, numero);
			}else {
				mostrarDescendentes(aux.direita, numero);
			}
		}
	}
	
	public int contarElementos(Nodo aux) {
		if(aux != null) {
			return contarElementos(aux.esquerda) + contarElementos(aux.direita) + 1;
		}else {
			return 0;
		}
	}
	
	public void mostrarPares(Nodo aux) {
		if(aux != null) {
			mostrarPares(aux.esquerda);
			if(aux.numero % 2 == 0) {
				System.out.println(aux.numero);
			}
			mostrarPares(aux.direita);
		}
	}
	
	public void  converterParaLista(Nodo aux, ListaEncadeada lista) {
		if(aux != null) {
			converterParaLista(aux.esquerda, lista);
			lista.inserir(aux.numero);
			converterParaLista(aux.direita, lista);
		}
	}
	
	public void mostrarSubarvoreEsquerda(Nodo aux, int numero) {
		if(aux.numero != numero) {
			if(numero < aux.numero) {
				mostrarSubarvoreEsquerda(aux.esquerda, numero);
			}else {
				mostrarSubarvoreEsquerda(aux.direita, numero);
			}
		}else {
			listarSubarvore(aux.esquerda);
		}
	}
	
	public void mostrarSubarvoreDireita(Nodo aux, int numero) {
		if(aux.numero != numero) {
			if(numero < aux.numero) {
				mostrarSubarvoreDireita(aux.esquerda, numero);
			}else {
				mostrarSubarvoreDireita(aux.direita, numero);
			}
		}else {
			listarSubarvore(aux.direita);
		}
	}
	
	public void listarSubarvore(Nodo aux) {
		if(aux != null) {
			listarSubarvore(aux.esquerda);
			System.out.println(aux.numero+" ");
			listarSubarvore(aux.direita);
		}
	}
	
	public void listarFilhos(Nodo aux,int numero) {
		if(aux != null) {
			listarFilhos(aux.esquerda, numero);
			System.out.println(aux.numero+ " é um nodo filho de "+numero);
			listarFilhos(aux.direita, numero);
		}
	}
	
	public void mostrarMaiorNumero(Nodo aux) {
		if(aux.direita != null) {
			mostrarMaiorNumero(aux.direita);
		}else {
			System.out.println("O maior número da árvore é "+aux.numero);
		}
	}
	
	public void mostrarMenorNumero(Nodo aux) {
		if(aux.esquerda != null) {
			mostrarMenorNumero(aux.direita);
		}else {
			System.out.println("O menor número da árvore é "+aux.numero);
		}
	}
	
	public void mostrarFolhas(Nodo aux) {
		if(aux != null) {
			if(aux.esquerda == null && aux.direita == null) {
				System.out.println(aux.numero + " é uma folha");
			}else {
				mostrarFolhas(aux.esquerda);
				mostrarFolhas(aux.direita);
			}
		}
	}
}
