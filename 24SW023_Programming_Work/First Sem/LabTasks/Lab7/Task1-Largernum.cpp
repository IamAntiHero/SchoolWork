#include <iostream>
using namespace std;

int Largernum(int a, int b) {
    return (a > b) ? a : b;
}

int main() {
    cout << Largernum(5, 10) << endl;
    cout << Largernum(20, 15) << endl;
    return 0;
}
