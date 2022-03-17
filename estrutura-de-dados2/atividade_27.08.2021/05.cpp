/*
Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
palavra EMPATE.
*/

#include <stdio.h>
#include <locale.h>

int calcularResultado(int gol1, int gol2);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Pegando as variáveis
  char nomeTime1[30] = "";
  char nomeTime2[30] = "";
  int gol1 = 0;
  int gol2 = 0;

  printf("Nome do time 1: ");
  scanf("%s", &nomeTime1);

  printf("Nome do time 2: ");
  scanf("%s", &nomeTime2);

  printf("Gols do time 1: ");
  scanf("%d", &gol1);

  printf("Gols do time 2: ");
  scanf("%d", &gol2);

  //Lógica e funções para calculo do resultado
  switch (calcularResultado(gol1, gol2)) {
    case 0:
      printf("\nTime de nome %s ganhou", nomeTime1);
      break;
    case 1:
      printf("\nTime de nome %s ganhou", nomeTime2);
      break;
    case 2:
      printf("\nEmpate");
      break;
    default:
      break;
  }
  return 0;
}

int calcularResultado(int gol1, int gol2){
  //Returns;
  //0 = Time 1 ganhou
  //1 = Time 2 ganhou
  //2 = Empate
  if (gol1 > gol2)
    return 0;
  else if (gol1 < gol2)
    return 1;
  else
    return 2;
}
