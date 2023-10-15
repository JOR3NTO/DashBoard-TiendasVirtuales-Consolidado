package Datos;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LeerArchivoCSV {

    int año[] = new int[3];
    int entidadObligada[] = new int[6];
    int estado[] = new int[9];
    int ordenEntidad[] = new int[9];
    int ramaEntidad[] = new int[5];
    int postConflicto[] = new int[5];

    ArrayList<getDatos> inst = new ArrayList<>();

    public void Leer_Archivo(String nomFile) {
        FileReader fr = null;
        boolean error = false;
        try {
            fr = new FileReader(nomFile);
        } catch (Exception e) {
            error = true;
            System.out.println(e);
        }
        if (!error) {
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            String tokens[];
            int fila = 1;
            try {
                while ((linea = br.readLine()) != null) {
                    //System.out.println(fila + " - " + linea);
                    tokens = linea.split(",");
                    inst.add(new getDatos(
                            Integer.parseInt(tokens[0]), 
                            Integer.parseInt(tokens[1]), 
                            Integer.parseInt(tokens[2]),
                            tokens[3],
                            Integer.parseInt(tokens[4]),
                            tokens[5],
                            tokens[6],
                            tokens[7],
                            Double.parseDouble(tokens[8]),
                            tokens[9],
                            Double.parseDouble(tokens[10]),
                            tokens[11],
                            tokens[12],
                            Double.parseDouble(tokens[13]),
                            Double.parseDouble(tokens[14])
                            ));
                    fila++;
                }
            } catch (Exception e) {
                System.out.println("Error en la fila = " + fila + "\n" + e);
            }
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public int[] cantidadVentasXAño(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        año[0] = 0;
        año[1] = 0;
        año[2] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021: año[0]++;                  
                    break;
                case 2022: año[1]++;                  
                    break;
                case 2023: año[2]++;
                    break;
            }
        }

        return año;                                      
    }
    
    public int[] cantidadEntidadesObligadas(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        
        for (int i = 0; i < entidadObligada.length; i++) {
            entidadObligada[i] = 0;
        }
        
        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021:
                    if(obj.entidadObligada.equals("Obligada")){
                        entidadObligada[0]++;                        
                    }else entidadObligada[1]++;
                   
                break;
                
                case 2022:
                    if(obj.entidadObligada.equals("Obligada")){
                        entidadObligada[2]++;                        
                    }else entidadObligada[3]++;
                break;
                
                case 2023:
                    if(obj.entidadObligada.equals("Obligada")){
                        entidadObligada[4]++;                        
                    }else entidadObligada[5]++;
                break;
            }
        }
        
        return entidadObligada;                                      
    }
    
    public int[] cantidadTerritorialesONacionales(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        
        for (int i = 0; i < ordenEntidad.length; i++) {
            ordenEntidad[i] = 0;
        }
        
        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021:
                    if(obj.ordenEntidad.equals("Territorial")) ordenEntidad[0]++;        
                    else if(obj.ordenEntidad.equals("Nacional")) ordenEntidad[1]++;
                    else ordenEntidad[2]++;                   
                break;
                
                case 2022:
                    if(obj.ordenEntidad.equals("Territorial")) ordenEntidad[3]++;        
                    else if(obj.ordenEntidad.equals("Nacional")) ordenEntidad[4]++;
                    else ordenEntidad[5]++;                   
                break;
                
                case 2023:
                    if(obj.ordenEntidad.equals("Territorial")) ordenEntidad[6]++;        
                    else if(obj.ordenEntidad.equals("Nacional")) ordenEntidad[7]++;
                    else ordenEntidad[8]++;                   
                break;
            }
        }
        
        return ordenEntidad;                                      
    }

    public int[] estado(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < entidadObligada.length; i++) {
            estado[i] = 0;
        }

        //Recuerda que son 3, emitida, cerrada o cancelada
        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021:
                    if(obj.estado.equals("Emitida")) estado[0]++;                        
                    else if(obj.estado.equals("Cerrada")) estado[1]++;
                    else estado[2]++;
                break;
                
                case 2022:
                    if(obj.estado.equals("Emitida")) estado[3]++;                        
                    else if(obj.estado.equals("Cerrada")) estado[4]++;
                    else estado[5]++;
                break;
                
                case 2023:
                    if(obj.estado.equals("Emitida")) estado[6]++;                        
                    else if(obj.estado.equals("Cerrada")) estado[7]++;
                    else estado[8]++;
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"ERROR AL CALCULAR EL ESTADO DE LAS COMPRAS");
                    break;
            }
        }
        return estado;
    }

    
    
    public int[] ramaEntidad(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        ramaEntidad[0] = 0;
        ramaEntidad[1] = 0;
        ramaEntidad[2] = 0;
        ramaEntidad[3] = 0;
        ramaEntidad[4] = 0;
        
        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.ramaEntidad) {
                case "Ejecutiva":   ramaEntidad[0]++;                  
                    break;
                case "Judicial":  ramaEntidad[1]++;                  
                    break;
                case "Legislativa":  ramaEntidad[2]++;
                    break;
                case "No Definido":  ramaEntidad[3]++;
                    break;
                case "Organismos autonomos o idependientes":  ramaEntidad[4]++;
                    break;
            }
        }

        return ramaEntidad;
    }

    public int[] postConflicto(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        postConflicto[0] = 0;
        postConflicto[1] = 0;

        
        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.postConflicto) {
                case "Definida":   postConflicto[0]++;                  
                    break;
                case "No Definida":  postConflicto[1]++;                  
                    break;
            }
        }
        
        return postConflicto;                                      
    }





    public void listar(){
        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            System.out.println((i+1) + " es " + obj.toString());
        }
    }
}


