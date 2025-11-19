package vista;
import javax.swing.JOptionPane;
import logica.*;
/**
 *
 * @author ivans
 */
public class proFraccionario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(proFraccionario.class.getName());

    public proFraccionario() {
        initComponents();
        
        f1 = new Fraccionario();
        f2 = new Fraccionario();//null ambas
        // No hay resultado al iniciar; usar null para poder mostrar mensajes
        r = null;
        
        habilitarNoHabilitarOperaciones(false);
        btnEditar.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }
    public void habilitarNoHabilitarOperaciones(boolean como){
        btnSumar.setEnabled(como);
        btnRestar.setEnabled(como);
        btnMultiplicar.setEnabled(como);
        btnDividir.setEnabled(como);
        btnDecimal.setEnabled(como);
        btnSimplificar.setEnabled(como);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fraccionaeio1 = new javax.swing.JPanel();
        numerador = new javax.swing.JLabel();
        jtFNum1 = new javax.swing.JTextField();
        denominador = new javax.swing.JLabel();
        jtFDen1 = new javax.swing.JTextField();
        Fraccionario2 = new javax.swing.JPanel();
        numerador2 = new javax.swing.JLabel();
        denominador2 = new javax.swing.JLabel();
        jtFNum2 = new javax.swing.JTextField();
        jtFDen2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        Acciones = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnSimplificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajando con fraccionario"));

        Fraccionaeio1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fraccionario 1"));

        numerador.setText("Numerador");

        denominador.setText("Denominador");

        javax.swing.GroupLayout Fraccionaeio1Layout = new javax.swing.GroupLayout(Fraccionaeio1);
        Fraccionaeio1.setLayout(Fraccionaeio1Layout);
        Fraccionaeio1Layout.setHorizontalGroup(
            Fraccionaeio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fraccionaeio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Fraccionaeio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fraccionaeio1Layout.createSequentialGroup()
                        .addComponent(numerador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtFNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fraccionaeio1Layout.createSequentialGroup()
                        .addComponent(denominador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtFDen1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fraccionaeio1Layout.setVerticalGroup(
            Fraccionaeio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fraccionaeio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Fraccionaeio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerador)
                    .addComponent(jtFNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Fraccionaeio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(denominador)
                    .addComponent(jtFDen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fraccionario2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fraccionario 2"));

        numerador2.setText("Numerador");

        denominador2.setText("Denominador");

        javax.swing.GroupLayout Fraccionario2Layout = new javax.swing.GroupLayout(Fraccionario2);
        Fraccionario2.setLayout(Fraccionario2Layout);
        Fraccionario2Layout.setHorizontalGroup(
            Fraccionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fraccionario2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Fraccionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fraccionario2Layout.createSequentialGroup()
                        .addComponent(numerador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtFNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fraccionario2Layout.createSequentialGroup()
                        .addComponent(denominador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jtFDen2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Fraccionario2Layout.setVerticalGroup(
            Fraccionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fraccionario2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Fraccionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerador2)
                    .addComponent(jtFNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Fraccionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(denominador2)
                    .addComponent(jtFDen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Resultado");

        lbResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbResultado.setText("0.0");

        Acciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccionesLayout = new javax.swing.GroupLayout(Acciones);
        Acciones.setLayout(AccionesLayout);
        AccionesLayout.setHorizontalGroup(
            AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AccionesLayout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AccionesLayout.setVerticalGroup(
            AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setText("Dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnDecimal.setText("Decimal");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btnSimplificar.setText("Simplificar");
        btnSimplificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimplificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiplicar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimplificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar)
                    .addComponent(btnMultiplicar)
                    .addComponent(btnDecimal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestar)
                    .addComponent(btnDividir)
                    .addComponent(btnSimplificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbResultado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Fraccionaeio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fraccionario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Acciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fraccionaeio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fraccionario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarDenominador(String p){
        int den = Integer.parseInt(p);
        
        if(den==0){
            return false;
        }
        return true;
    }
    
    private boolean validarNumero(String parametro){
        // Validar que el parámetro no esté vacío
        if(parametro.isEmpty() || !parametro.matches("-?\\d+")){
            //JOptionPane.showMessageDialog(this, "Ingrese un valor valido");
            return false;
        }
        //return true;
        
        if(!validarDenominador(parametro)){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DIVIDIR ENTRE CERO");
            return false; 
        }
        return true;
        /**         
        // Validar que el parametro solo contenga números
        * cadena en rejects
        if(!parametro.matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Solo se permiten números.");
            return false;
        }
        return true;
        **/
    }
    
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        //boolean esNumero;
        //esNumero = validarNumero(jtFNum1.getText());
        
        /**
        // Si pasa las validaciones, se puede asignar el valor al numerador
        if(esNumero){
            f1.setNumerador(Integer.parseInt(jtFNum1.getText()));
            jtFNum1.setEnabled(false);
        }else jtFNum1.setText(" ");
                
        if(validarNumero(jtFDen1.getText())) f1.setDenominador(Integer.parseInt(jtFDen1.getText()));
        else jtFDen1.setText(" ");
        
        if(validarNumero(jtFNum1.getText()))f2.setNumerador(Integer.parseInt(jtFNum2.getText())); 
        else jtFNum2.setText(" ");
        
        if(validarNumero(jtFDen2.getText()))f2.setDenominador(Integer.parseInt(jtFDen2.getText()));
        else jtFDen2.setText(" ");
        
        lbResultado.setText(f1.toString());
        **/  
                
        boolean validarCampos = true;
        // Revisars cada campo. Si 1 falla la bandera cambia a false.
        if (!validarNumero(jtFNum1.getText())) {
            validarCampos = false;
        }
        if (!validarNumero(jtFNum2.getText())) {
            validarCampos = false;
        }
        if (!validarNumero(jtFDen1.getText())) {
            validarCampos = false;
        }
        if (!validarNumero(jtFDen2.getText())) {
            validarCampos = false;
        }
        
        if(!validarCampos){
            JOptionPane.showMessageDialog(this, "POR FAVOR RELLENE TODOS LOS CAMPOS CON VALORES VALIDOS");
            // Limpiar campos inválidos
            jtFNum1.setText("");
            jtFNum2.setText("");
            jtFDen1.setText("");
            jtFDen2.setText("");
        }
        else {
            f1.setNumerador(Integer.parseInt(jtFNum1.getText()));
            jtFNum1.setEnabled(false);
            f1.setDenominador(Integer.parseInt(jtFDen1.getText()));
            jtFDen1.setEnabled(false);
            
            
            f2.setNumerador(Integer.parseInt(jtFNum2.getText()));
            jtFNum2.setEnabled(false);
            f2.setDenominador(Integer.parseInt(jtFDen2.getText()));
            jtFDen2.setEnabled(false);
            // Habilitar botones de operaciones y acciones tras crear correctamente
            habilitarNoHabilitarOperaciones(true);
            btnEditar.setEnabled(true);
            btnLimpiar.setEnabled(true);
            // Opcional: deshabilitar Crear para evitar crear de nuevo sin editar
            btnCrear.setEnabled(false);
            
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jtFNum1.setText("");
        jtFNum2.setText("");
        jtFDen1.setText("");
        jtFDen2.setText("");
        jtFNum1.setEnabled(true);
        jtFNum2.setEnabled(true);
        jtFDen1.setEnabled(true);
        jtFDen2.setEnabled(true);
        // Resetear resultado y etiqueta
        r = null;
        lbResultado.setText("0.0");
        // Permitir crear nuevamente si estaba deshabilitado
        btnCrear.setEnabled(true);
        habilitarNoHabilitarOperaciones(false);
        btnEditar.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        jtFNum1.setEnabled(true);
        jtFDen1.setEnabled(true);
        jtFNum2.setEnabled(true);
        jtFDen2.setEnabled(true);
        
        // Al editar, invalida el resultado previo
        r = null;
        lbResultado.setText("0.0");
        habilitarNoHabilitarOperaciones(false);
        btnCrear.setEnabled(true);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        r = OperaFraccionario.sumar(f1, f2);
        lbResultado.setText(r.toString());
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        r = OperaFraccionario.multiplicar(f1, f2);
        lbResultado.setText(r.toString());
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        // TODO add your handling code here:
        if (r == null) {
            lbResultado.setText("No hay resultado disponible");
            return;
        }
        double decimal = OperaFraccionario.decimal(r);
        // Conversión simple a String:
        lbResultado.setText(String.valueOf(decimal));
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        // TODO add your handling code here:
        r = OperaFraccionario.restar(f1, f2);
        lbResultado.setText(r.toString());
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
        r = OperaFraccionario.dividir(f1, f2);
        lbResultado.setText(r.toString());
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnSimplificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimplificarActionPerformed
        // TODO add your handling code here:
        if (r == null) {
            lbResultado.setText("No hay resultado para simplificar");
            return;
        }
        r = OperaFraccionario.simplificar(r);
        lbResultado.setText(r.toString());
    }//GEN-LAST:event_btnSimplificarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new proFraccionario().setVisible(true));
    }
    
    Fraccionario f1,f2,r;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acciones;
    private javax.swing.JPanel Fraccionaeio1;
    private javax.swing.JPanel Fraccionario2;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSimplificar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel denominador;
    private javax.swing.JLabel denominador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtFDen1;
    private javax.swing.JTextField jtFDen2;
    private javax.swing.JTextField jtFNum1;
    private javax.swing.JTextField jtFNum2;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel numerador;
    private javax.swing.JLabel numerador2;
    // End of variables declaration//GEN-END:variables
}
