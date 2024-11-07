# GenericClass Java Example

This is a simple Java project demonstrating the use of generic classes. It defines a `GenericClass` that accepts two generic type parameters and shows how to create instances with different data types.

## Overview

The `GenericClass` class is a generic container that holds two values of different types. It includes a constructor to initialize these values and a method `getValue()` to return the second value.

The `Main` class demonstrates how to use this generic class with various data types such as `Integer`, `Double`, `Character`, and `String`.

## Features

- **GenericClass**: A generic class with two type parameters (`Thing` and `Thing1`).
  - Constructor initializes the two values.
  - `getValue()` method returns the second value of type `Thing1`.
  
- **Main Class**: Demonstrates how to create and use instances of `GenericClass` with different data types.

## Example Usage

```java
package Solutions;

public class Main
{
    public static void main(String[] args)
    {
        GenericClass<Integer, Integer> intObject = new GenericClass<>(1, 12);
        GenericClass<Double, Double> doubleObject = new GenericClass<>(3.14, 2.76);
        GenericClass<Character, Character> charObject = new GenericClass<>('@', '$');
        GenericClass<String, Character> stringObject = new GenericClass<>("Hello", 'A');

        System.out.println(intObject.getValue());
        System.out.println(doubleObject.getValue());
        System.out.println(charObject.getValue());
        System.out.println(stringObject.getValue());
    }
}
```

### How It Works

- **GenericClass**: This class can hold two objects of any type (specified during instantiation). You pass two values of different types to the constructor and retrieve the second value using the `getValue()` method.
  
- **Main Class**: The `Main` class demonstrates how to create `GenericClass` objects with different data types and prints the second value of each.

## Prerequisites

- Java 8 or higher.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/generic-class-example.git
   ```

2. Navigate to the project directory:
   ```bash
   cd GenericClassExample
   ```

3. Compile and run the `Main.java` file:
   ```bash
   javac Main.java
   java Main
   ```

### Explanation:
- **Overview**: Briefly explains what the project is about.
- **Features**: Highlights the key components of the code (GenericClass and Main).
- **Example Usage**: Shows a basic example of how to use the `GenericClass` in Java.
- **How It Works**: Describes how the generic class operates.
- **Prerequisites**: Specifies Java version requirements.
- **Getting Started**: Provides step-by-step instructions to clone and run the project locally.
- **License**: Mentions licensing information (adjust as per your actual license).

This `README.md` serves as a comprehensive guide to understand, use, and contribute to your project.
