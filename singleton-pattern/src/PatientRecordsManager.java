public class PatientRecordsManager {
    // Static instance variable to hold the singleton object
    private static PatientRecordsManager instance;

    // Private constructor to prevent instantiation from outside the class
    private PatientRecordsManager() {
        System.out.println("PatientRecordsManager instance created");
    }

    // Public method to get the singleton instance
    public static PatientRecordsManager getInstance() {
        if (instance == null) {
            instance = new PatientRecordsManager();
        }
        return instance;
    }

    // Example method to demonstrate the singleton instance
    public void addPatientRecord(String patientName, String diagnosis) {
        System.out.println("Added patient record: Name = " + patientName +
                ", Diagnosis = " + diagnosis);
    }

    // Example method to demonstrate the singleton instance
    public void viewPatientRecords(String patientName){
        System.out.println("Viewing patient record for: " + patientName);
    }
}
