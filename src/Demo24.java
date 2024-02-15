import java.io.Serializable;

class Demo24<T extends Serializable, K> {

    void myMethod(Object o, K k, int x){}

    void myMethod(K k, Object o){}

    int myMethod(T myT, K k, int y){ return 0; }

    <S extends T> void myMethod(S myS, Object o){}
}