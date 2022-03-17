#include <stdio.h>

//Sem ponteiros, a variavel não será adicionada na main
void funcao(int var,int val){
	var += val;
}

main(){
      int variavel = 10;
      printf("Antes: %d",variavel);
      funcao(variavel, 10);
      printf("\nDepois: %d",variavel);
}
