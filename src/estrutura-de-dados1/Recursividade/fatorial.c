#include <stdio.h>
#include <iostream>

using namespace std;

unsigned long long fat(unsigned long long n);

int main(){
    int x;

    cout << "Informe um numero: " << endl;
    cin >> x;

    unsigned long long r = fat(x);
    cout << r << endl;
    return 0;
}

unsigned long long fat(unsigned long long n){
    if (n <= 1){
        return 1;
    }
    else{
        return n * fat(n-1);
    }
}
