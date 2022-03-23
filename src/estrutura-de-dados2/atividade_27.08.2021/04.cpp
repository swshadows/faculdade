/*
Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima
em estoque e quantidade m�nima em estoque de um produto. Calcular e escrever
a quantidade m�dia ((quantidade m�dia = quantidade m�xima + quantidade
m�nima) /2). Se a quantidade em estoque for maior ou igual a quantidade m�dia
escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem
'Efetuar compra'.
*/

#include <stdio.h>
#include <locale.h>

void calcularMedia(int estoque, int max, int min);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "");

  //Pegando as vari�veis
  int atualEst = 0;
  int maxEst = 0;
  int minEst = 0;

  printf("Quantidade atual do estoque: ");
  scanf("%d", &atualEst);

  printf("\nQuantidade m�xima do estoque: ");
  scanf("%d", &maxEst);

  printf("\nQuantidade m�nima do estoque: ");
  scanf("%d", &minEst);

  //L�gica e fun��es para calculo da m�dia
  calcularMedia(atualEst, maxEst, minEst);
  return 0;

}

void calcularMedia(int estoque, int max, int min){
  int media = (max + min)/2;
  if (estoque >= media)
    printf("\nN�o efetuar compra");
  else
    printf("\nEfetuar compra");
  printf("\nM�dia = %d", media);
}
