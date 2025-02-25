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



public class Patient {
	private String first_name;
	private String middle_name;
	private String last_name;
	private String street;
	private String city;
	private String state;
	private String zip_code;
	private String phone_number;
	private String emergency_contact_name;
	private String emergency_contact_phone;
	
	/**
     * No-arg constructor and this also initializes all attributes to empty strings.
     */
	public Patient() {
        this.first_name = "";
        this.middle_name = "";
        this.last_name = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip_code = "";
        this.phone_number = "";
        this.emergency_contact_name = "";
        this.emergency_contact_phone = "";
    }

	/**
     * Constructor that initializes the attributes for name pf the patient.
     * @param firstName is the patient's first name
     * @param middleName is the patient's middle name
     * @param lastName is the patient's last name
     */
    public Patient(String firstName, String middleName, String lastName) {
        this.first_name = firstName;
        this.middle_name = middleName;
        this.last_name = lastName;
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip_code = "";
        this.phone_number = "";
        this.emergency_contact_name = "";
        this.emergency_contact_phone = "";
    }

    /**
     * Constructor that initializes all attributes of the patient.
     * @param firstName is the patient's first name
     * @param middleName is the patient's middle name
     * @param lastName is the patient's last name
     * @param streetAddress is the patient's street address
     * @param city is the patient's city
     * @param state is the patient's state
     * @param zipCode is the patient's ZIP code
     * @param phoneNumber is the patient's phone number
     * @param emergencyContactName is the emergency contact person's name
     * @param emergencyContactPhone is the emergency contact person's phone number
     */
    public Patient(String firstName, String middleName, String lastName, 
                   String streetAddress, String city, String state, String zipCode, 
                   String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.first_name = firstName;
        this.middle_name = middleName;
        this.last_name = lastName;
        this.street = streetAddress;
        this.city = city;
        this.state = state;
        this.zip_code = zipCode;
        this.phone_number = phoneNumber;
        this.emergency_contact_name = emergencyContactName;
        this.emergency_contact_phone = emergencyContactPhone;
    }
    
    /**
     * Returns the patient's first name.
     * @return The patient's first name
     */
    public String getFirstName() {
    		return first_name;
   	}
   
    /**
     * Returns the patient's middle name.
     * @return The patient's middle name
     */
    public String getMiddleName() {
        return middle_name;
    }

    /**
     * Returns the patient's last name.
     * @return The patient's last name
     */
    public String getLastName() {
        return last_name;
    }

    /**
     * Returns the patient's street address.
     * @return The patient's street address
     */
    public String getStreetAddress() {
        return street;
    }

    /**
     * Returns the patient's city.
     * @return The patient's city
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the state that the patient lives in.
     * @return The patient's state
     */
    public String getState() {
        return state;
    }

   

    /**
     * Returns the patient's phone number.
     * @return The patient's phone number
     */
    public String getPhoneNumber() {
        return phone_number;
    }
    
    /**
     * Returns the ZIP code of the patient.
     * @return The patient's ZIP code
     */
    public String getZipCode() {
        return zip_code;
    }

    /**
     * Returns the name of the patient's emergency contact.
     * @return The name of the emergency contact
     */
    public String getEmergencyContactName() {
        return emergency_contact_name;
    }

    /**
     * Returns the phone number of the patient's emergency contact.
     * @return The phone number of the emergency contact
     */
    public String getEmergencyContactPhone() {
        return emergency_contact_phone;
    }

    /**
     * Sets the patient's first name.
     * @param firstName The patient's first name
     */
    public void setFirstName(String firstName) {
    	this.first_name = firstName;
    }
    
    /**
     * Sets the patient's middle name.
     * @param middleName The patient's middle name
     */
    public void setMiddleName(String middleName) {
    	this.middle_name = middleName;
    }
    
    /**
     * Sets the last name of the patient.
     * @param lastName The patient's last name
     */
    public void setLastName(String lastName) { 
    	this.last_name = lastName;
    }
    
    /**
     * Sets the street address of the patient.
     * @param streetAddress The patient's street address
     */
    public void setStreetAddress(String streetAddress) {
    
    	this.street= streetAddress;
    	
    }
    
    
    /**
     * Sets the patient's state.
     * @param state what state the patient is from
     */
    public void setState(String state) {
    	
    	this.state = state;
    
    }
    
    /**
     * Sets the city of the patient.
     * @param city what city the patient is from
     */
    public void setCity(String city) { 
    	
    	this.city = city;
    	
    }
    
    /**
     * Sets the patient's ZIP code.
     * @param zipCode T'he ZIP code of the patient
     */
    public void setZipCode(String zipCode) {
        this.zip_code = zipCode;
    }

    /**
     * Sets the patient's phone number.
     * @param phoneNumber The phone number of the patient
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    /**
     * Sets the name of the patient's emergency contact.
     * @param emergencyContactName The name of the emergency contact
     */
    public void setEmergencyContactName(String emergencyContactName) {
        this.emergency_contact_name = emergencyContactName;
    }

    /**
     * Sets the phone number of the patient's emergency contact.
     * @param emergencyContactPhone The phone number of the emergency contact
     */
    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergency_contact_phone = emergencyContactPhone;
    }

    /**
     * this builds and returns the full name of the patient.
     * @return A string containing the full name of the patient
     */
    public String buildFullName() {
        return first_name + " " + middle_name + " " + last_name;
    }

    /**
     * Method that builds and returns the full address of the patient.
     * @return A string containing the full address of the patient
     */
    
    public String buildAddress() {
        return street + ", " + city + ", " + state + " " + zip_code;
    }

    /**
     * Method that builds and returns the emergency contact details.
     * @return A string containing the emergency contact name and phone number
     */
    public String buildEmergencyContact() {
        return emergency_contact_name + " - " + emergency_contact_phone;
    }
    
    /**
     * Returns a formatted string containing all patient details.
     * @return A string representation of the patient's information
     */
    public String toString() {
        return "Patient Information:\n" +
               "Full Name: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Phone Number: " + phone_number + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }
    
}
