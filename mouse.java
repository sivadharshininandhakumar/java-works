import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
class A extends JFrame implements MouseListener
{
JLabel l1;
public A()
{
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 400);
setLayout(new GridBagLayout());
l1 = new JLabel();
Font f = new Font("Verdana", Font.BOLD, 20);
l1.setFont(f);
l1.setForeground(Color.BLUE);
l1.setAlignmentX(Component.CENTER_ALIGNMENT);
l1.setAlignmentY(Component.CENTER_ALIGNMENT);
add(l1);
addMouseListener(this);
setVisible(true); }
public void mouseExited(MouseEvent m)
{
l1.setText("Mouse Exited");
}
public void mouseEntered(MouseEvent m)
{
l1.setText("Mouse Entered");
}
public void mouseReleased(MouseEvent m)
{
l1.setText("Mouse Released");
}

public void mousePressed(MouseEvent m)
{
l1.setText("Mouse Pressed");
}
public void mouseClicked(MouseEvent m)
{
l1.setText("Mouse Clicked");
} }
class Mevents
{ public static void main(String[] args)
{
A a = new A();
} }