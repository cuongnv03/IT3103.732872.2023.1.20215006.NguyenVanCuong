//Nguyễn Văn Cường - 20215006
//Example 6: SolveBasicEquations.java
import javax.swing.JOptionPane;
import java.lang.Math;
public class SolveBasicEquations {
        public static void main(String[] args){
            int option = JOptionPane.showOptionDialog(null, "Solve Basic Equations", "Select types of equation",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                State.values(), State.values()[0]);
        if (option == JOptionPane.CLOSED_OPTION) {
            System.out.println("You closed the JOptionPane without selecting"); 
        } else {
            State state = State.values()[option];
            doAction(state);
            if (state == State.EQ1){
                solveEQ1();
            }
            if (state == State.EQ2){
                solveEQ2();
            }
            if (state == State.EQ3){
                solveEQ3();
            }
        }
    }

    private static void doAction(State state) {
        System.out.println("You have selected to " + state);
    }

    private static void solveEQ1(){
        String strNum1, strNum2;
    
        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
        "Please input the second number: ", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double x;
        if (num1 == 0 & num2 == 0){
            JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem.", "Ket qua", 0);
        }
        if (num1 == 0 & num2 != 0){
            JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem.", "Ket qua", 0);
        }
        if (num1 != 0 & num2 != 0){
            x = -num2/num1;
            JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem la: " + x, "Ket qua", 0);
        }        
    }
    private static void solveEQ2(){
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
    
        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
        "Please input the second number: ", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        strNum3 = JOptionPane.showInputDialog(null, 
        "Please input the third number: ", 
        "Input the third number", JOptionPane.INFORMATION_MESSAGE);
        double num3 = Double.parseDouble(strNum3);

        strNum4 = JOptionPane.showInputDialog(null, 
        "Please input the fourth number: ", 
        "Input the fourth number", JOptionPane.INFORMATION_MESSAGE);
        double num4 = Double.parseDouble(strNum4);

        strNum5 = JOptionPane.showInputDialog(null, 
        "Please input the fifth number: ", 
        "Input the fifth number", JOptionPane.INFORMATION_MESSAGE);
        double num5 = Double.parseDouble(strNum5);

        strNum6 = JOptionPane.showInputDialog(null, 
        "Please input the sixth number: ", 
        "Input the sixth number", JOptionPane.INFORMATION_MESSAGE);
        double num6 = Double.parseDouble(strNum6);

        double d = num1*num5 - num4*num2;
        double dx = num3*num5 - num6*num2;
        double dy = num1*num6 - num4*num3;

        if (d != 0){
            double x = dx/d;
            double y = dy/d;
            JOptionPane.showMessageDialog(null, "He phuong trinh co nghiem la: (" + x + "; " + y + ").", "Ket qua", 0);
        }
        if (d == 0 & dx != 0 & dy != 0){
            JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem.", "Ket qua", 0);
        }
        if (d == 0 & dx == 0 & dy == 0){
            JOptionPane.showMessageDialog(null, "He phuong trinh co vo so nghiem.", "Ket qua", 0);
        }
    }
    private static void solveEQ3(){
        String strNum1, strNum2, strNum3;
    
        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
        "Please input the second number: ", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        strNum3 = JOptionPane.showInputDialog(null, 
        "Please input the third number: ", 
        "Input the third number", JOptionPane.INFORMATION_MESSAGE);
        double num3 = Double.parseDouble(strNum3);

        double x,x1,x2;
        if (num1==0){
            if (num2 == 0 & num3 == 0){
                JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem.", "Ket qua", 0);
            }
            if (num2 == 0 & num3 != 0){
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem.", "Ket qua", 0);
            }
            if (num2 != 0 & num3 != 0){
                x = -num3/num2;
                JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem la: " + x, "Ket qua", 0);
            }
        }
        else{
            double d = num2*num2 - 4*num1*num3;
            if (d < 0){
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem.", "Ket qua", 0);
            }
            if (d == 0){
                x = -num2/(2*num1);
                JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep la: " + x, "Ket qua", 0);
            }
            if (d > 0){
                x1 = (-num2 + Math.sqrt(d))/(2*num1);
                x2 = (-num2 - Math.sqrt(d))/(2*num1);
                JOptionPane.showMessageDialog(null, "Phuong trinh co 2 nghiem la: " + x1 + ", " + x2, "Ket qua", 0);
            }
        }
    }
}

enum State {
    EQ1("Ax+B=0"), EQ2("Ax+By=C, Dx+Ey=F"), EQ3("Ax^2+Bx+C=0");
    private State(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}