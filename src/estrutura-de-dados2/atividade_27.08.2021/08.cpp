/*
Escreva um algoritmo para imprimir os n�meros inteiros no intervalo de 10 a 100.
*/

#include <stdio.h>
#include <locale.h>

void inteiros(int start, int end);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "");

  //L�gica e fun��es para calculo
  inteiros(10, 100);
  return 0;
}

void inteiros(int start, int end){
  for(start; start <= end; start++)
    printf("N�mero: %d\n", start);
}
