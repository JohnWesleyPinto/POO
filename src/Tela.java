import javax.swing.*;
import java.awt.*;

public class Tela1 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon pepuImg = new ImageIcon("C:/Users/john.silva/IdeaProjects/POO/src/Fotos/Pepu.jpg");
    ImageIcon addIcon = new ImageIcon("C:/Users/john.silva/IdeaProjects/POO/src/Fotos/Adicionar.png");
    ImageIcon pesqIcon = new ImageIcon("C:/Users/john.silva/IdeaProjects/POO/src/Fotos/Pesquisar.png");
    ImageIcon removeIcon = new ImageIcon("C:/Users/john.silva/IdeaProjects/POO/src/Fotos/Delete.png");
    JButton btn_Adicionar, btn_Pesquisar, btn_Remover;
    Tela1 tela = new Tela1();
    public Tela1(){
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
        btn_Adicionar.addActionListener(new AmigoAddController(tela,this));
        btn_Pesquisar = new JButton("Pesquisar",pesqIcon);
        btn_Pesquisar.addActionListener(new AmigoSearchController(tela,this));
        btn_Remover = new JButton("Remover Amigo", addIcon);
        btn_Remover.addActionListener(new AmigoRemoveController(tela,this));









    }
    public static void main(String []args){
        JFrame Tela1 = new Tela1();
        Tela1.setVisible(true);
        Tela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
