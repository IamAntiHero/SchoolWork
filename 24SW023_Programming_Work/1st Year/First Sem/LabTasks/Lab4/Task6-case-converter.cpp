#include <iostream>
using namespace std;

int main() {
    char ch;
    cout << "Enter a character: ";
    cin >> ch;
    
    if (ch >= 'a' && ch <= 'z') {
        cout << "Character is lowercase" << endl;
        cout << "Uppercase: " << char(ch - 32);
    } else if (ch >= 'A' && ch <= 'Z') {
        cout << "Character is uppercase" << endl;
        cout << "Lowercase: " << char(ch + 32);
    }
    return 0;
}
