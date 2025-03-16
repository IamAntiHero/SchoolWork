#include <iostream>
#include <conio.h>
using namespace std;

int main() {
    int num = 5;
    char key;
    cout << "Press spacebar to display square of " << num << endl;
    key = getch();
    if (key == ' ') {
        cout << "Square: " << num * num;
    }
    return 0;
}
