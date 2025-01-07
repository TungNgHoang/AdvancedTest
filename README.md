
# Advanced Testing with JUnit and JaCoCo

## Table of Contents
- [Introduction](#introduction)
- [Implemented Algorithms](#implemented-algorithms)
- [Test Cases](#test-cases)
- [Code Coverage](#code-coverage)
- [Setup and Installation](#setup-and-installation)
- [How to Run Tests](#how-to-run-tests)
- [Conclusion](#conclusion)

---

## Introduction
This project demonstrates advanced testing techniques using **JUnit** for common algorithms. The testing process includes both positive and negative cases, ensuring robust validation of the implemented code. Additionally, **JaCoCo** is used to measure test coverage, helping us identify areas for improvement and achieve 100% branch coverage.

---

## Implemented Algorithms
The project includes the following commonly used algorithms:
1. **Binary Search**: Efficiently finds an element in a sorted array.
2. **Bubble Sort**: Sorts an array using the bubble sort algorithm.
3. **Factorial**: Computes the factorial of a given integer.
4. **Count Word Occurrences**: Counts the number of occurrences of each word in a string.

---

## Test Cases
### Binary Search
- **Tested Scenarios**:
  - Value exists in the array.
  - Value does not exist in the array.
  - Empty array.
  - Null array (throws exception).
  - Single-element array (found/not found).

### Other Algorithms
- **Bubble Sort**:
  - Handles unsorted arrays.
  - Works with empty and single-element arrays.
- **Factorial**:
  - Validates calculations for positive integers.
  - Handles edge cases like `0!`.
- **Count Word Occurrences**:
  - Tests with strings containing multiple occurrences of words.
  - Handles empty strings and null input.

---

## Test Results
![image](https://github.com/user-attachments/assets/88e061ea-f9fc-4f96-9e63-778a1b556639)

---

## Code Coverage
### JaCoCo Report
- **Instruction Coverage**: 98%
- **Branch Coverage**: 100%

Below is the summary from the **JaCoCo** report:

| Method                     | Instruction Coverage | Branch Coverage |
|----------------------------|----------------------|-----------------|
| `binarySearch`             | 100%                | 100%           |
| `bubbleSort`               | 100%                | 100%           |
| `countWordOccurrences`     | 100%                | 100%           |
| `factorial`                | 100%                | 100%           |

> Note: The 2% of missed instructions is due to the class constructor not being explicitly tested.
![image](https://github.com/user-attachments/assets/167d2ed2-f3ca-46ee-abad-a17fa1e2e669)

---

## Setup and Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/TungNgHoang/AdvancedTest.git
   ```

2. **Add Dependencies**:
   Ensure you have the following in your `pom.xml`:
   ```xml
   <dependency>
       <groupId>org.junit.jupiter</groupId>
       <artifactId>junit-jupiter</artifactId>
       <version>5.10.0</version>
       <scope>test</scope>
   </dependency>
   <plugin>
       <groupId>org.jacoco</groupId>
       <artifactId>jacoco-maven-plugin</artifactId>
       <version>0.8.10</version>
   </plugin>
   ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

---

## How to Run Tests
1. **Run Tests**:
   Use the following command to execute the JUnit test cases:
   ```bash
   mvn test
   ```

2. **Generate Coverage Report**:
   Execute the following command to generate the **JaCoCo** test coverage report:
   ```bash
   mvn verify
   ```

3. **View the Coverage Report**:
   Open the file `target/site/jacoco/index.html` in your browser to view the coverage details.

---

## ChatGPT Link
https://chatgpt.com/share/677d5e30-9264-8010-b0df-fbd1eb273749

---

## Conclusion
This project showcases the power of combining **JUnit** with **JaCoCo** to achieve robust testing and high code coverage. By iteratively analyzing the coverage reports, we were able to improve and achieve 100% branch coverage for all implemented algorithms.

Feel free to fork this repository, suggest improvements, or adapt it to your needs!

---
```
