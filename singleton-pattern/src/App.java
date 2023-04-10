public class App {
    public static void main(String[] args) {
        // Get the singleton instance of PatientRecordManager
        PatientRecordsManager recordsManager1 = PatientRecordsManager.getInstance();

        // Call methods on the singleton instance
        recordsManager1.addPatientRecord("John Doe", "Fever");
        recordsManager1.viewPatientRecords("John Doe");

        // Try to create another instance (which should be the same as recordsManager1)
        PatientRecordsManager recordsManager2 = PatientRecordsManager.getInstance();

        // Call methods on the new instance
        recordsManager2.addPatientRecord("Jane Smith", "Headache");
        recordsManager2.viewPatientRecords("Jane Smith");

        // Check if recordsManager1 and recordsManager2 are the same instance
        System.out.println("recordsManager1 == recordsManager2 : " +
                (recordsManager1 == recordsManager2));
    }
}
