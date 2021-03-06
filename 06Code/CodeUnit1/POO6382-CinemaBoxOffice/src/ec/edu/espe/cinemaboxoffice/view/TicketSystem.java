/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import java.io.IOException;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class TicketSystem {

    public static void main(String[] args) throws IOException {
     
        Cover cover = new Cover();
        cover.run();
        
        InputValidation in = new InputValidation();
        AdminSystem adminSystem = new AdminSystem();
        CustomerSystem customerSystem = new CustomerSystem();
        
        boolean repeat = false;
        
        do {
            System.out.println("----CINEMA BOX OFFICE----");
            System.out.println(" 1: Admin \n 2: Customer \n 3: Exit");
            int option2 = in.getInt("Enter an option: ", 1);
            switch (option2) {
                case 1:
                    adminSystem.manager();
                    break;
                case 2:
                    customerSystem.seeBillboard();
                    break;
                case 3:
                    repeat = true;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (repeat == false);
    }
}
