import java.io.Serializable;
import java.util.List;

void main(){

}


// m1:
public static <K, T extends Error> void myMethod(int x, K myK, List<?> myList) throws T{}

// m2:
public <T extends Serializable> T myMethod(double x, T myT, List<? super Serializable> myList){
    return null;
}

// m3:
public <K extends Error, T extends Serializable> void myMethod(int x, T myT, List<?> mySuper){}

// m4:
void myMethod(Integer x, Object myObj, List<? super Comparable> myList) throws Exception{}

// m5:
<T extends Serializable, K extends Comparable> void myMethod(T t, Integer something, K k){}

// m6:
static void myMethod(Serializable s, int abc, Comparable myC){}