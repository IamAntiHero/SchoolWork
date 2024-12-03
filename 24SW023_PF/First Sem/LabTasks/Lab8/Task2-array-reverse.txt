#include <iostream>
using namespace std;

int main() {
    int array[] = {5, 10, 15, 20, 25};
    
    cout << "Array in reverse order: ";
    for(int i = 4; i >= 0; i--) {
        cout << array[i];
        if(i > 0) cout << ", ";
    }
    cout << endl;
    
    return 0;
}
