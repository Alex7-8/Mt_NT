package Logica;

import Almacenamiento.Datos;

public class Proceso {

    public String Rec;
    Datos al = new Datos();
    public Proceso(String rec) {
       Rec = rec;
    }
    
    public String Resultado(Double Re){

        try {
              Re = Double.parseDouble(Rec);  
        } catch (Exception e) {
            return "0";
        }
//        if(Re.equals("")){
//        
//        }
        
    return null;
    }
        
}
