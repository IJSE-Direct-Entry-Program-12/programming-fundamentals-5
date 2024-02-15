void main(){
    System.out.println("About to enter into doSomething() method");
    int i = doSomething();
    System.out.println(i);
    System.out.println("Just exited from the doSomething() method");
}

int doSomething(){
    System.out.println("Hello");
    System.out.println("IJSE");
    System.out.println("DEP");
    return 10 + 15;
}