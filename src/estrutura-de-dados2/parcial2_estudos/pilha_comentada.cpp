// Criando as bibliotecas
#include <stdio.h>
#include <stdlib.h>

// Declarando variaveis em escopo global para facil acesso
int const TAMANHO = 5; // Tamanho constante máximo da pilha
int pilha[TAMANHO];    // Inicia pilha com tamanho 5 (De 0 a 4)
int topo;              // Cria o topo, que controla quem entra e sai

void iniciaPilha()
{              // Função para iniciar a pilha
    topo = -1; // Topo é definido como -1 para validar funções mais a frente, indicando que a pilha está 100% vazia
}

bool pilhaVazia()
{ // Checa se a pilha está vazia
    if (topo == -1)
    { // Se topo = -1, indica que não há nada
        return true;
    }
    else
    { // Se não, tem alguma coisa na pilha
        return false;
    }
}

bool pilhaCheia()
{ // Checa se a pilha está cheia
    if (topo == TAMANHO - 1)
    { // Se o topo = 4, a pilha está no limite (De 0 a 4)
        return true;
    }
    else
    { // Se não, ainda há espaço para itens. É possivel que a pilha não esteja nem vazia nem cheia ao mesmo tempo
        return false;
    }
}

bool pilhaInsere(int valor)
{ // Insere 'valor' no topo da pilha, seguindo regra LIFO
    if (pilhaCheia())
    { // Se a função de pilhaCheia() retornar verdadeira, não há mais espaço para inserção de novo valor
        printf("\nNao foi possível inserir o elemento, pilha cheia");
        return false;
    }
    else
    {                        // Se não, inserção é possível
        topo++;              // Topo é incrementado para sinalizar um novo elemento para funções de validação pilhaCheia() e pilhaVazia();
        pilha[topo] = valor; // Define o topo da pilha como o valor passado por argumento
        return true;
    }
}

bool pilhaDesempilha(int &valor)
{ // Remove o valor no topo da pilha, e atribui ele ao endereço de memória do argumento 'valor'
    if (pilhaVazia())
    { // Se a pilha estiver vazia, é impossivel remover alguma coisa
        printf("\nPilha vazia, impossivel remover");
        return false;
    }
    else
    {                        // Se não, é possivel remover
        valor = pilha[topo]; // Atribui ao argumento 'valor' o numero que está no topo da pilha
        topo--;              // Decrementa o topo da pilha, apagando o numero atribuido a ela e diminuindo o tamanho;
        return true;
    }
}

bool exibePilha(int &valor)
{ // Exibe o valor no topo da pilha, atribuindo o numero ao endereço de memória de 'valor'
    if (pilhaVazia())
    { // Se a pilha estiver vazia, é inpossivel atribuir
        printf("\nPilha vazia, impossivel atribuir");
        return false;
    }
    else
    {                        // Se não, mostra o valor do topo
        valor = pilha[topo]; // Atribui o valor do topo da pilha ao argumento 'valor'
        // Nota pessoal: É possivel criar um printf nessa linha e mostrar o valor diretamente dentro da função sem problemas
        return true; // Por não haver printf dentro da função, é necessário chamar na main para saber o 'valor'
    }
}

int pilhaTamanho()
{
    return topo + 1; // Retorna o tamanho da pilha
    // Nota pessoal: Ao invés de uma função tipo int, é possível criar essa função como void e fazer um printf ao invés de return para mostrar os tamanho diretamente
}

void mostrar()
{ // Mostra todos os elementos empilhados
    printf("\nElementos da pilha atual:");
    for (int i = 0; topo >= i; i++) // É possivel utilizar i <= tras da mesma forma
    {
        printf(" %d", pilha[i]);
    }
}

// !Função Main
main()
{
    iniciaPilha(); // Inicializa a pilha
    int valor;     // Inicializa a variavel valor que pescará valores removidos e etc nas funções como endereço de memória
    for (int i = 0; i < TAMANHO; i++)
    {
        pilhaInsere(i + 1); // Empilha 1 2 3 4 e 5
    }
    pilhaInsere(900);                                 // Não é inserido pois não há espaço
    pilhaDesempilha(valor);                           // Desenfileira o ultimo valor colocado (5) e atribui a variavel 'valor'
    printf("\nValor removido: %d", valor);            // Mostr o numero 5 que foi removido do topo da pilha anteriormente;
    mostrar();                                        // Mostra a pilha atual: 1 2 3 e 4
    exibePilha(valor);                                // Atribui o primeiro da pilha a variavel valor, nesse caso, 4
    printf("\nValor no topo da pilha: %d", valor);    // Mostra o valor 4 anteriormente pego como o topo da pilha
    printf("\nTamanho da pilha: %d", pilhaTamanho()); // Mostra o tamanho atual da pilha topo + 1 = 4
}