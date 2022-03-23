#include <stdio.h>

// Testando alterações com arquivo
main(){
	FILE *arquivo;
	arquivo=fopen("arquivo02.txt","w");
	fprintf(arquivo,"Texto na linha 1\nTexto em outra linha");
	printf("Arquivo criado com sucesso");
	fclose(arquivo);
}
