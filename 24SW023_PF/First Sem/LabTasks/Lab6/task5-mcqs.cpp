#include <iostream>
using namespace std;

struct Question {
    string question;
    string options[4];
    char correct;
};

struct Quiz {
    Question questions[10] = {
        {"What is 2+2?", {"2", "3", "4", "5"}, 'c'},
        {"What is capital of France?", {"London", "Paris", "Berlin", "Rome"}, 'b'},
        {"Which planet is closest to sun?", {"Earth", "Venus", "Mercury", "Mars"}, 'c'},
        {"What is 5x5?", {"20", "25", "30", "35"}, 'b'},
        {"Who wrote Romeo and Juliet?", {"Shakespeare", "Dickens", "Twain", "Austen"}, 'a'}
    };
    int total = 5;
    
    void takeTest() {
        int correct = 0;
        char answer;
        
        for(int i = 0; i < total; i++) {
            cout << "\nQ" << i+1 << ". " << questions[i].question << endl;
            for(int j = 0; j < 4; j++) {
                cout << char('a' + j) << ") " << questions[i].options[j] << endl;
            }
            
            cout << "Your answer (a/b/c/d): ";
            cin >> answer;
            
            if(answer == questions[i].correct) {
                cout << "Correct!\n";
                correct++;
            } else {
                cout << "Wrong!\n";
            }
        }
        
        cout << "\n*** Your Result ***\n";
        cout << "Total questions: " << total << endl;
        cout << "Correct answers: " << correct << endl;
        cout << "Wrong answers: " << total - correct << endl;
    }
};

int main() {
    Quiz quiz;
    cout << "Welcome to Quiz!\n";
    quiz.takeTest();
    return 0;
}
