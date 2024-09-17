package logic;

public class Operation {
    double num1, num2;
    public Operation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        }
    }
}