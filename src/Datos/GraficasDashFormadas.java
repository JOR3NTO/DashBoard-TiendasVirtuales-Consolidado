/*
 * Clase para leer el csv y realizar las operaciones de las consultas que el usuario
 * puede formular dependiendo lo que escoja
 * 
 * Autores: Jorge Eduardo Cobo Ocampo, Mario Ochoa Arango, Katherin Andrea Palacio
 * 
 * Fecha: 13/11/2023
 */


package Datos;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.text.NumberFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.util.SortOrder;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficasDashFormadas {

    ChartPanel chartPanel, chartPanel2, chartPanel3, chartPanel4, chartPanel5, chartPanel6, chartPanel7, chartPanel8,chartPanel9;
    JFreeChart chart;
    

    String mes_fil,dia_fil,estadoOrden_fil,departamento_fil,sectorEntidad_fil,ramaEntidad_fil,ordenEntidad_fil;



    ArrayList<getDatos> inst = new ArrayList<>();

    int[] años_consulta = new int[3];
    int[] mes_consulta = new int[12];

    //Constructor
    public GraficasDashFormadas(String mes_fil, String dia_fil, String estadoOrden_fil, String departamento_fil, String sectorEntidad_fil, String ramaEntidad_fil, String ordenEntidad_fil) {
        this.mes_fil = mes_fil;
        this.dia_fil = dia_fil;
        this.estadoOrden_fil = estadoOrden_fil;
        this.departamento_fil = departamento_fil;
        this.sectorEntidad_fil = sectorEntidad_fil;
        this.ramaEntidad_fil = ramaEntidad_fil;
        this.ordenEntidad_fil = ordenEntidad_fil;
    }
    
    
    
    //Leer archivos CSV
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


    //-----------------------------------------------------------------------------------------

    //Consultas no fijas

    // ------------------------------------------------------------------------------------------
    //Cantidad de ventas X año
    public void cantidad_Ventas_Mes_torta_No_fijo(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < años_consulta.length; i++) años_consulta[i] = 0;
        
        getComboBoxes getMes = new getComboBoxes();
        int mesValue = getMes.getValueMes(mes_fil);

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021 -> años_consulta[0] += (mesValue == obj.getMes()) ? 1 : 0;
                case 2022 -> años_consulta[1] += (mesValue == obj.getMes()) ? 1 : 0;
                case 2023 -> años_consulta[2] += (mesValue == obj.getMes()) ? 1 : 0;
            }
        }  
    }

    //Grafica
    public void Grafico_Torta_No_Fija() {       
        DefaultPieDataset data = new DefaultPieDataset();

        data.setValue("2021", años_consulta[0]);
        data.setValue("2022", años_consulta[1]);
        data.setValue("2023", años_consulta[2]);

        chart = ChartFactory.createPieChart3D(
                mes_fil, // chart title
                data, // data
                true, // include legend
                true,
                false);

        chart.setBackgroundPaint(Color.white);// Color de fonde de la ventana
        chart.getTitle().setPaint(Color.black); // Dar color al titulo

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setLabelBackgroundPaint(Color.ORANGE);// Color de las etiquetas
        plot.setForegroundAlpha(0.60f);// Color de el fondo del grafico

        chartPanel = new ChartPanel(chart, false);
        chartPanel.setBounds(5, 5, 460, 375);
    }

    public ChartPanel getGraficoTorta() {
        return chartPanel;
    }

    //-----------------------------------------------------------------------------------------------


    // ------------------------------------------------------------------------------------------------
    //cantidad de ventas X año, consulta no fija
    public void cantidad_Ventas_Dia_Axi_No_fijo(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < años_consulta.length; i++) años_consulta[i] = 0;
        
        getComboBoxes getDia = new getComboBoxes();
        int diaValue = getDia.getValueDia(dia_fil);

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021 -> años_consulta[0] += (diaValue == obj.getDia()) ? 1 : 0;
                case 2022 -> años_consulta[1] += (diaValue == obj.getDia()) ? 1 : 0;
                case 2023 -> años_consulta[2] += (diaValue == obj.getDia()) ? 1 : 0;
            }
        }  
    }

    //Grafica
    public void Grafico_Axi_No_Fija() {        
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        data.setValue(años_consulta[0], "2021", "");
        data.setValue(años_consulta[1], "2022", "");
        data.setValue(años_consulta[2], "2023", "");

        DefaultCategoryDataset data2 = new DefaultCategoryDataset();


        chart = ChartFactory.createBarChart3D(
                "Cantidad de ventas el dia: "+dia_fil, // chart title
                "Años", // domain axis label
                "Cantidad de tiendas", // range axis label
                data, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true,
                false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setDataset(1, data2);
        plot.mapDatasetToRangeAxis(1, 1);

        CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setSeriesPaint(0, Color.red);
        plot.setRenderer(1, renderer2);

        chartPanel2 = new ChartPanel(chart, false);
        chartPanel2.setBounds(470, 385, 460, 375);
    }

    public ChartPanel getGraficoAxi() {
        return chartPanel2;
    }

    // ---------------------------------------------------------------------------------------------


    // ---------------------------------------------------------------------------------------------
    //Cantidad departamento X Año
    
    public void cantidad_Departamanto_Grafica_Area_No_Fija(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < años_consulta.length; i++) años_consulta[i] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021 -> años_consulta[0] += (departamento_fil.equalsIgnoreCase(obj.getCiudad())) ? 1 : 0;
                case 2022 -> años_consulta[1] += (departamento_fil.equalsIgnoreCase(obj.getCiudad())) ? 1 : 0;
                case 2023 -> años_consulta[2] += (departamento_fil.equalsIgnoreCase(obj.getCiudad())) ? 1 : 0;
            }
        } 
        
        System.out.println();

    }

    //Grafica
    public void Grafico_Area_No_Fija() {
        DefaultCategoryDataset data = new DefaultCategoryDataset(); // crear el conjunto de datos

        data.setValue(años_consulta[0], "2021", "");
        data.setValue(años_consulta[1], "2022", "");
        data.setValue(años_consulta[2], "2023", "");

        
        chart = ChartFactory.createStackedBarChart(
                "Cantidad de ventas en "+departamento_fil, 
                "Años", 
                "Tiendas Virtuales", 
                data,
                PlotOrientation.VERTICAL, 
                true, true, false);


        chartPanel3 = new ChartPanel(chart, false);
        chartPanel3.setBounds(5, 385, 460, 375);
    }

    public ChartPanel getGraficoArea() {
        return chartPanel3;
    }

    // --------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------
    //Cantidad estados X años
    
    public void cantidad_Estado_Grafica_No_Fija(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < años_consulta.length; i++) años_consulta[i] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021 -> años_consulta[0] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 2022 -> años_consulta[1] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 2023 -> años_consulta[2] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
            }
        } 
    }

    //Grafica
    public void Grafico_Lineal_No_Fija() {
        // crear el conjunto de datos
        DefaultKeyedValues data = new DefaultKeyedValues();

        data.setValue( "2021", años_consulta[0]);
        data.setValue( "2022", años_consulta[1]);
        data.setValue( "2023", años_consulta[2]);

        data.sortByValues(SortOrder.DESCENDING);
        
        KeyedValues cumulative = DataUtilities.getCumulativePercentages(data);
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("Ventas", data);
        
        chart = ChartFactory.createBarChart(
                "cantidad de ventas: "+estadoOrden_fil+"s",  // chart title
                "Estado",         // domain axis label
                "Cantidad vendida", // range axis label
                dataset,            // data
                PlotOrientation.VERTICAL,
                true, true, false);
        
        CategoryPlot plot = chart.getCategoryPlot();
        
        LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
        plot.setRenderer(1, renderer2);
        
        CategoryDataset dataset2 = DatasetUtilities.createCategoryDataset("Acumulativo", cumulative);
        NumberAxis axis2 = new NumberAxis("Porcentaje");
        axis2.setNumberFormatOverride(NumberFormat.getPercentInstance());
        plot.setRangeAxis(1, axis2);
        plot.setDataset(1, dataset2);
        plot.mapDatasetToRangeAxis(1, 1);


        chartPanel4 = new ChartPanel(chart, false);
        chartPanel4.setBounds(470, 5, 460, 375);
    }

    public ChartPanel getGraficoLineal() {
        return chartPanel4;
    }
    // ---------------------------------------------------------------------------------------------


    // --------------------------------------------------------------------------------------------
    //Cantidad sector entidad X año

    public void cantidad_Sector_Entidad_Barra_No_Fija(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < años_consulta.length; i++) años_consulta[i] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021 -> años_consulta[0] += (sectorEntidad_fil.equalsIgnoreCase(obj.getSectorEntidad())) ? 1 : 0;
                case 2022 -> años_consulta[1] += (sectorEntidad_fil.equalsIgnoreCase(obj.getSectorEntidad())) ? 1 : 0;
                case 2023 -> años_consulta[2] += (sectorEntidad_fil.equalsIgnoreCase(obj.getSectorEntidad())) ? 1 : 0;
            }
        } 
        
    }

    public void Grafico_Barras_No_Fija(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(años_consulta[0], "2021", "");
        dataset.addValue(años_consulta[1], "2022", "");
        dataset.addValue(años_consulta[2], "2023", "");

        
        chart = ChartFactory.createWaterfallChart("Sector:"+sectorEntidad_fil, 
                "Años", 
                "Cantidad de tiendas",
                dataset, 
                PlotOrientation.VERTICAL, 
                true,true, false);
        
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        p.setDomainGridlinesVisible(true);
        p.setDomainGridlinePaint(Color.black);

        chartPanel5 = new ChartPanel(chart, false);
        chartPanel5.setBounds(935, 5, 460, 375);


    }

    public ChartPanel getGraficoBarras() {
        return chartPanel5;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------
    
    // -------------------------------------------------------------------------------------------------------------------
    //Consulta no fija rama de la entidad

    public void cantidad_Rama_Entidad_Polar_No_Fija(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < años_consulta.length; i++) años_consulta[i] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021 -> años_consulta[0] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 2022 -> años_consulta[1] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 2023 -> años_consulta[2] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
            }
        } 
        
    }

    public void Grafico_Polar_No_Fija(){
        XYSeries s1 = new XYSeries("2021 - 2022 - 2023");
        s1.add(0.0, años_consulta[0]);
        s1.add(90.0, años_consulta[1]);
        s1.add(180.0, años_consulta[2]);


        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s1);

        chart = ChartFactory.createPolarChart(
                "Ejemplo Grafico Polar", 
                dataset,
                true,
                true,
                false);

        chartPanel6 = new ChartPanel(chart, false);
        chartPanel6.setBounds(935, 385, 460, 375);


    }

    public ChartPanel getGraficoPolar() {
        return chartPanel6;
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------
   
    // --------------------------------------------------------------------------------
    //Consulta no fija rama de la entidad

    public void cantidad_Orden_Entidad_Lineal_No_Fija(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < años_consulta.length; i++) años_consulta[i] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.año) {
                case 2021 -> años_consulta[0] += (ordenEntidad_fil.equalsIgnoreCase(obj.getOrdenEntidad())) ? 1 : 0;
                case 2022 -> años_consulta[1] += (ordenEntidad_fil.equalsIgnoreCase(obj.getOrdenEntidad())) ? 1 : 0;
                case 2023 -> años_consulta[2] += (ordenEntidad_fil.equalsIgnoreCase(obj.getOrdenEntidad())) ? 1 : 0;
            }
        } 
        
    }

    public void Grafico_Lineal2_No_Fija(){
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        data.setValue(años_consulta[0],"","2021");
        data.setValue(años_consulta[1],"","2022");
        data.setValue(años_consulta[2],"","2023");

        chart = ChartFactory.createLineChart(
                "Ventas orden: "+ordenEntidad_fil, // T�tulo
                "Años", // Etiqueta Coordenada X
                "Cantidad de tiendas", // Etiqueta Coordenada Y
                data, // Datos
                PlotOrientation.VERTICAL,
                true, // Muestra la leyenda de los productos en el eje de la X
                true,// mostrar la leyenda en cada punto
                false
        );

        chartPanel7 = new ChartPanel(chart, false);
        chartPanel7.setBounds(5, 765, 460, 375);


    }

    public ChartPanel getGraficoLineal2() {
        return chartPanel7;
    }

    //---------------------------------------------------------------------------------------------------------------------
    //Consulta no fija estado de orden X mes

    public void cantidad_EstadoDeLaOrden_X_Mes_No_Fija(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < mes_consulta.length; i++) mes_consulta[i] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.mes) {
                case 1 -> mes_consulta[0] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 2 -> mes_consulta[1] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 3 -> mes_consulta[2] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 4 -> mes_consulta[3] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 5 -> mes_consulta[4] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 6 -> mes_consulta[5] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 7 -> mes_consulta[6] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 8 -> mes_consulta[7] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 9 -> mes_consulta[8] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 10 -> mes_consulta[9] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 11 -> mes_consulta[10] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
                case 12 -> mes_consulta[11] += (estadoOrden_fil.equalsIgnoreCase(obj.getEstado())) ? 1 : 0;
            }
        } 
        
    }

    public void Grafico_TortaPartida_No_Fija(){
        
        DefaultPieDataset data = new DefaultPieDataset();
        //data.setValue(años_consulta[0],"","2021");
        //data.setValue(años_consulta[1],"","2022");
        //data.setValue(años_consulta[2],"","2023");

        data.setValue("01", mes_consulta[0]);
        data.setValue("02", mes_consulta[1]);
        data.setValue("03", mes_consulta[2]);
        data.setValue("04", mes_consulta[3]);
        data.setValue("05", mes_consulta[4]);
        data.setValue("06", mes_consulta[5]);
        data.setValue("07", mes_consulta[6]);
        data.setValue("08", mes_consulta[7]);
        data.setValue("09", mes_consulta[8]);
        data.setValue("10", mes_consulta[9]);
        data.setValue("11", mes_consulta[10]);
        data.setValue("12", mes_consulta[11]);

        chart = ChartFactory.createPieChart(
                "Ventas "+estadoOrden_fil+"s por meses", //Titulo del grafico
                data, //data
                true, //Leyenda
                true,
                false);

        //pintura
        chart.setBackgroundPaint(Color.WHITE);//Color de fonde de la ventana
        chart.getTitle().setPaint(Color.blue); //Dar color al titulo
        chartPanel8 = new ChartPanel(chart, false);
        chartPanel8.setBounds(470, 765, 460, 375);


    }

    public ChartPanel getGraficoTortaPartida() {
        return chartPanel8;
    }


    // --------------------------------------------------------------------------------
    //Consulta no fija rama de la entidad X mes

    public void cantidad_Rama_Entidad_X_Mes_Axis_No_Fija(){
        Leer_Archivo("csv/TiendasVirtualesConsolidadoDepurado.csv");
        for (int i = 0; i < mes_consulta.length; i++) mes_consulta[i] = 0;

        for (int i = 0; i < inst.size(); i++) {
            getDatos obj = inst.get(i);
            switch (obj.mes) {
                case 1 -> mes_consulta[0] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 2 -> mes_consulta[1] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 3 -> mes_consulta[2] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 4 -> mes_consulta[3] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 5 -> mes_consulta[4] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 6 -> mes_consulta[5] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 7 -> mes_consulta[6] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 8 -> mes_consulta[7] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 9 -> mes_consulta[8] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 10 -> mes_consulta[9] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 11 -> mes_consulta[10] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
                case 12 -> mes_consulta[11] += (ramaEntidad_fil.equalsIgnoreCase(obj.getRamaEntidad())) ? 1 : 0;
            }
        } 
        
    }

    public void Grafico_Axis_No_Fija(){
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        data.setValue(mes_consulta[0],"","01");
        data.setValue(mes_consulta[1],"","02");
        data.setValue(mes_consulta[2],"","03");
        data.setValue(mes_consulta[3],"","04");
        data.setValue(mes_consulta[4],"","05");
        data.setValue(mes_consulta[5],"","06");
        data.setValue(mes_consulta[6],"","07");
        data.setValue(mes_consulta[7],"","08");
        data.setValue(mes_consulta[8],"","09");
        data.setValue(mes_consulta[9],"","10");
        data.setValue(mes_consulta[10],"","11");
        data.setValue(mes_consulta[11],"","12");

        chart = ChartFactory.createAreaChart(
                "Ventas rama de la entidad: "+ramaEntidad_fil, // T�tulo
                "Meses", // Etiqueta Coordenada X
                "Cantidad de tiendas", // Etiqueta Coordenada Y
                data, // Datos
                PlotOrientation.VERTICAL,
                true, // Muestra la leyenda de los productos en el eje de la X
                true,// mostrar la leyenda en cada punto
                false
        );

        chartPanel9 = new ChartPanel(chart, false);
        chartPanel9.setBounds(935, 765, 460, 375);


    }

    public ChartPanel getGraficoAxis() {
        return chartPanel9;
    }

    //---------------------------------------------------------------------------------------------------------------------
    
}

