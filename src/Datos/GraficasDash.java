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

    public GraficasDash() {

    }
    //hola bro

    //Ole

    // --------------------------------------------------------------------------------
    //Consulta fija
    public void GraficoTorta1() {
        LeerArchivoCSV cant = new LeerArchivoCSV();
        cant.cantidadVentasXAño();
        DefaultPieDataset data = new DefaultPieDataset();
        
        data.setValue("2021", cant.año[0]);
        data.setValue("2022", cant.año[1]);
        data.setValue("2023", cant.año[2]);

        
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
        chartPanel.setBounds(5, 5, 360, 305);
    }

    public ChartPanel getGraficoTorta1() {
        return chartPanel;
    }
    // --------------------------------------------------------------------------------
    
    
    
    // --------------------------------------------------------------------------------
    //Consulta fija
    public void GraficoAxis1() {
        LeerArchivoCSV entidadObligada = new LeerArchivoCSV();
        entidadObligada.cantidadEntidadesObligadas();
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        data.addValue(entidadObligada.entidadObligada[0], "Obligada", "2021");// ventas de Mazda de Jaime
        data.addValue(entidadObligada.entidadObligada[2], "Obligada", "2022");// ventas de Mazda de Valeria
        data.addValue(entidadObligada.entidadObligada[4], "Obligada", "2023");// ventas de Mazda de Sebastian


        data.addValue(entidadObligada.entidadObligada[1], "No obligada", "2021");// ventas de Mazda de Jaime
        data.addValue(entidadObligada.entidadObligada[3], "No obligada", "2022");// ventas de Mazda de Valeria
        data.addValue(entidadObligada.entidadObligada[5], "No obligada", "2023");// ventas de Mazda de Sebastian


        DefaultCategoryDataset data2 = new DefaultCategoryDataset();

        chart = ChartFactory.createBarChart3D(
                "Cantidad de entidades obligadas a usar tienda virtual", // chart title
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
        chartPanel2.setBounds(365, 310, 360, 305);
    }

    public ChartPanel getGraficoAxis1() {
        return chartPanel2;
    }
    // --------------------------------------------------------------------------------

    
    // --------------------------------------------------------------------------------
    //Consulta fija
    public void GraficoArea1() {
        LeerArchivoCSV estadoCompra = new LeerArchivoCSV();
        estadoCompra.estado();
        DefaultCategoryDataset data = new DefaultCategoryDataset(); // crear el conjunto de datos

        // crear la categoria de Ford
        data.setValue(estadoCompra.estado[0], "Emitida", "2021");
        data.setValue(estadoCompra.estado[3], "Emitida", "2022");
        data.setValue(estadoCompra.estado[6], "Emitida", "2023");


        // crear la categoria de Mazda
        data.setValue(estadoCompra.estado[1], "Cerrada", "2021");
        data.setValue(estadoCompra.estado[4], "Cerrada", "2022");
        data.setValue(estadoCompra.estado[7], "Cerrada", "2023");
        
        data.setValue(estadoCompra.estado[2], "Cancelada", "2021");
        data.setValue(estadoCompra.estado[5], "Cancelada", "2022");
        data.setValue(estadoCompra.estado[8], "Cancelada", "2023");

        chart = ChartFactory.createAreaChart(
                "Estados de la compra", // titulo del grafico
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
        chartPanel3.setBounds(5, 310, 360, 305);
    }

    public ChartPanel getGraficoArea1() {
        return chartPanel3;
    }

    // --------------------------------------------------------------------------------
    
    
    // --------------------------------------------------------------------------------
    //Consulta fija
    public void graficoLineal1(){
        LeerArchivoCSV ordenEntidad = new LeerArchivoCSV();
        ordenEntidad.cantidadTerritorialesONacionales();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(ordenEntidad.ordenEntidad[0], "Territorial", "2021");//ventas de Mazda de Jaime
        dataset.addValue(ordenEntidad.ordenEntidad[3], "Territorial", "2022");//ventas de Mazda de Valeria
        dataset.addValue(ordenEntidad.ordenEntidad[6], "Territorial", "2023");//ventas de Mazda de Sebastian


        dataset.addValue(ordenEntidad.ordenEntidad[1], "Nacional", "2021");
        dataset.addValue(ordenEntidad.ordenEntidad[4], "Nacional", "2022");
        dataset.addValue(ordenEntidad.ordenEntidad[7], "Nacional", "2023");


        dataset.addValue(ordenEntidad.ordenEntidad[2], "Corporación autónoma", "2021");
        dataset.addValue(ordenEntidad.ordenEntidad[5], "Corporación autónoma", "2022");
        dataset.addValue(ordenEntidad.ordenEntidad[8], "Corporación autónoma", "2023");


        chart = ChartFactory.createLineChart3D(
                "Cantidad territoriales y nacionales",  // Titulo
                "Años",   // Etiqueta Coordenada X
                "Cantidad de ventas",     // Etiqueta Coordenada Y
                dataset,        // Datos
                PlotOrientation.VERTICAL,
                true,           // Muestra la leyenda de los productos en el eje de la X
                true,           // mostrar la leyenda en cada punto
                false
        );
        
        chartPanel4 = new ChartPanel(chart, false);
        chartPanel4.setBounds(365, 5, 360, 305);
    }

    
    public ChartPanel getGraficoLineal1(){
        return chartPanel4;
    }
    // --------------------------------------------------------------------------------
    

    // --------------------------------------------------------------------------------
    //Consulta fija
    
    public void grafico(){
        LeerArchivoCSV ramaEntidad = new LeerArchivoCSV();
        ramaEntidad.ramaEntidad();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(ramaEntidad.ramaEntidad[0], "Ejecutiva", "2021 - 2022 - 2023");//ventas de Mazda de Jaime
        dataset.addValue(ramaEntidad.ramaEntidad[1], "Judicial", "2021 - 2022 - 2023v");//ventas de Mazda de Valeria
        dataset.addValue(ramaEntidad.ramaEntidad[2], "Legislativa", "2021 - 2022 - 2023");//ventas de Mazda de Sebastian
        dataset.addValue(ramaEntidad.ramaEntidad[3], "No Definido", "2021 - 2022 - 2023");
        dataset.addValue(ramaEntidad.ramaEntidad[4], "Organismos autonomos o idependientes", "2021 - 2022 - 2023");//ventas de Mazda de Sebastian

        
        chart = ChartFactory.createWaterfallChart("Cantidad por ramas", 
                "años", 
                "Cantidad de tiendas",
                dataset, 
                PlotOrientation.VERTICAL, 
                true,true, false);
        
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        p.setDomainGridlinesVisible(true);
        p.setDomainGridlinePaint(Color.black);
        
        chartPanel5 = new ChartPanel(chart, false);
        chartPanel5.setBounds(725, 5, 360, 305);
    }
    
    public ChartPanel getGrafico(){
        return chartPanel5;
    }


    // --------------------------------------------------------------------------------
}
