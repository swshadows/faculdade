/*
Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
Sabendo-se que ele recebe uma comiss�o de 3% sobre o total das vendas at�
R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o
seu sal�rio total.
*/

#include <stdio.h>
#include <locale.h>

double calcularSalario(double valVendas, double salario);
main(){
  //Settando a linguagem em PT-BR para acentua��o
  setlocale(LC_ALL, "Portuguese");

  //Pegando as variaveis
  double salario = 0;
  double valorVendas = 0;

  printf("Digite seu sal�rio: R$ ");
  scanf("%lf", &salario);

  printf("\nDigite o total de vendas: R$ ");
  scanf("%lf", &valorVendas);

  //Logica e fun��es para o calculo
  double calcSalario = calcularSalario(valorVendas, salario);

  printf("\nO seu sal�rio � de R$ %.2lf", calcSalario);
  return 0;

}

double calcularSalario(double valVendas, double salario){
  if (valVendas < 1500){
    salario += (valVendas * 3)/100;
    printf("\nA sua comiss�o de R$ %.2lf em vendas � de R$ %.2lf", valVendas, valVendas*0.03);
  }else{
    salario += (valVendas * 5)/100;
    printf("\nA sua comiss�o de R$ %.2lf em vendas � de R$ %.2lf", valVendas, valVendas*0.05);
  }
  return salario;
}
