package by.homework.lessons.task19.lambda;

public class Main {

    public static void main(String[] args) {
        StringProcessor toUpperCase = (input) -> input.toUpperCase();

        String originalString = "hello, vadarod";
        String upperCaseString = toUpperCase.process(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Uppercase string: " + upperCaseString);
    }

}
