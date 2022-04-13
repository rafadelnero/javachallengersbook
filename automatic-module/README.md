# Using an automatic module

### Compile the automatic module class

- Go to the path `javachallengersbook/automatic-module` and use the command:
  `javac -d out src/main/java/util/Automatic.java`

### Create a jar from the compiled class

`jar --create --file automatic.jar -C out .`