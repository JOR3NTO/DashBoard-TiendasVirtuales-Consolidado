
/*
 * Clase principal GUI
 * 
 * Fecha: 13/11/2023
 * 
 * Autores: Jorge Eduardo Cobo Ocampo, Mario Ochoa Arango, Katherin Andrea Palacio
 */
package GUI;

import Datos.GraficasDash;
import Datos.GraficasDashFormadas;
import Datos.LeerArchivoCSV;
import Datos.getComboBoxes;
import java.awt.Image;
import java.awt.Toolkit;

public class GUIdash extends javax.swing.JFrame {

    // Objetos
    GraficasDash estadistica = new GraficasDash();
    LeerArchivoCSV graficoGeneral = new LeerArchivoCSV();
    getComboBoxes getValues = new getComboBoxes();

    String[] value;
    String[] entidadesObligadas = {"Obligada","No obligada"};


    int key;

    public GUIdash() {
        initComponents();

        
    }
    
    //Icono
    @Override
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Icono.png"));
        return icono;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbGenerar = new javax.swing.JButton();
        jRadioGraficaTiendasXAño = new javax.swing.JRadioButton();
        jRadioTerritorialesNacionales = new javax.swing.JRadioButton();
        jRadioEstados = new javax.swing.JRadioButton();
        jRadioEntidadesObligadas = new javax.swing.JRadioButton();
        jRadioRamaEntidad = new javax.swing.JRadioButton();
        jComboMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboDia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboEstadoOrden = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboDepartamento = new javax.swing.JComboBox<>();
        jComboSectorEntidad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboOrdenEntidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboRamaEntidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DASHBOARD");
        setBackground(new java.awt.Color(70, 149, 151));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jSplitPane1.setBackground(new java.awt.Color(70, 149, 151));
        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setForeground(new java.awt.Color(70, 149, 151));
        jSplitPane1.setDoubleBuffered(true);
        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setBackground(new java.awt.Color(91, 161, 153));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú principal");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jbGenerar.setFont(new java.awt.Font("Ink Free", 3, 20)); // NOI18N
        jbGenerar.setText("Generar");
        jbGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarActionPerformed(evt);
            }
        });

        jRadioGraficaTiendasXAño.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        jRadioGraficaTiendasXAño.setForeground(new java.awt.Color(255, 255, 255));
        jRadioGraficaTiendasXAño.setText("Tiendas por años");
        jRadioGraficaTiendasXAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGraficaTiendasXAñoActionPerformed(evt);
            }
        });

        jRadioTerritorialesNacionales.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        jRadioTerritorialesNacionales.setForeground(new java.awt.Color(255, 255, 255));
        jRadioTerritorialesNacionales.setText("Cantidad territoriales y nacionales");
        jRadioTerritorialesNacionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTerritorialesNacionalesActionPerformed(evt);
            }
        });

        jRadioEstados.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        jRadioEstados.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEstados.setText("Estados de las compras");
        jRadioEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadosActionPerformed(evt);
            }
        });

        jRadioEntidadesObligadas.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        jRadioEntidadesObligadas.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEntidadesObligadas.setText("Entidades obligadas a usar tiendas vituales");
        jRadioEntidadesObligadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEntidadesObligadasActionPerformed(evt);
            }
        });

        jRadioRamaEntidad.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        jRadioRamaEntidad.setForeground(new java.awt.Color(255, 255, 255));
        jRadioRamaEntidad.setText("Cantidad por ramas de las entidades");
        jRadioRamaEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRamaEntidadActionPerformed(evt);
            }
        });

        jComboMes.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboMes.setMinimumSize(new java.awt.Dimension(72, 22));
        jComboMes.setPreferredSize(new java.awt.Dimension(72, 22));
        jComboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mes");

        jComboDia.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jComboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDiaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Día");

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado de la orden");

        jComboEstadoOrden.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboEstadoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Emitida", "Cerrada", "Cancelada" }));

        jLabel6.setFont(new java.awt.Font("Ink Free", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Departamento");

        jComboDepartamento.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Amazonas", "Antioquia", "Arauca", "Atlantico", "Bolivar", "Boyaca", "Caldas", "Caqueta", "Casanare", "Cauca", "Cesar", "Choco", "Cordoba", "Cundinamarca", "Guainia", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "San Andres y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupes", "Vichada" }));

        jComboSectorEntidad.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboSectorEntidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Agricultura y Desarrollo Rural", "Ambiente y Desarrollo Sostenible", "Ciencia y Tecnologia", "Comercio Industria y Turismo", "Cultura", "Defensa Nacional", "Deporte", "Educacion Nacional", "Funcion Publica", "Hacienda y Cedito Publico", "Inclusion social y reconciliacion", "Informacin Estadistica", "Inteligencia Estrategica y Contrainteligencia", "Interior", "Justicia y del Derecho", "Minas y Energia", "No Aplica", "Planeacion", "Presidencia de la Republica", "Relaciones Exteriores", "Salud y Proteccion Social", "Tecnologias de la Informacion y las comunicaciones", "Trabajo", "Transporte", "Vivienda Ciudad y Territorio" }));
        jComboSectorEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSectorEntidadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ink Free", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sector de la entiedad");

        jLabel8.setFont(new java.awt.Font("Ink Free", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rama de la entidad");

        jComboOrdenEntidad.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboOrdenEntidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Territorial", "Nacional" }));
        jComboOrdenEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboOrdenEntidadActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ink Free", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Orden de la entidad");

        jComboRamaEntidad.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboRamaEntidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Judicial", "Legislativa", "Ejecutiva", "Organismos autonomos o independientes" }));
        jComboRamaEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRamaEntidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboRamaEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jComboOrdenEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioEntidadesObligadas)
                            .addComponent(jRadioGraficaTiendasXAño)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jRadioEstados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioTerritorialesNacionales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jRadioRamaEntidad)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboSectorEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)))
                            .addComponent(jComboEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jRadioEstados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioTerritorialesNacionales, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jRadioEntidadesObligadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioRamaEntidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioGraficaTiendasXAño)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboSectorEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboRamaEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboOrdenEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jbGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(187, 198, 200));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1400, 1165));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1335, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1165, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        jSplitPane1.setRightComponent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboSectorEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSectorEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSectorEntidadActionPerformed

    private void jComboOrdenEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboOrdenEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboOrdenEntidadActionPerformed

    private void jComboRamaEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRamaEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRamaEntidadActionPerformed

    private void jComboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDiaActionPerformed

    private void jComboMesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboMesActionPerformed
            String month = jComboMes.getSelectedItem().toString();
            int daysInMonth = getValues.getDaysInMonth(month);

            jComboDia.removeAllItems(); // Limpia los elementos anteriores

            jComboDia.addItem("-");

            for (int i = 1; i <= daysInMonth; i++) {
                jComboDia.addItem(Integer.toString(i));
            }
    }// GEN-LAST:event_jComboMesActionPerformed
   

    private void jbGenerarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbGenerarActionPerformed
        encontrarConsulta();
        pack();
        repaint();
    }// GEN-LAST:event_jbGenerarActionPerformed
   

//--------------------------------------------------------------------------------------------------------------------
   
    public void encontrarConsulta(){

        jPanel2.removeAll();
        String mes_fil = jComboMes.getSelectedItem().toString();
        String dia_fil = jComboDia.getSelectedItem().toString();
        String estadoOrden_fil = jComboEstadoOrden.getSelectedItem().toString();
        String departamento_fil = jComboDepartamento.getSelectedItem().toString();
        String sectorEntidad_fil = jComboSectorEntidad.getSelectedItem().toString();
        String ramaEntidad_fil = jComboRamaEntidad.getSelectedItem().toString();
        String ordenEntidad_fil = jComboOrdenEntidad.getSelectedItem().toString();

        GraficasDashFormadas gdf = new GraficasDashFormadas(mes_fil,dia_fil,estadoOrden_fil,
        departamento_fil,sectorEntidad_fil,ramaEntidad_fil,ordenEntidad_fil);

        gdf.cantidad_Ventas_Mes_torta_No_fijo();
        gdf.Grafico_Torta_No_Fija();
        jPanel2.add(gdf.getGraficoTorta());
        if(jComboMes.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoTorta());

        gdf.cantidad_Ventas_Dia_Axi_No_fijo();
        gdf.Grafico_Axi_No_Fija();
        jPanel2.add(gdf.getGraficoAxi());
        if(jComboDia.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoAxi());

        gdf.cantidad_Departamanto_Grafica_Area_No_Fija();
        gdf.Grafico_Area_No_Fija();
        jPanel2.add(gdf.getGraficoArea());
        if(jComboDepartamento.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoArea());

        gdf.cantidad_Estado_Grafica_No_Fija();
        gdf.Grafico_Lineal_No_Fija();
        jPanel2.add(gdf.getGraficoLineal());
        if(jComboEstadoOrden.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoLineal());

        gdf.cantidad_Sector_Entidad_Barra_No_Fija();
        gdf.Grafico_Barras_No_Fija();
        jPanel2.add(gdf.getGraficoBarras());
        if(jComboSectorEntidad.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoBarras());

        gdf.cantidad_Rama_Entidad_Polar_No_Fija();
        gdf.Grafico_Polar_No_Fija();
        jPanel2.add(gdf.getGraficoPolar());
        if(jComboRamaEntidad.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoPolar());

        gdf.cantidad_Orden_Entidad_Lineal_No_Fija();
        gdf.Grafico_Lineal2_No_Fija();
        jPanel2.add(gdf.getGraficoLineal2());
        if(jComboOrdenEntidad.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoLineal2());

        gdf.cantidad_EstadoDeLaOrden_X_Mes_No_Fija();
        gdf.Grafico_TortaPartida_No_Fija();
        jPanel2.add(gdf.getGraficoTortaPartida());
        if(jComboEstadoOrden.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoTortaPartida());

        gdf.cantidad_Rama_Entidad_X_Mes_Axis_No_Fija();
        gdf.Grafico_Axis_No_Fija();
        jPanel2.add(gdf.getGraficoAxis());
        if(jComboRamaEntidad.getSelectedItem().toString() == "-") jPanel2.remove(gdf.getGraficoAxis());


        repaint();

    }


    // ActionPerformed de los Radio Buttons----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void jRadioGraficaTiendasXAñoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioGraficaTiendasXAñoActionPerformed
        jPanel2.removeAll();
        encontrarValue();
        
        if(jRadioGraficaTiendasXAño.isSelected()){
            
            
            jRadioEntidadesObligadas.setSelected(false);
            jRadioEstados.setSelected(false);
            jRadioRamaEntidad.setSelected(false);
            jRadioTerritorialesNacionales.setSelected(false);
            mostrarGraficoTorta1();
            mostrarGraficoBarras1();
            mostrarGraficoArea1();
            mostrarGraficoLineal();


        } else jPanel2.removeAll();

        repaint();
    }// GEN-LAST:event_jRadioGraficaTiendasXAñoActionPerformed

    private void jRadioTerritorialesNacionalesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioTerritorialesNacionalesActionPerformed
        jPanel2.removeAll();

        encontrarValue();
        if(jRadioTerritorialesNacionales.isSelected()){

            jRadioGraficaTiendasXAño.setSelected(false);
            jRadioEntidadesObligadas.setSelected(false);
            jRadioRamaEntidad.setSelected(false);
            jRadioEstados.setSelected(false);
            mostrarGraficoTorta1();
            mostrarGraficoBarras1();
            mostrarGraficoArea1();
            mostrarGraficoLineal();

        } else jPanel2.removeAll();

        repaint();

    }// GEN-LAST:event_jRadioTerritorialesNacionalesActionPerformed

    private void jRadioEstadosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioEstadosActionPerformed
        jPanel2.removeAll();

        encontrarValue();
        if(jRadioEstados.isSelected()){
            jRadioGraficaTiendasXAño.setSelected(false);
            jRadioEntidadesObligadas.setSelected(false);
            jRadioRamaEntidad.setSelected(false);
            jRadioTerritorialesNacionales.setSelected(false);
            mostrarGraficoTorta1();
            mostrarGraficoBarras1();
            mostrarGraficoArea1();
            mostrarGraficoLineal();

        } else jPanel2.removeAll();


        repaint();

    }// GEN-LAST:event_jRadioEstadosActionPerformed

    private void jRadioEntidadesObligadasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioEntidadesObligadasActionPerformed
        jPanel2.removeAll();

        encontrarValue();
        if(jRadioEntidadesObligadas.isSelected()){
            jRadioGraficaTiendasXAño.setSelected(false);
            jRadioEstados.setSelected(false);
            jRadioRamaEntidad.setSelected(false);
            jRadioTerritorialesNacionales.setSelected(false);
            mostrarGraficoTorta1();
            mostrarGraficoBarras1();
            mostrarGraficoArea1();
            mostrarGraficoLineal();

        } else jPanel2.removeAll();


        repaint();

    }// GEN-LAST:event_jRadioEntidadesObligadasActionPerformed

    private void jRadioRamaEntidadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioRamaEntidadActionPerformed
        jPanel2.removeAll();

        encontrarValue();
        if(jRadioRamaEntidad.isSelected()){
            jRadioGraficaTiendasXAño.setSelected(false);
            jRadioEntidadesObligadas.setSelected(false);
            jRadioEstados.setSelected(false);
            jRadioTerritorialesNacionales.setSelected(false);
            mostrarGraficoTorta1();
            mostrarGraficoBarras1();
            mostrarGraficoArea1();
            mostrarGraficoLineal();

        } else jPanel2.removeAll();


        repaint();
        //mostrarGrafico();

    }// GEN-LAST:event_jRadioRamaEntidadActionPerformed

    public void encontrarValue(){
        
        if (jRadioGraficaTiendasXAño.isSelected()) {
            value = new String[3];
            value[0] = "2021";
            value[1] = "2022";
            value[2] = "2023";

            key = 1;
            
        }else if (jRadioEstados.isSelected()) {
            value = new String[jComboEstadoOrden.getItemCount()-1];
            for (int i = 0; i < jComboEstadoOrden.getItemCount()-1; i++) {
                value[i] = jComboEstadoOrden.getItemAt(i+1);
            }

            key = 2;

        }else if (jRadioTerritorialesNacionales.isSelected()) {
            value = new String[jComboOrdenEntidad.getItemCount()-1];
            for (int i = 0; i < jComboOrdenEntidad.getItemCount()-1; i++) {
                value[i] = jComboOrdenEntidad.getItemAt(i+1);
            }

            key = 3;
        }else if (jRadioEntidadesObligadas.isSelected()) {
            value = new String[entidadesObligadas.length];
            for (int i = 0; i < entidadesObligadas.length; i++) {
                value[i] = entidadesObligadas[i];
            }

            key = 4;
        }
        else if (jRadioRamaEntidad.isSelected()) {
            value = new String[jComboRamaEntidad.getItemCount()-1];
            for (int i = 0; i < jComboRamaEntidad.getItemCount()-1; i++) {
                value[i] = jComboRamaEntidad.getItemAt(i+1);                
            }

            key = 5;
        }
    }


    private void mostrarGraficoTorta1() {
        estadistica.GraficoTorta1(value,key);
        jPanel2.add(estadistica.getGraficoTorta1());
    }

    public void mostrarGraficoBarras1() {
        estadistica.GraficoAxis1(value,key);
        jPanel2.add(estadistica.getGraficoAxis1());
    }

    public void mostrarGraficoArea1() {
        estadistica.GraficoArea1(value,key);
        jPanel2.add(estadistica.getGraficoArea1());
    }

    public void mostrarGraficoLineal() {
        estadistica.graficoLineal(value,key);
        jPanel2.add(estadistica.getGrafico());
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIdash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIdash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIdash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIdash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIdash gui = new GUIdash();

                gui.setLocationRelativeTo(null);
                gui.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboDepartamento;
    private javax.swing.JComboBox<String> jComboDia;
    private javax.swing.JComboBox<String> jComboEstadoOrden;
    private javax.swing.JComboBox<String> jComboMes;
    private javax.swing.JComboBox<String> jComboOrdenEntidad;
    private javax.swing.JComboBox<String> jComboRamaEntidad;
    private javax.swing.JComboBox<String> jComboSectorEntidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioEntidadesObligadas;
    private javax.swing.JRadioButton jRadioEstados;
    private javax.swing.JRadioButton jRadioGraficaTiendasXAño;
    private javax.swing.JRadioButton jRadioRamaEntidad;
    private javax.swing.JRadioButton jRadioTerritorialesNacionales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton jbGenerar;
    // End of variables declaration//GEN-END:variables
}
