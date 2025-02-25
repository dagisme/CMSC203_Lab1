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


public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    /**
     * No-arg constructor that initializes all fields to default values.
     */
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.charges = 0.0;
    }

    /**
     * Constructor that initializes the procedure's name and date.
     * @param procedureName The name of the procedure
     * @param procedureDate The date of the procedure
     */
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = "";
        this.charges = 0.0;
    }

    /**
     * Constructor that initializes all fields of the procedure.
     * @param procedureName The name of the procedure
     * @param procedureDate The date of the procedure
     * @param practitionerName The name of the practitioner who performed the procedure
     * @param charges The charges for the procedure
     */
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

     /**
     * Returns the name of the procedure.
     * @return The name of the procedure
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * Returns the date of the procedure.
     * @return The date of the procedure
     */
    public String getProcedureDate() {
        return procedureDate;
    }

    /**
     * Returns the name of the practitioner who performed the procedure.
     * @return The name of the practitioner
     */
    public String getPractitionerName() {
        return practitionerName;
    }

    /**
     * Returns the charges for the procedure.
     * @return The charges for the procedure
     */
    public double getCharges() {
        return charges;
    }

    // Mutators (setters)

    /**
     * Sets the name of the procedure.
     * @param procedureName The name of the procedure
     */
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    /**
     * Sets the date of the procedure.
     * @param procedureDate The date of the procedure
     */
    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    /**
     * Sets the name of the practitioner who performed the procedure.
     * @param practitionerName The name of the practitioner
     */
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    /**
     * Sets the charges for the procedure.
     * @param charges The charges for the procedure
     */
    public void setCharges(double charges) {
        this.charges = charges;
    }

    /**
     * Returns a formatted string containing all details of the procedure.
     * @return A string representation of the procedure's information
     */
    @Override
    public String toString() {
        return "\tProcedure: " + procedureName + "\n" +
               "\tProcedure Date: " + procedureDate + "\n" +
               "\tPractitioner: " + practitionerName + "\n" +
               "\tCharge: " + String.format("$%.2f", charges);
    }
}

