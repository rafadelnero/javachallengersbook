

### Generating the `.class` files:

`javac -d out src/main/java/hellomodule/*.java src/main/java/module-info.java`

### Running the `HelloModule` class:

`java -p out -m helloModule/hellomodule.HelloModule`

### Creating a jar from `.class` files:

`jar --create --file=hello-module.jar -C out/ .`


### Inspecting a Jar file:

`jar --describe-module --file=hello-module.jar`