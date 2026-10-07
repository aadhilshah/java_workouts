import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class Calculater implements ActionListener
{
    boolean isoperaterclicked=false;
    float result=0;
    float num=0;
   boolean isnewcalculation=true;
   String current;
    String newvalue;
    String operater;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton dotButton;
    JButton equaltoButton;
    JButton multiplicationButton;
    JButton divisionButton;
    JButton addButton;
    JButton substractionButton;
    JButton clearButton;
    
    public Calculater()
{
 jf=new JFrame();
jf.setSize(600,600);
jf.setLocation(300,150);
 displayLabel=new JLabel("");
displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
displayLabel.setBackground(Color.gray);
displayLabel.setOpaque(true);
displayLabel.setBounds(30,50,450,40);
jf.add(displayLabel);
jf.setLayout(null);
sevenButton=new JButton("7");
sevenButton.setBounds(30,130,80,80);
sevenButton.addActionListener(this);
sevenButton.setFont(new Font("Arial",   Font.PLAIN, 40));
jf.add(sevenButton);
eightButton=new JButton("8");
eightButton.setBounds(130,130,80,80);
eightButton.setFont(new Font("Arial",   Font.PLAIN, 40));
eightButton.addActionListener(this);
jf.add(eightButton);
nineButton=new JButton("9");
nineButton.setBounds(230,130,80,80);
nineButton.setFont(new Font("Arial",   Font.PLAIN, 40));
nineButton.addActionListener(this);
jf.add(nineButton);
fourButton=new JButton("4");
fourButton.setBounds(30,230,80,80);
fourButton.setFont(new Font("Arial",   Font.PLAIN, 40));
fourButton.addActionListener(this);
jf.add(fourButton);
fiveButton=new JButton("5");
fiveButton.setBounds(130,230,80,80);
fiveButton.setFont(new Font("Arial",   Font.PLAIN, 40));
fiveButton.addActionListener(this);
jf.add(fiveButton);
sixButton=new JButton("6");
sixButton.setBounds(230,230,80,80);
sixButton.setFont(new Font("Arial",Font.PLAIN,40 ));
sixButton.addActionListener(this);
jf.add(sixButton);
oneButton=new JButton("1");
oneButton.setBounds(30,330,80,80);
oneButton.setFont(new Font("Arial",Font.PLAIN,40 ));
oneButton.addActionListener(this);
jf.add(oneButton);
twoButton=new JButton("2");
twoButton.setBounds(130,330,80,80);
twoButton.setFont(new Font("Arial",Font.PLAIN,40 ));
twoButton.addActionListener(this);
jf.add(twoButton);
threeButton=new JButton("3");
threeButton.setBounds(230,330,80,80);
threeButton.setFont(new Font("Arial",Font.PLAIN,40 ));
threeButton.addActionListener(this);
jf.add(threeButton);
zeroButton=new JButton("0");
zeroButton.setBounds(30,430,80,80);
zeroButton.setFont(new Font("Arial",Font.PLAIN,40 ));
zeroButton.addActionListener(this);
jf.add(zeroButton);
dotButton=new JButton(".");
dotButton.setBounds(130,430,80,80);
dotButton.setFont(new Font("Arial",Font.PLAIN,40 ));
dotButton.addActionListener(this);
jf.add(dotButton);
equaltoButton=new JButton("=");
equaltoButton.setBounds(230,430,80,80);
equaltoButton.setFont(new Font("Arial",Font.PLAIN,40 ));
equaltoButton.addActionListener(this);
jf.add(equaltoButton);
multiplicationButton=new JButton("x");
multiplicationButton.setBounds(330,230,80,80);
multiplicationButton.setFont(new Font("Arial",Font.PLAIN,40 ));
multiplicationButton.addActionListener(this);
jf.add(multiplicationButton);
divisionButton=new JButton("/");
divisionButton.setBounds(330,130,80,80);
divisionButton.setFont(new Font("Arial",Font.PLAIN,40 ));
divisionButton.addActionListener(this);
jf.add(divisionButton);
addButton=new JButton("+");
addButton.setBounds(330,330,80,80);
addButton.setFont(new Font("Arial",Font.PLAIN,40 ));
addButton.addActionListener(this);
jf.add(addButton);
substractionButton=new JButton("-");
substractionButton.setBounds(330,430,80,80);
substractionButton.setFont(new Font("Arial",Font.PLAIN,40 ));
substractionButton.addActionListener(this);
jf.add(substractionButton);
clearButton=new JButton("C");
clearButton.setBounds(430,430,80 , 80);
clearButton.setFont(new Font("Arial",Font.PLAIN,40 ));
clearButton.addActionListener(this);
jf.add(clearButton);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[]args)
{
     new Calculater();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==sevenButton)
{
    if (isoperaterclicked==true)
    {
        displayLabel.setText("7");
        isoperaterclicked=false;
    }
    else
    {
        displayLabel.setText(displayLabel.getText()+"7");
    }
}
else if (e.getSource()==eightButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("8");
        isoperaterclicked=false;
    }
    else
{
    displayLabel.setText(displayLabel.getText()+"8");
}
    
}
else if (e.getSource()==nineButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("9");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"9");
    }
}
else if (e.getSource()==fourButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("4");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"4");
    }
}
else if (e.getSource()==fiveButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("5");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"5");
    }
}
else if (e.getSource()==sixButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("6");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"6");
    }
}
else if (e.getSource()==oneButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("1");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"1");
    }
}
else if (e.getSource()==twoButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("2");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"2");
    }
}
else if (e.getSource()==threeButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("3");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"3");
    }
}
else if (e.getSource()==zeroButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText("0");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+"0");
    }
}
else if (e.getSource()==dotButton) {
      if (isoperaterclicked==true)
    {
        displayLabel.setText(".");
        isoperaterclicked=false;
    }
    else{
    displayLabel.setText(displayLabel.getText()+".");
    }
}
else if (e.getSource()==equaltoButton)
 {
    current=displayLabel.getText();
    if(!current.isEmpty())
    {
        float num=Float.parseFloat(current);
          if (operater.equals("*"))result*=num;
        else if (operater.equals("/"))result/=num;
        else if (operater.equals("+"))result+=num;
        else if(operater.equals("-"))result+=num;
        displayLabel.setText(result+"");
        isnewcalculation=true;
        operater="";
    }
    
}
else if (e.getSource()==multiplicationButton) {
    isoperaterclicked=true;
    operater="*";
    current=displayLabel.getText();
    if(!current.isEmpty())
    {
       num=Float.parseFloat(current);
    }
    if(isnewcalculation==true) 
    {
        result=num;
        isnewcalculation=false;
    }
    else{
        if (operater.equals("*"))result*=num;
        else if (operater.equals("/"))result/=num;
        else if (operater.equals("+"))result+=num;
        else if(operater.equals("-"))result-=num;
    }
}
else if (e.getSource()==divisionButton) {
     isoperaterclicked=true;
     operater="/";
       current=displayLabel.getText();
    if(!current.isEmpty())
    {
       num=Float.parseFloat(current);
    }
    if(isnewcalculation==true)
    {
        result=num;
        isnewcalculation=false;
    }
    else{
        if (operater.equals("/"))result/=num;
        else if (operater.equals("*"))result*=num;
        else if (operater.equals("+"))result+=num;
        else if(operater.equals("-"))result-=num;
    }
}

 else if (e.getSource()==addButton) {
     isoperaterclicked=true;
     operater="+";
       current=displayLabel.getText();
    if(!current.isEmpty())
    {
       num=Float.parseFloat(current);
    }
    if(isnewcalculation==true)
    {
        result=num;
        isnewcalculation=false;
    }
    else{
        if (operater.equals("+"))result+=num;
        else if (operater.equals("/"))result/=num;
        else if (operater.equals("*"))result*=num;
        else if(operater.equals("-"))result-=num;
    }
}
else if (e.getSource()==substractionButton) {
     isoperaterclicked=true;
     operater="-";
       current=displayLabel.getText();
    if(!current.isEmpty())
    {
       num=Float.parseFloat(current);
    }
    if(isnewcalculation==true)
    {
        result=num;
        isnewcalculation=false;
    }
    else{
        if (operater.equals("-"))result-=num;
        else if (operater.equals("/"))result/=num;
        else if (operater.equals("+"))result+=num;
        else if(operater.equals("*"))result*=num;
    }
}
else if (e.getSource()==clearButton) {
     displayLabel.setText("");
     result=0;
     operater="";
     isnewcalculation=true; 

}
}
}






