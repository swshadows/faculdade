#include <stdio.h>

// Adicionando valores a um vetor manualmente usando ponteiros
main(){
	int vetor[5];
	int *p;
	p = &vetor[0];
	*p = 20;
	p = &vetor[1];
	*p = 30;
	p = &vetor[2];
	*p = 40;
	p = &vetor[3];
	*p = 50;
	p = &vetor[4];
	*p = 60;
	printf("%d",vetor[0]);
	printf("\n%d",vetor[1]);
	printf("\n%d",vetor[2]);
	printf("\n%d",vetor[3]);
	printf("\n%d",vetor[4]);
}
