public class Calculator {

    public Calculator() {

    }

    //Fully the same
    public int add(int summand1, int summand2) {
        return summand1 + summand2;
    }

    //Other call order
    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }
    
    //Switched order
    public int multiply(int a, int b) {
        return b * a;
    }
}
