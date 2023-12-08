# SESSION 2

## Exercise 1

Long time ago in a galaxy far, far away…

Andrian is a padawan and his master gave him a math assignment and
Andrian is terrible with math but on the other hand Andrian has you!
Help Andrian do his assignments.

a*x*<sup>2</sup> + b*x* + *c* = 0

and wants the 2 roots (if available) as the response. Help Andrian with
writing a Java program that reads the coefficient of *x*<sup>2</sup>(a),
coefficient of *x*(b) and, constant(c) and print the 2 root if possible.

hint: Use this $\Large x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a}$

## Exercise 2

While meditating Andrian thought of some Java syntax(don’t ask why there
should be a java in starwars world). He’s confused by the Math.rint()
and Math.round().

Write a Java program that prompts the user for a floating-point number
and rounds it to the nearest whole number using the Math.rint() method.
The program should then demonstrate the difference between Math.rint()
and Math.round() by showing the results of both methods for the same
input number.

This is the template for the output.

``` bash
Please enter a floating-point number: \*User input\*

Using Math.rint: \*Your output\*

Using Math.round: \*Your output\*

Explanation:

\*Your explanation!\*
```

## Exercise 3

Andrian was hanging around in the Citadel’s archive and found a password
generator. Well as we know Andrian is bad with Math. Help him to
re-create this ancient technology. We figured that it’s a dumb password
generator. It gives a 5 digit input and add a random number between 0 to
9 to each digit randomly and give you the new password. If the result of
the addition has more than 1 digit you have to select the most
right-side digit. For example:

I give the “13345” as input, It gives me “42469”.

1 + “3” = **4**

3 + “9” = 1**2** -&gt; 2 is the most right-side digit

3 + “1” = **4**

4 + “2” = **6**

5 + “4” = **9**

Write a Java program that can re-create this functionality.

Use Random this to generate random number:

``` java
import java.util.Random;

Random random = new Random();

random.nextInt(10); // random number between 0 and 9
```

## Exercise 4

Andrian’s master now gave you a special assignment since you were the
smart one that solved all Andrian’s problems. Create a Java program that
reads a number X from console and generates **a random number**(Not
necessarily integer) between 0 and X called R and calculates the area
and circumference of “Equilateral Triangle” with the size of edge of R,
Circle with the radius of R, and a Square with edge of R.

Input and output example:

``` bash
Please enter a positive number X: 3

Random number R: 2.3681137982250386

Equilateral Triangle:

- Area: 2.4283191940029787

- Perimeter: 7.1043413946751155

Circle:

- Area: 17.617935240961405

- Circumference: 14.879297822736806

Square:

- Area: 5.607962961343819

- Perimeter: 9.472455192900155
```
