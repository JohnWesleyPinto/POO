import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Tela extends JFrame {
    JLabel linha1, linha2;
    ImageIcon pepuImg = new ImageIcon("C:/Users/john.silva/IdeaProjects/AiQueDelicia/src/Fotos/pepu.jpg");
    ImageIcon addIcon = new ImageIcon("/Fotos/Adicionar.png");
    ImageIcon pesqIcon = new ImageIcon("/Fotos/Pesquisar.png");
    ImageIcon removeIcon = new ImageIcon("/src/Fotos/Delete.png");
    JButton btn_Adicionar, btn_Pesquisar, btn_Remover;
    public Tela(){
        setLayout(null);
        setTitle("Find your friend");
        setSize(1080,720);
        setLocation(150,150);
        setResizable(true);
        getContentPane().setBackground(Color.lightGray);
        linha1 = new JLabel("Encontre o seu amigo.");
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Times new roman",Font.ROMAN_BASELINE,24));
        linha2 = new JLabel(pepuImg, JLabel.CENTER);

        btn_Adicionar = new JButton("Adicionar Amigo", addIcon);
        btn_Adicionar.setBounds(100,100,100,70);

        btn_Pesquisar = new JButton("Pesquisar",pesqIcon);

        btn_Remover = new JButton("Remover Amigo", addIcon);


        /*
        btn_Adicionar.addActionListener(new AmigoAddController(tela,this));

        btn_Pesquisar.addActionListener(new AmigoSearchController(tela,this));

        btn_Remover.addActionListener(new AmigoRemoveController(tela,this));
        setVisible(true); */
        setLayout(new BorderLayout(3,3));
        add(BorderLayout.CENTER,new JLabel(pepuImg));
        add(BorderLayout.EAST,btn_Adicionar);
        add(BorderLayout.EAST,btn_Pesquisar);
        add(BorderLayout.EAST,btn_Remover);
        setVisible(true);
    }
}
