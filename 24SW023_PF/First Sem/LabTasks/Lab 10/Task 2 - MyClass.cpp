#include <iostream>
using namespace std;

class MyClass {
private:
    int value;
    
public:
    void initToZero() {
        value = 0;
    }
    
    void initToValue(int v) {
        value = v;
    }
    
    void display() {
        cout << "Value: " << value << endl;
    }
};

int main() {
    MyClass obj;
    
    obj.initToZero();
    obj.display();
    
    obj.initToValue(42);
    obj.display();
    
    return 0;
}
