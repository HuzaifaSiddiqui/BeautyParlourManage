package Beauty_Parlour;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Add_Service extends javax.swing.JFrame {

    Connection con=null;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String s;
    public Add_Service() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=connectClass.ConnectDb();
        s=null;
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add_image = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sdes = new javax.swing.JTextArea();
        scat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        scost = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hour = new javax.swing.JSpinner();
        minute = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add File_701px.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("ADD SERVICE");

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 400));

        add_image.setBackground(new java.awt.Color(36, 47, 65));
        add_image.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        add_image.setForeground(new java.awt.Color(255, 255, 255));
        add_image.setText("Add Image");
        add_image.setBorder(null);
        add_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_imageActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 47, 65));
        jLabel3.setText("Service Category:");
        jLabel3.setPreferredSize(new java.awt.Dimension(184, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 47, 65));
        jLabel4.setText("Service Code:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 47, 65));
        jLabel5.setText("Service Cost:");

        scode.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        scode.setForeground(new java.awt.Color(36, 47, 65));
        scode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 47, 65)));
        scode.setCaretColor(new java.awt.Color(36, 47, 65));
        scode.setPreferredSize(new java.awt.Dimension(2, 30));
        scode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scodeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 47, 65));
        jLabel6.setText("Description:");

        sdes.setColumns(16);
        sdes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        sdes.setRows(4);
        sdes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 47, 65)));
        jScrollPane2.setViewportView(sdes);

        scat.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        scat.setForeground(new java.awt.Color(36, 47, 65));
        scat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Hair", "Facial", "Waxing", "Threading", "Bleach", "Nails", "Body Spa", "Mehandi", "Makeup", " " }));
        scat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 47, 65)));
        scat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scat.setPreferredSize(new java.awt.Dimension(56, 30));
        scat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 47, 65));
        jLabel7.setText("Service ID:");
        jLabel7.setPreferredSize(new java.awt.Dimension(184, 30));

        sid.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        sid.setForeground(new java.awt.Color(36, 47, 65));
        sid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 47, 65)));
        sid.setCaretColor(new java.awt.Color(36, 47, 65));
        sid.setPreferredSize(new java.awt.Dimension(2, 30));
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 47, 65));
        jLabel8.setText("Service Name:");

        scost.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        scost.setForeground(new java.awt.Color(36, 47, 65));
        scost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 47, 65)));
        scost.setCaretColor(new java.awt.Color(36, 47, 65));
        scost.setPreferredSize(new java.awt.Dimension(2, 30));
        scost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scostActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save_45px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear Symbol_45px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Undo_45px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit_45px.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(36, 47, 65));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SAVE");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 47, 65));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CLEAR");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 47, 65));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BACK");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 47, 65));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EXIT");

        sname.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        sname.setForeground(new java.awt.Color(36, 47, 65));
        sname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 47, 65)));
        sname.setCaretColor(new java.awt.Color(36, 47, 65));
        sname.setPreferredSize(new java.awt.Dimension(2, 30));
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 47, 65), 2));
        lblimage.setPreferredSize(new java.awt.Dimension(250, 250));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 47, 65));
        jLabel13.setText("Service Period:");

        hour.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        hour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        hour.setBorder(null);

        minute.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        minute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        minute.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(add_image, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_image, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(scode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(scost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
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

    private void scodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scodeActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void scostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scostActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_scostActionPerformed

    private void scatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scatActionPerformed
        /*if(scat.getSelectedItem()=="-Select-")
        {
            snam.removeAllItems();
            snam.setEnabled(false);
        }
        if(scat.getSelectedItem()=="Hair")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Cuts");
            snam.addItem("Relaxers");
            snam.addItem("Perms");
            snam.addItem("Colors");
            snam.addItem("Shampoo");
            snam.addItem("Curling"); 
            snam.addItem("Conditioning");
            snam.addItem("Reconstructing");
            snam.addItem("Weaving");
            snam.addItem("Waving");
            
            
        }
       if(scat.getSelectedItem()=="Facial")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Fruit");
            snam.addItem("Platinum");
            snam.addItem("Diamond");
            snam.addItem("Gold");
            snam.addItem("Silver");
            snam.addItem("Ragha");
            snam.addItem("D.Tan");
            snam.addItem("Papaya");
            snam.addItem("Aroma");
            snam.addItem("Aloevera");
            snam.addItem("Oxy Glow");
            snam.addItem("Insta Glow");
        }
       if(scat.getSelectedItem()=="Waxing")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Full Arms");
            snam.addItem("Half Arms");
            snam.addItem("Full Legs");
            snam.addItem("Half Legs");
            snam.addItem("Under Arms");
            snam.addItem("Back");
            snam.addItem("Front");
            snam.addItem("Full Body");
            
        }
       if(scat.getSelectedItem()=="Threading")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Eye Rows");
            snam.addItem("Upper Lips");
            snam.addItem("Chin");
            snam.addItem("Forehead");
            snam.addItem("Side Looks");
            snam.addItem("Full Face");
        }
       if(scat.getSelectedItem()=="Bleach")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Face");
            snam.addItem("Face & Neck");
            snam.addItem("Full Arms");
            snam.addItem("Full Legs");
            snam.addItem("Full Body");
            snam.addItem("Feet");
            snam.addItem("Under Arms");
            
        }
       if(scat.getSelectedItem()=="Nails")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Menicure");
            snam.addItem("Pedicure");
        }
       if(scat.getSelectedItem()=="Body Spa")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Head Message");
            snam.addItem("Foot Message");
            snam.addItem("Body Message");
            snam.addItem("Body Scrub");
            snam.addItem("Body Polishing");
            
            
        }
       if(scat.getSelectedItem()=="Mehandi")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("______________");
        }
       
       if(scat.getSelectedItem()=="MakeUp")
        {
            snam.removeAllItems();
            snam.setEnabled(true);
            snam.addItem("Bridal MakeUp");
            snam.addItem("Party MakeUp");
            snam.addItem("Engagement MakeUp");
            snam.addItem("Reception MakeUp");
            snam.addItem("Light MakeUp");
        }*/
    }//GEN-LAST:event_scatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        //st=con.createStatement();
        ps=con.prepareStatement("insert into Service(Service_ID, Service_Category, Service_Name, Service_Code, Service_Cost, Description, image, hour, minute)values(?,?,?,?,?,?,?,?,?)");
        String sql="insert into Service(Service_ID, Service_Category, Service_Name, Service_Code, Service_Cost, Description, image, hour, minute)values(?,?,?,?,?,?,?,?,?)";
        InputStream is=new FileInputStream(new File(s));
        ps.setString(1,sid.getText());
        ps.setString(2,scat.getSelectedItem().toString());
        ps.setString(3,sname.getText());
        ps.setString(4,scode.getText());
        ps.setString(5,scost.getText());
        ps.setString(6,sdes.getText());
        ps.setBlob(7,is);
        String h=hour.getValue().toString();
        String p=minute.getValue().toString();
        
        if(h.length()==1)
        {
            String m="0"+h;
            
            ps.setString(8,m);
        }
        else
        {
        ps.setString(8,h);
        }
        
        if(p.length()==1)
        {
            String q="0"+p;
            ps.setString(9,q);
        }
        else
        {
        ps.setString(9,p);
        }
        
        
        ps.executeUpdate();
        
        
        
        
        
        /*String id=sid.getText();
        String cat=scat.getSelectedItem().toString();
        String name=sname.getText();
        String code=scode.getText();
        int cost=Integer.parseInt(scost.getText());
        String des=sdes.getText();
        String image=txt.getText();
        image=image.replace("\\","\\\\");*/
        /*String sql="insert into Service(Service_ID, Service_Category, Service_Name, Service_Code, Service_Cost, Description, image)values('"+id+"','"+cat+"','"+name+"','"+code+"',"+cost+",'"+des+"','"+image+"')";
        st.executeUpdate(sql);*/
        JOptionPane.showMessageDialog(null, "Successfull Saved");
        
        
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        Main_Module mm=new Main_Module();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void add_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_imageActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("'.IMAGE","jpg","gif","png");
        chooser.addChoosableFileFilter(filter);
        int result=chooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=chooser.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            lblimage.setIcon(ResizeImage(path,null));
            s=path;
            
            
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("noDAta");
        }
        //chooser.showOpenDialog(null);
        /*File f=chooser.getSelectedFile();
        String Filename=f.getAbsolutePath();
        txt.setText(Filename);
        Image getAbsolutePath=null;
        ImageIcon icon=new ImageIcon(Filename);
        Image image=icon.getImage().getScaledInstance(lblimage.getWidth(),lblimage.getHeight(),Image.SCALE_SMOOTH);
        lblimage.setIcon(icon);*/
        
    }//GEN-LAST:event_add_imageActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //sid.setText(null);
        scat.setSelectedItem("-Select-");
        sname.setText(null);
        scode.setText(null);
        scost.setText(null);
        sdes.setText(null);
        lblimage.setIcon(null);
        hour.setValue(0);
        minute.setValue(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    public ImageIcon ResizeImage(String imgPath, byte[] pic){
        ImageIcon MyImage=null;
        if(imgPath!=null)
        {
         MyImage=new ImageIcon(imgPath);
        }else{
            MyImage=new ImageIcon(pic);
        }
        Image img=MyImage.getImage();
        Image newImage=img.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImage);
        return image;
        
    }
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
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_image;
    private javax.swing.JSpinner hour;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblimage;
    private javax.swing.JSpinner minute;
    private javax.swing.JComboBox<String> scat;
    private javax.swing.JTextField scode;
    private javax.swing.JTextField scost;
    private javax.swing.JTextArea sdes;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}
