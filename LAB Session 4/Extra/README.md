## Casting  
## Selection

### Hands on Code

1.  Write a Java program that verify if a character is a vowel.
-------------------------------
2.  Write a Java program that check if a number is odd or even using **bitwise operators**.
-------------------------------
3.  Write a Java program that verify if a character is an alphabet letter and uppercase.
-------------------------------
4.  With the help of `java.lang.System.currentTimeMillis()` verify if the current time is after midday.  
      
    * The `java.lang.System.currentTimeMillis()` method returns the
    current time in milliseconds.
-------------------------------
5.	Write a Java program that takes a temperature value in Celsius and checks if the water is in a solid, liquid, or gaseous state at that temperature.
-------------------------------
6.	Write a Java program that categorizes the roots of a quadratic equation as ‘Real and Different’, ‘Real and Equal’, or ‘Complex’ based on its coefficients.
-------------------------------
7.	Write a Java program to determine a student’s grade. The program should consider test scores, homework completion, and class participation, using nested if statements.
-------------------------------
8.	Implement a Java code that takes three integers as sides and prints true if they can form a valid triangle, using logical operators.
-------------------------------
9.	Write a Java program that takes an integer and prints true if the number is a power of 2, using the bitwise & operator.
-------------------------------

### Study Questions

1.	What happens if you wrongly cast an object?
-------------------------------
2.	What is the difference between upcasting and downcasting?
-------------------------------
3.	Can & and | change the original values of the operands? Can they be used with floating-point numbers?
-------------------------------
4.	How does Java handle scope in nested if statements?
-------------------------------
5.	Can variables defined in the if block be accessed in the else block?
-------------------------------
6.	Discuss the importance of parentheses in conditions using multiple logical operators.
-------------------------------
7.	Explain the difference between if-else and else if in Java.

---

## Answers

**Hands on Code:**

over the code directory you can find the codes


**Study Questions:**

1.	In Java, if you attempt to cast an object to a type that it is not an instance of, it will result in a **ClassCastException**. This exception is thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.
-------------------------------
2.	upcasting is implicit, safe, and involves casting to a more general type, while downcasting is explicit, potentially unsafe, and involves casting to a more specific type.
-------------------------------
3.	Can **&** and **|** Change the Original Values of the Operands?
No, the **&** and **|** operators do not change the original values of the operands. In Java, all basic data types are passed by value, not by reference. This means when you use these operators, the values of the operands are copied, and the operation is performed on these copies. The original variables remain unchanged. 
Can They Be Used with Floating-Point Numbers?
No, the & and | operators cannot be used directly with floating-point numbers (like float and double) in Java. These operators are meant for bitwise operations, which are not defined for floating-point numbers. Bitwise operations only make sense for integral types, where the binary representation directly corresponds to the value of the number.
-------------------------------
4.	In Java, the scope of variables is determined by the blocks in which they are declared, which is essentially the set of curly braces **{}** that enclose the variable. This scope rule applies to nested **if** statements as well
-------------------------------
5.	Yes, variables defined in an **if** block can be accessed in the corresponding **else** block, but with an important condition: the variable must be declared outside the **if** block. If a variable is declared within the **if** block, it is only accessible within that block due to its scope, and thus cannot be accessed directly in the **else** block.
-------------------------------
6.	The use of parentheses in conditions with multiple logical operators in Java is crucial for several reasons, primarily to ensure the correct order of evaluation and to enhance code readability and maintainability. The judicious use of parentheses in conditions with multiple logical operators is essential for ensuring the correct logical flow, making the code more readable and understandable, and preventing potential bugs due to misinterpreted order of operations.
-------------------------------
7.	Key Differences: 
- **Number of Conditions:**
      1. **if-else** is for a single condition check, leading to a binary choice.
      2. **else if** allows for checking multiple, different conditions in sequence.
- Use Cases:
      1. Use **if-else** when you only need to distinguish between two cases.
      2. **else if** allows for checking multiple, different conditions in sequence.
- Execution Path:
      1. In **if-else**, there are only two possible execution paths.
      2. In **else if**, there can be many paths, one for each condition, plus the final **else**.

