import java.io.Serializable;
import java.util.List;
import java.util.Set;

void main(){

}

void myMethod(int x, int y, List<? extends Serializable> myList){}
// m1 signature = myMethod(int, int, List<? extends Serializable)

void myMethod(int x, Integer y, List<? extends Comparable> mySet){}
// m2 signature = myMethod(int, Integer, List<? extends Comparable>)