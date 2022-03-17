// Importando bibliotecas
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

// Inicializando variaveis e constantes
int const SIZE = 5;
int front, back;
int queue[SIZE];

// Função para iniciar a fila
void startQueue(){
    front = 0;
    back = -1;
    printf("Fila inicializada!");
}

// Função para verificar se a fila está vazia
bool emptyQueue(){
    if (back == -1){
        return true;
    } else{
        return false;
    }
}

// Função para verificar se a fila está cheia
bool fullQueue(){
    if (back == SIZE - 1){
        return true;
    } else{
        return false;
    }
}

// Função para inserir elementos na fila
void insertQueue(int value){
    if (fullQueue()){
        printf("\nFila cheia");
    } else{
        back++;
        queue[back] = value;
        printf("\nValor %d inserido na fila", value);
    }
}

// Função para organizar a fila depois da retirada de elemento
void organizeQueue(){
	if(front > 0){
		for(int i = 0; i < back; i++){
			queue[i] = queue[i + 1];
		}
		front--;
		back--;
}
}

// Função para retirar o elemento da fila, seguindo regra FIFO
void removeQueue(int &value){
    if (emptyQueue()){
        printf("\nFila vazia");
    } else{
        value = queue[front];
        front++;
        printf("Valor %d removido da fila", value);
        organizeQueue();
    }
}

// Função para checar o tamanho da fila
int checkQueueSize(){
    return (back - front) + 1;
}

// Função para mostrar todos os elementos da fila
void showQueue(){
    printf("\nFila: ");
    for (int i = 0; back >= i; i++){
        printf(" %d", queue[i]);
    }
}

// Função para mostrar o primeiro elemento da fila
void showFirstInQueue(int &valor){
    if (emptyQueue()){
        printf("\nFila vazia");
    } else{
        valor = queue[front];
        printf("\nElemento 1 da fila: %d", valor);
    }
}

// MAIN
main(void){
    int valor;
    startQueue(); //Iniciando a fila

    for (int i = 0; i < 5; i++){
        insertQueue(i * 2); //Inserindo elementos na fila
    }

    showFirstInQueue(valor); // Mostrando o primeiro elemento da fila
    showQueue(); //Mostrando toda a fila
    removeQueue(valor); //Removendo o primeiro elemento da fila
    showFirstInQueue(valor); // Mostrando novamente o primeiro da fila

    printf("\nTamanho da fila: %d", checkQueueSize()); // Mostrando o tamanho da fila
    return 0;
}
