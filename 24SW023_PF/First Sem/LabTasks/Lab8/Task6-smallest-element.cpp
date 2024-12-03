#include <iostream>
using namespace std;

int main() {
    int array[10] = {1, 2, 3, 5, 8, 10, 12, 23, 28, 15};
    int smallest = array[0];
    int index = 0;
    
    for(int i = 1; i < 10; i++) {
        if(array[i] < smallest) {
            smallest = array[i];
            index = i;
        }
    }
    
    cout << "Smallest element: " << smallest << endl;
    cout << "Index of smallest element: " << index << endl;
    
    return 0;
}
