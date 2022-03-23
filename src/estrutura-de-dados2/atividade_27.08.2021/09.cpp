/*
Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).
*/

#include <stdio.h>
#include <locale.h>

void soma(int n1);
void subtracao(int n1);
void multiplicacao(int n1);
void divisao(int n1);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "");

  //L�gica e fun��es para calculo
  soma(8);
  subtracao(8);
  multiplicacao(8);
  divisao(8);
  return 0;
}

void soma(int n1){
  printf("--- SOMA ---\n");
  for(int i = 0; i <= 10; i++)
    printf("%d + %d = %d\n", n1, i, (n1+i));
}

void subtracao(int n1){
  printf("--- SUBTRA��O ---\n");
  for(int i = 0; i <= 10; i++)
    printf("%d - %d = %d\n", n1, i, (n1-i));
}

void multiplicacao(int n1){
  printf("--- MULTIPLICA��O ---\n");
  for(int i = 0; i <= 10; i++)
    printf("%d * %d = %d\n", n1, i, (n1*i));
}

void divisao(int n1){
  printf("--- DIVIS�O ---\n");
  for(int i = 0; i <= 10; i++)
    printf("%d / %d = %d\n", (i*n1), n1, (i*n1/n1));
}
