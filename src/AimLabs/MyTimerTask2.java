package AimLabs;


import java.awt.Color;
import java.io.IOException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonette
 */
public class MyTimerTask2 extends TimerTask{
    AimLabs af;
    
    
    public MyTimerTask2(AimLabs af){
        this.af=af;
    }
    
    public void run() {
      af.num--;
        if(af.num == 0){
          
          try {
              Score sc = new Score();
              af.startBool=true;
              
              af.dataTrans();
              af.timer.cancel();
          } catch (IOException ex) {
              Logger.getLogger(MyTimerTask2.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      af.disp();
    }
    
//    public void decrement()
//    {
//        af.num--;
//        if(af.num == 0){
//          
//          af.startBool=true;
//          Score sc = new Score();  // di na ata need neto working perfect witohut it parang ako sakanya :<
//          sc.show();
//          af.timer.cancel();
//      }
//    }
//    
   
}
