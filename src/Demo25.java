import java.io.Serializable;

class Demo25{

    class Super{
        <T extends Serializable> void myMethod(T t, Object o){}

        void myMethod(Object myObject, Serializable s){}
    }

    class Sub extends Super{
        @Override
        <K extends Serializable> void myMethod(K myK, Object o){}

        static <T extends Serializable> void myMethod(Object o, T t, int x){}
    }

}