#include <stdio.h>
#include <iostream>

using namespace std;

int exp(int x, int y);
int main(){
    int x, y;

    cout << "Informe x e y: " << endl;
    cin >> x >> y;

    cout << exp(x, y) << endl;
    return 0;
}

int exp(int x, int y){
    if (y == 0)
        return 1;
    else if (y == 1)
        return x;
    else
        return(x*exp(x, y-1));
}
