# Object Oriented Porgramming - Java Edition

### What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm that revolves around the concept of "objects," which encapsulate data and behavior. It promotes the modular design of software, making it more maintainable and scalable.

### OOP Concepts in Java

Java, being an object-oriented language, embraces key OOP principles:

1. **Encapsulation:** Encapsulating data within classes and controlling access via methods.
2. **Inheritance:** Deriving new classes from existing ones, fostering code reuse and hierarchy.
3. **Polymorphism:** Allowing objects to be treated as instances of their parent class, enhancing flexibility.

### OOP Constraints in Java

Java enforces certain constraints to maintain the integrity of OOP principles:

1. **Single Inheritance:** A class can inherit from only one superclass to avoid ambiguity.
2. **Abstraction:** Abstract classes and interfaces provide a level of abstraction, ensuring clear separation of concerns.

## Applications of OOP in Java

### Java OOP in Machine Learning

Utilizing OOP in Java for Machine Learning involves creating modular and reusable components. Classes can represent algorithms, datasets, and evaluation metrics, making the codebase more structured.

```java
import java.util.List;

public class DecisionTree {

    // Attributes or fields representing the internal state of the DecisionTree
    private TreeNode rootNode;

    // Constructor to initialize the DecisionTree with data
    public DecisionTree(List<SampleData> trainingData) {
        // Implement the logic to build the decision tree from the training data
        this.rootNode = buildDecisionTree(trainingData);
    }

    // Method to make a prediction based on input features
    public String predict(List<Double> inputFeatures) {
        // Implement the logic to traverse the decision tree and make a prediction
        return traverseDecisionTree(inputFeatures, rootNode);
    }

    // Private method to recursively build the decision tree
    private TreeNode buildDecisionTree(List<SampleData> data) {
        // Implement the logic to construct the decision tree nodes
        // ...
        return new TreeNode(); // Placeholder for demonstration
    }

    // Private method to traverse the decision tree for making predictions
    private String traverseDecisionTree(List<Double> inputFeatures, TreeNode currentNode) {
        // Implement the logic to traverse the decision tree nodes and make predictions
        // ...
        return "ClassA"; // Placeholder for demonstration
    }

    // Inner class representing a node in the decision tree
    private static class TreeNode {
        // Attributes or fields of a tree node
        // ...
    }

    // Inner class representing sample data with features and labels
    private static class SampleData {
        List<Double> features;
        String label;

        SampleData(List<Double> features, String label) {
            this.features = features;
            this.label = label;
        }
    }
}


### Java OOP in AI

### Java OOP in Data Engineering

## Author

[hamad-tariq](https://github.com/hamad-tariq)
