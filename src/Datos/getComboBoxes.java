
/*
 * Clase para retornar valores de algunos comboBoxes para evitar hacer muchas validaciones
 * 
 * Autores: Jorge Eduardo Cobo Ocampo, Mario Ochoa Arango, Katherin Andrea Palacio
 * Fecha: 13/11/2023
 */

package Datos;

import java.util.HashMap;
import java.util.Map;

public class getComboBoxes {

    public int getValueAño(String año) {
        Map<String, Integer> findAño = new HashMap<>();
        findAño.put("2021", 1);
        findAño.put("2022", 2); 
        findAño.put("2023", 3);
        findAño.put("-", 0);
        return findAño.getOrDefault(año, 0);
    }

    public int getValueMes(String mes) {
        Map<String, Integer> findMes = new HashMap<>();
        findMes.put("-", 0);
        findMes.put("Enero", 1);
        findMes.put("Febrero", 2);
        findMes.put("Marzo", 3);
        findMes.put("Abril", 4);
        findMes.put("Mayo", 5);
        findMes.put("Junio", 6);
        findMes.put("Julio", 7);
        findMes.put("Agosto", 8);
        findMes.put("Septiembre", 9);
        findMes.put("Octubre", 10);
        findMes.put("Noviembre", 11);
        findMes.put("Diciembre", 12);
        
        return findMes.getOrDefault(mes, 0);
    }

    public int getValueDia(String dia) {
        Map<String, Integer> findDia = new HashMap<>();
        for (int i = 1; i <= 31; i++) {
            findDia.put(String.valueOf(i), i);
        }
    
        return findDia.getOrDefault(dia, 0);
    }

    public int getDaysInMonth(String month) {
        // Define un mapa que asocia los nombres de los meses con la cantidad de días
        Map<String, Integer> daysInMonths = new HashMap<>();
        daysInMonths.put("Enero", 31);
        daysInMonths.put("Febrero", 29); // Puedes manejar años bisiestos por separado
        daysInMonths.put("Marzo", 31);
        daysInMonths.put("Abril", 30);
        daysInMonths.put("Mayo", 31);
        daysInMonths.put("Junio", 30);
        daysInMonths.put("Julio", 31);
        daysInMonths.put("Agosto", 31);
        daysInMonths.put("Septiembre", 30);
        daysInMonths.put("Octubre", 31);
        daysInMonths.put("Noviembre", 30);
        daysInMonths.put("Diciembre", 31);

        // Retorna la cantidad de días en base al mes seleccionado
        return daysInMonths.getOrDefault(month, 0);
    }
    
}
