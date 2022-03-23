#include <stdio.h>

#define MAX 2

typedef struct{
    char nome[30];
    char end[40];
    char rg[10];
    char fone[12];
}tCliente;

int main(){
    FILE * arqCliente;
    tCliente vetCli[MAX], vetLeCli[MAX];
    int retorno;
    arqCliente = fopen("dadosCli.bin", "r+b");
    if (arqCliente == NULL)
        printf("\nErro na abertura do arquivo!!");
    for (int i = 0; i < MAX; i++){
        puts("Nome ? ");
        gets(vetCli[i].nome);
        puts("Endereco ? ");
        gets(vetCli[i].end);
        puts("Telefone ? ");
        gets(vetCli[i].fone);
        puts("RG ? ");
        gets(vetCli[i].rg);
    }
        puts("Gravando....");
    for (int i = 0; i < MAX; i++){
        retorno = fwrite(&vetCli[i], sizeof(tCliente), 1, arqCliente);
        if (retorno != 1)
            puts("Erro na escrita do arquivo!!");
    }

    rewind(arqCliente);

    puts("Lendo....");
    for (int i = 0; i < MAX; i++){
        retorno = fread(&vetLeCli[i], sizeof(tCliente), 1, arqCliente);
        if (retorno != 1){
            if (feof(arqCliente))
                break;
            puts("Erro na leitura do arquivo!!");
        }
    }
    for (int e = 0; e < MAX; e++){
        puts(vetLeCli[e].nome);
        puts(vetLeCli[e].end);
        puts(vetLeCli[e].fone);
        puts(vetLeCli[e].rg);
    }
    fclose(arqCliente);
    return 0;
}
