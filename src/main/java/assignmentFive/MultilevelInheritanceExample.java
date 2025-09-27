package assignmentFive;

class Grandparent {
    void wisdom() {
        System.out.println("Grandparent shares wisdom.");
    }
}

class Parent extends Grandparent {
    void guide() {
        System.out.println("Parent gives guidance.");
    }
}

class Child extends Parent {
    void play() {
        System.out.println("Child is playing.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.wisdom();
        child.guide();
        child.play();
    }
}
