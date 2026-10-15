package asjessi;

class learners {
    int rollNo = 101;
    String name = "Ravi";

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class exp2 {
    public static void main(String[] args) {
        learners s = new learners();
        s.display();
    }
}
