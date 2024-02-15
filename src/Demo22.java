import java.io.Serializable;

void main(){

}

<T extends Serializable> void  myMethod(T myT) throws Exception{}
// m1 signature = myMethod(T)

public static void myMethod(Serializable mySet, int x){}
// m2 signature = myMethod(Serializable, int)