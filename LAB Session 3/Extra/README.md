## Casting  
## Math

### Hands on Code

1.  Write a program that gets a float then cast a float to an int and
    display the resultant value.
-------------------------------
2.  Create a program that casts double to byte and explains the result.
-------------------------------
3.  Create a program that generates a random integer between 0 and 50
    using Math.random().
-------------------------------
4.  With the help of **java.lang.System.currentTimeMillis()** create a
    program that shows the current time of the day in 24 hours format.  
      
    **The java.lang.System.currentTimeMillis() method returns the
    current time in milliseconds.**
-------------------------------
5.  We have a code snippet. Find the error and explain why it’s
    happening and how to fix it!
    
``` java
import java.util.Scanner;  
  
public class Q5 {  
    public static void main(String\[\] args) {  
    Scanner sc = new Scanner(System.*in*);  
    System.out.println("Enter a number and then enter a string: ");  
    System.out.println("nextInt() = " + sc.nextInt());  
    System.out.println("nextLine() = " + sc.nextLine());  
    }  
}
```
-------------------------------

### Study Questions

1.  What is Implicit Casting? Can you provide an example?
-------------------------------
2.  What is Explicit Casting? Can you provide an example?
-------------------------------
3.  What is ClassCastException, and when does it occur?
-------------------------------
4.  What will happen if you cast a float into an int?
-------------------------------
5.  What are widening and narrowing conversions in Java?
-------------------------------
6.  Can you convert a char to an int in Java? How?
-------------------------------
7.  Is it possible to cast an int to a boolean in Java?
-------------------------------
8.  What is the difference between Math.ceil() and Math.floor()?
-------------------------------
9.  What is the purpose of Math.signum()?

---

## Answers

**Hands on Code:**

over the code directory you can find the codes


**Study Questions:**

1.  Implicit casting is done automatically by the compiler when
    converting a smaller type to a larger type size. Example: **int
    myInt = 9; double myDouble = myInt;** (Here, **int** is
    automatically converted to **double**).
-------------------------------
2.  Explicit casting requires a manual conversion and is needed when
    converting a larger type to a smaller size type. Example: **double
    myDouble = 9.78; int myInt = (int) myDouble;** (Here, **double** is
    explicitly cast to **int**).
-------------------------------
3.  ClassCastException is a runtime exception that occurs when trying to
    cast an object to a subclass of which it is not an instance.
-------------------------------
4.  The decimal part will be truncated, and only the integer part will
    be stored.
-------------------------------
5.  Widening conversion (implicit) is converting a smaller type to a
    larger type size, while narrowing conversion (explicit) is
    converting a larger type to a smaller size.
-------------------------------
6.  Yes, when a char is cast to an int, it returns the ASCII value of
    that character. Example: **char c = 'A'; int ascii = (int) c;**.
-------------------------------
7.  No, there is no direct way to cast an int to a boolean in Java, as
    they are not compatible types.
-------------------------------
8.  **Math.ceil()** rounds up to the nearest whole number, whereas
    **Math.floor()** rounds down to the nearest whole number.
-------------------------------
9.  It determines the sign of a number. It returns -1.0 for negative
    values, 1.0 for positive values, and 0.0 if the number is zero.
