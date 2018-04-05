import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Dimension;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.JFrame;
import java.util.*;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GUI_project extends JFrame {
    private JMenuBar menuBar;
    private JButton button1;
    public static ArrayList<JButton> buttons = new ArrayList<JButton>();

    JFrame frame;
    static JPanel contentPane;
    public void draw(CountryDeck cod) {
        Image image = null;
        try {
            URL url = new URL("http://i.imgur.com/AH3rB1M.jpg");
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1600,1062));
        contentPane.setBackground(new Color (162,162,162));
        
        frame = new JFrame();
         frame.setSize(1600, 900);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
        contentPane.setVisible(true);
        frame.add(contentPane);
         
        frame.pack();
        
        //SOUTH MURICA
        JButton Venezuela = new JButton();
        Venezuela.setBounds(270,500,45,45);
        Venezuela.setBackground(new Color(190,190,190));
        Venezuela.setForeground(new Color(32,32,32));
        Venezuela.setEnabled(true);
        Venezuela.setFont(new Font("sansserif",0,12));
        Venezuela.setText("1");
        contentPane.add(Venezuela);
        buttons.add(Venezuela);
        
        JButton Brazil = new JButton();
        Brazil.setBounds(360,602,100,50);
        Brazil.setBackground(new Color(190,190,190));
        Brazil.setForeground(new Color(32,32,32));
        Brazil.setEnabled(true);
        Brazil.setFont(new Font("sansserif",0,12));
        Brazil.setText("2");
        contentPane.add(Brazil);
        buttons.add(Brazil);
        
        JButton Peru = new JButton();
        Peru.setBounds(270,645,45,45);
        Peru.setBackground(new Color(190,190,190));
        Peru.setForeground(new Color(32,32,32));
        Peru.setEnabled(true);
        Peru.setFont(new Font("sansserif",0,12));
        Peru.setText("3");
        contentPane.add(Peru);
        buttons.add(Peru);
        
        JButton Argentina = new JButton();
        Argentina.setBounds(295,745,45,45);
        Argentina.setBackground(new Color(190,190,190));
        Argentina.setForeground(new Color(32,32,32));
        Argentina.setEnabled(true);
        Argentina.setFont(new Font("sansserif",0,12));
        Argentina.setText("4");
        contentPane.add(Argentina);
        buttons.add(Argentina);
        
        //AFREEKA
        JButton NorthAfrica = new JButton();
        NorthAfrica.setBounds(565,510,100,50);
        NorthAfrica.setBackground(new Color(190,190,190));
        NorthAfrica.setForeground(new Color(32,32,32));
        NorthAfrica.setEnabled(true);
        NorthAfrica.setFont(new Font("sansserif",0,12));
        NorthAfrica.setText("5");
        contentPane.add(NorthAfrica);
        buttons.add(NorthAfrica);
        
        
         JButton Egypt = new JButton();
        Egypt.setBounds(675,450,75,50);
        Egypt.setBackground(new Color(190,190,190));
        Egypt.setForeground(new Color(32,32,32));
        Egypt.setEnabled(true);
        Egypt.setFont(new Font("sansserif",0,12));
        Egypt.setText("6");
        contentPane.add(Egypt);
        buttons.add(Egypt);
        
        JButton EastAfrica = new JButton();
        EastAfrica.setBounds(776,580,45,45);
        EastAfrica.setBackground(new Color(190,190,190));
        EastAfrica.setForeground(new Color(32,32,32));
        EastAfrica.setEnabled(true);
        EastAfrica.setFont(new Font("sansserif",0,12));
        EastAfrica.setText("7");
        contentPane.add(EastAfrica);
        buttons.add(EastAfrica);
        
        JButton CentralAfrica = new JButton();
        CentralAfrica.setBounds(700,653,45,45);
        CentralAfrica.setBackground(new Color(190,190,190));
        CentralAfrica.setForeground(new Color(32,32,32));
        CentralAfrica.setEnabled(true);
        CentralAfrica.setFont(new Font("sansserif",0,12));
        CentralAfrica.setText("8");
        contentPane.add(CentralAfrica);
        buttons.add(CentralAfrica);
        
        JButton SouthAfrica = new JButton();
        SouthAfrica.setBounds(685,760,45,45);
        SouthAfrica.setBackground(new Color(190,190,190));
        SouthAfrica.setForeground(new Color(32,32,32));
        SouthAfrica.setEnabled(true);
        SouthAfrica.setFont(new Font("sansserif",0,12));
        SouthAfrica.setText("9");
        contentPane.add(SouthAfrica);
        buttons.add(SouthAfrica);
        
        
        JButton Madagascar = new JButton();
        Madagascar.setBounds(832,774,45,45);
        Madagascar.setBackground(new Color(190,190,190));
        Madagascar.setForeground(new Color(32,32,32));
        Madagascar.setEnabled(true);
        Madagascar.setFont(new Font("sansserif",0,12));
        Madagascar.setText("10");
        contentPane.add(Madagascar);
        buttons.add(Madagascar);
        
        //AUSTRALIA
        JButton Indonesia = new JButton();
        Indonesia.setBounds(1179,615,45,45);
        Indonesia.setBackground(new Color(190,190,190));
        Indonesia.setForeground(new Color(32,32,32));
        Indonesia.setEnabled(true);
        Indonesia.setFont(new Font("sansserif",0,12));
        Indonesia.setText("11");
        contentPane.add(Indonesia);
        buttons.add(Indonesia);
        
        JButton WestAustralia = new JButton();
        WestAustralia.setBounds(1156,770,45,45);
        WestAustralia.setBackground(new Color(190,190,190));
        WestAustralia.setForeground(new Color(32,32,32));
        WestAustralia.setEnabled(true);
        WestAustralia.setFont(new Font("sansserif",0,12));
        WestAustralia.setText("12");
        contentPane.add(WestAustralia);
        buttons.add(WestAustralia);
        
        JButton EastAustralia = new JButton();
        EastAustralia.setBounds(1274,735,45,45);
        EastAustralia.setBackground(new Color(190,190,190));
        EastAustralia.setForeground(new Color(32,32,32));
        EastAustralia.setEnabled(true);
        EastAustralia.setFont(new Font("sansserif",0,12));
        EastAustralia.setText("13");
        contentPane.add(EastAustralia);
        buttons.add(EastAustralia);
        
        JButton NewGuinea = new JButton();
        NewGuinea.setBounds(1333,622,45,45);
        NewGuinea.setBackground(new Color(190,190,190));
        NewGuinea.setForeground(new Color(32,32,32));
        NewGuinea.setEnabled(true);
        NewGuinea.setFont(new Font("sansserif",0,12));
        NewGuinea.setText("14");
        contentPane.add(NewGuinea);
        buttons.add(NewGuinea);
        
        //ASIA
        JButton MiddleEast = new JButton();
        MiddleEast.setBounds(812,384,45,45);
        MiddleEast.setBackground(new Color(190,190,190));
        MiddleEast.setForeground(new Color(32,32,32));
        MiddleEast.setEnabled(true);
        MiddleEast.setFont(new Font("sansserif",0,12));
        MiddleEast.setText("15");
        contentPane.add(MiddleEast);
        buttons.add(MiddleEast);
        
        JButton India = new JButton();
        India.setBounds(983,431,45,45);
        India.setBackground(new Color(190,190,190));
        India.setForeground(new Color(32,32,32));
        India.setEnabled(true);
        India.setFont(new Font("sansserif",0,12));
        India.setText("16");
        contentPane.add(India);
        buttons.add(India);
        
        JButton China = new JButton();
        China.setBounds(1075,370,45,45);
        China.setBackground(new Color(190,190,190));
        China.setForeground(new Color(32,32,32));
        China.setEnabled(true);
        China.setFont(new Font("sansserif",0,12));
        China.setText("17");
        contentPane.add(China);
        buttons.add(China);
        
        JButton Ural = new JButton();
        Ural.setBounds(956,146,45,45);
        Ural.setBackground(new Color(190,190,190));
        Ural.setForeground(new Color(32,32,32));
        Ural.setEnabled(true);
        Ural.setFont(new Font("sansserif",0,12));
        Ural.setText("18");
        contentPane.add(Ural);
        buttons.add(Ural);
        
        JButton Siberia = new JButton();
        Siberia.setBounds(1056,109,45,45);
        Siberia.setBackground(new Color(190,190,190));
        Siberia.setForeground(new Color(32,32,32));
        Siberia.setEnabled(true);
        Siberia.setFont(new Font("sansserif",0,12));
        Siberia.setText("19");
        contentPane.add(Siberia);
        buttons.add(Siberia);
        
        JButton SouthEast = new JButton();
        SouthEast.setBounds(1117,471,45,45);
        SouthEast.setBackground(new Color(190,190,190));
        SouthEast.setForeground(new Color(32,32,32));
        SouthEast.setEnabled(true);
        SouthEast.setFont(new Font("sansserif",0,12));
        SouthEast.setText("20");
        contentPane.add(SouthEast);
        buttons.add(SouthEast);
        
        JButton Afghanistan = new JButton();
        Afghanistan.setBounds(927,266,45,45);
        Afghanistan.setBackground(new Color(190,190,190));
        Afghanistan.setForeground(new Color(32,32,32));
        Afghanistan.setEnabled(true);
        Afghanistan.setFont(new Font("sansserif",0,12));
        Afghanistan.setText("21");
        contentPane.add(Afghanistan);
        buttons.add(Afghanistan);
        
        JButton Mongolia = new JButton();
        Mongolia.setBounds(1219,266,45,45);
        Mongolia.setBackground(new Color(190,190,190));
        Mongolia.setForeground(new Color(32,32,32));
        Mongolia.setEnabled(true);
        Mongolia.setFont(new Font("sansserif",0,12));
        Mongolia.setText("22");
        contentPane.add(Mongolia);
        buttons.add(Mongolia);
        
        JButton Japan = new JButton();
        Japan.setBounds(1323,302,45,45);
        Japan.setBackground(new Color(190,190,190));
        Japan.setForeground(new Color(32,32,32));
        Japan.setEnabled(true);
        Japan.setFont(new Font("sansserif",0,12));
        Japan.setText("23");
        contentPane.add(Japan);
        buttons.add(Japan);
        
        JButton Irkutsk = new JButton();
        Irkutsk.setBounds(1166,176,45,45);
        Irkutsk.setBackground(new Color(190,190,190));
        Irkutsk.setForeground(new Color(32,32,32));
        Irkutsk.setEnabled(true);
        Irkutsk.setFont(new Font("sansserif",0,12));
        Irkutsk.setText("24");
        contentPane.add(Irkutsk);
        buttons.add(Irkutsk);
        
        JButton Kamchatka = new JButton();
        Kamchatka.setBounds(1357,86,45,45);
        Kamchatka.setBackground(new Color(190,190,190));
        Kamchatka.setForeground(new Color(32,32,32));
        Kamchatka.setEnabled(true);
        Kamchatka.setFont(new Font("sansserif",0,12));
        Kamchatka.setText("25");
        contentPane.add(Kamchatka);
        buttons.add(Kamchatka);
        
        JButton Yakutsk = new JButton();
        Yakutsk.setBounds(1207,79,45,45);
        Yakutsk.setBackground(new Color(190,190,190));
        Yakutsk.setForeground(new Color(32,32,32));
        Yakutsk.setEnabled(true);
        Yakutsk.setFont(new Font("sansserif",0,12));
        Yakutsk.setText("26");
        contentPane.add(Yakutsk);
        buttons.add(Yakutsk);
        
        //North Murica
        JButton Alaska = new JButton();
        Alaska.setBounds(16,90,45,45);
        Alaska.setBackground(new Color(190,190,190));
        Alaska.setForeground(new Color(32,32,32));
        Alaska.setEnabled(true);
        Alaska.setFont(new Font("sansserif",0,12));
        Alaska.setText("27");
        contentPane.add(Alaska);
        buttons.add(Alaska);
        
        JButton NorthWest = new JButton();
        NorthWest.setBounds(100,90,45,45);
        NorthWest.setBackground(new Color(190,190,190));
        NorthWest.setForeground(new Color(32,32,32));
        NorthWest.setEnabled(true);
        NorthWest.setFont(new Font("sansserif",0,12));
        NorthWest.setText("28");
        contentPane.add(NorthWest);
        buttons.add(NorthWest);
        
        JButton EastUS = new JButton();
        EastUS.setBounds(290,295,45,45);
        EastUS.setBackground(new Color(190,190,190));
        EastUS.setForeground(new Color(32,32,32));
        EastUS.setEnabled(true);
        EastUS.setFont(new Font("sansserif",0,12));
        EastUS.setText("29");
        contentPane.add(EastUS);
        buttons.add(EastUS);
        
        JButton EastCanada = new JButton();
        EastCanada.setBounds(375,193,45,45);
        EastCanada.setBackground(new Color(190,190,190));
        EastCanada.setForeground(new Color(32,32,32));
        EastCanada.setEnabled(true);
        EastCanada.setFont(new Font("sansserif",0,12));
        EastCanada.setText("30");
        contentPane.add(EastCanada);
        buttons.add(EastCanada);
        
        JButton WestEurope = new JButton();
        WestEurope.setBounds(580,345,45,45);
        WestEurope.setBackground(new Color(190,190,190));
        WestEurope.setForeground(new Color(32,32,32));
        WestEurope.setEnabled(true);
        WestEurope.setFont(new Font("sansserif",0,12));
        WestEurope.setText("31");
        contentPane.add(WestEurope);
        buttons.add(WestEurope);
        
        JButton GreatBritian = new JButton();
        GreatBritian.setBounds(580,220,45,45);
        GreatBritian.setBackground(new Color(190,190,190));
        GreatBritian.setForeground(new Color(32,32,32));
        GreatBritian.setEnabled(true);
        GreatBritian.setFont(new Font("sansserif",0,12));
        GreatBritian.setText("32");
        contentPane.add(GreatBritian);
        buttons.add(GreatBritian);
        
        JButton SouthEurope = new JButton();
        SouthEurope.setBounds(700,320,45,45);
        SouthEurope.setBackground(new Color(190,190,190));
        SouthEurope.setForeground(new Color(32,32,32));
        SouthEurope.setEnabled(true);
        SouthEurope.setFont(new Font("sansserif",0,12));
        SouthEurope.setText("33");
        contentPane.add(SouthEurope);
        buttons.add(SouthEurope);
        
        JButton NorthEurope = new JButton();
        NorthEurope.setBounds(680,235,45,45);
        NorthEurope.setBackground(new Color(190,190,190));
        NorthEurope.setForeground(new Color(32,32,32));
        NorthEurope.setEnabled(true);
        NorthEurope.setFont(new Font("sansserif",0,12));
        NorthEurope.setText("34");
        contentPane.add(NorthEurope);
        buttons.add(NorthEurope);
        
        JButton Scandinavia = new JButton();
        Scandinavia.setBounds(650,130,45,45);
        Scandinavia.setBackground(new Color(190,190,190));
        Scandinavia.setForeground(new Color(32,32,32));
        Scandinavia.setEnabled(true);
        Scandinavia.setFont(new Font("sansserif",0,12));
        Scandinavia.setText("35");
        contentPane.add(Scandinavia);
        buttons.add(Scandinavia);
        
        JButton Russia = new JButton();
        Russia.setBounds(770,200,45,45);
        Russia.setBackground(new Color(190,190,190));
        Russia.setForeground(new Color(32,32,32));
        Russia.setEnabled(true);
        Russia.setFont(new Font("sansserif",0,12));
        Russia.setText("36");
        contentPane.add(Russia);
        buttons.add(Russia);
        
        JButton Alberta = new JButton();
        Alberta.setBounds(130,170,45,45);
        Alberta.setBackground(new Color(190,190,190));
        Alberta.setForeground(new Color(32,32,32));
        Alberta.setEnabled(true);
        Alberta.setFont(new Font("sansserif",0,12));
        Alberta.setText("37");
        contentPane.add(Alberta);
        buttons.add(Alberta);
        
        JButton Ontario = new JButton();
        Ontario.setBounds(260,170,45,45);
        Ontario.setBackground(new Color(190,190,190));
        Ontario.setForeground(new Color(32,32,32));
        Ontario.setEnabled(true);
        Ontario.setFont(new Font("sansserif",0,12));
        Ontario.setText("38");
        contentPane.add(Ontario);
        buttons.add(Ontario);
        
        JButton Iceland = new JButton();
        Iceland.setBounds(575,120,45,45);
        Iceland.setBackground(new Color(190,190,190));
        Iceland.setForeground(new Color(32,32,32));
        Iceland.setEnabled(true);
        Iceland.setFont(new Font("sansserif",0,12));
        Iceland.setText("39");
        contentPane.add(Iceland);
        buttons.add(Iceland);
        
        JButton Greenland = new JButton();
        Greenland.setBounds(500,70,45,45);
        Greenland.setBackground(new Color(190,190,190));
        Greenland.setForeground(new Color(32,32,32));
        Greenland.setEnabled(true);
        Greenland.setFont(new Font("sansserif",0,12));
        Greenland.setText("45");
        contentPane.add(Greenland);
        buttons.add(Greenland);
        
        JButton WestUS = new JButton();
        WestUS.setBounds(155,275,45,45);
        WestUS.setBackground(new Color(190,190,190));
        WestUS.setForeground(new Color(32,32,32));
        WestUS.setEnabled(true);
        WestUS.setFont(new Font("sansserif",0,12));
        WestUS.setText("41");
        contentPane.add(WestUS);
        buttons.add(WestUS);
        
        
        JButton CentralAmerica = new JButton();
        CentralAmerica.setBounds(175,380,45,45);
        CentralAmerica.setBackground(new Color(190,190,190));
        CentralAmerica.setForeground(new Color(32,32,32));
        CentralAmerica.setEnabled(true);
        CentralAmerica.setFont(new Font("sansserif",0,12));
        CentralAmerica.setText("42");
        contentPane.add(CentralAmerica);
        buttons.add(CentralAmerica);
        setAllVisible();

        
        //set all the buttons
        (cod.getCountry(0)).setButton(Alaska);
        (cod.getCountry(1)).setButton(NorthWest);
        (cod.getCountry(2)).setButton(Greenland);
        (cod.getCountry(3)).setButton(Alberta);
        (cod.getCountry(4)).setButton(Ontario);
        (cod.getCountry(5)).setButton(EastCanada);
        (cod.getCountry(6)).setButton(WestUS);
        (cod.getCountry(7)).setButton(EastUS);
        (cod.getCountry(8)).setButton(CentralAmerica);
        (cod.getCountry(9)).setButton(Venezuela);
        (cod.getCountry(10)).setButton(Peru);
        (cod.getCountry(11)).setButton(Brazil);
        (cod.getCountry(12)).setButton(Argentina);
        (cod.getCountry(13)).setButton(Iceland);
        (cod.getCountry(14)).setButton(GreatBritian);
        (cod.getCountry(15)).setButton(NorthEurope);
        (cod.getCountry(16)).setButton(SouthEurope);
        (cod.getCountry(17)).setButton(WestEurope);
        (cod.getCountry(18)).setButton(Russia);
        (cod.getCountry(19)).setButton(Scandinavia);
        (cod.getCountry(20)).setButton(NorthAfrica);
        (cod.getCountry(21)).setButton(Egypt);
        (cod.getCountry(22)).setButton(EastAfrica);
        (cod.getCountry(23)).setButton(SouthAfrica);
        (cod.getCountry(24)).setButton(CentralAfrica);
        (cod.getCountry(25)).setButton(Madagascar);
        (cod.getCountry(26)).setButton(MiddleEast);
        (cod.getCountry(27)).setButton(India);
        (cod.getCountry(28)).setButton(SouthEast);
        (cod.getCountry(29)).setButton(Afghanistan);
        (cod.getCountry(30)).setButton(China);
        (cod.getCountry(31)).setButton(Mongolia);
        (cod.getCountry(32)).setButton(Japan);
        (cod.getCountry(33)).setButton(Irkutsk);
        (cod.getCountry(34)).setButton(Kamchatka);
        (cod.getCountry(35)).setButton(Yakutsk);
        (cod.getCountry(36)).setButton(Siberia);
        (cod.getCountry(37)).setButton(Ural);
        (cod.getCountry(38)).setButton(Indonesia);
        (cod.getCountry(39)).setButton(NewGuinea);
        (cod.getCountry(40)).setButton(EastAustralia);
        (cod.getCountry(41)).setButton(WestAustralia);
    }

    //constructor
    public GUI_project(CountryDeck cod){
        this.setTitle("GUI_project");
        this.setSize(500,450);
        
        draw(cod);
    }

    public void setAllVisible() {
        for(JButton b : buttons) {
            b.setVisible(true);
        }
    }

    public static JPanel getPane() {
        return contentPane;
    }
    
    public static void changeButtonColor(JButton button, Color color){
        button.setBackground(color);
        button.setForeground(color);
    }
    
    public void updateCountry(Country country, Player player){
           if(player.getColor().equals("RED")){
               (country.getButton()).setBackground(Color.RED);
           }
           else{
               (country.getButton()).setBackground(Color.CYAN);
           }
           country.getButton().setText(Integer.toString(country.getArmies()));
    }
    
    public void updateAll(Player pl1, Player pl2){
        for(Country c : pl1.getTerritories()){
            this.updateCountry(c, pl1);
        }
        for(Country c : pl2.getTerritories()){
            this.updateCountry(c, pl2);
        }
    }
}