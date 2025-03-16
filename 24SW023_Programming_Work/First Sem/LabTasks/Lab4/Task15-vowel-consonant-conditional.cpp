#include <iostream>
using namespace std;

int main() {
    char ch;
    cout << "Enter a character: ";
    cin >> ch;
    
    cout << ch << " is " << 
    (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
     ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ? 
     "a vowel" : "a consonant");
    
    return 0;
}
