/*
Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N
(inclusive). Considere que o N será sempre maior que ZERO.
*/
#include <stdio.h>
#include <locale.h>

void imprimirInts(int n);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Pegando as variáveis
  int n = 0;

  printf("Digite o valor de N: ");
  scanf("%d", &n);

  //Lógica e funções para calculo
  if (n <= 0){
    printf("N não pode ser igual ou inferior a zero\n");
  }else{
    imprimirInts(n);
  }

  return 0;
}

void imprimirInts(int n){
  printf("Números inteiros entre 1 e %d\n", n);
  for(int i = 1; i <= n; i++)
    printf("Numero: %d\n", i);
}
