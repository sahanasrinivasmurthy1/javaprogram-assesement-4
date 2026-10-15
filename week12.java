package asjessi;

class Addition {
    int a = 10;
    int b = 20;

    void display() {
        System.out.println("Addition: " + (a + b));
    }
}

public class week12 {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.display();
    }
}
