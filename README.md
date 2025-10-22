# ⚙️ Arch.pc: Algorithms and Data Structures Labs

**Arch.pc** is a collection of laboratory assignments focused on fundamental algorithms and data structures, implemented in Java. Each lab explores a specific concept, providing practical implementations and performance comparisons. This project is designed for students and developers aiming to deepen their understanding of algorithms and data structures.

## 📝 Table of Contents

*   [✨ Features](#-features)
*   [🛠️ Technologies Used](#️-technologies-used)
*   [🚀 Quick Start](#-quick-start)
    *   [1️⃣ Clone the Repository](#1️⃣-clone-the-repository)
    *   [2️⃣ Build the Project](#2️⃣-build-the-project)
    *   [3️⃣ Run the Labs](#3️⃣-run-the-labs)
*   [🔬 Lab Details](#-lab-details)
    *   [Lab01Task: List Performance Comparison](#lab01task-list-performance-comparison)
    *   [Lab02Sorting: Sorting Algorithms Performance Comparison](#lab02sorting-sorting-algorithms-performance-comparison)
    *   [Lab03Recursion: Recursion and Iteration Examples](#lab03recursion-recursion-and-iteration-examples)
    *   [Lab04BST: Binary Search Tree Implementation](#lab04bst-binary-search-tree-implementation)
    *   [Lab05: Data Validation and Manipulation](#lab05-data-validation-and-manipulation)
*   [🤝 Contributing](#-contributing)
*   [📄 License](#-license)
*   [🧰 Maintainer](#-maintainer)

## ✨ Features

*   **Fundamental Concepts**: Covers key algorithms and data structures such as lists, sorting, recursion, binary search trees, and data validation.
*   **Practical Implementation**: Provides ready-to-run examples for each lab, demonstrating concepts in practice.
*   **Java-Oriented Approach**: All assignments are implemented in Java, ensuring ease of understanding and code modification.
*   **Modular Structure**: Each lab is organized as a separate Maven module, simplifying navigation and study.
*   **Performance Comparison**: Includes analysis of the performance of different list implementations and sorting algorithms.
*   **Standard Tooling**: Utilizes standard Java development tools such as Maven for project building and JUnit for testing.

## 🛠️ Technologies Used

The project is built upon the following technologies and libraries:

*   **Java**: Primary programming language (JDK 19 or newer).
*   **Apache Maven**: Project management and build automation tool.
*   **JUnit**: Framework for unit testing.

## 🚀 Quick Start

To build and run these projects, follow these instructions:

### 1️⃣ Clone the Repository

```shell
git clone https://github.com/ArtemRivnyi/arch.pc.git
cd arch.pc
```

### 2️⃣ Build the Project

Navigate to each lab directory and build the project using Maven:

```shell
cd Lab01Task # or Lab02Sorting, Lab03Recursion, Lab04BST, Lab05
mvn clean install
```

### 3️⃣ Run the Labs

Run the main program for each lab:

**Run Lab01Task:**

```shell
mvn exec:java -Dexec.mainClass="ListPerformanceComparison"
```

**Run Lab02Sorting:**

```shell
mvn exec:java -Dexec.mainClass="SortingPerformance"
```

**Run Lab03Recursion:**

```shell
mvn exec:java -Dexec.mainClass="Main"
```

**Run Lab04BST:**

```shell
mvn exec:java -Dexec.mainClass="Node"
```

**Run Lab05:**

```shell
mvn exec:java -Dexec.mainClass="Main"
```

## 🔬 Lab Details

### Lab01Task: List Performance Comparison

This lab compares the performance of `ArrayList` and `LinkedList` in Java for various operations such as filling, random access, sequential access, and insertions at the beginning, end, and middle of the list. It demonstrates the trade-offs between these two common list implementations.

**Key Files:**

*   `ListPerformanceComparison.java`: Contains the main logic for comparing `ArrayList` and `LinkedList` performance.

### Lab02Sorting: Sorting Algorithms Performance Comparison

This module implements and compares the performance of several sorting algorithms, including Bubble Sort, Merge Sort, Quick Sort, and Shell Sort. It provides a framework to generate arrays of different sizes and measure the execution time of each sorting method.

**Key Files:**

*   `ArrayGenerator.java`: Utility to generate arrays for sorting.
*   `BubbleSorter.java`, `MergeSorter.java`, `QuickSorter.java`, `ShellSorter.java`: Implementations of various sorting algorithms.
*   `Sorter.java`: Interface for sorting algorithms.
*   `SorterFactory.java`: Factory to get `Sorter` implementations.
*   `SortingPerformance.java`: Main class for running sorting performance tests.
*   `SortingType.java`: Enum for different sorting types.

### Lab03Recursion: Recursion and Iteration Examples

This lab explores the concepts of recursion and iteration through various examples, including factorial calculation, Fibonacci sequence generation, and sum of digits calculation. It compares recursive and iterative approaches for these problems.

**Key Files:**

*   `FibonacciCalculator.java`: Calculates Fibonacci numbers using both recursive and iterative methods.
*   `fCalc.java`: Calculates factorials using both recursive and iterative methods.
*   `Resolvesumm.java`: Calculates the sum of digits of a number.
*   `SumCalculator.java`: Calculates the sum of two numbers (simple example).
*   `Main.java`: Entry point to demonstrate the functionality of the recursive and iterative examples.

### Lab04BST: Binary Search Tree Implementation

This module provides a basic implementation of a Binary Search Tree (BST). It includes functionalities for inserting, deleting, and finding nodes within the tree. The `Node` class represents the structure of the BST.

**Key Files:**

*   `Node.java`: Implements the Node structure and core BST operations (insert, delete, find, getNodeCount).
*   `NodeTest.java`: JUnit tests for the `Node` class.

### Lab05: Data Validation and Manipulation

This lab focuses on data validation and manipulation, specifically demonstrating phone number validation using regular expressions. It includes classes for validation, deletion, and replacement operations.

**Key Files:**

*   `Validation.java`: Contains logic for validating phone numbers using a regex pattern.
*   `Deleter.java`, `Replacement.java`: (Likely contain logic for deletion and replacement operations, though specific functionality would require further inspection).
*   `DeleterTest.java`, `ReplacementTest.java`, `ValidationTest.java`: JUnit tests for the respective utility classes.

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository, make improvements, and submit pull requests.

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## 🧰 Maintainer

**Artem Rivnyi** — Junior Technical Support / DevOps Enthusiast

*   📧 [artemrivnyi@outlook.com](mailto:artemrivnyi@outlook.com)
*   🔗 [LinkedIn](https://www.linkedin.com/in/artem-rivnyi/)
