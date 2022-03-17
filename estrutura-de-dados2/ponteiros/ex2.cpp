#include <stdio.h>

// Testando os valores dos ponteiros
main(void){
    int valor = 100;
    int *ptr;
    ptr = &valor;

    printf("Utilizando ponteiros\n\n");
    printf ("Conteudo da variavel valor: %d\n", valor);
    printf ("Endereço da variavel valor: %d\n", &valor);
    printf ("Conteudo da variavel ponteiro ptr: %d\n", ptr);
    printf("Conteudo da variavel ponteiro *ptr: %d", *ptr);
}
