
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;


public class keyHandler implements KeyListener {

    GUI g;
    int[] KeyCodes = {
        
27,112,113,114,115,116,117,118,119,120,121,122,123,KeyEvent.VK_PRINTSCREEN,KeyEvent.VK_SCROLL_LOCK,KeyEvent.VK_PAUSE,192,49,50,51,52,53,54,55,56,57,48,45,61,8,155,36,
33,KeyEvent.VK_NUM_LOCK,111,106,109,KeyEvent.VK_TAB,81,87,69,82,84,89,85,73,79,80,91,93,92,127,35,34,KeyEvent.VK_NUMPAD7,KeyEvent.VK_NUMPAD8,
KeyEvent.VK_NUMPAD9,107,20,65,83,68,70,71,72,74,75,76,59,222,10,KeyEvent.VK_NUMPAD4,KeyEvent.VK_NUMPAD5,KeyEvent.VK_NUMPAD6,16,90,88,67,86,66,78,77,44,46,47,16,38,KeyEvent.VK_NUMPAD1,KeyEvent.VK_NUMPAD2,KeyEvent.VK_NUMPAD3,10,17,524,18,32,18,525,17,37,40,39,KeyEvent.VK_NUMPAD0,110       
       
    };
    
    boolean[] keysPressed = new boolean[103];
    
    
    keyHandler(GUI refG){
    
        g = refG;
        for(int i = 0; i < 103; i++)
            keysPressed[i] = false;       
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        System.out.println(keyCode);
            for(int i = 0; i < 103; i++){                
                     g.fr.requestFocus();
                              
             if(keyCode == KeyCodes[i]) {
                      g.keys[i].setBackground(Color.lightGray);
             }          
        }    
    }

    @Override
    public void keyReleased(KeyEvent ke) {
                   
            int keyCode = ke.getKeyCode();
                for(int i = 0; i < 103; i++){
             if(keyCode == KeyCodes[i]) {
                      g.keys[i].setBackground(Color.GRAY);
                      keysPressed[i] = true;
             }
        }
                  Exit(g);
}
    
    public void Exit(GUI g){

            boolean allTrue = true;        
            for(int i = 0; i < 103; i++){
                if(keysPressed[i] == false){
                allTrue = false;
                break;
                }

} 
        if(allTrue){
        JOptionPane P = new JOptionPane();
        P.showMessageDialog(null, "YOUR KEYBOARD IS PERFECT!!!!");
        System.exit(0);
    }  
}}