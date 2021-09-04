

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GUI {
    
JFrame fr;
JButton[] keys;
JRadioButton[] toggles;    

GUI(){
initGUI();
}

void initGUI(){

fr = new JFrame("Keyboard Test");

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  //--------------------------------------------
double screenWidth = screenSize.getWidth();
double screenHeight = screenSize.getHeight();
Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\TAYYAB\\Desktop\\Java\\KeyboardTest\\KB.png");    

fr.setSize((int)(80 * screenWidth / 100),(int)(40 * screenHeight / 100));
fr.setLocationRelativeTo(null);
fr.setIconImage(icon);   

addComponentsToPane(fr.getContentPane());

fr.addKeyListener(new keyHandler(this));

fr.setFocusTraversalPolicyProvider(false);  //--------------------------------------------
fr.setFocusTraversalKeysEnabled(false);   //--------------------------------------------
fr.pack();
fr.setVisible(true);
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}

public void addComponentsToPane(Container p){

    p.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    keys = new JButton[103];
    for(int i = 0; i < 103; i++){
        keys[i] = new JButton();
        keys[i].setFocusPainted( false );
        keys[i].setFocusable(false);
    }
    
    
    //Esc
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 10;
    c.insets = new Insets(0,0,0,30);
    c.gridx = 0;
    c.gridy = 0;
    p.add(keys[0],c);
    
    for(int i = 1; i < 13; i++){
        
        if(i%4 == 0)
          c.insets = new Insets(0,0,0,30);
        
        else c.insets = new Insets(0,0,0,0);

    c.gridx = i;
    p.add(keys[i],c);
    }
    
    c.insets = new Insets(0,0,0,0);
    c.gridx = 14;
    p.add(keys[13],c);
    
    c.gridx = 15;
    p.add(keys[14],c);
    
    c.insets = new Insets(0,0,0,10);
    c.gridx = 16;
    p.add(keys[15],c);
    
    c.gridx = 18;
    c.insets = new Insets(15,0,0,0);
    c.gridx = 0;
    c.gridy = 1;
    p.add(keys[16],c);

    for(int i = 17; i < 37; i++){
        
         if(i == 29 || i == 32)
         c.insets = new Insets(15,0,0,10);
         
        else c.insets = new Insets(15,0,0,0);

         
    c.gridx = i - 16;
    p.add(keys[i],c);
    }
     
    c.gridx = 0;
    c.gridy = 2;
    p.add(keys[37],c);
    
    for(int i = 38; i < 58; i++){
       
          if(i==50 || i == 53)
         c.insets = new Insets(15,0,0,10);
         
        else c.insets = new Insets(15,0,0,0);
         
    c.gridx = i - 37;
    if(i == 57){
          c.gridheight = 2;
          c.ipady = 40;      //make this component tall
          c.fill = GridBagConstraints.VERTICAL;

        
    }
    p.add(keys[i],c);
    }
    
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridheight = 1;
    c.ipady = 10;      //make this component tall
    c.gridx = 0;
    c.gridy = 3;
    
    p.add(keys[58],c);
    
     for(int i = 59; i < 71; i++){
         
       if(i == 70){
           c.insets = new Insets(15,0,0,10);
           c.gridwidth = 2;
           
       }
       
         
    c.gridx = i - 58;
    p.add(keys[i],c);
    }
     
    c.gridwidth = 1;
    c.insets = new Insets(15,0,0,0);
    c.gridx = 17;
    p.add(keys[71],c);
    
    c.gridx = 18;
    p.add(keys[72],c);
    
    c.gridx = 19;
    p.add(keys[73],c);
    
    c.gridy = 4;
    c.gridx = 0;
    c.gridwidth = 2;
    p.add(keys[74],c);
    
    c.gridwidth = 1;

    
     for(int i = 75; i < 85; i++){
         
         
       if(i == 70){
           c.insets = new Insets(15,0,0,10);
           c.gridwidth = 2;
           
       }
       
         
    c.gridx = i - 73;
    p.add(keys[i],c);
    }
     
    c.insets = new Insets(15,0,0,10);
    c.gridx = c.gridx + 1;
    c.gridwidth = 2;
    p.add(keys[85],c);
    
    c.gridwidth = 1;
    c.gridx = c.gridx + 3;
    p.add(keys[86],c);
    
    c.insets = new Insets(15,0,0,0);
    c.gridx = c.gridx + 2;
    p.add(keys[87],c);
    c.gridx = c.gridx + 1;    
    p.add(keys[88],c);
    c.gridx = c.gridx + 1;
    p.add(keys[89],c);
        
    c.gridx = c.gridx + 1;
    c.gridheight = 2;
    c.ipady = 40;      //make this component tall
    c.fill = GridBagConstraints.VERTICAL;
    p.add(keys[90],c);

    c.gridy = 5;
    c.gridheight = 1;
    c.ipady = 10;      //make this component tall
    c.fill = GridBagConstraints.HORIZONTAL;
    
    c.gridx = 0;
    c.gridwidth = 2;
    p.add(keys[91],c);
    
    c.gridwidth = 1;
    c.gridx = 2;
    p.add(keys[92],c);
    
    c.gridx = 3;
    p.add(keys[93],c);
    
    
    c.gridwidth = 6;
    c.gridx = 4;
    p.add(keys[94],c);
    
    c.gridwidth = 1;
    c.gridx = 10;
    p.add(keys[95],c);
    
    c.gridx = 11;
    p.add(keys[96],c);
    
    c.gridwidth = 2;
    c.insets = new Insets(15,0,0,10);
    c.gridx = 12;
    p.add(keys[97],c);
    
    c.gridwidth = 1;
    c.gridx = 14;
    p.add(keys[98],c);
    
    c.gridx = 15;
    p.add(keys[99],c);
    
    c.insets = new Insets(15,0,0,10);
    c.gridx = 16;
    p.add(keys[100],c);
    
    c.insets = new Insets(15,0,0,0);
    c.gridwidth = 2;
    c.gridx = 17;
    p.add(keys[101],c);
    
    c.gridwidth = 1;
    c.gridx = 19;
    p.add(keys[102],c);
    
        keys[0].setText("Esc");
        keys[1].setText("F1");
        keys[2].setText("F2");
        keys[3].setText("F3");
        keys[4].setText("F4");
        keys[5].setText("F5");
        keys[6].setText("F6");
        keys[7].setText("F7");
        keys[8].setText("F8");
        keys[9].setText("F9");
        keys[10].setText("F10");
        keys[11].setText("F11");
        keys[12].setText("F12");
        keys[13].setText("PrtScr");
        keys[14].setText("ScrLck");
        keys[15].setText("Pause");
        keys[16].setText("~ `");
        keys[17].setText("1");
        keys[18].setText("2");
        keys[19].setText("3");
        keys[20].setText("4");
        keys[21].setText("5");
        keys[22].setText("6");
        keys[23].setText("7");
        keys[24].setText("8");
        keys[25].setText("9");
        keys[26].setText("0");
        keys[27].setText("-");
        keys[28].setText("=");
        keys[29].setText("BckSpc");
        keys[30].setText("Insert");
        keys[31].setText("Home");
        keys[32].setText("Pg Up");
        keys[33].setText("NumLck");
        keys[34].setText("/");
        keys[35].setText("*");
        keys[36].setText("-");
        keys[37].setText("Tab");
        keys[38].setText("Q");
        keys[39].setText("W");
        keys[40].setText("E");
        keys[41].setText("R");
        keys[42].setText("T");
        keys[43].setText("Y");
        keys[44].setText("U");
        keys[45].setText("I");
        keys[46].setText("O");
        keys[47].setText("P");
        keys[48].setText("[");
        keys[49].setText("]");
        keys[50].setText("\\");
        keys[51].setText("Del");
        keys[52].setText("End");
        keys[53].setText("Pg Dn");
        keys[54].setText("7");
        keys[55].setText("8");
        keys[56].setText("9");
        keys[57].setText("+");
        keys[58].setText("CapsLock");
        keys[59].setText("A");
        keys[60].setText("S");
        keys[61].setText("D");
        keys[62].setText("F");
        keys[63].setText("G");
        keys[64].setText("H");
        keys[65].setText("J");
        keys[66].setText("K");
        keys[67].setText("L");
        keys[68].setText(";");
        keys[69].setText("'");
        keys[70].setText("Enter");
        keys[71].setText("4");
        keys[72].setText("5");
        keys[73].setText("6");
        keys[74].setText("Shift");
        keys[75].setText("Z");
        keys[76].setText("X");
        keys[77].setText("C");
        keys[78].setText("V");
        keys[79].setText("B");
        keys[80].setText("N");
        keys[81].setText("M");
        keys[82].setText(",");
        keys[83].setText(".");
        keys[84].setText("/");
        keys[85].setText("Shift");
        keys[86].setText("^");
        keys[87].setText("1");
        keys[88].setText("2");
        keys[89].setText("3");
        keys[90].setText("E");
        keys[91].setText("Ctrl");
        keys[92].setText("Fn");
        keys[92].setText("Win");
        keys[93].setText("Alt");
        keys[94].setText(" ");
        keys[95].setText("Alt");
        keys[96].setText("RWin");
        keys[97].setText("Ctrl");
        keys[98].setText("<");
        keys[99].setText("V");
        keys[100].setText(">");
        keys[101].setText("0");
        keys[102].setText(".");
       
}


}