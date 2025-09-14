1.
#include <iostream>
#include <stack>
 
int main()
{
    std::stack<std::string> stack;
    if(stack.empty())
    {
        std::cout << "stack is empty" << std::endl;
    }
    std::cout << "stack size: " << stack.size() << std::endl;
}

=================================================================
2.
  
#include <iostream>

int main() {

    const int size = 10;

    int numbers[size];

    std::cout << "Введите " << size << " целых чисел:\n";

    for(int i = 0; i < size; ++i) {

        std::cin >> numbers[i];

    }    

    return 0;

}
