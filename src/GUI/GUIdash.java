/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.HashMap;
import java.util.Map;

import Datos.GraficasDash;
import Datos.LeerArchivoCSV;
import Datos.getComboBoxes;

/**
 *
 * @author eduar
 */
public class GUIdash extends javax.swing.JFrame {

    // Objetos
    GraficasDash estadistica = new GraficasDash();
    LeerArchivoCSV graficoGeneral = new LeerArchivoCSV();
    getComboBoxes getValues = new getComboBoxes();

    /**
     * Creates new form GUIdash
     */
    public GUIdash() {
        initComponents();
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
        jComboAño = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setForeground(new java.awt.Color(153, 153, 153));
        jSplitPane1.setDoubleBuffered(true);
        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
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

        jComboAño.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jComboAño.setForeground(new java.awt.Color(153, 204, 255));
        jComboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2021", "2022", "2023" }));
        jComboAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAñoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Año");

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
        jComboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Amazonas", "Antioquia", "Arauca", "Atlántico", "Bolívar", "Boyacá", "Caldas", "Caquetá", "Casanare", "Cauca", "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Guainía", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "San Andrés y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada" }));

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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jComboRamaEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jComboOrdenEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5))
                            .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioRamaEntidad)
                            .addComponent(jRadioEntidadesObligadas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jRadioGraficaTiendasXAño))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioEstados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioTerritorialesNacionales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboSectorEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboEstadoOrden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(29, 29, 29))
                                    .addComponent(jComboDepartamento, 0, 147, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jbGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(46, 46, 46)
                .addComponent(jbGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(2000, 2000));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
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
                .addGap(24, 24, 24))
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

    private void jComboAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboAñoActionPerformed

    private void jComboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDiaActionPerformed


    

    private void jbGenerarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbGenerarActionPerformed
        calcularGraficoAGraficar();
        pack();
        repaint();
    }// GEN-LAST:event_jbGenerarActionPerformed

    private void calcularGraficoAGraficar(){

        String año,mes,dia,estadoOrden;
        año = jComboAño.getSelectedItem().toString();
        mes = jComboMes.getSelectedItem().toString();
        dia = jComboDia.getSelectedItem().toString();
        estadoOrden = jComboEstadoOrden.getSelectedItem().toString();



        int codAño = getValues.getValueAño(año);
        int codMes = getValues.getValueMes(mes);
        int codEstadoOrden = getValues.getValueEstadoOrden(estadoOrden);
        

        graficoGeneral.calcularGrafico(codAño, codMes, codEstadoOrden);
    }







    private void jRadioGraficaTiendasXAñoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioGraficaTiendasXAñoActionPerformed
        if(jRadioGraficaTiendasXAño.isSelected()) mostrarGraficoTorta1();

    }// GEN-LAST:event_jRadioGraficaTiendasXAñoActionPerformed

    private void jRadioTerritorialesNacionalesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioTerritorialesNacionalesActionPerformed
        mostrarGraficoLineal();

    }// GEN-LAST:event_jRadioTerritorialesNacionalesActionPerformed

    private void jRadioEstadosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioEstadosActionPerformed
        mostrarGraficoArea1();

    }// GEN-LAST:event_jRadioEstadosActionPerformed

    private void jRadioEntidadesObligadasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioEntidadesObligadasActionPerformed
        mostrarGraficoBarras1();

    }// GEN-LAST:event_jRadioEntidadesObligadasActionPerformed

    private void jRadioRamaEntidadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioRamaEntidadActionPerformed
        // a
        mostrarGrafico();

    }// GEN-LAST:event_jRadioRamaEntidadActionPerformed

    private void jComboMesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboMesActionPerformed
        String month = jComboMes.getSelectedItem().toString();
        int daysInMonth = getValues.getDaysInMonth(month);

        jComboDia.removeAllItems(); // Limpia los elementos anteriores

        for (int i = 1; i <= daysInMonth; i++) {
            jComboDia.addItem(Integer.toString(i));
        }
    }// GEN-LAST:event_jComboMesActionPerformed

    

    private void mostrarGraficoTorta1() {
        estadistica.GraficoTorta1();
        jPanel2.add(estadistica.getGraficoTorta1());
    }

    public void mostrarGraficoBarras1() {
        estadistica.GraficoAxis1();
        jPanel2.add(estadistica.getGraficoAxis1());

    }

    public void mostrarGraficoArea1() {
        estadistica.GraficoArea1();
        jPanel2.add(estadistica.getGraficoArea1());

    }

    public void mostrarGraficoLineal() {
        estadistica.graficoLineal1();
        jPanel2.add(estadistica.getGraficoLineal1());
    }

    public void mostrarGrafico() {
        estadistica.grafico();
        jPanel2.add(estadistica.getGrafico());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
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
    private javax.swing.JComboBox<String> jComboAño;
    private javax.swing.JComboBox<String> jComboDepartamento;
    private javax.swing.JComboBox<String> jComboDia;
    private javax.swing.JComboBox<String> jComboEstadoOrden;
    private javax.swing.JComboBox<String> jComboMes;
    private javax.swing.JComboBox<String> jComboOrdenEntidad;
    private javax.swing.JComboBox<String> jComboRamaEntidad;
    private javax.swing.JComboBox<String> jComboSectorEntidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
