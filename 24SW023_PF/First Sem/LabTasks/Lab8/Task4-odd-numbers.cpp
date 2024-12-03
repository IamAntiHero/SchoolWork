#include <iostream>
using namespace std;

int main() {
    int array[10] = {1, 2, 3, 5, 8, 10, 12, 23, 28, 15};
    
    cout << "Odd numbers in array: ";
    for(int i = 0; i < 10; i++) {
        if(array[i] % 2 != 0) {
            cout << array[i] << " ";
        }
    }
    cout << endl;
    
    return 0;
}
