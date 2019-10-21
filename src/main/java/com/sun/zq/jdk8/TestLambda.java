package com.sun.zq.jdk8;

public class TestLambda {
    public static void main(String[] args) {
        TestLambda test = new TestLambda();

        MathOperation addOperation = (a, b) -> a+b;

        MathOperation subtraction = (int a, int b) -> a - b;

        MathOperation multiplication = (a, b) -> {return a * b; };

        MathOperation division = (int a, int b) -> a/b;

        System.out.println("a + b = " + test.operator(4, 5, addOperation));
        System.out.println("a - b = " + test.operator(4, 5, subtraction));
        System.out.println("a * b = " + test.operator(4, 5, multiplication));
        System.out.println("a / b = " + test.operator(10, 5, division));

        GreetingService greetingService1 = message -> {
            System.out.println("Hello " + message);
        };

        GreetingService greetingService2 = (message) -> {
            System.out.println("Hello " + message);
        };

        greetingService1.sayMessage("World");
        greetingService2.sayMessage("Everyone");



    }


    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operator(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
