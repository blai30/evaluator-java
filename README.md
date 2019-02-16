# CSC 413 - Project One

## Student Name  : Brian Lai

## Student ID    : 916818167

## Student Email : blai2@mail.sfsu.edu

### Note failure to completely fill out this README.md could cause you to recieve a  0 for your project until correctly done

## Additional Work
* Factorial operator
* Modulus operator
* EvaluatorUI text field behavior

## File Structure
```css
csc413-p1-blai30
./
├── Assignment1.pdf
├── classDiagram.txt
├── README.md
├── calculator/
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   └── edu/
│       │   │       └── csc413/
│       │   │           └── calculator/
│       │   │               ├── evaluator/
│       │   │               │   ├── Evaluator.java
│       │   │               │   ├── EvaluatorDriver.java
│       │   │               │   ├── EvaluatorUI.java
│       │   │               │   └── Operand.java
│       │   │               └── operators/
│       │   │                   ├── AddOperator.java
│       │   │                   ├── CloseOperator.java
│       │   │                   ├── DivideOperator.java
│       │   │                   ├── FactorialOperator.java
│       │   │                   ├── ModulusOperator.java
│       │   │                   ├── MultiplyOperator.java
│       │   │                   ├── OpenOperator.java
│       │   │                   ├── Operator.java
│       │   │                   ├── PowerOperator.java
│       │   │                   └── SubtractOperator.java
│       │   └── resources/
│       │       └── emptyfilesofolderappears.noneed
│       └── test/
│           ├── java/
│           │   ├── AddOperatorTest.java
│           │   ├── DivideOperatorTest.java
│           │   ├── EvaluatorTest.java
│           │   ├── MultiplyOperatorTest.java
│           │   ├── OperandTest.java
│           │   ├── OperatorTester.java
│           │   ├── PowerOperatorTest.java
│           │   └── SubtractOperatorTest.java
│           └── resources/
│               ├── apiguardian-api-1.0.0.jar
│               ├── junit-jupiter-api-5.2.0.jar
│               ├── junit-jupiter-engine-5.2.0.jar
│               ├── junit-jupiter-params-5.2.0.jar
│               ├── junit-platform-commons-1.2.0.jar
│               ├── junit-platform-engine-1.2.0.jar
│               ├── junit-platform-launcher-1.2.0.jar
│               ├── junit-platform-runner-1.2.0.jar
│               ├── junit-platform-suite-api-1.2.0.jar
│               └── opentest4j-1.1.0.jar
└── documentation/
    ├── docBase.docx
    ├── docBase.pdf
    └── Documentation Guidelines.pdf
```

## Adding the JUnit 5 Jars to your project.

### InteliJ
In order to use the Unit tests given you will need to let intelij know where to find the needed jars. (jars are just java version of an archived folder or zip file.). 

Intelij will actually find these jars for you while imporiting the project.

If for some reason it does not, you can add the jars in the following way:

1. Complete the process for "create project from existing resources"
2. Then go to File -> Project Structure.
3. Inside project Structure select the "Libraries" tab on the left.
4. You will see a "+" symbol near the top of the window. CLick this symbol.
5. A little window will popup asking what kind of library you want to import. Select "jar"
6. After selection jar, a file selector will appear, navigate to the folder calcualtor/src/test/resources
7. Add ALL jars in this folder. Then hit OK/Accept until all windows for project structure are closed.
8. Now all jar needed to run unit test should be attached to your project.
9. To run unit tests you can simply select any of the files in test/java. Also you may right-slick on the java folder inside test and select run all tests to run all given unit tests.
