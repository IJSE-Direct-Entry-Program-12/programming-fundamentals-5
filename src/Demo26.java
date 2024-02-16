void main(){
    myMethod(10,15, 20);
}

void myMethod(long x, double y, float z){
    System.out.println("B.myMethod(long,double,float)");
}

void myMethod(int x, long y, long z){
    System.out.println("A.myMethod(int,long,long)");
}
