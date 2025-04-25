#include <iostream>
using namespace std;

void zeroSmaller(int& a, int& b) {
    if(a < b)
        a = 0;
    else
        b = 0;
}

int main() {
    int x = 5, y = 10;
    cout << x << " " << y << endl;
    zeroSmaller(x, y);
    cout << x << " " << y << endl;
    return 0;
}
