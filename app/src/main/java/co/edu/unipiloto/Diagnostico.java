package co.edu.unipiloto;

public class Diagnostico {

    public static String getMediciones(String tipoDeEnfermedad){

        String  mediciones= "Temperatura corporal";

        switch(tipoDeEnfermedad){
            case "Diabetes":
                mediciones+=", niveles de glucosa en la sangre, agudeza visual.";
                break;
            case "Hipertensión":
                mediciones+=", presión arterial.";
                break;
            case "Insuficiencia cardíaca":
                mediciones+=", frecuencia cardiaca.";
        }

        return mediciones;
    }
}
