/*
Escreva um algoritmo para imprimir os números inteiros no intervalo de 10 a 100.
*/

#include <stdio.h>
#include <locale.h>

void inteiros(int start, int end);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Lógica e funções para calculo
  inteiros(10, 100);
  return 0;
}

void inteiros(int start, int end){
  for(start; start <= end; start++)
    printf("Número: %d\n", start);
}
