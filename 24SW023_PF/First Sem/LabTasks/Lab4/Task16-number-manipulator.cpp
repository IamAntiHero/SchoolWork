#include <iostream>
using namespace std;

int main() {
    int num = 8;
    
    if (num == 0) {
        num = 10;
        cout << "Cube of double figure: " << num * num * num;
    } else if (num % 2 == 0) {
        num++;
        cout << "Made odd: " << num;
    } else {
        cout << "Square of odd: " << num * num;
    }
    
    return 0;
}
