/*
Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem
'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
*/

#include <stdio.h>
#include <locale.h>

double calcSaldo(double saldo, double deb, double cred);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Pegando as variaveis
  char numConta[] = "";
  double saldo = 0;
  double debito = 0;
  double credito = 0;

  printf("Digite o número da sua conta: ");
  scanf("%s", &numConta);

  printf("\nDigite o saldo da sua conta: R$ ");
  scanf("%lf", &saldo);

  printf("\nDigite o débito da sua conta: R$ ");
  scanf("%lf", &debito);

  printf("\nDigite o crédito da sua conta: R$ ");
  scanf("%lf", &credito);

  //Logica e funções para o calculo
  double calc = calcSaldo(saldo, debito, credito);
  if (calc >= 0)
    printf("\nSeu saldo atual é positivo, no valor de R$ %.2lf", calc);
  else
    printf("\nSeu saldo atual é negativo, no valor de R$ %.2lf", calc);
  return 0;
}

double calcSaldo(double saldo, double deb, double cred){
  double saldoAtual = saldo - deb + cred;
  return saldoAtual;
}
