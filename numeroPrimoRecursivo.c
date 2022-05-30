#include <stdio.h>
int numeroPrimo(int valorRecebido, int cont);
int main(){
  
  int valor, cont = 1;
  scanf("%d", &valor);

  if(valor > 1){
  	numeroPrimo(valor, cont);
  }else{
  	// desvalida
  	printf("Numero menor que 2");
  }
}

int numeroPrimo(int valorRecebido, int cont){
	if(cont <= valorRecebido){
	int aux = 0;
	for(int i = 1; i <= cont;i++){
		
		if(cont % i == 0){
			aux++;
		}
	}
	if(aux == 2){
		printf("%d ", cont);
	}
	cont++;
	numeroPrimo(valorRecebido, cont);		
	}

}