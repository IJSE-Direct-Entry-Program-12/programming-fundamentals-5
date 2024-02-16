void main(){
    int[] something1 = null;
    Integer[] something2 = null;
    myMethod(something1);
//    myMethod(something2);
}

void myMethod(int[] num){
    System.out.println("myMethod(int[])");
}

void myMethod(Integer[] num){
    System.out.println("myMethod(Integer[])");
}

void myMethod(Number[] num){
    System.out.println("myMethod(Number[])");
}

void myMethod(Object num){
    System.out.println("myMethod(Object)");
}