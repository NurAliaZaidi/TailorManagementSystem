/*
 * Assignment 1
 * Name             : Nur Alia Shahira binti Mohd Zaidi
 * Student ID       : CB19141
 * Section          : 04B
 * Project Title    : TailorManagementSystem
 */
package tailormanagementsystem;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TailorManagementSystem {
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Staff staff;
        Customer customer = new Customer();
        Booking booking = new Booking();
        Manager maneger = new Manager(booking);
        
        
        //Array of object Tailor downcasting
        Staff[] tailor = new Tailor[3];
        //Set tailor info
        tailor[0] = new Tailor();
        tailor[0].setStaffName("Sofia");
        tailor[0].setStaffID("T001");
        tailor[0].setPosition("Tailor");
        
        tailor[1] = new Tailor();
        tailor[1].setStaffName("Ayu");
        tailor[1].setStaffID("T002");
        tailor[1].setPosition("Tailor");
        
        tailor[2] = new Tailor();
        tailor[2].setStaffName("Fatimah");
        tailor[2].setStaffID("T003");
        tailor[2].setPosition("Tailor");
        
        
        MainPage form = new MainPage(customer, booking, maneger, tailor);
        form.setVisible(true);
          
    }
    
}
