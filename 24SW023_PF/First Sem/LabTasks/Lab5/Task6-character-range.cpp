#include <iostream>
using namespace std;

int main() {
    char first, second;
    cout << "Enter first character: ";
    cin >> first;
    cout << "Enter second character: ";
    cin >> second;
    
    cout << "Characters between '" << first << "' and '" << second << "' are: ";
    int count = 0;
    for(char c = first + 1; c < second; c++) {
        cout << c << " ";
        count++;
    }
    cout << "\nand Characters count : " << count;
    return 0;
}
