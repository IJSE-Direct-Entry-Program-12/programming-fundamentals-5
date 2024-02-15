void main() {
    print(6, 0);
}

//void print(int y, int x) {            // 0, 0
//    if (y == 5) return;
//    if (x == (5 - y)) {
//        System.out.println();
//        print(y + 1, 0);
//    }else{
//        System.out.print("* ");
//        print(y, x + 1);
//    }
//}

//void print(int y, int x) {            // 4, 4
//    System.out.print("* ");
//    if (y == 0) return;
//    if (x == 0) {
//        System.out.println();
//        print(--y, y);
//    }else{
//        print(y, --x);
//    }
//}

void print(int y, int x){               // 6,0
    if (y == 0) return;
    System.out.print(y != ++x ? "* ": "\n");
    print(x == y ? --y: y, x-1 == y ? 0 : x);
}
