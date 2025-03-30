import javax.swing.*;
import java.awt.*;

public class Ifmtlogo extends JFrame {

    public Ifmtlogo() {
        // Configurações da janela
        setTitle("IFMT Logo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Carregar a imagem da logo
        ImageIcon logo = new ImageIcon("if.png");
        JLabel logoLabel = new JLabel(logo);
        panel.add(logoLabel, BorderLayout.CENTER);

        // Texto abaixo da logo
        JLabel textLabel = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO", SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(textLabel, BorderLayout.SOUTH);

        // Adiciona o painel à janela
        add(panel);
    }

    public static void main(String[] args) {
        // Cria e exibe a janela
        SwingUtilities.invokeLater(() -> {
            Ifmtlogo frame = new Ifmtlogo();
            frame.setVisible(true);
        });
    }
}