package com.example.eya_hassairi_mesure_glycmie.controller;
import com.example.eya_hassairi_mesure_glycmie.model.Patient;

public final class Controller {
    private static Patient patient;
    private static Controller instance=null;
    private Controller ()
    {
        super();
    }
    public static final Controller getInstance()

    {
        if (instance == null)
            instance=new Controller();
        return instance;
    }

    //methode userAction (du view au controller)
public static void createPatient(int age, float valeurMesuree, boolean isFasting)
{
    //methode update (du controller au model)
    patient=new Patient(age ,valeurMesuree ,isFasting);
}
//methode notify (du controller au view)
    public String getResponse()
    {
        return patient.getResult();
    }
}
