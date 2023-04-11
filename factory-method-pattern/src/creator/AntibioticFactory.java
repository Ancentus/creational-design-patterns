package creator;

import product.Antibiotic;
import product.Medication;

public class AntibioticFactory implements MedicationFactory {

    @Override
    public Medication createMedication() {
        return new Antibiotic();
    }
    
}
