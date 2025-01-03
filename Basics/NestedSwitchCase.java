package Basics;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Employee id: ");
        int empId = in.nextInt();
        String department = "None";
        if (empId == 3) {
            System.out.println("Enter the department: ");
            department = in.next();
        }
        switch(empId){
            case 1:
                System.out.println("Manya Tuli");
                break;
            case 2:
                System.out.println("Shaurya Tuli");
                break;
            case 3:
                System.out.println("Keira Bhakhri");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department allocated");
                }
                break;
            default:
                System.out.println("Employee not registered");
        }

    }
}
