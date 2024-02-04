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

## Applications of Java OOPs

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
```

### Java OOP in AI

In AI applications, OOP facilitates building intelligent systems with modular components. Classes representing agents, environments, and decision-making processes enhance code organization.

```java
import java.util.Random;

public class IntelligentAgent {

    // Attributes or fields representing the internal state of the IntelligentAgent
    private String agentName;
    private int energyLevel;

    // Constructor to initialize the IntelligentAgent
    public IntelligentAgent(String agentName) {
        this.agentName = agentName;
        this.energyLevel = 100; // Starting energy level
    }

    // Method to perform an action based on the agent's intelligence
    public void performAction() {
        if (energyLevel > 0) {
            // Implement the logic for intelligent decision-making or action
            System.out.println(agentName + " is performing an intelligent action.");
            // Consume energy for the action
            consumeEnergy();
        } else {
            System.out.println(agentName + " is out of energy and cannot perform actions.");
        }
    }

    // Method to recharge the energy of the IntelligentAgent
    public void rechargeEnergy() {
        // Implement the logic to recharge the energy
        energyLevel = 100; // Full energy after recharge
        System.out.println(agentName + "'s energy has been fully recharged.");
    }

    // Private method to simulate energy consumption
    private void consumeEnergy() {
        // Simulate energy consumption during an action
        Random random = new Random();
        int energyConsumed = random.nextInt(20) + 1; // Consume between 1 to 20 units of energy
        energyLevel -= energyConsumed;
        System.out.println(agentName + " has consumed " + energyConsumed + " units of energy.");
    }

    // Getters and setters for attributes (if needed)
    public String getAgentName() {
        return agentName;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    // Additional methods and functionalities can be added as needed
}
```

### Java OOP in Data Engineering

For Data Engineering tasks, OOP promotes a well-organized approach. Classes can represent data pipelines, transformations, and connectors, making the codebase scalable and maintainable.

```java
import java.util.List;

public class DataPipeline {

    // Attributes or fields representing the internal state of the DataPipeline
    private String pipelineName;
    private List<DataProcessor> processors;

    // Constructor to initialize the DataPipeline
    public DataPipeline(String pipelineName, List<DataProcessor> processors) {
        this.pipelineName = pipelineName;
        this.processors = processors;
    }

    // Method to process data through the pipeline
    public void process(List<Data> inputData) {
        System.out.println("Processing data through the pipeline: " + pipelineName);

        // Iterate through each processor in the pipeline
        for (DataProcessor processor : processors) {
            System.out.println("Applying processor: " + processor.getName());
            inputData = processor.processData(inputData);
        }

        System.out.println("Data processing completed.");
    }

    // Inner class representing a data processor
    public static class DataProcessor {
        private String name;

        public DataProcessor(String name) {
            this.name = name;
        }

        // Method to process data
        public List<Data> processData(List<Data> inputData) {
            // Implement the logic to process data
            // ...
            return inputData; // Placeholder for demonstration
        }

        // Getter for processor name
        public String getName() {
            return name;
        }
    }

    // Inner class representing the data that flows through the pipeline
    public static class Data {
        // Attributes or fields of data
        // ...
    }

    // Additional methods and functionalities can be added as needed
}
```

For more information and content follow on [Instagram](https://www.instagram.com/hamad_tariq001/) or send a connection request on [LinkedIn](https://www.linkedin.com/in/hammad-tariq-269623207/)

## Author


Visit portfolio at [hamad-tariq](https://github.com/hamad-tariq)
