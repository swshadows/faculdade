#include <stdio.h>
#include <iostream>

using namespace std;
int tamstring(char texto[]);

int main(){
    char nome[30];

    cout << "Nome: " << endl;
    cin >> nome;

    cout << tamstring(nome) << endl;
    return 0;
}

int tamstring(char texto[]){
    if (texto[0] == '\0')
        return 0;
    else
        return (1 + tamstring(&texto[1]));
}
