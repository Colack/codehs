#include "util.h"

int main() {
    string favClass = "Math";
    int gradeLevel = 11;
    double gpa = 3.5;
    char csGrade = 'A';
    bool afterSchool = true;

    cout << "Your favorite class (other than Computer Science): " << favClass << "\n";
    cout << "Your current grade level: " << gradeLevel << "\n";
    cout << "Your goal GPA for the year: " << gpa << "\n";
    cout << "Grade you hope to achieve in Comp Sci: " << csGrade << "\n";
    cout << "Do you participate in any after school activities? " << afterSchool << "\n";

    return 0;
}