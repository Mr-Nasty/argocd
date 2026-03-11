/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac1_;

/**
 *
 * @author devan
 */
public class Prac1_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Addition = add(30,60);
        System.out.println("Addition: " +  Addition);
        
        int Subtraction = sub(30,40);
        System.out.println("Sub: " + Subtraction);
        
        int Multiplication = mul(2,4);
        System.out.println("Multiplication: " + Multiplication);
        
        int Division = div(4,2);
        System.out.println("Division: " + Division);
    }

    private static int add(int num1, int num2) {
        client.Prac1WS_Service service = new client.Prac1WS_Service();
        client.Prac1WS port = service.getPrac1WSPort();
        return port.add(num1, num2);
    }

    private static int sub(int num1, int num2) {
        client.Prac1WS_Service service = new client.Prac1WS_Service();
        client.Prac1WS port = service.getPrac1WSPort();
        return port.sub(num1, num2);
    }

    private static int mul(int num1, int num2) {
        client.Prac1WS_Service service = new client.Prac1WS_Service();
        client.Prac1WS port = service.getPrac1WSPort();
        return port.mul(num1, num2);
    }

    private static int div(int num1, int num2) {
        client.Prac1WS_Service service = new client.Prac1WS_Service();
        client.Prac1WS port = service.getPrac1WSPort();
        return port.div(num1, num2);
    }
    
}
