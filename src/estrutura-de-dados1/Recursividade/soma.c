#include <stdio.h>
#include <iostream>

using namespace std;

int soma(int n);
int main(){
    int x;

    cout << "Informe um numero: " << endl;
    cin >> x;

    cout << soma(x) << endl;
    return 0;
}

int soma(int n){
    if (n <= 1){
        return n;
    }else{
        return (n + soma(n-1));
    }
}
