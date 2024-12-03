#include <iostream>
using namespace std;

class Demo {
private:
    int value;
    static int count;
    
public:
    Demo() {
        value = 0;
        count++;
    }
    
    Demo(int v) {
        value = v;
        count++;
    }
    
    void setValue(int v) {
        value = v;
    }
    
    int getValue() {
        return value;
    }
    
    static int getCount() {
        return count;
    }
};

int Demo::count = 0;

int main() {
    Demo obj1;
    Demo obj2(42);
    
    cout << "obj1 value: " << obj1.getValue() << endl;
    
    obj1.setValue(100);
    cout << "obj1 new value: " << obj1.getValue() << endl;
    cout << "obj2 value: " << obj2.getValue() << endl;
    
    cout << "Total objects created: " << Demo::getCount() << endl;
    
    return 0;
}
