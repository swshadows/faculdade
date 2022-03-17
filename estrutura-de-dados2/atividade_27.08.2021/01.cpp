/*
Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
(considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também
a média calculada.
*/

#include <stdio.h>
#include <locale.h>

double calcularMedia(double n1, double n2);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Pegando as variáveis
  double n1 = 0;
  double n2 = 0;

  printf("Digite a nota da primeira prova: ");
  scanf("%lf", &n1);

  printf("\nDigite a nota da segunda prova: ");
  scanf("%lf", &n2);

  //Lógica e funções para calculo da média
  double calcMedia = calcularMedia(n1, n2);

  if (calcMedia >= 6)
    printf("\nAprovado");
  else
    printf("\nReprovado");

  printf("\nA média do aluno é: %.2lf\n", calcMedia);
  return 0;
}

double calcularMedia(double n1, double n2){
  double media = (n1 + n2)/2;
  return media;
}
