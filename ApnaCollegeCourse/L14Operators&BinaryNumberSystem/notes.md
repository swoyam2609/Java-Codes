# Operators & Binary Number System in Java

## Operators in Java

### Arithmetic Operators:

- **Addition (`+`):**
  ```java
  int result = 5 + 3; // result is 8
  ```

- **Subtraction (`-`):**
  ```java
  int result = 5 - 3; // result is 2
  ```

- **Multiplication (`*`):**
  ```java
  int result = 5 * 3; // result is 15
  ```

- **Division (`/`):**
  ```java
  int result = 6 / 3; // result is 2
  ```

- **Modulus (`%`):**
  ```java
  int result = 7 % 3; // result is 1 (remainder of division)
  ```

### Assignment Operators:

- **Assignment (`=`):**
  ```java
  int x = 5; // assigns the value 5 to variable x
  ```

- **Addition Assignment (`+=`):**
  ```java
  int x = 5;
  x += 3; // equivalent to x = x + 3; // x is now 8
  ```

...

### Use Cases:

1. **Bit Manipulation:**
   - Bitwise operators are often used for low-level bit manipulation, encoding, and decoding.

2. **Performance Optimization:**
   - Efficient use of bitwise operations and shifts can lead to performance improvements in specific scenarios.

3. **Flags and Status Bits:**
   - Binary numbers are frequently used to represent sets of flags or status bits, where each bit indicates a specific condition.

4. **Hardware Interaction:**
   - When working with hardware or protocols, understanding and manipulating binary data is essential.

## Binary Number System in Java

### Binary Literals:

In Java, you can represent binary literals using the `0b` prefix:

```java
int binaryNumber = 0b1010; // represents the decimal number 10
```

### Binary Operations with Shifts:

Besides the regular arithmetic and bitwise operations, shifts can be used effectively for certain operations.

```java
int x = 0b1010;

// Rotate right by 2 positions
int rotatedRight = (x >>> 2) | (x << (Integer.SIZE - 2));

// Count the number of set bits (1s)
int countSetBits = Integer.bitCount(x);
```

#### Hexadecimal and Octal Literals:

In addition to binary literals, Java supports hexadecimal and octal literals using `0x` and `0` prefixes, respectively.

```java
int hexNumber = 0xA; // represents decimal 10
int octalNumber = 010; // represents decimal 8
```