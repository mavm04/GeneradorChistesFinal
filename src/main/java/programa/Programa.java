/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programa;

import conexion_http.ConexionHTTP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRadioButton;
import modelos.Joke;
import modelos2.ListaChistes;
import serviciojson.JsonService;

/**
 *
 * @author miguel
 */
public class Programa extends javax.swing.JFrame {

    private List<String> listaCategorias = new ArrayList<>();
    private String lenguaje = "";
    private String numChistes = "";
    private Joke chiste;
    private ListaChistes listaChistes;

    /**
     * Creates new form Programa
     */
    public Programa() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListIdioma = new javax.swing.JList<>();
        jLabelTextoSelecIdioma = new javax.swing.JLabel();
        jLabelTextoSelecCat = new javax.swing.JLabel();
        jLabelTextoSelectCant = new javax.swing.JLabel();
        jRadioButtonProg = new javax.swing.JRadioButton();
        jRadioButtonMisc = new javax.swing.JRadioButton();
        jRadioButtonPun = new javax.swing.JRadioButton();
        jRadioButtonDark = new javax.swing.JRadioButton();
        jRadioButtonSpooky = new javax.swing.JRadioButton();
        jRadioButtonChrist = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonGenerarChistes = new javax.swing.JButton();
        jRadioButtonTodasLasCat = new javax.swing.JRadioButton();
        jComboNumChistes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jListIdioma.setBackground(new java.awt.Color(102, 102, 102));
        jListIdioma.setBorder(null);
        jListIdioma.setForeground(new java.awt.Color(255, 255, 255));
        jListIdioma.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "en - English", "es - Español", "cs - Czech", "de - German", "fr - French", "pt - Portuguese" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListIdioma);

        jLabelTextoSelecIdioma.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelTextoSelecIdioma.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextoSelecIdioma.setText("1- Selecciona el Idioma de los chistes:");

        jLabelTextoSelecCat.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelTextoSelecCat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextoSelecCat.setText("2- Selecciona la categoría de los chistes:");

        jLabelTextoSelectCant.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelTextoSelectCant.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextoSelectCant.setText("3- Selecciona la cantidad de chistes a mostrar:");

        jRadioButtonProg.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonProg.setText("Programming");
        jRadioButtonProg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonProg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonProgMouseClicked(evt);
            }
        });
        jRadioButtonProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonProgActionPerformed(evt);
            }
        });

        jRadioButtonMisc.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMisc.setText("Miscellaneous");
        jRadioButtonMisc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMiscMouseClicked(evt);
            }
        });

        jRadioButtonPun.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonPun.setText("Pun");
        jRadioButtonPun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonPunMouseClicked(evt);
            }
        });
        jRadioButtonPun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPunActionPerformed(evt);
            }
        });

        jRadioButtonDark.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonDark.setText("Dark");
        jRadioButtonDark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonDarkMouseClicked(evt);
            }
        });
        jRadioButtonDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDarkActionPerformed(evt);
            }
        });

        jRadioButtonSpooky.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonSpooky.setText("Spooky");
        jRadioButtonSpooky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonSpookyMouseClicked(evt);
            }
        });

        jRadioButtonChrist.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonChrist.setText("Christmas");
        jRadioButtonChrist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonChristMouseClicked(evt);
            }
        });
        jRadioButtonChrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonChristActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GENERADOR DE CHISTES MALOS");

        jButtonGenerarChistes.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButtonGenerarChistes.setForeground(new java.awt.Color(153, 204, 255));
        jButtonGenerarChistes.setText("Generar chistes");
        jButtonGenerarChistes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerarChistesMouseClicked(evt);
            }
        });

        jRadioButtonTodasLasCat.setFont(new java.awt.Font("Liberation Sans", 2, 15)); // NOI18N
        jRadioButtonTodasLasCat.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTodasLasCat.setSelected(true);
        jRadioButtonTodasLasCat.setText("Todas las opciones");
        jRadioButtonTodasLasCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonTodasLasCatMouseClicked(evt);
            }
        });
        jRadioButtonTodasLasCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodasLasCatActionPerformed(evt);
            }
        });

        jComboNumChistes.setBackground(new java.awt.Color(102, 102, 102));
        jComboNumChistes.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jComboNumChistes.setForeground(new java.awt.Color(255, 255, 255));
        jComboNumChistes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTextoSelectCant, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboNumChistes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTextoSelecCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(170, 170, 170))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTextoSelecIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(46, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonProg)
                                    .addComponent(jRadioButtonDark)
                                    .addComponent(jRadioButtonMisc))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonPun)
                                    .addComponent(jRadioButtonChrist)
                                    .addComponent(jRadioButtonSpooky)))
                            .addComponent(jRadioButtonTodasLasCat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButtonGenerarChistes)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTextoSelecIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTextoSelecCat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTodasLasCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonProg)
                    .addComponent(jRadioButtonPun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMisc)
                    .addComponent(jRadioButtonSpooky))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDark)
                    .addComponent(jRadioButtonChrist))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoSelectCant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboNumChistes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGenerarChistes)
                .addContainerGap(40, Short.MAX_VALUE))
        );

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

    private void jRadioButtonDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDarkActionPerformed

    private void jRadioButtonProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonProgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonProgActionPerformed

    private void jButtonGenerarChistesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarChistesMouseClicked
        // Lógica del programa

        //Saco el lenguaje 
        lenguaje = jListIdioma.getSelectedValue();
        System.out.println("lenguaje: " + lenguaje);
        //Hago una lista de JRadioButton y añado los de categoria para sacar los resultados
        List<JRadioButton> listaTmpJRadioButton = new ArrayList<>();
        listaTmpJRadioButton.add(jRadioButtonChrist);
        listaTmpJRadioButton.add(jRadioButtonDark);
        listaTmpJRadioButton.add(jRadioButtonMisc);
        listaTmpJRadioButton.add(jRadioButtonProg);
        listaTmpJRadioButton.add(jRadioButtonPun);
        listaTmpJRadioButton.add(jRadioButtonSpooky);
        listaTmpJRadioButton.add(jRadioButtonTodasLasCat);

        //Recorro la lista de JRadioButton para que si esta seleccionado, lo añada a la lista de 
        //strings de categorias 
        for (JRadioButton jRadioButton : listaTmpJRadioButton) {
            if (jRadioButton.isSelected()) {
                listaCategorias.add(jRadioButton.getText().trim());
            }
        }

        //Saco el numero de chistes
        numChistes = jComboNumChistes.getSelectedItem().toString().trim();

        System.out.println("numChistes: " + numChistes);

        try {
            String url = generarUrl1Chiste();
            String fichero = ConexionHTTP.peticionHttpGet(url);

            if (numChistes.equalsIgnoreCase("1")) {

                chiste = (Joke) JsonService.stringToPojo(fichero, Joke.class);
                System.out.println(chiste);
                new ResultadoPrograma(this, true).setVisible(true);
            } else {

                listaChistes = (ListaChistes) JsonService.stringToPojo(fichero, ListaChistes.class);
                new ResultadoPrograma(this, true).setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonGenerarChistesMouseClicked

    private void jRadioButtonProgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonProgMouseClicked
        jRadioButtonTodasLasCat.setSelected(false);
    }//GEN-LAST:event_jRadioButtonProgMouseClicked

    private void jRadioButtonMiscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMiscMouseClicked
        jRadioButtonTodasLasCat.setSelected(false);
    }//GEN-LAST:event_jRadioButtonMiscMouseClicked

    private void jRadioButtonDarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonDarkMouseClicked
        jRadioButtonTodasLasCat.setSelected(false);
    }//GEN-LAST:event_jRadioButtonDarkMouseClicked

    private void jRadioButtonPunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonPunMouseClicked
        jRadioButtonTodasLasCat.setSelected(false);
    }//GEN-LAST:event_jRadioButtonPunMouseClicked

    private void jRadioButtonSpookyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonSpookyMouseClicked
        jRadioButtonTodasLasCat.setSelected(false);
    }//GEN-LAST:event_jRadioButtonSpookyMouseClicked

    private void jRadioButtonChristMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonChristMouseClicked
        jRadioButtonTodasLasCat.setSelected(false);
    }//GEN-LAST:event_jRadioButtonChristMouseClicked

    private void jRadioButtonPunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPunActionPerformed

    }//GEN-LAST:event_jRadioButtonPunActionPerformed

    private void jRadioButtonTodasLasCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonTodasLasCatMouseClicked
        jRadioButtonChrist.setSelected(false);
        jRadioButtonDark.setSelected(false);
        jRadioButtonMisc.setSelected(false);
        jRadioButtonProg.setSelected(false);
        jRadioButtonPun.setSelected(false);
        jRadioButtonSpooky.setSelected(false);
    }//GEN-LAST:event_jRadioButtonTodasLasCatMouseClicked

    private void jRadioButtonTodasLasCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodasLasCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTodasLasCatActionPerformed

    private void jRadioButtonChristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonChristActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonChristActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerarChistes;
    private javax.swing.JComboBox<String> jComboNumChistes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTextoSelecCat;
    private javax.swing.JLabel jLabelTextoSelecIdioma;
    private javax.swing.JLabel jLabelTextoSelectCant;
    private javax.swing.JList<String> jListIdioma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonChrist;
    private javax.swing.JRadioButton jRadioButtonDark;
    private javax.swing.JRadioButton jRadioButtonMisc;
    private javax.swing.JRadioButton jRadioButtonProg;
    private javax.swing.JRadioButton jRadioButtonPun;
    private javax.swing.JRadioButton jRadioButtonSpooky;
    private javax.swing.JRadioButton jRadioButtonTodasLasCat;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public String generarUrl1Chiste() {
        /*
            private List<String> listaCategorias = new ArrayList<>();
            private String lenguaje = "";
            private String numChistes = "";
         */
        String url = "";

        //logica para la categoria de los chistes
        if (listaCategorias.contains("Todas las opciones")
                || listaCategorias.isEmpty()) {

            url = "https://v2.jokeapi.dev/joke/Any";
        } else if (listaCategorias.size() == 1
                && !listaCategorias.contains("Todas las opciones")) {

            url = "https://v2.jokeapi.dev/joke/" + listaCategorias.get(0);
        } else {

            url = "https://v2.jokeapi.dev/joke/" + String.join(",", listaCategorias);
        }

        //logica para añadir el lenguaje
        if (lenguaje.equalsIgnoreCase("en - English")) {

            url += "?";
        } else {
            url += "?lang=";
            String[] partesLenguaje = lenguaje.split(" - ");
            url += partesLenguaje[0].trim();
        }

        url += "&amount=" + numChistes;

        listaCategorias.removeAll(listaCategorias);
        return url;
    }

    public String getInfo() {

        String resultado = "";

        if (chiste != null) {
            if (chiste.getType().equalsIgnoreCase("single")) {
                resultado = chiste.getSetup();
            } else {
                resultado = chiste.getSetup()
                        + "\n" + chiste.getDelivery();
            }
        } else if (listaChistes != null) {

            for (modelos2.Joke joke : listaChistes.getJokes()) {
                if (chiste.getType().equalsIgnoreCase("single")) {
                    resultado += chiste.getSetup() + "\n" + "\n";
                } else {
                    resultado += chiste.getSetup()
                            + "\n" + chiste.getDelivery() + "\n" + "\n";
                }
            }
        }
        return resultado;
    }
}
