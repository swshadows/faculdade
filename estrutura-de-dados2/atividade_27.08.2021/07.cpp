/*
Escreva um algoritmo para imprimir os n�meros de 1 (inclusive) a 10 (inclusive)
em ordem crescente.
*/

#include <stdio.h>
#include <locale.h>

void crescente(int start, int end);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "");

  //L�gica e fun��es para resolu��o
  crescente(1, 10);
  return 0;

}

void crescente(int start, int end){
  for(start; start <= end; start++)
    printf("N�mero: %d\n", start);
}
