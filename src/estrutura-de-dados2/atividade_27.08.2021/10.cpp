/*
Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N
(inclusive). Considere que o N ser� sempre maior que ZERO.
*/
#include <stdio.h>
#include <locale.h>

void imprimirInts(int n);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "");

  //Pegando as vari�veis
  int n = 0;

  printf("Digite o valor de N: ");
  scanf("%d", &n);

  //L�gica e fun��es para calculo
  if (n <= 0){
    printf("N n�o pode ser igual ou inferior a zero\n");
  }else{
    imprimirInts(n);
  }

  return 0;
}

void imprimirInts(int n){
  printf("N�meros inteiros entre 1 e %d\n", n);
  for(int i = 1; i <= n; i++)
    printf("Numero: %d\n", i);
}
