/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcontreras
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


public class JamFrame extends javax.swing.JFrame {
    //Timer is assigned and selected every time you press play
    Timer timer;
    //Creates a list of booleans that represent which instrumentTracks will be playing
    ArrayList<Boolean> chkbxsSelected = new ArrayList<Boolean>();
    ArrayList<JRadioButton> rbs = new ArrayList<JRadioButton>();
    ArrayList<InstrumentTrack> tracks = new ArrayList<InstrumentTrack>();
    
    String chord1;
    String chord2;
    String chord3;
    String chord4;
    String chord5;
    
    InstrumentTrack drumTrack;
    InstrumentTrack bassTrack;
    InstrumentTrack guitarTrack;
    InstrumentTrack keysTrack;
    
   
    
    /**
     * Creates new form JamFrame
     */
    public JamFrame() {
        initComponents();
    }

    /**r
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbChord1 = new javax.swing.JComboBox<>();
        cmbChord2 = new javax.swing.JComboBox<>();
        cmbChord3 = new javax.swing.JComboBox<>();
        cmbChord4 = new javax.swing.JComboBox<>();
        cmbChord5 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        rbDrums = new javax.swing.JRadioButton();
        rbBass = new javax.swing.JRadioButton();
        rbGuitar = new javax.swing.JRadioButton();
        rbKeys = new javax.swing.JRadioButton();
        cmbbxDrums = new javax.swing.JComboBox<>();
        cmbbxBass = new javax.swing.JComboBox<>();
        cmbbxGuitar = new javax.swing.JComboBox<>();
        cmbbxKeys = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tglPlay = new javax.swing.JToggleButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Jam Session");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chords"));

        cmbChord1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C Major", "C# Major", "D Major", "D# Major", "E Major", "F Major", "F# Major", "G Major", "G# Major", "A Major", "A# Major", "B Major", "C Minor", "C# Minor", "D Minor", "D# Minor", "E Minor", "F Minor", "F# Minor", "G Minor", "G# Minor", "A  Minor", "A# Minor", "B Minor" }));

        cmbChord2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C Major", "C# Major", "D Major", "D# Major", "E Major", "F Major", "F# Major", "G Major", "G# Major", "A Major", "A# Major", "B Major", "C Minor", "C# Minor", "D Minor", "D# Minor", "E Minor", "F Minor", "F# Minor", "G Minor", "G# Minor", "A  Minor", "A# Minor", "B Minor" }));
        cmbChord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChord2ActionPerformed(evt);
            }
        });

        cmbChord3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C Major", "C# Major", "D Major", "D# Major", "E Major", "F Major", "F# Major", "G Major", "G# Major", "A Major", "A# Major", "B Major", "C Minor", "C# Minor", "D Minor", "D# Minor", "E Minor", "F Minor", "F# Minor", "G Minor", "G# Minor", "A  Minor", "A# Minor", "B Minor" }));

        cmbChord4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C Major", "C# Major", "D Major", "D# Major", "E Major", "F Major", "F# Major", "G Major", "G# Major", "A Major", "A# Major", "B Major", "C Minor", "C# Minor", "D Minor", "D# Minor", "E Minor", "F Minor", "F# Minor", "G Minor", "G# Minor", "A  Minor", "A# Minor", "B Minor" }));

        cmbChord5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C Major", "C# Major", "D Major", "D# Major", "E Major", "F Major", "F# Major", "G Major", "G# Major", "A Major", "A# Major", "B Major", "C Minor", "C# Minor", "D Minor", "D# Minor", "E Minor", "F Minor", "F# Minor", "G Minor", "G# Minor", "A  Minor", "A# Minor", "B Minor" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cmbChord1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbChord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbChord3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbChord4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbChord5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbChord1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChord3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChord4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChord5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        rbDrums.setSelected(true);
        rbDrums.setText("Drums");

        rbBass.setText("Bass");
        rbBass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbBassStateChanged(evt);
            }
        });

        rbGuitar.setText("Guitar");
        rbGuitar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbGuitarStateChanged(evt);
            }
        });

        rbKeys.setText("Keys");
        rbKeys.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbKeysStateChanged(evt);
            }
        });

        cmbbxDrums.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbxDrumsItemStateChanged(evt);
            }
        });
        cmbbxDrums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxDrumsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDrums)
                    .addComponent(rbBass)
                    .addComponent(rbGuitar)
                    .addComponent(rbKeys))
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbbxGuitar, 0, 69, Short.MAX_VALUE)
                    .addComponent(cmbbxBass, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbbxDrums, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbbxKeys, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDrums)
                    .addComponent(cmbbxDrums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBass)
                    .addComponent(cmbbxBass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGuitar)
                    .addComponent(cmbbxGuitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbKeys)
                    .addComponent(cmbbxKeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setText("Instrument");

        jLabel3.setText("Style");

        tglPlay.setText("Play");
        tglPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglPlayActionPerformed(evt);
            }
        });

        btn1.setText("1");

        btn2.setText("2");

        btn3.setText("3");

        btn4.setText("4");

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel3))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglPlay)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tglPlay)
                        .addGap(28, 28, 28)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Backend.connectDB();
      
        
        //Loads directories of Instruments into comboboxes
        File drumsFile = new File("Audio/drums");
        addDirectories(drumsFile,cmbbxDrums);
        
        File bassFile = new File("Audio/bass");
        addDirectories(bassFile,cmbbxBass);
        
        File guitarFile = new File("Audio/guitar");
        addDirectories(guitarFile,cmbbxGuitar);
        
        File keysFile = new File("Audio/keyz");
        addDirectories(keysFile,cmbbxKeys);
        
        
        //Create the instrument tracks that will be used
            drumTrack = new InstrumentTrack("drums",Backend.getDrumVariationPath((String)cmbbxDrums.getSelectedItem(),"start"),
                            (String)cmbbxDrums.getSelectedItem()
                            ,"start");
            bassTrack = new InstrumentTrack("bass",Backend.getChordPath("bass",(String)cmbbxBass.getSelectedItem(),
                             (String)cmbChord1.getSelectedItem())
                            ,(String)cmbbxBass.getSelectedItem(),(String)cmbChord1.getSelectedItem());
            guitarTrack = new InstrumentTrack("guitar",Backend.getChordPath("guitar",(String)cmbbxGuitar.getSelectedItem(),
                             (String)cmbChord1.getSelectedItem())
                            ,(String)cmbbxGuitar.getSelectedItem(),(String)cmbChord1.getSelectedItem());
            keysTrack = new InstrumentTrack("keys",Backend.getChordPath("keyz",(String)cmbbxKeys.getSelectedItem(),
                             (String)cmbChord1.getSelectedItem())
                            ,(String)cmbbxKeys.getSelectedItem(),(String)cmbChord1.getSelectedItem());
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void cmbChord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChord2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbChord2ActionPerformed

    private void tglPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglPlayActionPerformed
        if(!ClipSequencer.started){
            
            
            //Add default radiobutton objects to arraylist
            rbs.clear();
            rbs.add(rbDrums);
            rbs.add(rbBass);
            rbs.add(rbGuitar);
            rbs.add(rbKeys);
            
            
            //Sets the 5 chords that will be used(Stores in string)
            chord1 = (String)cmbChord1.getSelectedItem();
            chord2 = (String)cmbChord2.getSelectedItem();
            chord3 = (String)cmbChord3.getSelectedItem();
            chord4 = (String)cmbChord4.getSelectedItem();
            chord5 = (String)cmbChord5.getSelectedItem();
            
            //
            drumTrack.updatePath(Backend.getDrumVariationPath((String)cmbbxDrums.getSelectedItem(),"start"));
            
            
            
            tracks.clear();
            tracks.add(drumTrack);
            tracks.add(bassTrack);
            tracks.add(guitarTrack);
            tracks.add(keysTrack);
            
            
            //Add values to radiobutton boolean arraylist(not considering
            //additional radiobuttons added)\
             refreshSequence();
             
             
            
            timer = new Timer();
            ClipSequencer.started = true;
            
            ClipSequencer.updateSequence(chkbxsSelected);
            timer.schedule(new ClipSequencer(tracks),0,6072);
        }
        else{
            
            //ClipSequencer.incrementCount();
            ClipSequencer.started = false;
            ClipSequencer.stopAllClips();
            cancelTimer();
            
            
        }
    }//GEN-LAST:event_tglPlayActionPerformed
    public void cancelTimer(){
        timer.cancel();
    }
    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
     
    }//GEN-LAST:event_btn5ActionPerformed

    private void cmbbxDrumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxDrumsActionPerformed

    }//GEN-LAST:event_cmbbxDrumsActionPerformed

    private void cmbbxDrumsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbxDrumsItemStateChanged

    }//GEN-LAST:event_cmbbxDrumsItemStateChanged

    private void rbKeysStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbKeysStateChanged
        refreshSequence();
    }//GEN-LAST:event_rbKeysStateChanged

    private void rbGuitarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbGuitarStateChanged
        refreshSequence();
    }//GEN-LAST:event_rbGuitarStateChanged

    private void rbBassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbBassStateChanged
        refreshSequence();
    }//GEN-LAST:event_rbBassStateChanged

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
            java.util.logging.Logger.getLogger(JamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JamFrame().setVisible(true);
            }
        });
    }
    private static void addDirectories(File file, JComboBox j){
        for(String s:file.list()){
            j.addItem(s);
        }
    }
    private void refreshSequence(){
        chkbxsSelected.clear();
        checkCheckboxes();
        ClipSequencer.updateSequence(chkbxsSelected);
    }
    private void checkCheckboxes(){
        
        for(int i =0;i<rbs.size();i++){
                 chkbxsSelected.add(rbs.get(i).isSelected());
             }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JComboBox<String> cmbChord1;
    private javax.swing.JComboBox<String> cmbChord2;
    private javax.swing.JComboBox<String> cmbChord3;
    private javax.swing.JComboBox<String> cmbChord4;
    private javax.swing.JComboBox<String> cmbChord5;
    private javax.swing.JComboBox<String> cmbbxBass;
    private javax.swing.JComboBox<String> cmbbxDrums;
    private javax.swing.JComboBox<String> cmbbxGuitar;
    private javax.swing.JComboBox<String> cmbbxKeys;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbBass;
    private javax.swing.JRadioButton rbDrums;
    private javax.swing.JRadioButton rbGuitar;
    private javax.swing.JRadioButton rbKeys;
    private javax.swing.JToggleButton tglPlay;
    // End of variables declaration//GEN-END:variables
}