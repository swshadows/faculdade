#include <stdio.h>
#include <string.h>

void alteraValor(int num)
{               // Função para alterar o valor sem ponteiro, não funciona
    num = 1000; // Sem retorno, num só é igual a 1000 dentro desta função
}

void alteraValorReal(int *num)
{                // Nesta função o valor é alterado, pois o que está sendo passado como argumento é o seu endereço de memória, que armazena o seu valor real
    *num = 1000; // Neste caso, o endereço que aponta para number, definido pelo argumento *num, que está sendo modificado, modificando a variavel original fora do escopo desta função sem precisar de retorno
}

main()
{
    int n = 10;                                    // Variavel a ter seu valor trocado por referência
    int *ponteiro;                                 // Ponteiro
    ponteiro = &n;                                 // Ponteiro é atribuido ao endereço de memória de n, podendo modificar seu valor através de si mesmo em outro momento
    printf("\nValor da variavel N: %d", n);        // Nesse momento, n é igual a 10
    *ponteiro = 20;                                // Troca o valor da variávei que o ponteiro, ou seja, 'n' é mudado para 20 pois ponteiro está apontando para o endereço de n (&n)
    printf("\nValor da variavel N depois: %d", n); // n é igual a 20 pois foi alterado por ponteiro

    // -----------------------------------------------------------

    int num = 10;             // Nova variável, valor 10
    alteraValor(num);         // Ao passar sem ponteiro, o valor não é modificado sem um retorno definido
    printf("\nNum: %d", num); // Num é 10 pois a função nao teve ponteiro nem retorno

    // Porém
    int number = 10;                // Nova variável, valor 10
    alteraValorReal(&number);       // Passando como argumento o endereço de memória de number, é possivel alterar o valor sem um retorno definido, utilizando ponteiro
    printf("\nNumber: %d", number); // Number é 1000, pois a função alterou o endereço de number com ponteiros e não o escopo local da variável
}
