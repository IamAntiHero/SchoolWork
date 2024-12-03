#include <iostream>
using namespace std;

int main() {
    int array[10] = {1, 2, 3, 5, 8, 10, 12, 23, 28, 15};
    int searchNumber;
    bool found = false;
    
    cout << "Enter a number to search: ";
    cin >> searchNumber;
    
    for(int i = 0; i < 10; i++) {
        if(array[i] == searchNumber) {
            found = true;
            break;
        }
    }
    
    if(found) {
        cout << "Number is Found" << endl;
    } else {
        cout << "Number does not Found" << endl;
    }
    
    return 0;
}
