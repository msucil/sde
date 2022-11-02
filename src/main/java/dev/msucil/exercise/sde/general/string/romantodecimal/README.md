# [ROMAN To Decimal](https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/)

#### Roman Numbers are based on the following symbol

| Symbol | Value |
| ------ | ------: |
| I       |     1 |
|  IV      |     4 |
|  V       |     5 |
|  IX      |     9 |
|  X       |     10 |
|  XL      |     40 |
|  L       |     50 |
|  XC      |     90 |
|  C       |     100 |
|  CD      |     400 |
|  D       |     500 |
|  CM      |     900 | 
|  M       |     1000 |


##### Approach:
A number in Roman Numerals is a string of these symbols written in descending order(e.g. M’s first, followed by D’s, etc.). However, in a few specific cases, to avoid four characters being repeated in succession(such as IIII or XXXX), subtractive notation is often used as follows:

* I placed before V or X indicates one less, so four is IV (one less than 5) and 9 is IX (one less than 10).
* X placed before L or C indicates ten less, so forty is XL (10 less than 50) and 90 is XC (ten less than a hundred).
* C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand).


```
Algorithm to convert Roman Numerals to Integer Number:  

1. Split the Roman Numeral string into Roman Symbols (character).
2. Convert each symbol of Roman Numerals into the value it represents.
3. Take symbol one by one from starting from index 0: 
	3.1 If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
	3.2 else subtract this value by adding the value of next symbol to the running total.
```