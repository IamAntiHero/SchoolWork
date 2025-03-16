#include <iostream>
using namespace std;

int main() {
    char upperChar;
    cout << "Enter an uppercase character: ";
    cin >> upperChar;
    
    cout << "Upper case character '" << upperChar << "'" << endl;
    cout << "Lower case character: '" << char(upperChar + 32) << "'";
    
    return 0;
}
