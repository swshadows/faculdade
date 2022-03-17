/*
Faça um algoritmo para ler: a descrição do produto (nome), a quantidade
adquirida e o preço unitário. Calcular e escrever o total (total = quantidade
adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total -
desconto), sabendo-se que: - Se quantidade <= 5 o desconto será de 2% - Se
quantidade > 5 e quantidade <=10 o desconto será de 3% - Se quantidade > 10
o desconto será de 5%
*/

#include <stdio.h>
#include <locale.h>

void calcularDesconto(int qtd, double preco);
main(){
  //Settando a linguagem em PT-BR para acentuação
  setlocale(LC_ALL, "");

  //Pegando as variáveis
  char nomeProd[30] = "";
  int qtd = 0;
  double preco = 0;

  printf("Digite o nome do produto: ");
  scanf("%s", &nomeProd);

  printf("Digite a quantidade adquirida: ");
  scanf("%d", &qtd);

  printf("Digite o preço do produto: ");
  scanf("%lf", &preco);


  //Lógica e funções para calculo do desconto
  calcularDesconto(qtd, preco);
  return 0;

}

void calcularDesconto(int qtd, double preco){
  double precoTotal = qtd * preco;
  double desconto = 0;
  double precoFinal = 0;
  printf("\nPreço total: R$%.2lf", precoTotal);
  if (qtd <=5) {
    desconto = (precoTotal*2)/100;
    precoFinal = (precoTotal - desconto);
  }else if(qtd > 5 && qtd <= 10){
    desconto = (precoTotal*3)/100;
    precoFinal = (precoTotal - desconto);
  }else{
    desconto = (precoTotal*5)/100;
    precoFinal = (precoTotal - desconto);
  }
  printf("\nDesconto de R$ %.2lf", desconto);
  printf("\nPREÇO FINAL: R$%.2lf", precoFinal);
}
