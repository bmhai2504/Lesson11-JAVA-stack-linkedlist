public class GenericStackClient {
    public static void stackOfStrings(){
        MyGenericStack <String> stringMyGenericStack = new MyGenericStack<>();
        stringMyGenericStack.push("Five");
        stringMyGenericStack.push("Four");
        stringMyGenericStack.push("Three");
        stringMyGenericStack.push("Two");
        stringMyGenericStack.push("One");
        System.out.println("2.1 Size of stack after push operations: " + stringMyGenericStack.size());
        System.out.println("2.2. Pop elements from stack : ");
        int i = 0;
        while (!stringMyGenericStack.isEmpty()){
            System.out.println(stringMyGenericStack.pop());
        }
        System.out.println("\n2.3. Size of stack after pop operations : " + stringMyGenericStack.size());
    }

    public static void stackOfInteger(){
        MyGenericStack <Integer> integerMyGenericStack = new MyGenericStack<>();
        integerMyGenericStack.push(5);
        integerMyGenericStack.push(4);
        integerMyGenericStack.push(3);
        integerMyGenericStack.push(2);
        integerMyGenericStack.push(1);
        System.out.println("1.1. Size of stack after push operations: " + integerMyGenericStack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!integerMyGenericStack.isEmpty()){
            System.out.println(integerMyGenericStack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + integerMyGenericStack.size());
    }
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfInteger();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();

    }
}
