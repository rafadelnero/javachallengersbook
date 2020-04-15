package com.javachallengers.overloading.cantbedone;

public class MatrixNotWork {

    void goToMatrix() {}

    // It doesn't compile because we can't overload by different return types
    /*long goToMatrix() {}*/

    void goToMatrix(String neo) {}
   /* void goToMatrix(String morpheus) {}*/
}
