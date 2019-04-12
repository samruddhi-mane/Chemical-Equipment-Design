/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on 24 Mar, 2019, 1:42:31 PM
 */

package chemicalequipmentdesign;

/**
 *
 * @author Samruddhi Mane
 */
public class NewJFrame extends javax.swing.JFrame {
   double operating_pressure,design_pressure,water_head,operating_temperature,design_temperature,allowable_stress,efficiency_factor,corrosion_allowance,outer_diameter_shell,inner_diameter_shell,theoretical_thickness_shell,standard_thickness_shell,opening_diameter,nozzle_height_inside,nozzle_height_outside,theoretical_thickness_nozzle,standard_thickness_nozzle,outer_diameter_padding,inner_diameter_padding,padding_thickness,Ao,Ai,As,A,H1,H2;


    /** Creates new form NewJFrame */
    public NewJFrame() {
        initComponents();
    }
public void DesignPreliminaries()
{
     operating_pressure = Double.parseDouble(jTextField8.getText());
     operating_temperature = Double.parseDouble(jTextField10.getText());
     water_head = Double.parseDouble(jTextField9.getText());
     if((1.05*operating_pressure)>(operating_pressure+(1000*9.81*water_head)))
         design_pressure=(1.05*operating_pressure);
     else
         design_pressure=(operating_pressure+(1000*9.81*water_head));
     jTextField13.setText(""+design_pressure);

     if(jRadioButton3.isSelected())
         design_temperature=operating_temperature+10;
     else if(jRadioButton2.isSelected())
         design_temperature=(operating_temperature+20)>250?(operating_temperature+20):250;
     else if(jRadioButton2.isSelected())
         design_temperature=(operating_temperature+50)>250?(operating_temperature+50):250;
     else
     {
         jRadioButton1.setSelected(true);
         design_temperature=operating_temperature;
     }
     jTextField14.setText(""+design_temperature);
   allowable_stress= Double.parseDouble(jTextField12.getText());
   efficiency_factor= Double.parseDouble(jTextField16.getText());
   corrosion_allowance= Double.parseDouble(jTextField20.getText());
   outer_diameter_shell= Double.parseDouble(jTextField17.getText());
   theoretical_thickness_shell=((design_pressure*outer_diameter_shell)/((2*allowable_stress*efficiency_factor)+design_pressure));
   jTextField18.setText(""+theoretical_thickness_shell);
   if(theoretical_thickness_shell+corrosion_allowance<0.005)
       standard_thickness_shell=0.005;
   else if (theoretical_thickness_shell+corrosion_allowance<0.0055)
       standard_thickness_shell=0.0055;
   else if (theoretical_thickness_shell+corrosion_allowance<0.006)
       standard_thickness_shell=0.006;
   else if (theoretical_thickness_shell+corrosion_allowance<0.007)
       standard_thickness_shell=0.007;
   else if (theoretical_thickness_shell+corrosion_allowance<0.008)
       standard_thickness_shell=0.008;
   else if (theoretical_thickness_shell+corrosion_allowance<0.009)
       standard_thickness_shell=0.009;
   else if (theoretical_thickness_shell+corrosion_allowance<0.010)
       standard_thickness_shell=0.010;
   else if (theoretical_thickness_shell+corrosion_allowance<0.011)
       standard_thickness_shell=0.011;
   else if (theoretical_thickness_shell+corrosion_allowance<0.012)
       standard_thickness_shell=0.012;
   else if (theoretical_thickness_shell+corrosion_allowance<0.014)
       standard_thickness_shell=0.014;
   else if (theoretical_thickness_shell+corrosion_allowance<0.016)
       standard_thickness_shell=0.016;
   else if (theoretical_thickness_shell+corrosion_allowance<0.018)
       standard_thickness_shell=0.018;
   else if (theoretical_thickness_shell+corrosion_allowance<0.020)
       standard_thickness_shell=0.020;
   else if (theoretical_thickness_shell+corrosion_allowance<0.022)
       standard_thickness_shell=0.022;
   else if (theoretical_thickness_shell+corrosion_allowance<0.025)
       standard_thickness_shell=0.025;
   else if (theoretical_thickness_shell+corrosion_allowance<0.028)
       standard_thickness_shell=0.028;
   else if (theoretical_thickness_shell+corrosion_allowance<0.032)
       standard_thickness_shell=0.032;
   else if (theoretical_thickness_shell+corrosion_allowance<0.036)
       standard_thickness_shell=0.036;
   else if (theoretical_thickness_shell+corrosion_allowance<0.040)
       standard_thickness_shell=0.040;
   else if (theoretical_thickness_shell+corrosion_allowance<0.045)
       standard_thickness_shell=0.045;
   else if (theoretical_thickness_shell+corrosion_allowance<0.050)
       standard_thickness_shell=0.050;
   else if (theoretical_thickness_shell+corrosion_allowance<0.056)
       standard_thickness_shell=0.056;
   else if (theoretical_thickness_shell+corrosion_allowance<0.063)
       standard_thickness_shell=0.063;
   else if (theoretical_thickness_shell+corrosion_allowance<0.071)
       standard_thickness_shell=0.071;
   else if (theoretical_thickness_shell+corrosion_allowance<0.080)
       standard_thickness_shell=0.080;
   else
       standard_thickness_shell=theoretical_thickness_shell+corrosion_allowance;
   jTextField19.setText(""+standard_thickness_shell); 
}
public void CompensationOpenings()
{
    opening_diameter= Double.parseDouble(jTextField1.getText());
    A=(opening_diameter+(2*corrosion_allowance))*theoretical_thickness_shell;
    As=(opening_diameter+(2*corrosion_allowance))*(standard_thickness_shell-theoretical_thickness_shell-corrosion_allowance);
    theoretical_thickness_nozzle=((design_pressure*opening_diameter)/((2*allowable_stress)+design_pressure));
    jTextField21.setText(""+theoretical_thickness_nozzle); 
    if(theoretical_thickness_nozzle+corrosion_allowance<0.005)
       standard_thickness_nozzle=0.005;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.0055)
       standard_thickness_nozzle=0.0055;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.006)
       standard_thickness_nozzle=0.006;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.007)
       standard_thickness_nozzle=0.007;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.008)
       standard_thickness_nozzle=0.008;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.009)
       standard_thickness_nozzle=0.009;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.010)
       standard_thickness_nozzle=0.010;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.011)
       standard_thickness_nozzle=0.011;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.012)
       standard_thickness_nozzle=0.012;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.014)
       standard_thickness_nozzle=0.014;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.016)
       standard_thickness_nozzle=0.016;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.018)
       standard_thickness_nozzle=0.018;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.020)
       standard_thickness_nozzle=0.020;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.022)
       standard_thickness_nozzle=0.022;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.025)
       standard_thickness_nozzle=0.025;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.028)
       standard_thickness_nozzle=0.028;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.032)
       standard_thickness_nozzle=0.032;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.036)
       standard_thickness_nozzle=0.036;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.040)
       standard_thickness_nozzle=0.040;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.045)
       standard_thickness_nozzle=0.045;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.050)
       standard_thickness_nozzle=0.050;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.056)
       standard_thickness_nozzle=0.056;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.063)
       standard_thickness_nozzle=0.063;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.071)
       standard_thickness_nozzle=0.071;
   else if (theoretical_thickness_nozzle+corrosion_allowance<0.080)
       standard_thickness_nozzle=0.080;
   else
       standard_thickness_nozzle=theoretical_thickness_nozzle+corrosion_allowance;
jTextField15.setText(""+standard_thickness_nozzle); 
nozzle_height_inside= Double.parseDouble(jTextField2.getText());
nozzle_height_outside= Double.parseDouble(jTextField3.getText());
H1=((Math.sqrt((opening_diameter+(2*corrosion_allowance))*(standard_thickness_nozzle-corrosion_allowance)))<nozzle_height_outside)?(Math.sqrt((opening_diameter+(2*corrosion_allowance))*(standard_thickness_nozzle-corrosion_allowance))):nozzle_height_outside;
H2=((Math.sqrt((opening_diameter+(2*corrosion_allowance))*(standard_thickness_nozzle-(2*corrosion_allowance))))<nozzle_height_outside)?(Math.sqrt((opening_diameter+(2*corrosion_allowance))*(standard_thickness_nozzle-(2*corrosion_allowance)))):nozzle_height_outside;
Ao=2*H1*(standard_thickness_nozzle-theoretical_thickness_nozzle-corrosion_allowance);
Ai=2*H2*(standard_thickness_nozzle-(2*corrosion_allowance));
if(A>(As+Ao+Ai))
{
    jTextField14.setText("Yes");
    outer_diameter_padding=(opening_diameter+(2*corrosion_allowance));
jTextField6.setText(""+outer_diameter_padding);
inner_diameter_padding=(opening_diameter+(2*standard_thickness_nozzle));
jTextField5.setText(""+outer_diameter_padding);
padding_thickness=(A-As-Ao-Ai)*(outer_diameter_padding-inner_diameter_padding);
jTextField7.setText(""+padding_thickness);

}
else
    jTextField14.setText("No");


        
    
    
    
}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Compensation for Openings in Process Equipment");

        jLabel3.setText("Diameter of the opening:");

        jTextField1.setText("0.0");

        jLabel4.setText("Plese enter the values of the following parameters:-");

        jLabel5.setText("(if there is a nozzle then enter the following dimensions)");

        jLabel6.setText("Nozzle length inside the vesel:");

        jTextField2.setText("0.0");

        jLabel7.setText("Nozzle length outside the vesel:");

        jTextField3.setText("0.0");

        jLabel8.setText("Is compensation required?");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Ring Pad Dimensions:-");

        jLabel10.setText("Inner Diameter:");

        jLabel11.setText("Outer Diameter:");

        jLabel12.setText("Thickness:");

        jTextField5.setText("0.0");

        jTextField6.setText("0.0");

        jTextField7.setText("0.0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("Design Preliminaries ");

        jLabel14.setText("Plese enter the values of the following parameters:-");

        jLabel15.setText("Maximum Operating Pressure (Pa):");

        jTextField8.setText("0.0");

        jLabel16.setText("Maximum Operating Temperature (celsius):");

        jLabel17.setText("Water Head (m) (if present):");

        jTextField9.setText("0.0");

        jTextField10.setText("0.0");

        jLabel18.setText("Material of Construction:");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel19.setText("Outer Diameter of Vessel (m):");

        jLabel20.setText("Design Temperature (celsius):");

        jLabel21.setText("Theoretical Shell Thickness (m):");

        jLabel22.setText("Corrosion Allowance (m):");

        jLabel23.setText("Weild Joint Efficiency Factor:");

        jLabel24.setText("Allowable Stress (Pa):");

        jLabel25.setText("Design Pressure (Pa):");

        jLabel26.setText("Standard Thickness (m):");

        jTextField13.setText("0.0");

        jTextField14.setText("0.0");

        jTextField16.setText("0.0");

        jTextField17.setText("0.0");

        jTextField18.setText("0.0");

        jTextField19.setText("0.0");

        jLabel27.setText("Means of Heating:");

        jRadioButton1.setText("Unheated Parts");

        jRadioButton2.setText("Direct internal/external Heating (shielded)");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Heated by means of steam/hot water etc. ");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Direct internal/external Heating (un-shielded)");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jTextField12.setText("0.0");

        jTextField20.setText("0.0");

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel28.setText("Theoretical Nozzle Thickness:");

        jLabel29.setText("Standard Nozzle Thickness:");

        jTextField15.setText("0.0");

        jTextField21.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel27)
                            .addComponent(jLabel23)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel28)
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jButton2))
                                                .addGap(98, 98, 98)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField7)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField6)
                                                    .addComponent(jTextField5)
                                                    .addComponent(jTextField15)
                                                    .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                                                .addGap(66, 66, 66)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25)
                                                    .addComponent(jLabel20)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jButton1)))
                                            .addComponent(jRadioButton1))
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField19)
                                            .addComponent(jTextField14)
                                            .addComponent(jTextField13)
                                            .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))))
                                .addGap(24, 24, 24))
                            .addComponent(jRadioButton3))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel26)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel28)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel29)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DesignPreliminaries();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
CompensationOpenings();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
