import java.awt.*;
import java.awt.event.*;

public class calculator {
    public static void main(String[] args) 
    {
        MarvellousCalculator mobj = new MarvellousCalculator(400,400,"Marvellous");     //only to create window
    }    
}

class MarvellousCalculator extends WindowAdapter implements ActionListener
{
    public Frame fobj; 
    public Button b1,b2,b3,b4;      
    public TextField t1,t2;
    public Label lobj;
    public Integer no1,no2;
    public MarvellousCalculator(int width, int heigh, String title)
    {
        fobj= new Frame(title);
        fobj.setSize(width,heigh);
        

        fobj.addWindowListener(this);
        b1=new Button("ADD");
        b2=new Button("SUB");
        b3=new Button("MULTIPLY");
        b4=new Button("DIVIDE");

        t1=new TextField();
        t2=new TextField();

        b1.setBounds(10,280,80,40);
        b2.setBounds(110,280,80,40);
        b3.setBounds(200,280,80,40);
        b4.setBounds(300,280,80,40);

        t1.setBounds(70,100,100,40);
        t2.setBounds(220,100,100,40);

        fobj.add(b1);
        fobj.add(b2);
        fobj.add(b3);
        fobj.add(b4);

        fobj.add(t1);
        fobj.add(t2);

        lobj=new Label();
        lobj.setBounds(150,150,200,100);
        fobj.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        fobj.setLayout(null);           
        fobj.setVisible(true);

    }

    public void windowClosing(WindowEvent obj)      //event handler for frame/window
    {
        System.exit(0);     //equivalent to return 0;
    }
    public void actionPerformed(ActionEvent aobj)       //event handler for buttons
    {
        try
        {
            no1=Integer.parseInt(t1.getText());         //parseInt to convert string into an integer
            no2=Integer.parseInt(t2.getText());

            if(aobj.getSource()==b1)
            {
                lobj.setText(" Addition is:"+ (no1 + no2));
            }
            else if(aobj.getSource()==b2)
            {
                lobj.setText(" Subtraction is:"+ (no1 - no2));
            }

            else if(aobj.getSource()==b3)
            {
                lobj.setText(" Product is:"+ (no1 * no2));
            }
            else if(aobj.getSource()==b4)
            {
                lobj.setText(" Divison is:"+ (no1 / no2));
            }
        }
         
        catch(Exception eobj)
        {

        }
    }
}