package com.example.eya_hassairi_mesure_glycmie.model;

public class Patient {
    private int age;
    private boolean isFasting;
    private float valeurMesuree;
    private String result;
    // methode update (controller -->model)

    public Patient(int age, float valeurMesuree, boolean isFasting) {
        this.age = age;
        this.isFasting = isFasting;
        this.valeurMesuree = valeurMesuree;
        calculer ();
    }

    public void calculer ()
    {
        

        if(isFasting) {
            if (age >= 13) {
                if (valeurMesuree < 5.0)
                    result="Niveau de glycemie est trop bas";
                else if (valeurMesuree >= 5.0 && valeurMesuree <= 7.2)
                    result="Niveau de glycemie est normale";
                else
                    result="Niveau de glycemie est trop eleve";
            } else if (age >= 6 && age <= 12) {
                if (valeurMesuree < 5.0)
                    result="Niveau de glycemie est trop bas";
                else if (valeurMesuree >= 5.0 && valeurMesuree <= 10.0)
                    result="Niveau de glycemie est normale";
                else
                    result="Niveau de glycemie est trop eleve";
            } else if (age < 6) {
                if (valeurMesuree < 5.5)
                    result="Niveau de glycemie est trop bas";
                else if (valeurMesuree >= 5.5 && valeurMesuree <= 10.0)
                    result="Niveau de glycemie est normale";
                else
                    result="Niveau de glycemie est trop eleve";
            }
        } else {
            if (valeurMesuree > 10.5)
                result="Niveau de glycemie est trop eleve";
            else
                result="Niveau de glycemie est normale";
        }
    }

    //methode Notify ( du model au controleur )
    //on va generer un getter pour "result" (attribut de classe)

    public String getResult() {
        return result;
    }
}
