#include <iostream>
using namespace std;

void printArray(int arr[], int size) {
    for(int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int array[] = {5, 10, 15, 20, 25};
    int size = 5;
    
    cout << "Array elements: ";
    printArray(array, size);
    
    return 0;
}
