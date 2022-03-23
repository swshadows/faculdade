#include <stdio.h>
#include <stdlib.h>

int main(){
    FILE *arq;

    /*char caractere;*/
    /*char arq_aux, nome[30];
    int idade1, idade2;*/

    arq = fopen("teste.txt", "r");

    if (arq == NULL)
    {
        printf("Nao foi possivel abrir o arquivo");
        return 1;
    }
    /*
    caractere = getc(arq);
    while (caractere != EOF)
    {
        printf("%c", caractere);
        caractere = getc(arq);
    }*/

    /*arq_aux = fscanf(arq, "%d %d %s", &idade1, &idade2, &nome);
    while (arq_aux != EOF){
        printf("%d", idade1);
        printf("%d", idade2);
        printf("%s", nome);
        arq_aux = fscanf(arq, "%d %d %s", &idade1, &idade2, &nome);
    }*/


    fclose(arq);

    return 0;
}
