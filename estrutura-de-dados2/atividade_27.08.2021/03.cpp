/*
Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito.
Ap�s, calcular e escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito).
Tamb�m testar se saldo atual for maior ou igual a zero escrever a mensagem
'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.
*/

#include <stdio.h>
#include <locale.h>

double calcSaldo(double saldo, double deb, double cred);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "");

  //Pegando as variaveis
  char numConta[] = "";
  double saldo = 0;
  double debito = 0;
  double credito = 0;

  printf("Digite o n�mero da sua conta: ");
  scanf("%s", &numConta);

  printf("\nDigite o saldo da sua conta: R$ ");
  scanf("%lf", &saldo);

  printf("\nDigite o d�bito da sua conta: R$ ");
  scanf("%lf", &debito);

  printf("\nDigite o cr�dito da sua conta: R$ ");
  scanf("%lf", &credito);

  //Logica e fun��es para o calculo
  double calc = calcSaldo(saldo, debito, credito);
  if (calc >= 0)
    printf("\nSeu saldo atual � positivo, no valor de R$ %.2lf", calc);
  else
    printf("\nSeu saldo atual � negativo, no valor de R$ %.2lf", calc);
  return 0;
}

double calcSaldo(double saldo, double deb, double cred){
  double saldoAtual = saldo - deb + cred;
  return saldoAtual;
}
