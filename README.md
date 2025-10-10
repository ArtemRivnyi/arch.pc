# Algorithms and Data Structures Labs

This repository contains a collection of Java-based laboratory assignments focused on fundamental algorithms and data structures. Each lab explores a specific concept, providing practical implementations and performance comparisons.

## Project Structure

The project is organized into several modules, each representing a distinct laboratory assignment. All modules are Maven-based projects.

```
arch.pc-master/
├── Lab01Task/             # List Performance Comparison
├── Lab02Sorting/          # Sorting Algorithms Performance Comparison
├── Lab03Recursion/        # Recursion and Iteration Examples
├── Lab04BST/              # Binary Search Tree Implementation
└── Lab05/                 # Data Validation and Manipulation
```

## Lab Details

### Lab01Task: List Performance Comparison

This lab compares the performance of `ArrayList` and `LinkedList` in Java for various operations such as filling, random access, sequential access, and insertions at the beginning, end, and middle of the list. It demonstrates the trade-offs between these two common list implementations.

**Key Files:**
- `ListPerformanceComparison.java`: Contains the main logic for comparing `ArrayList` and `LinkedList` performance.

### Lab02Sorting: Sorting Algorithms Performance Comparison

This module implements and compares the performance of several sorting algorithms, including Bubble Sort, Merge Sort, Quick Sort, and Shell Sort. It provides a framework to generate arrays of different sizes and measure the execution time of each sorting method.

**Key Files:**
- `ArrayGenerator.java`: Utility to generate arrays for sorting.
- `BubbleSorter.java`, `MergeSorter.java`, `QuickSorter.java`, `ShellSorter.java`: Implementations of various sorting algorithms.
- `Sorter.java`: Interface for sorting algorithms.
- `SorterFactory.java`: Factory to get `Sorter` implementations.
- `SortingPerformance.java`: Main class for running sorting performance tests.
- `SortingType.java`: Enum for different sorting types.

### Lab03Recursion: Recursion and Iteration Examples

This lab explores the concepts of recursion and iteration through various examples, including factorial calculation, Fibonacci sequence generation, and sum of digits calculation. It compares recursive and iterative approaches for these problems.

**Key Files:**
- `FibonacciCalculator.java`: Calculates Fibonacci numbers using both recursive and iterative methods.
- `fCalc.java`: Calculates factorials using both recursive and iterative methods.
- `Resolvesumm.java`: Calculates the sum of digits of a number.
- `SumCalculator.java`: Calculates the sum of two numbers (simple example).
- `Main.java`: Entry point to demonstrate the functionality of the recursive and iterative examples.

### Lab04BST: Binary Search Tree Implementation

This module provides a basic implementation of a Binary Search Tree (BST). It includes functionalities for inserting, deleting, and finding nodes within the tree. The `Node` class represents the structure of the BST.

**Key Files:**
- `Node.java`: Implements the Node structure and core BST operations (enter, delete, find, getNodeCount).
- `NodeTest.java`: JUnit tests for the `Node` class.

### Lab05: Data Validation and Manipulation

This lab focuses on data validation and manipulation, specifically demonstrating phone number validation using regular expressions. It includes classes for validation, deletion, and replacement operations.

**Key Files:**
- `Validation.java`: Contains logic for validating phone numbers using a regex pattern.
- `Deleter.java`, `Replacement.java`: (Based on file names, likely contain logic for deletion and replacement operations, though specific functionality would require further inspection).
- `DeleterTest.java`, `ReplacementTest.java`, `ValidationTest.java`: JUnit tests for the respective utility classes.

## Getting Started

To build and run these projects, you will need Java Development Kit (JDK) 19 or newer and Apache Maven installed.

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/arch.pc-master.git
    cd arch.pc-master
    ```
    *(Note: Replace `https://github.com/your-username/arch.pc-master.git` with the actual repository URL if it's hosted on GitHub.)*

2.  **Navigate to a specific lab directory (e.g., Lab01Task):**
    ```bash
    cd Lab01Task
    ```

3.  **Build the project using Maven:**
    ```bash
    mvn clean install
    ```

4.  **Run the main class (if applicable):**
    For `Lab01Task`:
    ```bash
    mvn exec:java -Dexec.mainClass="ListPerformanceComparison"
    ```
    For `Lab02Sorting`:
    ```bash
    mvn exec:java -Dexec.mainClass="SortingPerformance"
    ```
    For `Lab03Recursion`:
    ```bash
    mvn exec:java -Dexec.mainClass="Main"
    ```

## Contributing

Contributions are welcome! Please feel free to fork the repository, make improvements, and submit pull requests.

## License

This project is licensed under the MIT License - see the LICENSE file for details. (Note: A `LICENSE` file is not included in the provided archive, so this is a placeholder. Please create one if needed.)

---

**Author:** Artem Rivnyi

