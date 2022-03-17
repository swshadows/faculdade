#include <stdio.h>

// Usando ponteiros, a função será adicionada na main
void funcao(int *pointer,int val){	
	*pointer += val;
}

main(){
	int variavel = 10;
	printf("Antes: %d",variavel);
	funcao(&variavel,10);
	printf("\nDepois: %d",variavel);
}
