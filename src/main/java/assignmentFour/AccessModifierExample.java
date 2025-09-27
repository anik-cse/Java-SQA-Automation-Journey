package assignmentFour;

class DefaultClass {
    void showMessage() {
        System.out.println("Default access: inside same package");
    }
}

public class AccessModifierExample {
    public String publicField = "Public Field";
    private String privateField = "Private Field";
    protected String protectedField = "Protected Field";

    public void displayFields() {
        System.out.println("Public: " + publicField);
        System.out.println("Private: " + privateField);
        System.out.println("Protected: " + protectedField);
    }

    public static void main(String[] args) {
        AccessModifierExample obj = new AccessModifierExample();
        obj.displayFields();

        DefaultClass def = new DefaultClass();
        def.showMessage();
    }
}
