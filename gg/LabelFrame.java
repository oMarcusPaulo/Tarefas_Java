

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
        
public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame(){
        super("Testing JLabel");
        setLayout(new FlowLayout ());
        
        label1 = new JLabel("");
        label1.setToolTipText("Isso é algo");
        add(label1);
        
        Icon ifmtIcon = new ImageIcon( getClass().getResource("IFMT.PNG"));
        label2 = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO",ifmtIcon,SwingConstants.CENTER);
        label2.setToolTipText("Isso é label 2");
        add(label2);
        
        label3 = new JLabel();
        label3.setIcon(ifmtIcon);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setText("Label com icone e texto e botao");
        label3.setToolTipText("This is label3");
        
    }
}
