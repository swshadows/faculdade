/*
Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima
em estoque e quantidade mínima em estoque de um produto. Calcular e escrever
a quantidade média ((quantidade média = quantidade máxima + quantidade
mínima) /2). Se a quantidade em estoque for maior ou igual a quantidade média
escrever a mensagem 'Não efetuar compra', senão escrever a mensagem
'Efetuar compra'.
*/

#include <stdio.h>
#include <locale.h>

void calcularMedia(int estoque, int max, int min);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Pegando as variáveis
  int atualEst = 0;
  int maxEst = 0;
  int minEst = 0;

  printf("Quantidade atual do estoque: ");
  scanf("%d", &atualEst);

  printf("\nQuantidade máxima do estoque: ");
  scanf("%d", &maxEst);

  printf("\nQuantidade mínima do estoque: ");
  scanf("%d", &minEst);

  //Lógica e funções para calculo da média
  calcularMedia(atualEst, maxEst, minEst);
  return 0;

}

void calcularMedia(int estoque, int max, int min){
  int media = (max + min)/2;
  if (estoque >= media)
    printf("\nNão efetuar compra");
  else
    printf("\nEfetuar compra");
  printf("\nMédia = %d", media);
}
