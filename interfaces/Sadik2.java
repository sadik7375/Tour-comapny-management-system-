package sadik.pkg2;
import javax.swing.JFrame;

public final class Sadik2 {
    
    private image icon;
    private content c;

     Sadik2(){
        
        
        
       incommon();
        
   }
     
     public void incommon(){
         
       c=this.getcontentPane();
       c.setBackground(color.MAGENTA);
         
         
         
          //icon= new image(getClass().getResource("sadilk.png"));
       //  this.setIconImage(icon.getImage());
     }
    
    
    
    
    public static void main(String[] args) {

   JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400,300);
      frame.setLocation(200,50);
    
    frame.setBounds(200,50,400,300);
    frame.setTitle("FRame neew");
    
    
    
    
    
    
    
    
    
    
    }

    private content getcontentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
