# Welcome to the Scrabble challenge!

This is my first program in Java! 

```
                                                  _     _     _      
                                                 | |   | |   | |     
                               ___  ___ _ __ __ _| |__ | |__ | | ___ 
                              / __|/ __| '__/ _` | '_ \| '_ \| |/ _ \
                              \__ \ (__| | | (_| | |_) | |_) | |  __/
                              |___/\___|_|  \__,_|_.__/|_.__/|_|\___|
                              
```
Given a word, this program computes the scrabble score for that word.
##### Letter Values:

| Letter                        | Value  |
| ----                          |  ----  |
| A, E, I, O, U, L, N, R, S, T  |     1  |
| D, G                          |     2  |
| B, C, M, P                    |     3  |
| F, H, V, W, Y                 |     4  |
| K                             |     5  |
| J, X                          |     8  |
| Q, Z                          |     10 |


## Acceptance Criteria

```java

class ScrabbleRunner {

   public static void main(String[] args) {
      Scrabble scrabble = new Scrabble("");
      scrabble.score();   // => 0

      scrabble = new Scrabble(null);
      scrabble.score();   // => 0

      scrabble = new Scrabble("a");
      scrabble.score(); // => 1

      scrabble = new Scrabble("f");
      scrabble.score(); // => 4

      scrabble = new Scrabble("street");
      scrabble.score(); // =>, 6

      scrabble = new Scrabble("quirky");
      scrabble.score(); // => 22

      scrabble = new Scrabble("OXYPHENBUTAZONE");
      scrabble.score(); // => 41
   }
}
```

## How to use

In order to run this program, feel free to clone the repository to your local machine. <br>
If you are using IntelliJ and would like to run the test file, please right-click on the project and select `Run all Tests`.

## User stories and domain models

* First user story: <br>
As a user <br>
If I don't input anything <br>
I don't want the program to crash

```
Scrabble	takes in(input)	   @score()
Score		@Integer
Input		@String		
```
-> Testing that an empty string returns 0. <br>
-> Testing that a null value returns 0.

* Second user story: <br>
As a user <br>
I want to input a letter <br>
So that I can gain points 

```
Scrabble	takes in(input)	   @score()
                  array@Char
Score		@Integer
Input		@String		
```
-> Testing that letter "a" returns 1. <br>
-> Testing that letter "f" returns 4.

* Third user story: <br>
As a user <br>
I want to be input words <br>
So that I can gain more points

```
Scrabble	takes in(input)	   @score()
                  array@Char
Score		@Integer
Input		@String		
```
-> Testing that the whole word "street" returns a score of 6. <br>
-> Testing that the word "quirky" returns a score of 22.

* Fourth user story: <br>
As a user <br>
I want to be able to input words regardless of the capitalisation <br>
So that I can just focus on the word itself

```
Scrabble	takes in(input)	   @score()
                  array@Char
Score		@Integer
Input		@String		
```
-> Testing that the word in capital letters "OXYPHENBUTAZONE" returns 41.
