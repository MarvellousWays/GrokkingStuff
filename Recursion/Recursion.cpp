#include <iostream>

int recursionFactorial(int a){
    if(!(a<1)){    
       if(a>1){
       int i = a;
      a--;
      return i *recursionFactorial(a);
      }
      else return a;
      }
    else{
        return -1;
    }
}



int main(){
    int factorial = recursionFactorial(5);
    std::cout >> "Factorial value is "+factorial>>std::endl;
    return 0;
}