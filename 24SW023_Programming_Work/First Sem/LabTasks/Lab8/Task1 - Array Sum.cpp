#include <iostream>
using namespace std;

int main() {
    int array[] = {5, 10, 15, 20, 25};
    int sum = 0;
    
    for(int i = 0; i < 5; i++) {
        sum += array[i];
    }
    
    cout << "Sum of array elements: " << sum << endl;
    
    return 0;
}
