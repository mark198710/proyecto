
package estacionamiento_marcoa;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;   //import javax.swing.table.DefaultTableModel; //algorítmica (pasos) y sintáctica (código)


public class administrador extends javax.swing.JFrame { //creamos nuestra clase publica administrador //algorítmica (pasos) y sintáctica (código)

    //variables para borrar //algorítmica (pasos) y sintáctica (código)
    String Numero="";
    String Nombre="";
    String Marca="";
    String Modelo="";
    String Color="";
    String Placas="";
    String Estado="";
    String Piso="";
    String Cajon="";
    
    
    private File fichero; 
    private LinkedList Guardar2 = new LinkedList();
    ArrayList<datos>lista = new ArrayList<datos>();
    
    public administrador() {
        initComponents();
        this.setLocationRelativeTo(null);//nos aparecera enmedio la ventana
        
        //aplicamos la funcion mouse clicked para seleccionar objetos de la tabla //algorítmica (pasos) y sintáctica (código)
        tabla.addMouseListener(new MouseAdapter(){
            DefaultTableModel model = new DefaultTableModel();
            public void mouseClicked(MouseEvent e){
            int i = tabla.getSelectedRow();
            Numero=(tabla.getValueAt(i,0).toString());
            Nombre=(tabla.getValueAt(i,1).toString());
            Marca=(tabla.getValueAt(i,2).toString());
            Modelo=(tabla.getValueAt(i,3).toString());
            Color=(tabla.getValueAt(i,4).toString());
            Placas=(tabla.getValueAt(i,5).toString());
            Estado=(tabla.getValueAt(i,6).toString());
            Piso=(tabla.getValueAt(i,7).toString());
            Cajon=(tabla.getValueAt(i,8).toString());
            
            }});
          }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tNumero = new javax.swing.JTextField();
        tAcomodador = new javax.swing.JTextField();
        tMarca = new javax.swing.JTextField();
        tModelo = new javax.swing.JTextField();
        tColor = new javax.swing.JTextField();
        tPlacas = new javax.swing.JTextField();
        tEstado = new javax.swing.JTextField();
        t2Numero = new javax.swing.JTextField();
        t2Acomodador = new javax.swing.JTextField();
        t2Modelo = new javax.swing.JTextField();
        t2Color = new javax.swing.JTextField();
        t2Placas = new javax.swing.JTextField();
        t2Estado = new javax.swing.JTextField();
        Añadir = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        ConsultarDocumento = new javax.swing.JButton();
        MostrarDatos = new javax.swing.JButton();
        tdireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        eNumero = new javax.swing.JLabel();
        eAcomodador = new javax.swing.JLabel();
        eMarca = new javax.swing.JLabel();
        eModelo = new javax.swing.JLabel();
        eColor = new javax.swing.JLabel();
        ePlacas = new javax.swing.JLabel();
        eEstado = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        eNumero1 = new javax.swing.JLabel();
        eAcomodador1 = new javax.swing.JLabel();
        eMarca1 = new javax.swing.JLabel();
        eModelo1 = new javax.swing.JLabel();
        eColor1 = new javax.swing.JLabel();
        ePlacas1 = new javax.swing.JLabel();
        eEstado1 = new javax.swing.JLabel();
        editarmodelo = new javax.swing.JTextField();
        editarcolor = new javax.swing.JTextField();
        editarplacas = new javax.swing.JTextField();
        editarestado = new javax.swing.JTextField();
        emodelo = new javax.swing.JLabel();
        eColor2 = new javax.swing.JLabel();
        ePlacas2 = new javax.swing.JLabel();
        eEstado2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TerminarEdicion = new javax.swing.JButton();
        t2Marca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        campoparadatos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tCajon = new javax.swing.JTextField();
        eEstado3 = new javax.swing.JLabel();
        tPiso = new javax.swing.JTextField();
        eEstado4 = new javax.swing.JLabel();
        t2Cajon = new javax.swing.JTextField();
        t2Piso = new javax.swing.JTextField();
        eEstado5 = new javax.swing.JLabel();
        eEstado6 = new javax.swing.JLabel();
        Limpiar2 = new javax.swing.JButton();
        editarpiso = new javax.swing.JTextField();
        editarcajon = new javax.swing.JTextField();
        eEstado7 = new javax.swing.JLabel();
        eEstado8 = new javax.swing.JLabel();
        emarca = new javax.swing.JLabel();
        enombre = new javax.swing.JLabel();
        enumero = new javax.swing.JLabel();
        editarnumero = new javax.swing.JTextField();
        editarnombre = new javax.swing.JTextField();
        editarmarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INGRESO Y EDICION DE DATOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));
        getContentPane().add(tAcomodador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));
        getContentPane().add(tMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 150, -1));
        getContentPane().add(tModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 153, -1));
        getContentPane().add(tColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 150, -1));
        getContentPane().add(tPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 150, -1));
        getContentPane().add(tEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 150, -1));
        getContentPane().add(t2Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 211, 150, -1));
        getContentPane().add(t2Acomodador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 211, 150, -1));
        getContentPane().add(t2Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 211, 150, -1));
        getContentPane().add(t2Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 211, 150, -1));
        getContentPane().add(t2Placas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 211, 150, -1));

        t2Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2EstadoActionPerformed(evt);
            }
        });
        getContentPane().add(t2Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 211, 150, -1));

        Añadir.setText("AÑADIR DATOS:");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        getContentPane().add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 320, -1));

        Limpiar.setText("LIMPIAR CAMPOS DE TEXTO");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 310, -1));

        Guardar.setText("GUARDAR EN DOCUMENTO DE TEXTO");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 310, -1));

        ConsultarDocumento.setText("CONSULTAR DOCUMENTO");
        ConsultarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 306, -1));

        MostrarDatos.setText("PASAR DATOS A LA TABLA");
        MostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 250, 255, -1));

        tdireccion.setEditable(false);
        getContentPane().add(tdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 698, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESO Y EDICION DE DATOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1679, -1));

        eNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNumero.setText("NUMERO ");
        getContentPane().add(eNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 150, -1));

        eAcomodador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eAcomodador.setText("NOM. DE ACOMOD.");
        getContentPane().add(eAcomodador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 75, 150, -1));

        eMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMarca.setText("MARCA");
        getContentPane().add(eMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 75, 150, -1));

        eModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eModelo.setText("MODELO");
        getContentPane().add(eModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 75, 150, 12));

        eColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eColor.setText("COLOR");
        getContentPane().add(eColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 75, 150, -1));

        ePlacas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ePlacas.setText("PLACAS");
        getContentPane().add(ePlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 75, 150, -1));

        eEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado.setText("ESTADO");
        getContentPane().add(eEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 75, 150, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NUMERO DE BOLETO", "NOMBRE DE ACOMODADOR", "MARCA", "MODELO", "COLOR", "PLACAS", "ESTADO DEL VEHICULO", "PISO", "CAJON"
            }
        ));
        jScrollPane4.setViewportView(tabla);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1440, 151));

        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 550, 150, -1));

        Editar.setText("EDITAR");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 150, -1));

        eNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNumero1.setText("NUMERO ");
        getContentPane().add(eNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, 150, -1));

        eAcomodador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eAcomodador1.setText("NOM. DE ACOMOD.");
        getContentPane().add(eAcomodador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 179, 150, -1));

        eMarca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMarca1.setText("MARCA");
        getContentPane().add(eMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 179, 150, -1));

        eModelo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eModelo1.setText("MODELO");
        getContentPane().add(eModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 179, 150, -1));

        eColor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eColor1.setText("COLOR");
        getContentPane().add(eColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 179, 150, -1));

        ePlacas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ePlacas1.setText("PLACAS");
        getContentPane().add(ePlacas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 179, 150, -1));

        eEstado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado1.setText("ESTADO");
        getContentPane().add(eEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 179, 150, -1));
        getContentPane().add(editarmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 150, -1));
        getContentPane().add(editarcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 150, -1));
        getContentPane().add(editarplacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 650, 150, -1));
        getContentPane().add(editarestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, 150, -1));

        emodelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emodelo.setText("MODELO");
        getContentPane().add(emodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 150, -1));

        eColor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eColor2.setText("COLOR");
        getContentPane().add(eColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 150, -1));

        ePlacas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ePlacas2.setText("PLACAS");
        getContentPane().add(ePlacas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, 150, -1));

        eEstado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado2.setText("ESTADO");
        getContentPane().add(eEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, 150, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("introdusca los datos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 205, -1));

        TerminarEdicion.setText("TERMINAR EDICION");
        TerminarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarEdicionActionPerformed(evt);
            }
        });
        getContentPane().add(TerminarEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 150, -1));
        getContentPane().add(t2Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 211, 150, -1));

        jButton1.setText("MOSTRAR DATOS DEL DOCUMENTO SELECCIONADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, 306, -1));

        campoparadatos.setEditable(false);
        getContentPane().add(campoparadatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 331, 698, -1));

        jLabel3.setText("CAMPOS PARA EDITAR DATOS DE LA TABLA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 310, -1));

        jLabel4.setText("CUANDO SE TERMINE DE EDITAR PRECIONAR PARA MOSTRAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 550, 330, -1));

        jLabel5.setText("SELECCIONAR Y PRECIONAR PARA GUARDAR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 260, -1));

        tCajon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCajonActionPerformed(evt);
            }
        });
        getContentPane().add(tCajon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 100, 150, -1));

        eEstado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado3.setText("PISO");
        getContentPane().add(eEstado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 75, 150, -1));

        tPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPisoActionPerformed(evt);
            }
        });
        getContentPane().add(tPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 100, 150, -1));

        eEstado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado4.setText("CAJON");
        getContentPane().add(eEstado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 75, 150, -1));

        t2Cajon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2CajonActionPerformed(evt);
            }
        });
        getContentPane().add(t2Cajon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 211, 150, -1));

        t2Piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2PisoActionPerformed(evt);
            }
        });
        getContentPane().add(t2Piso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 211, 150, -1));

        eEstado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado5.setText("PISO");
        getContentPane().add(eEstado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 179, 150, -1));

        eEstado6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado6.setText("CAJON");
        getContentPane().add(eEstado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 179, 150, -1));

        Limpiar2.setText("LIMPIAR CAMPOS DE TEXTO");
        Limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 310, -1));

        editarpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarpisoActionPerformed(evt);
            }
        });
        getContentPane().add(editarpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 650, 150, -1));

        editarcajon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarcajonActionPerformed(evt);
            }
        });
        getContentPane().add(editarcajon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 650, 150, -1));

        eEstado7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado7.setText("PISO");
        getContentPane().add(eEstado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 630, 150, -1));

        eEstado8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEstado8.setText("CAJON");
        getContentPane().add(eEstado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 630, 150, -1));

        emarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emarca.setText("MARCA");
        getContentPane().add(emarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 150, -1));

        enombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enombre.setText("NOM. DE ACOMOD.");
        getContentPane().add(enombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 150, -1));

        enumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enumero.setText("NUMERO ");
        getContentPane().add(enumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 150, -1));

        editarnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarnumeroActionPerformed(evt);
            }
        });
        getContentPane().add(editarnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 150, -1));

        editarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarnombreActionPerformed(evt);
            }
        });
        getContentPane().add(editarnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 150, -1));
        getContentPane().add(editarmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 150, -1));

        jLabel6.setText("PARA ELIMINAR SELECCIONE LA LINEA Y PRESIONE ELIMINAR:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 550, 350, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("RECUERDE BUSCAR DISPINIBILIDAD DE LUGAR EN LA PESTAÑA CAJON ANTES DE CAPTURAR PISO Y CAJON.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 780, -1));

        jLabel8.setText("UNA VEZ GUARDADO SU DOCUMENTO PUEDE PASAR AL MENU DE BOLETO.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 390, 70));

        jLabel9.setText("CON ESTE BOTON GUARDE SU INFORMACION (SE RECOMIENDA GUARDAR EN LA CARPETA ARCHIVO CLIENTES)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 740, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //con este metodo añadimos los datos capturdos //algorítmica (pasos) y sintáctica (código)
    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        String nuevoItem; // String con datos de lo que guardaremos //algorítmica (pasos) y sintáctica (código)

        // Si algun campo está vacio, mostramos un mensaje informando de que faltan datos //algorítmica (pasos) y sintáctica (código)
        if (tNumero.getText().equals(" ") || tAcomodador.getText().equals(" ") || tMarca.getText().equals(" ") || tModelo.getText().equals(" ")
                ||tColor.getText().equals(" ")|| tPlacas.getText().equals(" ") || tEstado.getText().equals(" ") || tPiso.getText().equals(" ") || tCajon.getText().equals(" ") ) {
            JOptionPane.showMessageDialog(this, "ERROR: Faltan datos", "Mensaje de Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        nuevoItem = tNumero.getText();
        nuevoItem = tAcomodador.getText();
        nuevoItem = tMarca.getText();
        nuevoItem = tModelo.getText();
        nuevoItem = tColor.getText();
        nuevoItem = tPlacas.getText();
        nuevoItem = tEstado.getText();
        nuevoItem = tPiso.getText();
        nuevoItem = tCajon.getText();
        Guardar2.add(nuevoItem);
        t2Numero.setText(tNumero.getText());
        t2Acomodador.setText(tAcomodador.getText());
        t2Marca.setText(tMarca.getText());
        t2Modelo.setText(tModelo.getText());
        t2Color.setText(tColor.getText());
        t2Placas.setText(tPlacas.getText());
        t2Estado.setText(tEstado.getText());
        t2Piso.setText(tPiso.getText());
        t2Cajon.setText(tCajon.getText());
    }//GEN-LAST:event_AñadirActionPerformed

    
    //se creo para el botom limpiar de los jtextfield //algorítmica (pasos) y sintáctica (código)
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        tNumero.setText("");
        tAcomodador.setText("");
        tMarca.setText("");
        tModelo.setText("");
        tColor.setText("");
        tPlacas.setText("");
        tEstado.setText("");
        tPiso.setText("");
        tCajon.setText("");
        t2Numero.setText("");
        t2Acomodador.setText("");
        t2Modelo.setText("");
        t2Color.setText("");
        t2Placas.setText("");
        t2Estado.setText("");
        t2Piso.setText("");
        t2Cajon.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    
    //metodo completo para guardar un archivo de texto //algorítmica (pasos) y sintáctica (código)
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        BufferedWriter writer;
        
        
        
    try {
        JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
        archivo.showSaveDialog(this);
             
            
            if (archivo.getSelectedFile() != null) {
                
               
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile()+ ".txt")) {
                    
                    
                    guardado.write(t2Numero.getText()+"              "); //ponemos los espacios de separacion del archivo
                    guardado.write(t2Acomodador.getText()+"               ");
                    guardado.write(t2Marca.getText()+"                ");
                    guardado.write(t2Modelo.getText()+"               ");
                    guardado.write(t2Color.getText()+"               ");
                    guardado.write(t2Placas.getText()+"               ");
                    guardado.write(t2Estado.getText()+"               ");
                    guardado.write(t2Piso.getText()+"               ");
                    guardado.write(t2Cajon.getText()+"           "+ "\n" );
                   
                    JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
                

    }//GEN-LAST:event_GuardarActionPerformed

    //con este metodo llamamos un documento de texto
    private void ConsultarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarDocumentoActionPerformed
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
        JFileChooser fileChooserCargar = new JFileChooser();
        fileChooserCargar.setFileFilter(filtro);
        fileChooserCargar.setDialogTitle("Abrir");

       int seleccion = fileChooserCargar.showOpenDialog(this);
       if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fileChooserCargar.getSelectedFile();
            tdireccion.setText(fileChooserCargar.getSelectedFile().getPath());
              
            
        }
    }//GEN-LAST:event_ConsultarDocumentoActionPerformed

    //con este vemos los datos introducidos en los jtextfield en la tabla //algorítmica (pasos) y sintáctica (código)
    private void MostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarDatosActionPerformed
        
         datos datos = new datos(t2Numero.getText(),t2Acomodador.getText(),t2Marca.getText(),t2Modelo.getText(),t2Color.getText(),t2Placas.getText(),t2Estado.getText(),t2Piso.getText(),t2Cajon.getText());
          lista.add(datos);
          
          mostrar();
          
        t2Numero.setText("");
        t2Acomodador.setText("");
        t2Marca.setText("");
        t2Modelo.setText("");
        t2Color.setText("");
        t2Placas.setText("");
        t2Estado.setText("");
        t2Piso.setText("");
        t2Cajon.setText("");
    }//GEN-LAST:event_MostrarDatosActionPerformed

    //metodo para eliminar filas en la tabla //algorítmica (pasos) y sintáctica (código)
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        for (int i = 0; i < lista.size(); i++) {
            
            if(Nombre==lista.get(i).getNombre())
            {lista.remove(i);}
        }
        //actualizar tabla //algorítmica (pasos) y sintáctica (código)
        String matris [][]=new String[lista.size()][9];
        for (int i = 0; i < lista.size(); i++) {
            
            matris[i][0]=lista.get(i).getNumero();
            matris[i][1]=lista.get(i).getNombre();
            matris[i][2]=lista.get(i).getMarca();
            matris[i][3]=lista.get(i).getModelo();
            matris[i][4]=lista.get(i).getColor();
            matris[i][5]=lista.get(i).getPlacas();
            matris[i][6]=lista.get(i).getEstado();
            matris[i][7]=lista.get(i).getPiso();
            matris[i][8]=lista.get(i).getCajon();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            
                
                matris,
                new String [] {
                "NUMERO", "NOMBRE DE ACOMODADOR", "MARCA", "MODELO", "COLOR", "PLACAS", "ESTADO DEL VEHICULO", "PISO", "CAJON" 
            }
        ));
        
    }//GEN-LAST:event_EliminarActionPerformed

    //metodo para el boton editar //algorítmica (pasos) y sintáctica (código)
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed

        editarnumero.setText(Numero);
        editarnombre.setText(Nombre);
        editarmarca.setText(Marca);
        editarmodelo.setText(Modelo);
        editarcolor.setText(Color);
        editarplacas.setText(Placas);
        editarestado.setText(Estado);
        editarpiso.setText (Piso);
        editarcajon.setText(Cajon);
       
    }//GEN-LAST:event_EditarActionPerformed

    //metodo completo del boton terminar edicion donde se guarda y edita el texto //algorítmica (pasos) y sintáctica (código)
    private void TerminarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarEdicionActionPerformed
        
        for (int i = 0; i < lista.size(); i++) {
            if(Nombre==lista.get(i).getNombre())
            {
                lista.get(i).setNumero(editarnumero.getText());
                lista.get(i).setNombre(editarnombre.getText());
                lista.get(i).setMarca(editarmarca.getText());
                lista.get(i).setModelo(editarmodelo.getText());
                lista.get(i).setColor(editarcolor.getText());
                lista.get(i).setPlacas(editarplacas.getText());
                lista.get(i).setEstado(editarestado.getText());
                lista.get(i).setPiso(editarpiso.getText());
                lista.get(i).setCajon(editarcajon.getText());
                
            }
        }
        
        String matris [][]=new String[lista.size()][9];
        for (int i = 0; i < lista.size(); i++) {
            
            matris[i][0]=lista.get(i).getNumero();
            matris[i][1]=lista.get(i).getNombre();
            matris[i][2]=lista.get(i).getMarca();
            matris[i][3]=lista.get(i).getModelo();
            matris[i][4]=lista.get(i).getColor();
            matris[i][5]=lista.get(i).getPlacas();
            matris[i][6]=lista.get(i).getEstado();
            matris[i][7]=lista.get(i).getPiso();
            matris[i][8]=lista.get(i).getCajon();
           
            
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            
                
                matris,
                new String [] {
                "NUMERO", "NOMBRE DE ACOMODADOR", "MARCA", "MODELO", "COLOR", "PLACAS", "ESTADO DEL VEHICULO", "PISO", "CAJON"
            }
        ));
        
    }//GEN-LAST:event_TerminarEdicionActionPerformed

    private void t2EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2EstadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          JFileChooser fileChooserCargar = new JFileChooser();
          FileReader fr = new FileReader(tdireccion.getText());//archivo que va a ser leido
          BufferedReader br = new BufferedReader(fr);//leer el archivo
          String texto;
          
          while ((texto=br.readLine())!=null){
              
              campoparadatos.setText(texto);
              this.campoparadatos.setText(fileChooserCargar.getSelectedFile().getPath());
                }  
        }catch(Exception ex){}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2CajonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2CajonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2CajonActionPerformed

    private void t2PisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2PisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2PisoActionPerformed

    private void tPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPisoActionPerformed

    private void editarnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarnumeroActionPerformed

    private void editarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarnombreActionPerformed

    private void Limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar2ActionPerformed
        editarnumero.setText("");
        editarnombre.setText("");
        editarmarca.setText("");
        editarmodelo.setText("");
        editarcolor.setText("");
        editarplacas.setText("");
        editarestado.setText("");
        editarpiso.setText("");
        editarcajon.setText("");
    }//GEN-LAST:event_Limpiar2ActionPerformed

    private void tCajonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCajonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCajonActionPerformed

    private void editarcajonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarcajonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarcajonActionPerformed

    private void editarpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarpisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarpisoActionPerformed

    //clase mostrar para contenido de la tabla //algorítmica (pasos) y sintáctica (código)
    public void mostrar(){
        
        String matris [][]=new String[lista.size()][9];
        for (int i = 0; i < lista.size(); i++) {
            
            matris[i][0]=lista.get(i).getNumero();
            matris[i][1]=lista.get(i).getNombre();
            matris[i][2]=lista.get(i).getMarca();
            matris[i][3]=lista.get(i).getModelo();
            matris[i][4]=lista.get(i).getColor();
            matris[i][5]=lista.get(i).getPlacas();
            matris[i][6]=lista.get(i).getEstado();
            matris[i][7]=lista.get(i).getPiso();
            matris[i][8]=lista.get(i).getCajon();
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            
                
                matris,
                new String [] {
                "NUMERO", "NOMBRE DE ACOMODADOR", "MARCA", "MODELO", "COLOR", "PLACAS", "ESTADO DEL VEHICULO", "PÍSO", "CAJON",
            }
        ));
        
    }
    
    
    
    //creacion de constructores para la parte de la tabla //algorítmica (pasos) y sintáctica (código)
    public class datos{
        
        String Numero,Nombre,Marca,Modelo,Color,Placas,Estado,Piso,Cajon;

        public datos( String Numero, String Nombre, String Marca, String Modelo, String Color, String Placas, String Estado, String Piso, String Cajon) {
            this.Numero = Numero;
            this.Nombre = Nombre;
            this.Marca = Marca;
            this.Modelo = Modelo;
            this.Color = Color;
            this.Placas = Placas;
            this.Estado = Estado;
            this.Piso = Piso;
            this.Cajon = Cajon;
         }

       public String getNumero() {
            return Numero;
        }

        public void setNumero(String Numero) {
            this.Numero = Numero;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public String getMarca() {
            return Marca;
        }

        public void setMarca(String Marca) {
            this.Marca = Marca;
        }

        public String getModelo() {
            return Modelo;
        }

        public void setModelo(String Modelo) {
            this.Modelo = Modelo;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String Color) {
            this.Color = Color;
        }

        public String getPlacas() {
            return Placas;
        }

        public void setPlacas(String Placas) {
            this.Placas = Placas;
        }

        public String getEstado() {
            return Estado;
        }

        public void setEstado(String Estado) {
            this.Estado = Estado;
        }
        
        public String getPiso() {
            return Piso;
        }
        
        public void setPiso(String Piso) {
            this.Piso = Piso;
        }
        
        public String getCajon() {
            return Cajon;
        }
        
        public String setCajon(String Cajon) {
             this.Cajon = Cajon;
            
             return null;
        }
        
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JButton ConsultarDocumento;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Limpiar2;
    private javax.swing.JButton MostrarDatos;
    private javax.swing.JButton TerminarEdicion;
    private javax.swing.JTextField campoparadatos;
    private javax.swing.JLabel eAcomodador;
    private javax.swing.JLabel eAcomodador1;
    private javax.swing.JLabel eColor;
    private javax.swing.JLabel eColor1;
    private javax.swing.JLabel eColor2;
    private javax.swing.JLabel eEstado;
    private javax.swing.JLabel eEstado1;
    private javax.swing.JLabel eEstado2;
    private javax.swing.JLabel eEstado3;
    private javax.swing.JLabel eEstado4;
    private javax.swing.JLabel eEstado5;
    private javax.swing.JLabel eEstado6;
    private javax.swing.JLabel eEstado7;
    private javax.swing.JLabel eEstado8;
    private javax.swing.JLabel eMarca;
    private javax.swing.JLabel eMarca1;
    private javax.swing.JLabel eModelo;
    private javax.swing.JLabel eModelo1;
    private javax.swing.JLabel eNumero;
    private javax.swing.JLabel eNumero1;
    private javax.swing.JLabel ePlacas;
    private javax.swing.JLabel ePlacas1;
    private javax.swing.JLabel ePlacas2;
    private javax.swing.JTextField editarcajon;
    private javax.swing.JTextField editarcolor;
    private javax.swing.JTextField editarestado;
    private javax.swing.JTextField editarmarca;
    private javax.swing.JTextField editarmodelo;
    private javax.swing.JTextField editarnombre;
    private javax.swing.JTextField editarnumero;
    private javax.swing.JTextField editarpiso;
    private javax.swing.JTextField editarplacas;
    private javax.swing.JLabel emarca;
    private javax.swing.JLabel emodelo;
    private javax.swing.JLabel enombre;
    private javax.swing.JLabel enumero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField t2Acomodador;
    private javax.swing.JTextField t2Cajon;
    private javax.swing.JTextField t2Color;
    private javax.swing.JTextField t2Estado;
    private javax.swing.JTextField t2Marca;
    private javax.swing.JTextField t2Modelo;
    private javax.swing.JTextField t2Numero;
    private javax.swing.JTextField t2Piso;
    private javax.swing.JTextField t2Placas;
    private javax.swing.JTextField tAcomodador;
    private javax.swing.JTextField tCajon;
    private javax.swing.JTextField tColor;
    private javax.swing.JTextField tEstado;
    private javax.swing.JTextField tMarca;
    private javax.swing.JTextField tModelo;
    private javax.swing.JTextField tNumero;
    private javax.swing.JTextField tPiso;
    private javax.swing.JTextField tPlacas;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tdireccion;
    // End of variables declaration//GEN-END:variables
}
