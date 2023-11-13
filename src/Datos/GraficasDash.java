package Datos;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class GraficasDash extends JPanel {

    ChartPanel chartPanel, chartPanel2, chartPanel3, chartPanel4, chartPanel5;
    JFreeChart chart;

    // --------------------------------------------------------------------------------
    //Consulta fija
    public void GraficoTorta1(String value[], int key) {
        LeerArchivoCSV cant = new LeerArchivoCSV();
        
        DefaultPieDataset data = new DefaultPieDataset();

        switch (key) {
            case 1:
                cant.cantidad_Ventas_Años_torta();
                for (int i = 0; i < value.length; i++) {
                    data.setValue(value[i], cant.año[i]);
                }
                
                break;
            case 2:
                cant.cantidad_Estados_Venta_torta();
                for (int i = 0; i < value.length; i++) {
                    data.setValue(value[i], cant.cantEstados[i]);
                }
                
                break;
            case 3:
                cant.cantitad_Territoriales_Nacionales_torta();
                for (int i = 0; i < value.length; i++) {
                    data.setValue(value[i], cant.cantTerritorialesNacionales[i]);
                }
                
                break;
            case 4:
                cant.cantitad_Entidades_Obligadas_torta();
                for (int i = 0; i < value.length; i++) {
                    data.setValue(value[i], cant.cantEntidadObligada[i]);
                }
                break;
            case 5:
                cant.cantitad_Rama_Entidad_torta();
                for (int i = 0; i < value.length; i++) {
                    data.setValue(value[i], cant.cantRama[i]);
                }
                
                break;
        }

        chart = ChartFactory.createPieChart3D(
                "Cantidad de ventas", // chart title
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

        //100 + 70
    }

    public ChartPanel getGraficoTorta1() {
        return chartPanel;
    }
    // --------------------------------------------------------------------------------
    
    
    // --------------------------------------------------------------------------------
    //Consulta fija
    public void GraficoAxis1(String value[], int key) {
        LeerArchivoCSV cant = new LeerArchivoCSV();
        //entidadObligada.cantidadEntidadesObligadas();
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        switch (key) {
            case 1:
                cant.cantidad_Ventas_Años_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.año[i], value[i], "");
                }
            
                break;
            case 2:
                cant.cantidad_Estados_Venta_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantEstados[i], value[i], "");
                }
                
                break;
            case 3:
                cant.cantitad_Territoriales_Nacionales_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantTerritorialesNacionales[i], value[i],"");
                }
                
                break;
            case 4:
                cant.cantitad_Entidades_Obligadas_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantEntidadObligada[i],value[i],"");
                }
                break;
            case 5:
                cant.cantitad_Rama_Entidad_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantRama[i],value[i],"");
                }
                
                break;
        }

        DefaultCategoryDataset data2 = new DefaultCategoryDataset();

        chart = ChartFactory.createBarChart3D(
                "Cantidad de ventas", // chart title
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

    public ChartPanel getGraficoAxis1() {
        return chartPanel2;
    }
    // --------------------------------------------------------------------------------

    
    // --------------------------------------------------------------------------------
    //Consulta fija
    public void GraficoArea1(String value[], int key) {
        LeerArchivoCSV cant = new LeerArchivoCSV();
        //estadoCompra.estado();
        DefaultCategoryDataset data = new DefaultCategoryDataset(); // crear el conjunto de datos

        // crear la categoria de Ford

        switch (key) {
            case 1:
                cant.cantidad_Ventas_Años_torta();
                for (int i = value.length-1; i >= 0; i--) {
                    data.setValue(cant.año[i], value[i], "");
                }
            
                break;
            case 2:
                cant.cantidad_Estados_Venta_torta();
                for (int i = 0; i < value.length; i++) {
                    data.setValue(cant.cantEstados[i], value[i], "");
                }
                
                break;
            case 3:
                cant.cantitad_Territoriales_Nacionales_torta();
                for (int i = value.length-1; i >=0; i--) {
                    data.setValue(cant.cantTerritorialesNacionales[i], value[i],"");
                }
                
                break;
            case 4:
                cant.cantitad_Entidades_Obligadas_torta();
                for (int i = 0; i < value.length; i++) {
                    data.setValue(cant.cantEntidadObligada[i],value[i],"");
                }
                break;
            case 5:
                cant.cantitad_Rama_Entidad_torta();
                
                data.setValue(cant.cantRama[2],value[2],"");
                data.setValue(cant.cantRama[3],value[3],"");
                data.setValue(cant.cantRama[0],value[0],"");
                data.setValue(cant.cantRama[1],value[1],"");
                
                break;
        }
        
        chart = ChartFactory.createAreaChart(
                "Cantidad de tiendas", // titulo del grafico
                "Años", // etiqueta de x
                "Cantidad de compras", // etiqueta de y
                data, // datos
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        // esto es opcional
        TextTitle subtitle1 = new TextTitle("Estados de las compras");
        chart.addSubtitle(subtitle1);
        chart.setBorderVisible(true);
        chart.setBorderPaint(Color.white); // You can set any color as border here.

        chartPanel3 = new ChartPanel(chart, false);
        chartPanel3.setBounds(5, 385, 460, 375);
    }

    public ChartPanel getGraficoArea1() {
        return chartPanel3;
    }

    // --------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------
    //Consulta fija
    
    public void graficoLineal(String value[], int key){
        LeerArchivoCSV cant = new LeerArchivoCSV();
        //ramaEntidad.ramaEntidad();
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        switch (key) {
            case 1:
                cant.cantidad_Ventas_Años_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.año[i], "", value[i]);
                }
            
                break;
            case 2:
                cant.cantidad_Estados_Venta_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantEstados[i], "", value[i]);
                }
                
                break;
            case 3:
                cant.cantitad_Territoriales_Nacionales_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantTerritorialesNacionales[i], "", value[i]);
                }
                
                break;
            case 4:
                cant.cantitad_Entidades_Obligadas_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantEntidadObligada[i],"",value[i]);
                }
                break;
            case 5:
                cant.cantitad_Rama_Entidad_torta();
                for (int i = 0; i < value.length; i++) {
                    data.addValue(cant.cantRama[i],"",value[i]);
                }
                
                break;
        }

        chart = ChartFactory.createLineChart(
                "Ventas 2014", // T�tulo
                "Vendedores", // Etiqueta Coordenada X
                "Cantidad de Vehiculos", // Etiqueta Coordenada Y
                data, // Datos
                PlotOrientation.VERTICAL,
                true, // Muestra la leyenda de los productos en el eje de la X
                true,// mostrar la leyenda en cada punto
                false
        );

        chartPanel4 = new ChartPanel(chart, false);
        chartPanel4.setBounds(470, 5, 460, 375);

    }
    
    public ChartPanel getGrafico(){
        return chartPanel4;
    }


    // --------------------------------------------------------------------------------
}
