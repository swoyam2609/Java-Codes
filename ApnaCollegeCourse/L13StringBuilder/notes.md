# String Builder

- Strings are immutable in nature

## Declaration
```java
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Swoyam");
        System.out.println(sb);
    }
```

## Printing a character at a particular index
```java
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Swoyam");
        System.out.println("Printing a single character at index 0: "+sb.charAt(0));
    }
```

## Set character at an index
```java
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Swoyam");
        sb.setCharAt(0, 'P');
        System.out.println("The New string is "+sb);
    }
```

## Inserting a character or a string at an index
```java
stringBuilder.insert(5, " Awesome");
```

## Appending to the string
```java
stringBuilder.append(" World");
```

## Deleting Some Characters of the String
```java
stringBuilder.delete(11, 17);
```
the above will not delete the character at index 17

## Reversing the String
```java
stringBuilder.reverse();
```

# A special thing about StringBuilder class is that we can chain different functions together
```java
StringBuilder result = new StringBuilder().append("Java").append(" is").append(" awesome");
```

## Replacing in StringBuilder object
```java
stringBuilder.replace(6, 11, "Universe");
```

## Finding the index of an element
```java
int firstIndex = stringBuilder.indexOf("o");
int lastIndex = stringBuilder.lastIndexOf("o"); 
```
the `.indexOf()` method returns the first occurence whereas `lastIndexOf()` method returns the last occurence of the character or string