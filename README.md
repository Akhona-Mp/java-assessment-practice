# Java Assessments

This repository contains Java versions of the Python assessments. The assessments have been converted to Java while maintaining the same functionality and requirements.

## Project Structure

The project is organized as a Maven project with the following structure:

```
src/
├── main/
│   ├── java/
│   │   └── wethinkcode/
│   │       └── assessments/
│   │           ├── syntax/
│   │           │   └── Fundamentals.java
│   │           ├── quotes/
│   │           │   └── QuoteSystem.java
│   │           └── patterns/
│   │               └── Patterns.java
│   └── resources/
│       └── wethinkcode/
│           └── assessments/
│               └── quotes/
│                   └── quotes.txt
└── test/
    └── java/
        └── wethinkcode/
            └── assessments/
                ├── syntax/
                │   └── FundamentalsTest.java
                ├── quotes/
                │   └── QuoteSystemTest.java
                └── patterns/
                    └── PatternsTest.java
```

## Assessments

### 1. Fundamentals & Problem Solving

The first assessment tests basic Java syntax and problem-solving skills. Students need to implement methods in the `Fundamentals` class to:

- Extract information from ID numbers
- Implement the FizzBuzz algorithm
- Categorize numbers based on various conditions

### 2. Quote System

The second assessment involves working with files and string manipulation. Students need to implement methods in the `QuoteSystem` class to:

- Handle user input for file names
- Read from files and handle exceptions
- Select random quotes
- Match quotes to authors
- Format and display output

### 3. Patterns

The third assessment focuses on drawing various patterns. Students need to implement methods in the `Patterns` class to:

- Draw shapes like squares, triangles, and pyramids
- Create number patterns
- Generate prime number sequences
- Calculate Pascal's triangle

## Running the Tests

To run the tests, use Maven:

```bash
mvn test
```

To run tests for a specific assessment:

```bash
mvn test -Dtest=FundamentalsTest
mvn test -Dtest=QuoteSystemTest
mvn test -Dtest=PatternsTest
```

## Notes for Students

- All the method stubs are provided, but the implementations are left for you to complete.
- Read the Javadoc comments carefully to understand what each method should do.
- The tests will guide you in implementing the correct functionality.
- Do not modify the test files.