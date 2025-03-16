#include <iostream>
using namespace std;

int main() {
    int number;
    cout << "Enter a number: ";
    cin >> number;
    
    if(number >= 10 && number <= 99 || number <= -10 && number >= -99) {
        cout << "It is a double figure number";
    } else {
        cout << "It is not a double figure number";
    }
    return 0;
}
