# Strings
## Defining a string
```java
String newString = "Swoyam Siddharth";
```

## Taking input of a word
```java
Scanner sc = new Scanner(System.in);
String newString = sc.next();
```

## Taking input of a complete sentence
```java
Scanner sc = new Scanner(System.in);
String newString = sc.nextLine();
```

## Finding the length of the String
```java
public static void main(String[] args) {
    String myName = "Swoyam Siddharth";
    System.out.println("The length of the String is: " + myName.length());
}
```

## Printing a character at a specific index
```java
public static void main(String[] args) {
    String myName = "Swoyam Siddharth Nayak";
    System.out.println("The character at index 1 is " + myName.charAt(1));
}
```

## Comparing two strings
```java
    public static void main(String[] args) {
        String myName = "Swoyam Siddharth Nayak";
        String yourName = "Aditya Panda";
        if(myName.compareTo(yourName)==0){
            System.out.println("The two stings are equal");
        }else{
            System.out.println("The two strings are not equal");
        }
    }
```

## Substring function in Java
```java
    public static void main(String[] args) {
        String sentence = "My name is Swoyam";
        String name = sentence.substring(11, sentence.length());
        System.out.println("The name in the sentence is: " + name);
    }
```

## Integer to String and ViceVersa
```java
    public static void main(String[] args) {
        String number = "123";
        int numberFromString = Integer.parseInt(number);
        System.out.println("The number found in String is "+ numberFromString);
        int numberToString = 760;
        String foundNumber = Integer.toString(numberToString);
        System.out.println("The number coverted to string is "+ foundNumber);
    }
```