void main(){
    myMethod(20,30);
}

void myMethod(long... x){
    System.out.println("A");
}

void myMethod(Integer... x){
    System.out.println("B");
}

//void myMethod(Number... x){
//    System.out.println("C");
//}

//void myMethod(Number... x){     // Object > Object[] > Number[] > Integer[]
//    System.out.println("C.  Number(Integer...)");
//}

//void myMethod(short x, int...y){
//    System.out.println("A.");
//}
//
//void myMethod(int x, int y, int...k){
//    System.out.println("B. ");
//}

//void myMethod(Integer... x){    // Object > Object[] > Number[] > Integer[]
//    System.out.println("D. ");
//}
//
//void myMethod(long... x){       // Object > long[]
//    System.out.println("E. ");
//}



//void myMethod(Integer... x){
//    System.out.println("B.  myMethod(Integer...)");
//}



//void myMethod(Object... x){
//    System.out.println("C.  Number(Integer...)");
//}



//void myMethod(Object x){
//    System.out.println("C.  Number(Integer...)");
//}