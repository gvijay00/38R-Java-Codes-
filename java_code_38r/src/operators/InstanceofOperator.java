package operators;

class Parent {
}

class Child extends Parent {
}

public class InstanceofOperator {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
   
        // Checking instanceof
        System.out.println("p instanceof Parent: " + (p instanceof Parent)); // true
        System.out.println("c instanceof Child: " + (c instanceof Child)); // true
        System.out.println("c instanceof Parent: " + (c instanceof Parent)); // true
        System.out.println("p instanceof Child: " + (p instanceof Child)); // false
        
        
        String s1="Hai";
        String s2=null;
        System.out.println("s1 instanceof String: " + (s1 instanceof String));// true
        System.out.println("s2 instanceof String: " + (s2 instanceof String));// false
    }
}
