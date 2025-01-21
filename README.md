# CE305_CW1

java -jar lib/antlr-4.13.2-complete.jar -visitor -package visitors -o src/main/java/visitors src/main/antlr/Expr.g4


How to run the program:

1. Compile the program using the following command:

Step 1:

Set the CLASSPATH to include the ANTLR jar and the current directory:

```bash
export CLASSPATH=".:lib/antlr-4.13.2-complete.jar"
```

Step 2:

Compile the visitor classes using the following command:
```bash
javac -d bin src/main/java/visitors/*.java
```

Step 3:
 
Compile Main and Error Listener Classes:

```bash
javac -d bin -cp lib/antlr-4.13.2-complete.jar:bin src/main/java/ExprErrorListener.java src/main/java/Main.java
````



2. Running the program:

```bash
java -cp bin:lib/antlr-4.13.2-complete.jar main.java.Main
```
