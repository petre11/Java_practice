public class Ppj02 {
    //        int someInt1 = a23;
//        int someInt2 = 2ss;
//        int someInt3 = @az;
//        int someInt3 = @az;
//        int void = 2;
//        int someInt4 = null;
    char charValue = 'a';
    char charvalue = 'b';
    boolean someLogicOperator = 2 >= 3;
    int someInteger = 2;
    int someRealNumbers = 11;
    char someChar = '2';

    String someGlobalVariable = "I am global variable";

    public void someMethod() {
        String someLocalVariable = "I am a local variable";
        System.out.println(someLocalVariable);
        System.out.println(this.someGlobalVariable);
    }

    public void someOtherMethod() {
//        System.out.println(someLocalVariable);
        System.out.println(this.someGlobalVariable);
    }

    public static void main(String[] args) {
        Ppj02 ppj02 = new Ppj02();
        System.out.println(ppj02.someGlobalVariable);
//        System.out.println(ppj_02.someLocalVariable);
        ppj02.someMethod();
    }
}
