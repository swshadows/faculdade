#include <stdio.h>

// Testes dinamicos com arquivo
main(){
	FILE *arquivo;
	char nome[20];
	printf("Digite o nome do arquivo a ser criado: ");
	scanf("%s",&nome);
	arquivo = fopen(nome,"a");
	for(int i = 0;i < 10; i++){
	    fprintf(arquivo,"Texto inserido com sucesso\n");
	}
	printf("Arquivo %s criado com sucesso", nome);
}
