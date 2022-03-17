// Declarando as bibliotecas necessárias
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

// Declarando variáveis de escopo global para fácil manipulação da fila
int const TAMANHO = 5; // O tamanho fixo da fila
int frente, tras;      // Variaveis que irão receber o primeiro e o ultimo elemento da fila
int fila[TAMANHO];     // Cria uma fila de tamanho 5, conforme definido acima

void iniciaFila()
{               // Função para iniciar os parametros da fila
    frente = 0; // Define o primeiro elemento da fila como a posição 0 do verot
    tras = -1;  // Define o ultimo elemento da fila como -1 para validação nas próximas funções
    printf("Fila iniciada");
}

bool filaVazia()
{ // Checa se a fila está vazia
    if (tras == -1)
    {                // Caso tras ainda esteja no seu valor inicial -1, a fila está sem elementos
        return true; // Retorna true pois está vazia
    }
    else
    {                 // Se não, a fila já tem elementos e 'tras' não é mais -1
        return false; // Retorna falso
    }
}

bool filaCheia()
{ // Checa se a fila está cheia
    if (tras == TAMANHO - 1)
    {                // A fila tem tamanho 5, porém interpretadas de 0 a 4 (5 casas). Se o trás for igual a 4 (TAMANHO - 1), significa que o ultimo elemento possivel da fila já está ocupado
        return true; // Retorna verdade pois está cheia
    }
    else
    {                 // Se tras não for igual a TAMANHO - 1 (4), retorna falso, pois ainda há espaço; É possível não estar vazia e nem cheia ao mesmo tempo, com ambas funções retornando false
        return false; // Retorna false
    }
}

void enfileirar(int valor)
{ // Adiciona o valor na fila, seguindo regra FIFO
    if (filaCheia())
    { // Se a função filaCheia() retornar true, significa que não se pode adicionar mais elementos na fila
        printf("\nFila cheia");
    }
    else
    {                       // Se não retornar true, o 'valor' será adicionado na fila
        tras++;             // É incrementado 1 em 'tras' para indicar o preenchimento do espaco e validação das funções filaCheia e filaVazia
        fila[tras] = valor; // Fila na posição tras, que foi incrementada, será o valor passado, adicionando tal valor na fila e na posição correta
    }
}

void organizar()
{
    if (frente > 0)
    { // Frente nunca deve ser maior do que zero, pois é o inicio do vetor e o primeiro da fila
        for (int i = 0; i < tras; i++)
        {
            fila[i] = fila[i + 1]; // Trás todos os elementos da fila para 1 posição mais próximo da frente
        }
        frente--; // Como 1 elemento foi removido, frente que virou 1, vira 0 novamente
        tras--;   // O ultimo elemento foi movido 1 mais próximo da frente, logo deve-se decrementar também
    }
}

void desenfileirar(int &valor)
{ // Remove o ultimo valor da fila, o argumento valor é passado como ponteiro para manter o valor removido na memória
    if (filaVazia())
    { // Checa se a fila está vazia, se estiver, é impossível desenfileirar
        printf("\nFila vazia, impossivel desenfileirar");
    }
    else
    {                         // Se não, remove o primeiro valor adicionado (regra FIFO)
        valor = fila[frente]; // frente é o inicio da fila, lembre que frente é 0, inicio do vetor. Esse elemento será removido, mas antes seu valor é atribuido a variavel valor passada como ponteiro para mantê-lo na memória para consulta
        frente++;             // Adiciona mais 1 a frente para organizar
        organizar();          // Chama a função de organização, para reajustar os valores
    }
}

int tamanho()
{ // Retorna o tamanho da fila
    return (tras - frente) + 1;
    // Nota pessoal: Ao invés de uma função tipo int, é possível criar essa função como void e fazer um printf ao invés de return para mostrar os tamanho diretamente
}

void mostrar()
{ // Mostra todos os elementos da fila
    printf("\nElementos da fila atual:");
    for (int i = 0; tras >= i; i++) // É possivel utilizar i <= tras da mesma forma
    {
        printf(" %d", fila[i]); // Mostra os elementos da posição i da fila
    }
}

void primeiroFila(int &valor)
{ //Valor é lançado como endereço de memória para pegar o primeiro pra fora da função
    if (filaVazia())
    { // Se a fila estiver vazia, não pode mostrar nada
        printf("\nFila está vazia");
    }
    else
    {                         // Se não, exibe o primeiro valor
        valor = fila[frente]; //Lembre que a frente sempre será o primeiro da fila pois o mesmo sempre é igual a 0
        printf("\nPrimeiro valor da fila: %d", valor);
    }
}

// !Função Main
main()
{
    int valor;    // Declara valor, que pescará valores removidos e etc nas funções como endereço de memória
    iniciaFila(); // Inicia a fila com a função, definindo 'tras' e 'frente'

    for (int i = 0; i < TAMANHO; i++)
    {
        enfileirar(i + 1); // Enfileira 1 2 3 4 e 5
    }
    enfileirar(900);                                  // Não é enfileirado, pois todos os espaços estão ocupados
    desenfileirar(valor);                             // Desenfileira o primeiro valor (1) e atribui a variavel 'valor'
    printf("\nValor removido: %d", valor);            // Mostra o numero 1, que foi removido anteriormente
    mostrar();                                        // Mostra os valores da fila, sem o 1, que foi removido (2 3 4 5)
    primeiroFila(valor);                              // Chama a função, usando 'valor' como argumento. O primeiro da fila atual é 2
    printf("\nTamanho atual da fila: %d", tamanho()); // Mostra tamanho atual da fila (tras + frente) - 1 = 4
}