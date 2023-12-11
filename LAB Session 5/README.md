# SESSION 5

## Exercise 1

Little Jimmy got accepted as an intern in BuyukSoft company, and he
needs your help to get promoted to Junior developer. The first task is
to implement a Credit Score System.

Implement a program that simulates a credit score evaluation system. The
system should consider multiple factors like age, annual income,
employment status, and existing debt. Use if-else and switch-case to
determine the creditworthiness of an individual. And at the end if their
score is equal or higher than 40, they are eligible for a loan.

conditions:

Age:

 |Condition          | value|
 | :--               | :--  |
 | Between 18 and 25 | +5   |
 | Between 26 and 35 | +10  |
 | Between 36 and 45 | +15  |
 | Between 46 and 55 | +20  |
 | Between 56 and 65 | +10  |
 | Older than 65     | +5   |
 
Annual income:

 |Condition                 | value|
 | :--                      | :--  |
 | =&gt; 100000             | +20  |
 | Between 80000 and 100000 | +15  |
 | Between 60000 and 80000  | +10  |
 | Between 40000 and 60000  | +5   |

Employed: +10

Unemployed: -5

Exist of debt: -5

The input and output schema:
```
Age:

28

income:

120000

employed or unemployed:

employed

Enter your existing debt:

0

Your credit score is: 40.0 and you are eligible for a loan.
```
## Exercise 2

Little Jimmy’s boss, Bill Doors, now is very happy and gave the Little
Jimmy another problem. They need a application for greeting new interns.

Implement a program where the user inputs a language code (EN for
English, TUR for Turkish, DE for German). Use a switch-case to output a
greeting in the selected language. Include a default case for
unsupported languages.

The input and output schema:
```
Ag Enter the language code (EN for English, TUR for Turkish, DE for
German):

TUR

Merhaba!
```
## Exercise 3

After a successful implementation of the greeting application, Bill
Doors wants to test Little Jimmy’s in more practical applications.

Write a Java program that uses a switch-case statement for multiple
choices: 1 for "Addition", 2 for "Subtraction", 3 for "Multiplication",
and 4 for "Division". Based on the choice, the program should ask for
two numbers and perform the selected operation.

careful about the division by zero case. in case of division by zero,
the program should print "Division by zero is not possible".

The input and output schema:
```
Enter your choice (1 for Addition, 2 for Subtraction, 3 for
Multiplication, and 4 for Division):

3

Enter the first number:

12

Enter the second number:

20

The result is: 240.0
```
## Exercise 4

Now it’s almost time for Little Jimmy to get paid!

Write a Java program that converts a given amount in USD to other
currencies (EUR, CHF, TRY). Use a switch-case to select the target
currency and apply the appropriate conversion rate.

1 USD: 0.92 EUR

1 USD: 0.87 CHF

1 USD: 28.90 TRY

The input and output schema:
```
Enter the amount in USD:

1200

Enter the target currency (EUR, CHF, TRY):

TRY

The amount in TRY is: 34680.0
```