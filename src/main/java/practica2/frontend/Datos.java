/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.frontend;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import practica2.backend.jugador.Jugador;
import practica2.backend.jugador.DatosPuntos;
import practica2.backend.jugador.DatosFecha;
import static practica2.frontend.Datos.lista;

/**
 *
 * @author astridmc
 */
public class Datos extends javax.swing.JDialog {

    protected static ArrayList <Jugador> lista = new ArrayList <Jugador>();   
    
    public Datos(java.awt.Frame parent) {
        super(parent,true);
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        etiquetaDatosJugador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();
        barraMenu = new javax.swing.JMenuBar();
        botonPuntos = new javax.swing.JMenu();
        botonNombre = new javax.swing.JMenuItem();
        btnPuntos = new javax.swing.JMenuItem();
        btnFecha = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 226, 198));

        etiquetaDatosJugador.setFont(new java.awt.Font("Century Schoolbook L", 1, 27)); // NOI18N
        etiquetaDatosJugador.setText("Datos del Jugador");

        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Puntos", "Piezas", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaJugadores.setColumnSelectionAllowed(true);
        tablaJugadores.setRowHeight(22);
        jScrollPane1.setViewportView(tablaJugadores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaDatosJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaDatosJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        botonPuntos.setText("Ordenar Por:");

        botonNombre.setText("Nombre");
        botonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNombreActionPerformed(evt);
            }
        });
        botonPuntos.add(botonNombre);

        btnPuntos.setText("Puntos");
        btnPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntosActionPerformed(evt);
            }
        });
        botonPuntos.add(btnPuntos);

        btnFecha.setText("Fecha");
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });
        botonPuntos.add(btnFecha);

        barraMenu.add(botonPuntos);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNombreActionPerformed
        Collections.sort(lista);
        agregarLista(lista);
    }//GEN-LAST:event_botonNombreActionPerformed

    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed
       Collections.sort(lista,new DatosFecha());
       agregarLista(lista);
    }//GEN-LAST:event_btnFechaActionPerformed

    private void btnPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntosActionPerformed
        Collections.sort(lista,new DatosPuntos());
        agregarLista(lista);
    }//GEN-LAST:event_btnPuntosActionPerformed

     public static  void agregarLista(ArrayList jugador){
    String [][] noOrdenado = new String[lista.size()][4];
        
        for (int i = 0; i < lista.size(); i++) {
            noOrdenado[i][0]=lista.get(i).getNombre();
            noOrdenado[i][1]=Integer.toString(lista.get(i).getPuntos());
            noOrdenado[i][2]=Integer.toString(lista.get(i).getNoPiezas());
            noOrdenado[i][3]=lista.get(i).getFecha().toString();
        }
            
            tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
                    
           noOrdenado,
                    
            new String [] {
                "Nombre", "Puntos", "Piezas", "Fecha"}));
    }
     
     
    public static ArrayList diseño(){
        LocalDateTime fecha= LocalDateTime.now();
        Jugador miJugador = new Jugador(Juego.nuevo.getNombre(),Juego.nuevo.getPuntos(),Juego.nuevo.getNoPiezas(),fecha);
        lista.add(miJugador);
        return lista;
    }
    
    public static void noOrdenadoM(){
        agregarLista( diseño());
    }
        
     @Override
    public void setVisible(boolean visible){
        if (visible){
            
        }
        super.setVisible(visible);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem botonNombre;
    private javax.swing.JMenu botonPuntos;
    private javax.swing.JMenuItem btnFecha;
    private javax.swing.JMenuItem btnPuntos;
    private javax.swing.JLabel etiquetaDatosJugador;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tablaJugadores;
    // End of variables declaration//GEN-END:variables
}
