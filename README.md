# Weighted-Average-Evaluator
A simple program that evaluates the weighted average based on the input weights and the grades assigned to each weight.

# Features
1) Interactive & responsive application
2) Enter any amount of weights, each corresponding with a particular grade
3) The same weight can be used multiple times (no limit)
4) Tested properly to ensure no breakage/leakage of code

# Software Used
1) IntelliJ
2) Java

# How To Use
1) Make sure you have Java installed
2) Clone the project
3) Open with the IDE of your choice [IntelliJ recommended]
4) Wait for the indexing and setup to process
5) Run the application present in the Main class

# How It Works

- The program has an underlying map that stores and maps each weight to it's grade
- The weights each map to a list of grades to handle multiple grades being added to the same weight
- The entry and deletion methods are written to custom fit this use-case
- Evaluates the weighted average dividing the sum of the products of each weight and it's particular grade by the sum of all the weights
