// Declarando libs
#include <stdio.h>
#include <stdlib.h>

// Declarando constantes e variáveis
int const MAXSIZE = 5;
int stack[MAXSIZE];
int top;

// Função para iniciar a pilha
void createStack(){
    printf("Pilha inicializada!");
    top = -1;
}

// Função para ver se a pilha está vazia
bool stackIsEmpty(){
    if (top == -1){
        return true;
    } else {
        return false;
    }
}

// Função para ver se a pilha está cheia
bool stackIsFull(){
    if (top == MAXSIZE - 1){
        return true;
    } else {
        return false;
    }
}

// Função para inserir valor na pilha, seguindo regra LIFO
bool insertStack(int val){
    if (stackIsFull()){
        printf("\nPilha esta cheia, %d nao inserido", val);
        return false;
    } else {
        top++;
        stack[top] = val;
        printf("\nValor %d inserido na pilha", val);
        return true;
    }
}

// Função para remover valor da pilha, seguindo regra LIFO
bool removeStack(int &val){
    if (stackIsEmpty()){
        printf("\nPilha vazia, impossivel remover");
        return false;
    } else {
        val = stack[top];
        top--;
        printf("\nValor %d removido do topo da pilha", val);
        return true;
    }
}

// Função para mostrar o valor no topo da pilha
bool showFirstInStack(int &val){
    if (stackIsEmpty()){
        printf("\nPilha vazia, impossivel remover");
        return false;
    } else {
        val = stack[top];
        printf("\nValor do topo: %d", val);
        return true;
    }
}

// Função para mostrar o tamanho total da pilha
void checkStackSize(){
    int size = top + 1;
    printf("\nTamanho da pilha: %d", size);
}

// Função para mostrar toda a pilha
void showStack(){
    printf("\nElementos da pilha:");
    for (int i = 0; top >= i; i++){
        printf(" %d", stack[i]);
    }
}

// MAIN
main(void){
    int value; // Valor para buscar dentro de funções
    createStack(); // Gera pilha
    
    insertStack(10); // Insere 10
    insertStack(20); // Insere 20
    insertStack(30); // Insere 30
    insertStack(40); // Insere 40
    insertStack(50); // Insere 50
    insertStack(60); // Não insere 60, pois passa do limite MAXSIZE

    showStack(); // Mostra todos os elementos da pilha
    checkStackSize(); // Mostra o tamanho da pilha
    removeStack(value); // Remove o ultimo elemento adicionado: 50 (LIFO)
    showFirstInStack(value); // Mostra o novo elemento no topo da pilha: 40

    return 0;  
}