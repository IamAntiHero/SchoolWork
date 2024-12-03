#include <iostream>
using namespace std;

int main() {
    float numbers[100];
    float *ptr = numbers;
    int size;
    
    cout << "How many numbers do you want to enter? ";
    cin >> size;
    
    for(int i = 0; i < size; i++) {
        cout << "Enter number " << i + 1 << ": ";
        cin >> *(ptr + i);
    }
    
    cout << "\nThe numbers you entered are:\n";
    for(int i = 0; i < size; i++) {
        cout << *(ptr + i) << " ";
    }
    cout << endl;
    
    return 0;
}
