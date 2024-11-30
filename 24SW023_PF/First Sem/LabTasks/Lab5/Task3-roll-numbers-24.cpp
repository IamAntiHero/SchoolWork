#include <iostream>
using namespace std;

int main() {
    for(int i = 1; i <= 60; i++) {
        if(i < 10) {
            cout << "24SW0" << i << endl;
        } else {
            cout << "24SW" << i << endl;
        }
    }
    return 0;
}
