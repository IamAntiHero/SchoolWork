#include <iostream>
using namespace std;

int main() {
    int array[] = {5, 10, 15, 20, 25};
    
    cout << "Second last element: " << array[3] << endl;
    
    int sum = array[3] + array[4];
    int product = array[3] * array[4];
    
    cout << "Sum of last two elements: " << sum << endl;
    cout << "Product of last two elements: " << product << endl;
    
    return 0;
}
