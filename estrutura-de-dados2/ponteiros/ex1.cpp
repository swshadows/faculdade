#include <stdio.h>

// Testes iniciais com ponteiros
main(){
	int n = 10;
	int *ponteiro;
	ponteiro = &n;
	printf("Valor da variavel: %d", n);
	*ponteiro = 20;
	printf("\nValor depois: %d", n);
}
