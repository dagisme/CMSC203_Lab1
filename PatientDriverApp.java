/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: This project tracks the patients detail and 
 *     medical data. It uses a clasess and different methods to
 *     record, store and print(display) the data 
 * Due: 02/25/2025
 * Platform/compiler: eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Dagim Abeje
*/



import java.lang.*;


 public class PatientDriverApp {
    /**
     * The main method that runs my program.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {


    	Patient patient = new Patient("Jenny", "Elaine", "Santori", 
                                     "123 Main Street", "MyTown", "CA", "01234", 
                                     "777-555-1212", "Bill Santori", "777-555-1212");

        Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019");
        Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5500.43);
        Procedure procedure3 = new Procedure();

        procedure1.setPractitionerName("Dr. Irvine");
        procedure1.setCharges(3250.0);
     
        
        procedure3.setProcedureDate("7/20/2019");
        procedure3.setProcedureName("Blood Test");
        procedure3.setPractitionerName("Dr. Smith");
        procedure3.setCharges(1400.75);

        displayPatient(patient);

        System.out.print("\n");
        
        displayProcedure(procedure1);
        
        System.out.print("\n");
        
        displayProcedure(procedure2);
        
        System.out.print("\n");
        
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charge: $%,.2f\n", totalCharges);


        System.out.println("\nStudent Name: Dagim Abeje");
        
        System.out.println("MC#: M21202929");
        System.out.println("Due Date: 02/25/2025");
        
    }

    
    /**
     * prints the procedure's information.
     * @param procedure The Procedure object whose information will be displayed
     */
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }
    
    
    /**
     * print the patient's information.
     * @param patient The Patient classe's object whose information will be displayed
     */
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    

    /**
     * Calculates the total charges for the 3 procedures.
     * @param procedure1 The first procedure
     * @param procedure2 The second procedure
     * @param procedure3 The third procedure
     * @return The total charges for the three procedures
     */
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}