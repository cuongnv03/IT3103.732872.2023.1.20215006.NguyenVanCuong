import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
    
        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, 
        "Please input the second number: ", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, strNotification, 
        "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2);
        double product = num1 * num2;
        double quotient;
        if (num1 > num2){
            quotient = num1 / num2;
        }
        else {
            quotient = num2 / num1;
        }
        JOptionPane.showMessageDialog(null, "Sum: "+sum+"\n"+"Difference: "+difference+"\n"+"Product: "+product+"\n"+"Quotient: "+quotient, 
        "Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
