### OOPS -> Object Oriented Programming principles

Type of Programming
<hr>
<ol>
    <li>Procedural Programing/Functional Programming</li>
    <li>Object Oriented Programming</li>
    <li>Aspect Oriented Programming</li>
</ol>

### Procedural Programing/Functional Programming
C, C++, JavaScript, Ruby, Python, Perl, Cobol
In procedural programming we are writing method/functions/procedure
to solve a task. 

prepareMaterial();
startTheMachine();
pourTheMaterial();

### Object Oriented Programming 
What is class 
Class is a template to create object. its blue-print for an object
classes are also called UDT (User defined Type)
<hr>
What is an Object<br/>
An object is a instance of class, its tangible entity.
Object will have properties/attribute/data 

Every Human is an object .
//properties<br/>
name;
age;
address;
id;  (Data for an object)
<br>
//behavior <br/>
sleep();
talk();
walk();



Programming for Real Word.
<ol>
    <li> Abstraction </li> //Simplifying/Hiding details
    <li> Encapsulation </li> //its process of hiding data
    <li> Inheritance  </li> // Code Reuse
    <li> Polymorphism </li> // Change behavior on run time. 

</ol>

### Task 
Write a class called Box 
box should have following properties 
width, height, length; 

write a method in box, which should return 
volume of the box (width*height*length)

go to main method 
create 1 object of box 
and call the volume method and print the volume



### Constructor 
You can think a constructor as a special method, which is used
to create and initialize an object

<ul>
    <li> Constructor doesn't have any return type</li>
    <li> Constructor uses same name as of class</li>
    <li> Constructor can't be static</li>
</ul>
If you don't write constructor, java compiler will 
add default one for you.
But if you write contructor, compiler will not provide any 
for you.


## Task 2 

Write a class call Student with following properties; <br>
 studentId  // int 
 name// String
 program// String 

<br>
write a method, which will print student details
<br>
public void printDetails() {//logic here}}

```java
public class Student {
    // write variable here
    
    public Student(int studentId, String name, String program){
        // complete this
    }
   
    public void printDetails(){
        //complete this
    }
    // this will allow to change the program
    public void changeProgram(String newProgram) {
        //compelte
    }
}

class Main {
    public static void main(String[] args) {
        //Create 3 different student object 
        //print detals for all of them
        // change the program for 1st student 
        // print details again
    }
}
```
