Task 3: Packages/Classpath
==========================
Create a package com.math.operations and include classes for various arithmetic operations. Demonstrate how to compile and run these using the classpath.


Create Java Package:
===================
package com.math.operations

Create Java Classes:
===================

1.Addition Class
================
package com.math.operations;
public class Addition {
    public static int add(int a, int b) {
        return a + b;
    }
}

2.Subtraction Class
===================
package com.math.operations;
public class Subtraction {
    public static int subtract(int a, int b) {
        return a - b;
    }
}

3.Multiplication Class
======================
package com.math.operations;
public class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

4.Division Class
================
package com.math.operations;
public class Division {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero.");
        }
        return a / b;
    }
}

Main Class
==========
import com.math.operations.Addition;
import com.math.operations.Subtraction;
import com.math.operations.Multiplication;
import com.math.operations.Division;

public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + Addition.add(a, b));
        System.out.println("Subtraction: " + Subtraction.subtract(a, b));
        System.out.println("Multiplication: " + Multiplication.multiply(a, b));
        System.out.println("Division: " + Division.divide(a, b));
    }
}

Compile and Run the Main Class
==============================
Compile Calculator.java using: javac -classpath . Calculator.java
Run Calculator using: java -classpath . Calculator

