package Form;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.Color;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Form.KoneksiDB;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author 2B
 */
public class Form_InputNilai extends javax.swing.JDialog {
    public String nopenilaian;
    public String NIS;
    public String namakelas;
    public String semester;
    public String tahun;
    public String nilaispiritual;
    public String nilaimotorik;
    public String nilaikognitif;
    public String nilaisosialemosional;
    public String nilaitingkatpencapaiankeseluruhan;
    
    public String getnopenilaian(){
    return nopenilaian;
    }
      public String getNIS(){
        return NIS;
    }
       public String getnamakelas(){
        return namakelas;
    }
        public String getsemester(){
        return semester;
    }
     public String gettahun(){
        return tahun;
    }
      public String getnilaispiritual(){
        return  nilaispiritual;
    }
       public String getnilaimotorik(){
        return nilaimotorik;
    }
       public String getnilaikognitif(){
        return nilaikognitif;
    }
       public String getnilaisosialemosional(){
        return nilaisosialemosional;
    }
       public String getnilaitingkatpencapaiankeseluruhan(){
        return nilaitingkatpencapaiankeseluruhan;
    }
    /**
     * Creates new form Form_Input_Nilai
     */
    public Form_InputNilai(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void Transferdata(){
        TxtNoPenilaian.setText(nopenilaian);
        TxtNIS.setText(NIS);
        TxtNamaKelas.setText(namakelas);
        TxtTahunPelajaran.setText(tahun);
        TxtSemester.setText(semester);
        TxtSpiritual.setText(nilaispiritual);
        TxtMotorik.setText(nilaimotorik);
        TxtKognitif.setText(nilaikognitif);
        TxtSosialEmosional.setText(nilaisosialemosional);
        TxtTingkatPencapaian.setText(nilaitingkatpencapaiankeseluruhan); 
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtNoPenilaian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTahunPelajaran = new javax.swing.JTextField();
        BtnSimpan = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtNIS = new javax.swing.JTextField();
        TxtSpiritual = new javax.swing.JTextField();
        TxtMotorik = new javax.swing.JTextField();
        TxtSemester = new javax.swing.JTextField();
        TxtKognitif = new javax.swing.JTextField();
        TxtTingkatPencapaian = new javax.swing.JTextField();
        TxtSosialEmosional = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtNamaKelas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Data Nilai");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Form ini digunakan untuk Input Data Nilai");

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("No Penilaian");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Tahun Pelajaran");

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/save2.png"))); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit2.png"))); // NOI18N
        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/batal2.png"))); // NOI18N
        BtnBatal.setText("Batal");
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("NIS");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Semester");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Nilai Spiritual");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Nilai Motorik");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Nilai Kognitif");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Nilai Sosialemosional");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Nilai Tingkat Pencapaian");

        TxtNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNISActionPerformed(evt);
            }
        });

        TxtSosialEmosional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSosialEmosionalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Nama Kelas");

        TxtNamaKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaKelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(BtnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBatal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMotorik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TxtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtSosialEmosional, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtTingkatPencapaian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(TxtKognitif, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(TxtNoPenilaian, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSpiritual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTahunPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(TxtNamaKelas)
                .addGap(145, 145, 145))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNoPenilaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtTahunPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtNamaKelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtKognitif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSpiritual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSosialEmosional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMotorik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTingkatPencapaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpan)
                    .addComponent(BtnEdit)
                    .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        if(TxtNoPenilaian.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "No Penilaian Kosong");
        }else if(TxtNIS.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "NIS Kosong");
        }else if(TxtNamaKelas.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Kelas Kosong");
        }else if(TxtTahunPelajaran.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Tahun Pelajaran Kosong");
        }else if(TxtSemester.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Semester Kosong");
        }else if(TxtSpiritual.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Spiritual Kosong");
        }else if(TxtMotorik.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Motorik Kosong");
        }else if(TxtKognitif.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Kognitif Kosong");
         }else if(TxtSosialEmosional.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Sosialemosional Kosong");
             }else if(TxtTingkatPencapaian.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Pencapaian Keseluruhan Kosong");
        }else{
            String vnopenilaian = String.valueOf(TxtNoPenilaian.getText());
            String vNIS = String.valueOf(TxtNIS.getText());
            String vnamakelas = String.valueOf(TxtNamaKelas.getText());
            String vtahun = String.valueOf(TxtTahunPelajaran.getText());
            String vsemester = String.valueOf(TxtSemester.getText());
            String vnilaispiritual = String.valueOf(TxtSpiritual.getText());
            String vnilaimotorik = String.valueOf(TxtMotorik.getText());
            String vnilaikognitif = String.valueOf(TxtKognitif.getText());
            String vnilaisosialemosional = String.valueOf(TxtSosialEmosional.getText());
            String vnilaitingkatpencapaiankeseluruhan = String.valueOf(TxtTingkatPencapaian.getText());
            try {
                Statement statement =(Statement)KoneksiDB.getcoConnection().createStatement();
                statement.executeUpdate("insert into tbl_nilaisiswa(no_penilaian,nis_siswa,nm_kelas,semester,tahun_pelajaran,nilai_spiritual,nilai_motorik,nilai_kognitif,nilai_sosialemosional,nilai_tingkatpencapaiankeseluruhan)"
                    +"Value('"+vnopenilaian+"','"+vNIS+"','"+vnamakelas+"','"+vtahun+"','"+vsemester+"','"+vnilaispiritual+"','"+vnilaimotorik+"','"+vnilaikognitif+"','"+vnilaisosialemosional+"','"+vnilaitingkatpencapaiankeseluruhan+"');");
                statement.close();
                JOptionPane.showMessageDialog(null,"Data Tersimpan");
                TxtNoPenilaian.setText("");
                TxtNIS.setText("");
                TxtNamaKelas.setText("");
                TxtTahunPelajaran.setText("");
                TxtSemester.setText("");
                TxtSpiritual.setText("");
                TxtMotorik.setText("");
                TxtKognitif.setText("");
                TxtSosialEmosional.setText("");
                TxtTingkatPencapaian.setText(""); 
                TxtNoPenilaian.requestFocus();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Data Tidak Tersimpan");
            }
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        if(TxtNoPenilaian.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "No Penilaian Kosong");
        }else if(TxtNIS.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "NIS Kosong");
        }else if(TxtNamaKelas.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Kelas Kosong");
        }else if(TxtTahunPelajaran.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Tahun Pelajaran Kosong");
        }else if(TxtSemester.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Semester Kosong");
        }else if(TxtSpiritual.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Spiritual Kosong");
        }else if(TxtMotorik.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Motorik Kosong");
        }else if(TxtKognitif.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Kognitif Kosong");
         }else if(TxtSosialEmosional.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Sosialemosional Kosong");
             }else if(TxtTingkatPencapaian.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nilai Pencapaian Keseluruhan Kosong");
        }else{
            String vnopenilaian = String.valueOf(TxtNoPenilaian.getText());
            String vNIS = String.valueOf(TxtNIS.getText());
            String vnamakelas = String.valueOf(TxtNamaKelas.getText());
            String vtahun = String.valueOf(TxtTahunPelajaran.getText());
            String vsemester = String.valueOf(TxtSemester.getText());
            String vnilaispiritual = String.valueOf(TxtSpiritual.getText());
            String vnilaimotorik = String.valueOf(TxtMotorik.getText());
            String vnilaikognitif = String.valueOf(TxtKognitif.getText());
            String vnilaisosialemosional = String.valueOf(TxtSosialEmosional.getText());
            String vnilaitingkatpencapaiankeseluruhan = String.valueOf(TxtTingkatPencapaian.getText());
            try {
                Statement statement =(Statement)KoneksiDB.getcoConnection().createStatement();
                statement.executeUpdate("update tbl_nilaisiswa set no_penilaian='"+vnopenilaian+"' "
                    + "where nis_siswa='"+vNIS+"'");
                statement.close();
                JOptionPane.showMessageDialog(null,"Data Tersimpan");
                TxtNoPenilaian.setText("");
                TxtNIS.setText("");
                TxtNamaKelas.setText("");
                TxtTahunPelajaran.setText("");
                TxtSemester.setText("");
                TxtSpiritual.setText("");
                TxtMotorik.setText("");
                TxtKognitif.setText("");
                TxtSosialEmosional.setText("");
                TxtTingkatPencapaian.setText(""); 
                TxtNoPenilaian.requestFocus();

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Data Tidak Tersimpan");
            }
        }
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
                TxtNoPenilaian.setText("");
                TxtNIS.setText("");
                TxtNamaKelas.setText("");
                TxtTahunPelajaran.setText("");
                TxtSemester.setText("");
                TxtSpiritual.setText("");
                TxtMotorik.setText("");
                TxtKognitif.setText("");
                TxtSosialEmosional.setText("");
                TxtTingkatPencapaian.setText(""); 
                TxtNoPenilaian.requestFocus();
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void TxtNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNISActionPerformed

    private void TxtSosialEmosionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSosialEmosionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSosialEmosionalActionPerformed

    private void TxtNamaKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaKelasActionPerformed

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
            java.util.logging.Logger.getLogger(Form_InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Form_InputNilai dialog = new Form_InputNilai(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JTextField TxtKognitif;
    private javax.swing.JTextField TxtMotorik;
    private javax.swing.JTextField TxtNIS;
    private javax.swing.JTextField TxtNamaKelas;
    private javax.swing.JTextField TxtNoPenilaian;
    private javax.swing.JTextField TxtSemester;
    private javax.swing.JTextField TxtSosialEmosional;
    private javax.swing.JTextField TxtSpiritual;
    private javax.swing.JTextField TxtTahunPelajaran;
    private javax.swing.JTextField TxtTingkatPencapaian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
