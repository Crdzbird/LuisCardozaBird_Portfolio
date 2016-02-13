/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ConexionHibernate.NewHibernateUtil;
import ConexionUsuario.AtributosUsuarioConexion;
import LoginSistema.Login_Hospital;
import ValidacionImagenes.ImagenFondoDesktop;
import com.javaswingcomponents.accordion.JSCAccordion;
import com.javaswingcomponents.accordion.TabOrientation;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.hibernate.SessionFactory;

/**
 *
 * @author crdzbird
 */
public class MDI extends javax.swing.JFrame {

    private static SessionFactory sf;
    GraphicsDevice grafica = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    JSCAccordion accordion = new JSCAccordion();
    JPanel transparentPanel = new JPanel();
    JPanel panelMedicos = new JPanel();
    JPanel panelPacientes = new JPanel();
    JPanel panelConfiguraciones = new JPanel();
    JPanel panelAdministrador = new JPanel();
    JPanel panelCajero = new JPanel();
    JPanel panelInformacionGeneral = new JPanel();
    JButton btnSalir = new JButton();
    boolean pantallacompleta = false;
    boolean estadoConexion = true;
    Hora h;
    String dirWeb = "www.google.com";
    int puerto = 80;
    int IDUsuario;
    int opcion;
    public boolean Abierto = false;

    public MDI(SessionFactory sf) {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        this.Usuario.setText(AtributosUsuarioConexion.getUser());
        this.sf = sf;
        this.jPanel3.setLayout(new BorderLayout());
        this.jPanel3.add(MenuAcordion(), BorderLayout.CENTER);
        this.jPanel3.add(AgregarBotonSalir(), BorderLayout.PAGE_END);
        this.jDesktopPane1.setBorder(new ImagenFondoDesktop());
        this.add(BarraEstado);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraEstado = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        BarraEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Usuario.setText("Usuario");

        Fecha.setText("Fecha");

        javax.swing.GroupLayout BarraEstadoLayout = new javax.swing.GroupLayout(BarraEstado);
        BarraEstado.setLayout(BarraEstadoLayout);
        BarraEstadoLayout.setHorizontalGroup(
            BarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraEstadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                .addComponent(Fecha)
                .addGap(33, 33, 33))
        );
        BarraEstadoLayout.setVerticalGroup(
            BarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraEstadoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(BarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario)
                    .addComponent(Fecha))
                .addGap(5, 5, 5))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Hospital UNI");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        opcion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea salir", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (opcion == 0) {
            try {
                abrirLogin();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "El Programa ya ha sido ejecutado", "Informacion del Sistema", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        new Hora().start();
        new VerificacionInternet().start();
    }//GEN-LAST:event_formWindowOpened

    public void abrirLogin() throws IOException {
        NewHibernateUtil.cerrarSessionFactory();
        new Login_Hospital().setVisible(true);
        this.dispose();
    }

    public void pasarGarbageCollector() {
        Runtime garbage = Runtime.getRuntime();
        garbage.gc();
    }

    
    public void CerrarMDI(){
        this.dispose();
    }
    private Component AgregarBotonSalir() {
        btnSalir.setText("Salir del Sistema");
        btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                opcion = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (opcion == 0) {
                    try {
                        abrirLogin();
                        CerrarMDI();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "El Programa ya ha sido ejecutado", "Informacion del Sistema", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        return btnSalir;
    }

    private Component MenuAcordion() {
        accordion.setTabOrientation(TabOrientation.VERTICAL);
        agregarTabInformacionClinica(accordion);
        add(accordion);
        return accordion;
    }

    private void agregarTabMedicos(JSCAccordion accordion) {
        transparentPanel.setOpaque(true);
        transparentPanel.setBackground(Color.CYAN);

        accordion.addTab("Verificacion de Citas y Consultas", transparentPanel);
        accordion.addTab("Verificacion de Especialidades", transparentPanel);
        accordion.addTab("Actualizar Informacion General de " + AtributosUsuarioConexion.getUser(), transparentPanel);
        accordion.addTab("Horarios de Trabajo", transparentPanel);
        accordion.addTab("Obtencion de la Aplicacion Movil", transparentPanel);
    }

    private void agregarTabPacientes(JSCAccordion accordion) {
        transparentPanel.setOpaque(true);
        transparentPanel.setBackground(Color.CYAN);

        accordion.addTab("Verificacion de Citas y Consultas", transparentPanel);
        accordion.addTab("Informacion General de " + AtributosUsuarioConexion.getUser(), transparentPanel);
        accordion.addTab("Actualizar Informacion General ", transparentPanel);
        accordion.addTab("Horarios de Trabajo", transparentPanel);
        accordion.addTab("Obtencion de la Aplicacion Movil", transparentPanel);
    }

    private void agregarTabOpcionesGenerales(JSCAccordion accordion) {
        transparentPanel.setOpaque(true);
        transparentPanel.setBackground(Color.CYAN);

        accordion.addTab("Verificacion de Citas y Consultas", transparentPanel);
        accordion.addTab("Verificacion de Especialidades", transparentPanel);
        accordion.addTab("Actualizar Informacion General ", transparentPanel);
        accordion.addTab("Horarios de Trabajo", transparentPanel);
        accordion.addTab("Obtencion de la Aplicacion Movil", transparentPanel);
    }

    private void agregarTabInformacionClinica(JSCAccordion accordion) {
        transparentPanel.setOpaque(true);
        transparentPanel.setBackground(Color.CYAN);

        accordion.addTab("Datos Generales", transparentPanel);
        accordion.addTab("Contactenos", transparentPanel);
        accordion.addTab("Registro Nuevo", transparentPanel);
        accordion.addTab("Horarios de Trabajo", transparentPanel);
        accordion.addTab("Obtencion de la Aplicacion Movil", transparentPanel);
    }

    private void agregarTabAdministrador(JSCAccordion accordion) {
        transparentPanel.setOpaque(true);
        transparentPanel.setBackground(Color.CYAN);

        accordion.addTab("Datos Generales de " + AtributosUsuarioConexion.getUser(), transparentPanel);
        accordion.addTab("Administrar Medicos", transparentPanel);
        accordion.addTab("Administrar Enfermeras", transparentPanel);
        accordion.addTab("Administrar Pacientes", transparentPanel);
        accordion.addTab("Administrar Inventario", transparentPanel);
        accordion.addTab("Administrar Laboratorio Interno", transparentPanel);
    }

    private void agregarTabCajero(JSCAccordion accordion) {

    }

    private void agregarTabROOT(JSCAccordion accordion) {
        transparentPanel.setOpaque(true);
        transparentPanel.setBackground(Color.CYAN);

        accordion.addTab("Administrar Usuarios", transparentPanel);
        accordion.addTab("Administrar Medicos", transparentPanel);
        accordion.addTab("Administrar Enfermeras", transparentPanel);
        accordion.addTab("Administrar Pacientes", transparentPanel);
        accordion.addTab("Administrar Inventario", transparentPanel);
        accordion.addTab("Administrar Laboratorio Interno", transparentPanel);
    }

    private void agregarTabs(JSCAccordion accordion) {

        transparentPanel.setOpaque(true);
        transparentPanel.setBackground(Color.CYAN);

        accordion.addTab("Medicos", transparentPanel);
        accordion.addTab("Pacientes", transparentPanel);
        accordion.addTab("Informacion del Hospital", transparentPanel);
        accordion.addTab("Configuraciones", transparentPanel);
        accordion.addTab("Analisis Clinico", transparentPanel);
    }

    class VerificacionInternet extends Thread {

        public void run() {
            while (true) {
                try {
                    Socket s = new Socket(dirWeb, puerto);
                    if (s.isConnected()) {
                        estadoConexion = true;
                    } else {
                        estadoConexion = false;
                    }
                } catch (Exception ex) {

                }
            }
        }
    }

    class Hora extends Thread {

        public void run() {
            while (true) {
                Date Hoy = new java.util.Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a  EEEEEE, dd 'de' MMMM 'de' yyyy");
                Fecha.setText(sdf.format(Hoy));
                esperar();
            }
        }

        public void esperar() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI(sf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraEstado;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}