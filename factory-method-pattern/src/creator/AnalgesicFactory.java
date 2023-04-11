package creator;

import product.Analgesic;
import product.Medication;

public class AnalgesicFactory implements MedicationFactory {

    @Override
    public Medication createMedication() {
        return new Analgesic();
    }
    
}
