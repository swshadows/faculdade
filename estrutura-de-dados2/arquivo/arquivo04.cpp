#include <stdio.h>
#include <stdlib.h>

main(){
	FILE *arquivo;
	int n1, n2, n3;
    char nome[50];
    printf("Digite o nome do arquivo a ser lido: ");
    scanf("%s", &nome);
    
	arquivo = fopen(nome,"r");
	if(arquivo == NULL){
		printf("Arquivo nao encontrado");
		exit(0);
	}
	fscanf(arquivo,"%i %i %i",&n1,&n2,&n3);
	printf("Valores lidos do arquivos %i %i %i",n1,n2,n3);
	fclose(arquivo);
}
