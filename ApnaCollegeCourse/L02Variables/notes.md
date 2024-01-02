# Printing the output
```java
System.out.print("Your output here");
```
The above print the string to the console
```java
System.out.println("Your output here");
```
The above print the string to the console with an `/n` endline character at the end

# Variables
Varibles are defined in Java similar to c or c++. You will have to first define the variable type, then give it value
```java
int a = 10;
System.out.print(a);
```
The above will print the value of the variable `a`

# Data Types in Java
Java is a `typed` language. That is before declaring any variable in java, you need to mention the data type of that variable.
## Different types of data types
- ### Primitive
    - byte
    - short
    - char
    - int
    - boolean
    - long
    - float
    - double
- ### Non-Primitive
    - String
    - Array
    - Class
    - Object
    - Interface

# * We dont follow BODMAS Rule in JAVA

Java operator precedence is as `* / % + -`

# Taking input in Java
```java
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + "!");
        sc.close();
    }
```

The above code would take whatever input is recieved till the 1st whitespace and then store it in the varibale named `name`. 
Also it is recommended to close the canner object to avoid resource leaks.

```java
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        sc.close();
    }
```

The change in code `sc.nextLine();` will now take the input of the complete line till the first endline scharacter.