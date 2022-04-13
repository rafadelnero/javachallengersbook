# Using an automatic module

### Using automatic module on use-automatic-module 

- Create a lib folder into the use-automatic-module from `javachallengersbook/`
`mkdir use-automatic-module\lib`

- Move the `automatic.jar` to the `lib` folder:
`mv automatic-module/automatic.jar use-automatic-module/lib`

### Compiling the AutomaticModuleUse.java file

- Run the following command from `javachallengersbook/use-automatic-module`
javac --module-path lib -d out src/main/java/module-info.java src/main/java/use/AutomaticModuleUse.java

### Running the application using the automatic module
java --module-path ./out:./lib --module useAutomaticModule/use.AutomaticModuleUse
