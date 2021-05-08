### Recap 

### For loop
```java
 for (int i = 0 ;  i < 10 ; i++) {
    // if condition is true code in for loop runs
 }

 for (int i = 0; i< 10 ; i++) {
    System.out.println("Step1")    
    System.out.println("Step2") 
    if(i==2) {
        break; // when your control goes to break, loop will terminate
    }    
    System.out.println("Step2")    
 }

 for (int i = 0; i< 10 ; i++) {
     System.out.println("Step1")
     System.out.println("Step2")
     if(i==2) {
         continue; // when your control goes to continue, loop will 
        // skip the step 3 and will go to next iteration
     }
     System.out.println("Step3")
 }
```

### While loop 

```java
// i should be intialized before start of while loop
while( i< 10) {
    // if condition is true, loop will continue to run
}
//rule of using break and continue is same as for loop

```
### do-while loop 
```java
do{
    
}while(i<5);
//rule of using break and continue is same as for loop
```
### Differnce in while and do-while
do-while will always run at-least 1 iteration. 


## Method 
What is a method 
Its a block of code, which perform a task and return a result if any.

(Access Modifier  (optional)
(optional))   
public              static    <type of data method will return>  nameOfMethod(<Argument type and indentifed separate by ,>){
}

```java
class Solution {
    // example methods 
    // writing a method which will sum to int value 
    public static int sum(int num1, int num2){
        // write logic 
        int total = num1 + num2;
        return total;
    }
    //Exmple to print a greeting 
    // if method is not returning anything use void
    public void printGreeting() {
        System.out.println("Hello, how are you");
    }
    
    //Example return max of 2 decimal numbers 
    public static double maxOfTwo(double num1, double num2) {
         if( num1 > num2) {
             return num1;
         }
         return num2;
    }
}

```


### Reading from Console. 
To read from console we can use scanner class 
it should be important form java.util.Scanner;

```java
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();; // Read line
        sc.nextInt() ; //Read int value
        sc.nextDouble();// reads double value
        sc.nextBoolean() ; //read boolean 
                
    }
}
```
### Assignment 
Write a interactive calculator which should present following menu 
to user 
<br>
Choose one of following option 
<ul>
    <li> 1.  For Addition </li>
    <li> 2.  For Substraction </li>
    <li> 3.  For Multipication </li>
    <li> 4.  For Modulus </li>
    <li> 0.  For Exit </li>
</ul>

When user select 1 to 4 
Ask user to key in to int values 
and then display result 
after display result - prompt user with menu again
continue to run calculator till user select 0 to exit.
