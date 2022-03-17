/*
Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive)
em ordem crescente.
*/

#include <stdio.h>
#include <locale.h>

void crescente(int start, int end);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Lógica e funções para resolução
  crescente(1, 10);
  return 0;

}

void crescente(int start, int end){
  for(start; start <= end; start++)
    printf("Número: %d\n", start);
}
