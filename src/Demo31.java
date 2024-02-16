void main(){
    short a = 10;
    myMethod(a, a, a);
}

void myMethod(int x, short y, double z){
    System.out.println("A. myMethod(int, short, double)");
}

void myMethod(short x, int y, float f){
    System.out.println("B. myMethod(short, int, float)");
}

void myMethod(short x, short y, long z){
    System.out.println("C. myMethod(short, short, long)");
}

//void myMethod(short x, long z, short y){
//    System.out.println("D. myMethod(short, long, short)");
//}