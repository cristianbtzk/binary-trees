package exercicios;

public class ListaEncadeada {
	private NodoLista inicio;
	private NodoLista aux;
	private NodoLista fim;
	
	public void inserir(int numero) {
		NodoLista novo = new NodoLista();
		novo.numero = numero;
		
		if(inicio == null) {
			inicio = novo;
			fim = novo;
			novo.proximo = null;

		}else {
			fim.proximo = novo;
			fim = novo;
			novo.proximo = null;
		}
	}
	
	public void listar() {
		if(inicio == null) {
			System.out.println("Lista vazia ");
		}else {
			System.out.println("Lista Encadeada: ");
			aux = inicio;
			do {
				System.out.print(aux.numero+ " ");
				aux = aux.proximo;
			}while(aux != null);
		}
	}
}
