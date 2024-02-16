void main(){
    myMethod(5);
}

//void myMethod(int... x){
//    System.out.println("A.  myMethod(int...)");
//}

//void myMethod(Integer... x){
//    System.out.println("B.  myMethod(Integer...)");
//}

//void myMethod(Number... x){
//    System.out.println("C.  Number(Integer...)");
//}

void myMethod(Object... x){
    System.out.println("C.  Number(Integer...)");
}

void myMethod(Object x){
    System.out.println("C.  Number(Integer...)");
}