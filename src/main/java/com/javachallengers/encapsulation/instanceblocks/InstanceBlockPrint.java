package com.javachallengers.encapsulation.instanceblocks;

class InstanceBlockPrint {

    String name;

    {
        this.print();
    }

    InstanceBlockPrint() {
        name = "Challenger";
    }

    public static void main(String[] args) {
        InstanceBlockPrint instanceBlock = new InstanceBlockPrint();
        instanceBlock.print();
    }

    void print() {
        System.out.println(name);
    }

}
