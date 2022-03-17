#include <stdio.h>

int main() {
    FILE *fp;
    fp = fopen("teste.txt", "w");
    if (fp == NULL){
        printf("Nao e possivel abrir o arquivo");
        exit();
    }
    fprintf(fp, "Arquivo teste");
    fclose(fp);
    
    return 0;
}
