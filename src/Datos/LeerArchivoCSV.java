
/*
 * Clase para leer el csv y realizar las operaciones de las 5 consultas basicas
 * 
 * Autores: Jorge Eduardo Cobo Ocampo, Mario Ochoa Arango, Katherin Andrea Palacio
 * 
 * Fecha: 13/11/2023
 */

package Datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LeerArchivoCSV {

    int año[] = new int[3];

    int cantEstados[] = new int[3];
    int cantTerritorialesNacionales[] = new int[2];
    int cantEntidadObligada[] = new int[2];
    int cantRama[] = new int[5];
    

    int entidadObligada[] = new int[6];
    int estado[] = new int[9];
    int ordenEntidad[] = new int[9];
    int ramaEntidad[] = new int[5];
    int postConflicto[] = new int[5];


    int[] meses_año = new int[3];

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
    
//---------------------------------------------------------------------------------------------------------
    
    public int[] cantidad_Ventas_Años_torta(){
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

    public int[] cantidad_Estados_Venta_torta(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        cantEstados[0] = 0;
        cantEstados[1] = 0;
        cantEstados[2] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.estado) {
                case "Emitida": cantEstados[0]++;                  
                    break;
                case "Cerrada": cantEstados[1]++;                  
                    break;
                case "Cancelada": cantEstados[2]++;
                    break;
            }
        }

        return cantEstados;                                      
    }

    //Territorial o Nacional en años
    public int[] cantitad_Territoriales_Nacionales_torta(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        cantTerritorialesNacionales[0] = 0;
        cantTerritorialesNacionales[1] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.ordenEntidad) {
                case "Territorial": cantTerritorialesNacionales[0]++;                  
                    break;
                case "Nacional": cantTerritorialesNacionales[1]++;                  
                    break;
            }
        }

        return cantTerritorialesNacionales;                                      
    }

    //Cantidad de ventas obligada o no obligada
    
    public int[] cantitad_Entidades_Obligadas_torta(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        cantEntidadObligada[0] = 0;
        cantEntidadObligada[1] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.entidadObligada) {
                case "Obligada": cantEntidadObligada[0]++;                  
                    break;
                case "No obligada": cantEntidadObligada[1]++;                  
                    break;
            }
        }

        return cantTerritorialesNacionales;                                      
    }

    //Rama entidad en años
    
    public int[] cantitad_Rama_Entidad_torta(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        cantRama[0] = 0;
        cantRama[1] = 0;
        cantRama[2] = 0;
        cantRama[3] = 0;
        cantRama[4] = 0;


        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.ramaEntidad) {
                case "Judicial": cantRama[0]++;                  
                    break;
                case "Legislativa": cantRama[1]++;                  
                    break;
                case "Ejecutiva": cantRama[2]++;                  
                    break;
                case "Organismos autonomos o independientes": cantRama[3]++;                  
                    break;
                case "-": cantRama[4]++; 
                    break;
            }
        }

        return cantRama;                                      
    }

    //-------------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------------------------------
    //Metodo solo para verificar que los datos si se leen
    public void listar(){
        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            System.out.println((i+1) + " es " + obj.toString());
        }
    }
}


