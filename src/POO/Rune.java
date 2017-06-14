package POO;

import javax.swing.ImageIcon;

/**
 *
 * @author Denis
 */
public class Rune extends javax.swing.JPanel {
    // Définir les propriétés
    private String urlFace ;
    private String urlDos ;
    private boolean coteDos;
    private int id;
    private String nomRune;

    public Rune() {
        initComponents();
    }

    public Rune(String urlFace, String urlDos, boolean coteDos, int id, String nomRune) {
        this.urlFace = urlFace;
        this.urlDos = urlDos;
        this.id = id;
        this.coteDos = coteDos;
        this.nomRune = nomRune;
        initComponents();
    }
  
    
    // Méthode métier
    private void afficheRune(String url){
        java.net.URL imageURL = Main.class.getResource(url);
        ImageIcon icon = new ImageIcon(imageURL);
        runeLbl.setIcon(icon);
     }

    public void tournerVersFace(){
        afficheRune(urlFace);
        coteDos=false;
    }
    
    public void tournerVersDos(){
        afficheRune(urlDos);
        coteDos=true;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        runeLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(57, 91));

        runeLbl.setMinimumSize(new java.awt.Dimension(57, 91));
        runeLbl.setPreferredSize(new java.awt.Dimension(57, 91));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(runeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(runeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel runeLbl;
    // End of variables declaration//GEN-END:variables

    public String getUrlFace() {
        return urlFace;
    }

    public void setUrlFace(String urlFace) {
        this.urlFace = urlFace;
    }

    public String getUrlDos() {
        return urlDos;
    }

    public void setUrlDos(String urlDos) {
        this.urlDos = urlDos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCoteDos() {
        return coteDos;
    }

    public void setCoteDos(boolean coteDos) {
        this.coteDos = coteDos;
    }

    public String getNomRune() {
        return nomRune;
    }

    public void setNomRune(String nomRune) {
        this.nomRune = nomRune;
    }
   
}
