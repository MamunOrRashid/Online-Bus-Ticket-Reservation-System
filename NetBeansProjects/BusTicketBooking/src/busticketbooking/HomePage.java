/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busticketbooking;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mp
 */
public class HomePage extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    PreparedStatement pstmt;
    private String s_busId;
    private String s_availableSeat;
    private int i_availableSeat;
    private int i_updatedAvailableSeat;
    String s_userId;

    private String email;
    private String password;
    private String userId;
    private int flag = 0;

    public HomePage() throws SQLException {
        super("HomePage");
        initComponents();
        conn = JavaConnect.ConnecrDb();
    }

    @SuppressWarnings("unchecked")

    //getter and setter methods
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setBusId(String busId) {
        this.s_busId = busId;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        comboboxSelectBus_booking = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboboxBusType_booking = new javax.swing.JComboBox<>();
        comboboxFrom_booking = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboboxTo_booking = new javax.swing.JComboBox<>();
        etDate_booking = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        etTime_booking = new javax.swing.JTextField();
        btnSubmit_booking = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnShowAvailableSeat_booking = new javax.swing.JButton();
        etShowAvailableSeat_booking = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        etWeight_booking = new javax.swing.JTextField();
        etTotalSeatBook_booking = new javax.swing.JTextField();
        btnBookNow_booking = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelBusId_cancellingTicket = new javax.swing.JLabel();
        etUid_cancellingTicket = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        etBusid_cancellingTicket = new javax.swing.JTextField();
        etNoOfSeat_cancellingTicket = new javax.swing.JTextField();
        labelNoOfSeat_cancellingTicket = new javax.swing.JLabel();
        labelWeight_cancellingTicket = new javax.swing.JLabel();
        etWeight_cancellingTicket = new javax.swing.JTextField();
        btnSearch_cancellingTicket = new javax.swing.JButton();
        btnClear_cancellingTicket = new javax.swing.JButton();
        btnDelete_cancellingTicket = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etPayableMoney_payment = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        etEnterMoney_payment = new javax.swing.JTextField();
        btnPayment = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        comboboxTo_checkingfare = new javax.swing.JComboBox();
        comboboxFrom_checkingfare = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        comboboxBusType_checkingfare = new javax.swing.JComboBox();
        etTime_checkingfare = new javax.swing.JTextField();
        etDate_checkingfare = new javax.swing.JTextField();
        btnSubmit_checkingfare = new javax.swing.JButton();
        etName_checkingfare = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        etPrice_checkingfare = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        etNotice_Notification = new javax.swing.JTextField();
        btnShow_noticeBoard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboboxSelectBus_booking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bus", "Welcome", "Grameen Seba", "Borisal", "Vola", "Feni" }));

        jLabel2.setText("Select Bus");

        jLabel3.setText("Selct Type");

        comboboxBusType_booking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "AC", "Non_AC" }));

        comboboxFrom_booking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From", "Dhaka", "Khulna", "Vola", "Feni", "Borisal" }));

        jLabel4.setText("From");

        jLabel5.setText("To");

        comboboxTo_booking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destination", "Dhaka", "Khulna", "Vola", "Feni" }));

        etDate_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDate_bookingActionPerformed(evt);
            }
        });

        jLabel6.setText("Date");

        jLabel7.setText("Time");

        etTime_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTime_bookingActionPerformed(evt);
            }
        });

        btnSubmit_booking.setBackground(new java.awt.Color(0, 204, 255));
        btnSubmit_booking.setText("Submit");
        btnSubmit_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit_bookingActionPerformed(evt);
            }
        });

        jLabel8.setText("Available Seat");

        btnShowAvailableSeat_booking.setBackground(new java.awt.Color(0, 204, 204));
        btnShowAvailableSeat_booking.setText("Click To See Available Seat");
        btnShowAvailableSeat_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAvailableSeat_bookingActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Seat To Book");

        jLabel11.setText("Carried Weight");

        etWeight_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etWeight_bookingActionPerformed(evt);
            }
        });

        btnBookNow_booking.setBackground(new java.awt.Color(0, 153, 51));
        btnBookNow_booking.setText("Book Now");
        btnBookNow_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNow_bookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit_booking)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboboxBusType_booking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxTo_booking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxSelectBus_booking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxFrom_booking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etDate_booking)
                            .addComponent(etTime_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etWeight_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etTotalSeatBook_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(btnBookNow_booking)))))
                .addContainerGap(393, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(353, 353, 353)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(39, 39, 39)
                            .addComponent(etShowAvailableSeat_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(btnShowAvailableSeat_booking)))
                    .addContainerGap(459, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(comboboxSelectBus_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboboxBusType_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboboxFrom_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboboxTo_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etTotalSeatBook_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(etWeight_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(etDate_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(etTime_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookNow_booking))
                .addGap(36, 36, 36)
                .addComponent(btnSubmit_booking)
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(btnShowAvailableSeat_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etShowAvailableSeat_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addContainerGap(379, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Reservation", jPanel1);

        labelBusId_cancellingTicket.setText("Enter UserId");

        jLabel13.setText("Bus Id");

        labelNoOfSeat_cancellingTicket.setText("No of seat");

        labelWeight_cancellingTicket.setText("Weight");

        btnSearch_cancellingTicket.setText("Search");
        btnSearch_cancellingTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_cancellingTicketActionPerformed(evt);
            }
        });

        btnClear_cancellingTicket.setText("Clear");
        btnClear_cancellingTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear_cancellingTicketActionPerformed(evt);
            }
        });

        btnDelete_cancellingTicket.setText("Delete");
        btnDelete_cancellingTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_cancellingTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(labelNoOfSeat_cancellingTicket)
                            .addComponent(labelBusId_cancellingTicket)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelWeight_cancellingTicket)
                                .addGap(33, 33, 33)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etWeight_cancellingTicket)
                            .addComponent(etNoOfSeat_cancellingTicket)
                            .addComponent(etBusid_cancellingTicket)
                            .addComponent(etUid_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSearch_cancellingTicket)
                        .addGap(51, 51, 51)
                        .addComponent(btnClear_cancellingTicket)
                        .addGap(57, 57, 57)
                        .addComponent(btnDelete_cancellingTicket)))
                .addContainerGap(669, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etUid_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBusId_cancellingTicket))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etBusid_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etNoOfSeat_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNoOfSeat_cancellingTicket))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etWeight_cancellingTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelWeight_cancellingTicket))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch_cancellingTicket)
                            .addComponent(btnDelete_cancellingTicket)
                            .addComponent(btnClear_cancellingTicket))))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cancel", jPanel2);

        jLabel1.setText("Payable");

        jLabel9.setText("Enter money");

        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etPayableMoney_payment)
                            .addComponent(etEnterMoney_payment, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnPayment)))
                .addContainerGap(549, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etPayableMoney_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(etEnterMoney_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addComponent(btnPayment)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Payment", jPanel3);

        jLabel23.setText("From");

        jLabel24.setText("To");

        jLabel25.setText("Output :");

        jLabel26.setText("Bus Name");

        comboboxTo_checkingfare.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Destination", "Dhaka", "Khulna", "Vola", "Feni", "Borisal" }));
        comboboxTo_checkingfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxTo_checkingfareActionPerformed(evt);
            }
        });

        comboboxFrom_checkingfare.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "From", "Dhaka", "Khulna", "Vola", "Feni", "Borisal" }));

        jLabel27.setText("Date");

        jLabel28.setText("Time");

        jLabel29.setText("Bus Type");

        comboboxBusType_checkingfare.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "Non_AC" }));

        etTime_checkingfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTime_checkingfareActionPerformed(evt);
            }
        });

        etDate_checkingfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDate_checkingfareActionPerformed(evt);
            }
        });

        btnSubmit_checkingfare.setText("Submit");
        btnSubmit_checkingfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit_checkingfareActionPerformed(evt);
            }
        });

        jLabel30.setText("Price");

        etPrice_checkingfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPrice_checkingfareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etTime_checkingfare)
                            .addComponent(etDate_checkingfare)
                            .addComponent(comboboxTo_checkingfare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxFrom_checkingfare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxBusType_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etPrice_checkingfare)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 579, Short.MAX_VALUE))
                            .addComponent(etName_checkingfare, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(btnSubmit_checkingfare)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboboxFrom_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxTo_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(etName_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(etPrice_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etDate_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etTime_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(comboboxBusType_checkingfare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(91, 91, 91)
                .addComponent(btnSubmit_checkingfare)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Checking Fare", jPanel4);

        jTextField2.setText("Notice");

        btnShow_noticeBoard.setText("Show");
        btnShow_noticeBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow_noticeBoardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(etNotice_Notification, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnShow_noticeBoard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etNotice_Notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(btnShow_noticeBoard)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Notice Board", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 224, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmit_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit_bookingActionPerformed

        String sql = "select * from BUSSCHEDULING where BNAME=? and BTYPE=? and BFROM=? and BTO=? and BDATE=? and BDEPARTURETIME=?";
        try {
            pst = conn.prepareStatement(sql);
            String s_busName = (String) comboboxSelectBus_booking.getSelectedItem();
            String s_busType = (String) comboboxBusType_booking.getSelectedItem();
            String s_fromRoute = (String) comboboxFrom_booking.getSelectedItem();
            String s_toRoute = (String) comboboxTo_booking.getSelectedItem();
            String s_date = etDate_booking.getText();
            String s_time = etTime_booking.getText();
            // Checking date and time format
            boolean b_isDate = false;
            boolean b_isTime1 = false;
            boolean b_isTime2 = false;
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            String timePattern1 = "\\d{1,2}:\\d{1,2}am";
            String timePattern2 = "\\d{1,2}:\\d{1,2}pm";

            b_isDate = s_date.matches(datePattern);
            if (b_isDate == false) {
                JOptionPane.showMessageDialog(null, "Date in wrong format");
            }
            b_isTime1 = s_time.matches(timePattern1);
            b_isTime2 = s_time.matches(timePattern2);
            if ((b_isTime1 == false) && (b_isTime2 == false)) {
                JOptionPane.showMessageDialog(null, "Time in wrong format");
            }
            pst.setString(1, s_busName);
            pst.setString(2, s_busType);
            pst.setString(3, s_fromRoute);
            pst.setString(4, s_toRoute);
            pst.setString(5, s_date);
            pst.setString(6, s_time);
            rs = pst.executeQuery();

            //if bus available , pass data of busId to SeatReservation class and go to that class form
            SeatReservation seat = null;
            String s_availableSeat;//= rs.getString("BAVAILABLE");
            int i_availableSeat;// = Integer.parseInt(s_availableSeat);

            if (rs.next()) {

                s_busId = rs.getString("BID");
                s_availableSeat = rs.getString("BAVAILABLE");
                i_availableSeat = Integer.parseInt(s_availableSeat);
                if (i_availableSeat != 0) {
                    JOptionPane.showMessageDialog(null, "seat available, You can book!");
                    ///setVisible(false);
                    /// seat = new SeatReservation();
                    /// seat.setBusId(s_busId);
                    /// seat.setVisible(true);
                    //setBusId(s_busId);
                    // rs.close();
                    //pst.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Seat not available to book");
                }

            } else {
                JOptionPane.showMessageDialog(null, "There is no bus available");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } /*finally {
         try {
         //rs.close();
         // pst.close();
         } catch (SQLException e) {
         System.out.println(e);
         }
         }*/


        /*  // TODO add your handling code here:
         String s_busName = (String) comboboxSelectBus_booking.getSelectedItem();
         String s_busType = (String) comboboxBusType_booking.getSelectedItem();
         String s_fromRoute = (String) comboboxFrom_booking.getSelectedItem();
         String s_toRoute = (String) comboboxTo_booking.getSelectedItem();
         String s_date = etDate_booking.getText();
         String s_time = etTime_booking.getText();

         String sql = "select * from busscheduling where bname=? and btype=? and bfrom=? and bto=? and bdeparturetime=? and bdate=?";
         try {
         pst = conn.prepareStatement(sql);

         pst.setString(1, s_busName);
         pst.setString(2, s_busType);
         pst.setString(3, s_fromRoute);
         pst.setString(4, s_toRoute);
         pst.setString(5, s_date);
         pst.setString(6, s_time);
         rs = pst.executeQuery();

         if (rs.next()) {

         JOptionPane.showMessageDialog(null, "Found!!");
         flag = 1;
         rs.close();
         pst.close();
         }

         //pst.setString(1, etEmail_login.getText());
         } catch (SQLException ex) {
         Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
         }
         */

    }//GEN-LAST:event_btnSubmit_bookingActionPerformed

    private void etTime_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTime_bookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTime_bookingActionPerformed

    private void etDate_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDate_bookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etDate_bookingActionPerformed

    private void btnBookNow_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNow_bookingActionPerformed
       // String sql1 = "select uid from registration where email=? and password=?";
        String sql2 = "insert into booking_information(uid,bid,noofseat,weight_kg,money)values(?,?,?,?,?)";
        String sql3 = "select bavailable from busscheduling where bid=?";
        String sql4 = "update busscheduling set bavailable=? where bid=?";
      
        try {
            pst = conn.prepareStatement(sql3);
            pstmt = conn.prepareStatement(sql4);
            pst.setString(1, s_busId);
            rs = pst.executeQuery();     //query = "select bavailable from busscheduling where bid=?"
            if (rs.next()) {
                s_availableSeat = rs.getString("BAVAILABLE");

                i_availableSeat = Integer.parseInt(s_availableSeat);
                String totalBookedSeat = etTotalSeatBook_booking.getText();
                int i_totalBookedSeat = Integer.parseInt(totalBookedSeat);
                i_updatedAvailableSeat = i_availableSeat - i_totalBookedSeat;
                if (i_updatedAvailableSeat >= 0) {                                  //if updatedAvailableSeat is greater than or equal to zero then update the BAVAILABLE column of busscheduling table   
                    String s_updatedAvailableSeat = Integer.toString(i_updatedAvailableSeat);
                    etShowAvailableSeat_booking.setText(s_updatedAvailableSeat);
                    pstmt.setInt(1, i_updatedAvailableSeat);
                    pstmt.setString(2, s_busId);
                    pstmt.executeUpdate();   //SQL query is "update busscheduling set bavailable=? where bid=?
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //insert data into booking_information table column (UID,BID,NOOFSEAT,WEIGHT_KG)
        try {
            pst = conn.prepareStatement(sql2);
            String s_noSeat = etTotalSeatBook_booking.getText();
            int i_noSeat = Integer.parseInt(s_noSeat);
            String s_weight = etWeight_booking.getText();
            int i_remainingSeat = i_availableSeat - i_noSeat;
            if (i_remainingSeat >= 0) {              //if total number of seat to book is less than or equal to available seat then user can book
                pst.setString(1, userId);
                pst.setString(2, s_busId);
                pst.setString(3, s_noSeat);
                pst.setString(4, s_weight);
                pst.setString(5, 500+"");
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Booked");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBookNow_bookingActionPerformed

    private void etWeight_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etWeight_bookingActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_etWeight_bookingActionPerformed

    private void btnShowAvailableSeat_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAvailableSeat_bookingActionPerformed
        // TODO add your handling code here:
        // show available seat in a textfield labeled with 'Available Seat' by clicking 'Click To See Available Seat'button
        String sql = "select bavailable from busscheduling where bid=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, s_busId);
            rs = pst.executeQuery();
            if (rs.next()) {
                s_availableSeat = rs.getString("BAVAILABLE");
                etShowAvailableSeat_booking.setText(s_availableSeat);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnShowAvailableSeat_bookingActionPerformed

    private void btnSearch_cancellingTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_cancellingTicketActionPerformed
        String s_sql = "select * from booking_information where uid=?";
        try {

            pst = conn.prepareStatement(s_sql);
            // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
            pst.setString(1, etUid_cancellingTicket.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                etBusid_cancellingTicket.setText(rs.getString("bid"));
                etNoOfSeat_cancellingTicket.setText(rs.getString("noofseat"));
                etWeight_cancellingTicket.setText(rs.getString("weight_kg"));

            } else {
                JOptionPane.showMessageDialog(null, "recrod not found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearch_cancellingTicketActionPerformed

    private void btnClear_cancellingTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear_cancellingTicketActionPerformed
        etUid_cancellingTicket.setText("");
        etBusid_cancellingTicket.setText("");
        etNoOfSeat_cancellingTicket.setText("");
        etWeight_cancellingTicket.setText("");
    }//GEN-LAST:event_btnClear_cancellingTicketActionPerformed

    private void btnDelete_cancellingTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_cancellingTicketActionPerformed

        int i_uId = parseInt(etUid_cancellingTicket.getText());

        String s_query = "delete from booking_information where uid=" + i_uId;
        try {
            pst = conn.prepareStatement(s_query);

            // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
            //String sql = "delete from booking_information where uid";
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record deleted successfully");
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDelete_cancellingTicketActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
        
        /*
        
         pst = conn.prepareStatement(s_sql);
                 // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
                  pst.setString(1, etUid_cancellingTicket.getText());
                 rs=pst.executeQuery();
                 if(rs.next())
                 {
                     etBusid_cancellingTicket.setText(rs.getString("bid"));
                     etNoOfSeat_cancellingTicket.setText(rs.getString("noofseat"));
                     etWeight_cancellingTicket.setText(rs.getString("weight_kg"));
                       
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "recrod not found");
                 }
        */
        String sql =  "select * from booking_information where uid=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,userId);
            rs=pst.executeQuery();
            
            if(rs.next()){
                int i_money = Integer.parseInt(rs.getString("money"));
                etPayableMoney_payment.setText(i_money+"");
                int i_designMoney = Integer.parseInt(etEnterMoney_payment.getText());
                if(i_designMoney<i_money){
                    JOptionPane.showMessageDialog(null,"Insufficient money!!!");
                }else if(i_designMoney>=i_money){
                    JOptionPane.showMessageDialog(null,"Successfull!!!");
                }
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

            // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
            //String sql = "delete from booking_information where uid";
           
            


    }//GEN-LAST:event_btnPaymentActionPerformed

    private void comboboxTo_checkingfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxTo_checkingfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxTo_checkingfareActionPerformed

    private void etTime_checkingfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTime_checkingfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTime_checkingfareActionPerformed

    private void etDate_checkingfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDate_checkingfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etDate_checkingfareActionPerformed

    private void btnSubmit_checkingfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit_checkingfareActionPerformed
       
   
         // TODO add your handling code here:
        String sql = "select * from BUSSCHEDULING where BTYPE=? and BFROM=? and BTO=? and BDATE=? and BDEPARTURETIME=?";

        try {
            pst = conn.prepareStatement(sql);
        } catch (SQLException ex) {
           
        }
        //String s_busName = (String) com.getSelectedItem();
        String s_busType = (String) comboboxBusType_checkingfare.getSelectedItem();
        String s_fromRoute = (String) comboboxFrom_checkingfare.getSelectedItem();
        String s_toRoute = (String) comboboxTo_checkingfare.getSelectedItem();
        String s_date = etDate_checkingfare.getText();
        String s_time = etTime_checkingfare.getText();
        // Checking date and time format
        boolean b_isDate = false;
        boolean b_isTime1 = false;
        boolean b_isTime2 = false;
        String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
        String timePattern1 = "\\d{1,2}:\\d{1,2}am";
        String timePattern2 = "\\d{1,2}:\\d{1,2}pm";
        b_isDate = s_date.matches(datePattern);
        if (b_isDate == false) {
            JOptionPane.showMessageDialog(null, "Date in wrong format");
        }
        b_isTime1 = s_time.matches(timePattern1);
        b_isTime2 = s_time.matches(timePattern2);
        if ((b_isTime1 == false) && (b_isTime2 == false)) {
            JOptionPane.showMessageDialog(null, "Time in wrong format");
        }

        try {
            pst.setString(1, s_busType);
        } catch (SQLException ex) {
           // Logger.getLogger(CheckingFare.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.setString(2, s_fromRoute);
        } catch (SQLException ex) {
            //Logger.getLogger(CheckingFare.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.setString(3, s_toRoute);
        } catch (SQLException ex) {
            //Logger.getLogger(CheckingFare.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.setString(4, s_date);
        } catch (SQLException ex) {
            //Logger.getLogger(CheckingFare.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.setString(5, s_time);
        } catch (SQLException ex) {
           // Logger.getLogger(CheckingFare.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = pst.executeQuery();
        } catch (SQLException ex) {
           // Logger.getLogger(CheckingFare.class.getName()).log(Level.SEVERE, null, ex);
        }

        int flag = 0;
        String name1="";
        String price1="";
        try {
            while (rs.next()) {
                flag = 1;
                //String sql2 = "select * from BUSSCHEDULING where BFARE=? and BNAME=?";
                String price = rs.getString("BFARE");
                String busName = rs.getString("BNAME");
                name1=name1+", "+busName;
                price1=price1+", "+price;

                //System.out.println("Price:" + price1);
                //System.out.println("bNAME:" + name1 + "\n\n\n");

                // System.out.println("yes..................");
            }
            if(flag==1){
                etName_checkingfare.setText(name1);
                etPrice_checkingfare.setText(price1);
            }
            if (flag != 1) {
                JOptionPane.showMessageDialog(null, "There is no bus available");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
           // Logger.getLogger(CheckingFare.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }//GEN-LAST:event_btnSubmit_checkingfareActionPerformed

    private void etPrice_checkingfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPrice_checkingfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etPrice_checkingfareActionPerformed

    private void btnShow_noticeBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow_noticeBoardActionPerformed

        String s_sql = "select * from notice where uid=?";
        try{

            pst = conn.prepareStatement(s_sql);
            // pst.setInt(1, Integer.parseInt(etUid_cancellingTicket.getText()));
            pst.setString(1, userId);
            rs=pst.executeQuery();
            if(rs.next())
            {
              //  etUid_Notification.setText(rs.getString("uid"));
                etNotice_Notification.setText(rs.getString("notice"));

            }
            else{
                JOptionPane.showMessageDialog(null, "recrod not found");
            }

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnShow_noticeBoardActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomePage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookNow_booking;
    private javax.swing.JButton btnClear_cancellingTicket;
    private javax.swing.JButton btnDelete_cancellingTicket;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSearch_cancellingTicket;
    private javax.swing.JButton btnShowAvailableSeat_booking;
    private javax.swing.JButton btnShow_noticeBoard;
    private javax.swing.JButton btnSubmit_booking;
    private javax.swing.JButton btnSubmit_checkingfare;
    private javax.swing.JComboBox<String> comboboxBusType_booking;
    private javax.swing.JComboBox comboboxBusType_checkingfare;
    private javax.swing.JComboBox<String> comboboxFrom_booking;
    private javax.swing.JComboBox comboboxFrom_checkingfare;
    private javax.swing.JComboBox<String> comboboxSelectBus_booking;
    private javax.swing.JComboBox<String> comboboxTo_booking;
    private javax.swing.JComboBox comboboxTo_checkingfare;
    private javax.swing.JTextField etBusid_cancellingTicket;
    private javax.swing.JTextField etDate_booking;
    private javax.swing.JTextField etDate_checkingfare;
    private javax.swing.JTextField etEnterMoney_payment;
    private javax.swing.JTextField etName_checkingfare;
    private javax.swing.JTextField etNoOfSeat_cancellingTicket;
    private javax.swing.JTextField etNotice_Notification;
    private javax.swing.JTextField etPayableMoney_payment;
    private javax.swing.JTextField etPrice_checkingfare;
    private javax.swing.JTextField etShowAvailableSeat_booking;
    private javax.swing.JTextField etTime_booking;
    private javax.swing.JTextField etTime_checkingfare;
    private javax.swing.JTextField etTotalSeatBook_booking;
    private javax.swing.JTextField etUid_cancellingTicket;
    private javax.swing.JTextField etWeight_booking;
    private javax.swing.JTextField etWeight_cancellingTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelBusId_cancellingTicket;
    private javax.swing.JLabel labelNoOfSeat_cancellingTicket;
    private javax.swing.JLabel labelWeight_cancellingTicket;
    // End of variables declaration//GEN-END:variables
}
