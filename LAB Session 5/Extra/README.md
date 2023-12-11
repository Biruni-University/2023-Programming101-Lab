## If-Else
## Switch-Case


### Hands on Code

1. Write a Java program that takes a temperature value as input. Use an if-else statement to print "Cold" if the temperature is below 10°C, "Mild" if it's between 10°C and 25°C, and "Hot" if above 25°C.
-------------------------------
2. Implement a program that asks for a user's role (like Admin, Editor, Viewer) and uses a switch-case to print the specific permissions associated with each role. Include a default case for unknown roles
Admin: Full permission
Editor: Update information
Viewer: Read-Only

-------------------------------

3. Write a program that asks the user to enter a day of the week. Use a switch-case to determine and print whether it's a weekday or weekend.

-------------------------------

4. Develop a Java application that determines if a customer is eligible for a discount. The eligibility depends on several factors like customer type (Regular, Member, VIP), purchase amount, and if there's a special sale, regardless of the customer type “Eligible for discount”. Use if-else statements and switch-case to check and print the eligibility status.
Regular: min purchase amount = 1000
Member: min purchase amount = 500
VIP: min purchase amount = 100

-------------------------------

5. Implement a Java program that calculates the price of a flight ticket based on several factors. travel class (economy, business, first class), and whether it's peak season or off-season.
Economy: 300
Business: 600
First class: 900
Peak season: +200

-------------------------------

### Study Questions

1.	What are the main differences between using an if-else statement and a switch-case statement? In what scenarios is one preferred over the other?

-------------------------------

2.	What types of expressions or values can be used in a switch-case statement in Java? Are there any limitations compared to if-else statements?

-------------------------------

3.	How does the complexity of a program change as you increase the nesting levels of if-else statements? What are the potential pitfalls of deeply nested if-else structures?

-------------------------------

4.	What is the purpose of the 'default' case in a switch-case statement? Is it mandatory to include a default case?

-------------------------------

5.	How does Java control the flow of execution in nested if-else and switch-case statements? What role does 'break' play in switch-case statements?

-------------------------------

6.	Are there any notable performance differences between if-else and switch-case statements in Java? Which is generally faster?

-------------------------------

7.	When refactoring a piece of code with multiple if-else statements, under what conditions might it be advantageous to use a switch-case statement instead?

-------------------------------

8.	How can complex boolean logic be effectively managed within if-else statements? What are best practices for ensuring readability and maintainability?

-------------------------------

9.	Has there been any significant change or improvement in how switch-case statements work in recent versions of Java?

-------------------------------
## Answers

**Hands on Code:**

over the code directory you can find the codes


**Study Questions:**

1.	If-else statements are more flexible and can handle complex logical conditions. Switch-case statements are more readable and efficient for testing a single variable against a series of constants. Switch-case is preferred when you have a variable that can equal a limited set of values.

-------------------------------

2.	In Java, switch-case statements work with primitives (byte, short, char, int), their Wrapper classes (Byte, Short, Character, Integer), enumerated types, and since Java 7, strings. They don't support conditions involving ranges or multiple variables, unlike if-else statements.

-------------------------------

3.	As nesting levels increase, the complexity and readability of the code worsen, making it harder to maintain and understand. Deeply nested if-else structures can lead to "spaghetti code" and are generally considered poor programming practice.

-------------------------------

4.	The 'default' case in a switch-case acts as a catch-all for any case not explicitly handled by the other cases. It's not mandatory, but it's good practice to include it to handle unexpected values.

-------------------------------

5.	In both nested if-else and switch-case statements, Java executes the block of code where the condition is met and then exits the structure. In switch-case, the 'break' statement is crucial to prevent 'fall-through' to subsequent cases.

-------------------------------

6.	Switch-case can be faster than if-else statements, especially for a large number of cases, leading to constant-time performance. If-else statements generally have linear-time performance.

-------------------------------

7.	When multiple if-else statements are testing the same variable for equality against constant values, it's more readable and efficient to use a switch-case. This refactoring enhances readability and potentially performance.

-------------------------------

8.	To manage complex boolean logic in if-else statements, it's recommended to use well-named boolean variables, keep conditions simple, and avoid deeply nested structures. Breaking down complex conditions into smaller, named boolean expressions can enhance readability.

-------------------------------

9.	In Java 12, the switch-case was enhanced with the introduction of switch expressions. This allows switch-case to be used as either a statement or an expression and introduces a new form of case label, "case L ->", which simplifies syntax and improves readability.
