package behavioralDesignPatterns.interpreterDesignPattern;

public class MainInterpreterDesignPattern {
    public static void main(String[] args) {

        // Rule: person1 and person2 are going to shopping
        TerminalExpression person1 = new TerminalExpression("person1");
        TerminalExpression person2 = new TerminalExpression("person2");
        OrExpression orExpression = new OrExpression(person1, person2);

        boolean interpret = orExpression.interpret("person1 is going to shopping");
        boolean interpret2 = orExpression.interpret("person2 is going to shopping");

        System.out.println("person1 is going to shopping: " + interpret);
        System.out.println("person2 is going to shopping: " + interpret2);

    }
}
