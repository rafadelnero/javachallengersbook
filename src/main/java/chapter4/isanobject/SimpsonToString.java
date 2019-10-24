package chapter4.isanobject;

public class SimpsonToString {

    private String name;
    private String weight;

    private SimpsonToString(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public static void main(String... toStringExample) {
        SimpsonToString homer = new SimpsonToString("Homer", "240");
        System.out.println(homer);
    }

    @Override
    public String toString() {
        return "Simpson name:".concat(this.name).concat(", weight:").concat(weight);
    }

}
