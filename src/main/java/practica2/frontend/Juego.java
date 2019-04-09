/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.frontend;


import java.awt.Dimension;
import java.awt.GridLayout;
import practica2.backend.jugador.Jugador;
import practica2.backend.tablero.Tablero;

/**
 *
 * @author astridmc
 */
public class Juego extends javax.swing.JFrame {
  
    protected DatosJugador datosJugador = new DatosJugador(this);
    protected TamañoTablero tamañoTablero = new TamañoTablero(this);
    public Datos datos = new Datos(this);
    protected TableroAjedrez TableroAjedrez = new TableroAjedrez();
    private static final String PIEZAS = "piezas jugador {name}: ";
    
   
    public Juego() {
        
        diseño();
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

        jButton1 = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        panelDatos = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaPuntos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        piezasEtiqueta = new javax.swing.JLabel();
        panelTablero = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        btnInicio = new javax.swing.JMenuItem();
        menuResultados = new javax.swing.JMenu();
        btnResultados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        panelDatos.setBackground(new java.awt.Color(254, 219, 156));

        etiqueta1.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        etiqueta1.setForeground(new java.awt.Color(3, 3, 3));
        etiqueta1.setText("Nombre Jugador:");

        etiquetaNombre.setFont(new java.awt.Font("Century Schoolbook L", 2, 18)); // NOI18N
        etiquetaNombre.setText("nombre");

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Puntos:");

        etiquetaPuntos.setFont(new java.awt.Font("Century Schoolbook L", 2, 18)); // NOI18N
        etiquetaPuntos.setText("punteo");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("No. Piezas:");

        piezasEtiqueta.setFont(new java.awt.Font("Century Schoolbook L", 2, 18)); // NOI18N
        piezasEtiqueta.setText("piezas");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(piezasEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre)
                    .addComponent(jLabel3)
                    .addComponent(piezasEtiqueta)
                    .addComponent(jLabel1)
                    .addComponent(etiquetaPuntos)))
        );

        panelTablero.setBackground(java.awt.SystemColor.controlHighlight);
        panelTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTablero.setForeground(java.awt.SystemColor.control);

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        barraMenu.setBackground(new java.awt.Color(255, 141, 0));

        menuJuego.setForeground(new java.awt.Color(30, 22, 2));
        menuJuego.setText("Juego    ");
        menuJuego.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N

        btnInicio.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        btnInicio.setText("Nuevo");
        btnInicio.setPreferredSize(new java.awt.Dimension(65, 25));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        menuJuego.add(btnInicio);

        barraMenu.add(menuJuego);

        menuResultados.setForeground(new java.awt.Color(31, 27, 35));
        menuResultados.setText("Resultados   ");
        menuResultados.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        menuResultados.setRolloverEnabled(true);
        menuResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResultadosActionPerformed(evt);
            }
        });

        btnResultados.setText("Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });
        menuResultados.add(btnResultados);

        barraMenu.add(menuResultados);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador)
                    .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Jugador nuevo = new Jugador();
    
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        reiniciar();
        datosJugador.setVisible(true);
        
        if(nuevo.getNombre()== null){
            tamañoTablero.setVisible(false);
        } else{
            tamañoTablero.setVisible(true);
        }
        Tablero.especificarTablero();
        etiquetaNombre.setText(nuevo.getNombre());
        piezasEtiqueta.setText(nuevo.getNoPiezas()+" piezas");
        agregarTablero();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void menuResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResultadosActionPerformed
       
    }//GEN-LAST:event_menuResultadosActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        datos.setVisible(true);
    }//GEN-LAST:event_btnResultadosActionPerformed
    
    public void agregarTablero(){
        
    panelTablero.removeAll();
    panelTablero.setLayout(new GridLayout(1, 1));
    panelTablero.add(TableroAjedrez.TableroAjedrez());
    panelTablero.setPreferredSize(new Dimension(500, 500));
    panelTablero.setVisible(true);
    
    }
    
    private static void reiniciar(){
        etiquetaNombre.setText("nombre");
        nuevo.setNombre("");
        etiquetaPuntos.setText("puntos");
        piezasEtiqueta.setText("piezas");
        nuevo.setNoPiezas(nuevo.getNoPiezas()*0);
        nuevo.setPuntos(nuevo.getPuntos()*0);
    }
   
    private void diseño(){
       setTitle("TORRES Y ALFILES");
       setLocation(400,200);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem btnInicio;
    private javax.swing.JMenuItem btnResultados;
    private javax.swing.JLabel etiqueta1;
    public static javax.swing.JLabel etiquetaNombre;
    public static javax.swing.JLabel etiquetaPuntos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenu menuResultados;
    private javax.swing.JPanel panelDatos;
    public static javax.swing.JPanel panelTablero;
    public static javax.swing.JLabel piezasEtiqueta;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

   
}