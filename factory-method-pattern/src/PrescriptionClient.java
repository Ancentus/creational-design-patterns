import creator.AnalgesicFactory;
import creator.AntibioticFactory;
import creator.MedicationFactory;
import product.Medication;

public class PrescriptionClient {
    public static void main(String[] args) {
        // Create an antibiotic using AntibioticFactory
        MedicationFactory antibioticFactory = new AntibioticFactory();
        Medication antibiotic = antibioticFactory.createMedication();
        antibiotic.prescribe();

        // Create an Analgesic using AnalgesicFactory
        MedicationFactory analgesicFactory = new AnalgesicFactory();
        Medication analgesic = analgesicFactory.createMedication();
        analgesic.prescribe();
    }
}
