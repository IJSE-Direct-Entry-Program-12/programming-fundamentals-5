import java.io.IOException;

class Demo5 {

    public    final strictfp static      <T>            void     myMethod2   (){}
//  access      modifier(s)  static  <Type Parameter>   Result   Identifier
//  modifier

    protected  Object   myMethod2  (int         x,          String y, int ... args){ return null; }
//  access     Result   Identifier  (DataType  identifier, ..      , DataType... identifier){}
//  modifier

    <T, D, S>           T       myMethod3() throws ClassNotFoundException, IOException { return null; }
// <TypeParameters>    Result   Identifier()  throws Comma Separated Exception List
}