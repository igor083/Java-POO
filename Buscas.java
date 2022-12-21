package atividades_a_parte;

public class Buscas {
    public int tamanho;
	public Buscas() {}


	public int[] geraVetorNumericoOrdenado(int tamanho) {
		int[] numeros = new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			numeros[i]=i+1;
		}
		return numeros;
	}


	public boolean buscaLinear_iterativa(int[] numeros, int num) {


		for(int i =0;i<numeros.length;i++) 
			if(numeros[i]==num) 
			{return true;}



		return false;
	}


	public boolean buscaLinear_recursiva(int[] numeros, int num) {
		int indc = numeros.length-1;
		boolean busca = BuscaRecLin(numeros,num,indc);
		if (busca==false) {
			return false;
		}else {
			return true;}
	}
	private boolean BuscaRecLin (int[] numeros, int num, int indc){

		if (indc < 0){ 
			return false;}
		else if (numeros[indc]==num) {
			return true;}

		return BuscaRecLin(numeros,num,indc-1);
	}


	public boolean  buscaBinaria_iterativa(int[] numeros, int num){
		int meio, inicio=0, fim = numeros.length-1;

		while(inicio <= fim){
			meio = (inicio+fim)/2;
			if(numeros[meio] == num)
				return true;
			else if(numeros[meio] < num) inicio = meio+1;
			else if(numeros[meio] > num) fim = meio-1;
		}
		return false;
	}


	public boolean buscaBinaria_recursiva(int[] numeros, int num) {
		int resultado = buscaBinariaRecursiva(numeros,num);
		if(resultado < 0){
			return false;
		}
		else{
			return true;	    }
	}

	public static int buscaBinariaRecursiva(int [] numeros, int num){
		return buscaRecursiva(numeros, num, 0, numeros.length-1);
	}

	public static int buscaRecursiva(int [] numeros, int num, int menor, int maior){
		int media = (menor+maior)/2;
		if(menor>maior){
			return -1;
		}
		if(numeros[media] == num){
			return media;
		}
		if(numeros[media] < num){
			return buscaRecursiva(numeros, num, media+1, maior);
		}
		else{
			return buscaRecursiva(numeros, num, menor, media-1);
		}
	}
}