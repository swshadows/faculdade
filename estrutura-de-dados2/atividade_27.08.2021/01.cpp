/*
Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica
simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
(considerar que nota igual ou maior que 6 o aluno � aprovado). Escrever tamb�m
a m�dia calculada.
*/

#include <stdio.h>
#include <locale.h>

double calcularMedia(double n1, double n2);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "");

  //Pegando as vari�veis
  double n1 = 0;
  double n2 = 0;

  printf("Digite a nota da primeira prova: ");
  scanf("%lf", &n1);

  printf("\nDigite a nota da segunda prova: ");
  scanf("%lf", &n2);

  //L�gica e fun��es para calculo da m�dia
  double calcMedia = calcularMedia(n1, n2);

  if (calcMedia >= 6)
    printf("\nAprovado");
  else
    printf("\nReprovado");

  printf("\nA m�dia do aluno �: %.2lf\n", calcMedia);
  return 0;
}

double calcularMedia(double n1, double n2){
  double media = (n1 + n2)/2;
  return media;
}
