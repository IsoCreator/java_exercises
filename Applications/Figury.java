import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Figury implements ActionListener{
	
	JFrame ramka;
	JLabel etykieta1;
	JLabel etykieta2;
	JLabel etykieta3;
	JLabel etykieta4;
	JLabel etykieta5;
	JTextField poletext1;
	JTextField poletext2;
	JTextField poletext3;
	JTextField poletext4;
	JTextField poletext5;
	JButton przycisk1;
	JButton przycisk2;
	
	JFrame oknodialogu;
	JLabel etykieta6;
	JButton przycisk3;
	
	JComboBox<String> wybor_figury;
	JButton wybierz_kolor;
	
	public static void main(String args[]){
		Figury figury=new Figury();
		figury.zbudujGUI();
	}
	
	public void zbudujGUI(){

		ramka = new JFrame("FIGURY");
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setSize(600,300);
		ramka.setLayout(new GridLayout(7,0));
		etykieta1 = new JLabel("Podaj pierwszy bok:");
		poletext1 = new JTextField();
		etykieta2 = new JLabel("Podaj drugi bok:");
		poletext2 = new JTextField();
		etykieta5 = new JLabel("Podaj trzeci bok:");
		poletext5 = new JTextField();
		etykieta3 = new JLabel("Pole:");
		poletext3 = new JTextField();
		etykieta4 = new JLabel("Obwod:");
		poletext4 = new JTextField();
		przycisk1 = new JButton("OBLICZ POLE");
		przycisk2 = new JButton("OBLICZ OBWOD");

		ramka.add(etykieta1);
		ramka.add(poletext1);
		ramka.add(etykieta2);
		ramka.add(poletext2);
		ramka.add(etykieta5);
		ramka.add(poletext5);
		ramka.add(przycisk1);
		ramka.add(przycisk2);
		przycisk1.addActionListener(this);
		przycisk2.addActionListener(this);
		ramka.add(etykieta3);
		ramka.add(poletext3);
		ramka.add(etykieta4);
		ramka.add(poletext4);
		
		wybor_figury = new JComboBox<>();
		//wybor_figury.setBounds(50,400, 100,20);
		wybor_figury.addItem("Kwadrat");
		wybor_figury.addItem("Trojkat");
		ramka.add(wybor_figury);
		wybor_figury.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
		});
		
		wybierz_kolor = new JButton("Wybierz kolor");
		ramka.add(wybierz_kolor);
		wybierz_kolor.addActionListener(this);
		
		
		
		ramka.setVisible(true);
		
		
	}
	
	void dialog(String tytul, String info){
		
	   oknodialogu=new JFrame(tytul);
	   oknodialogu.setSize(300,100);
	   oknodialogu.setLocation(150,25);
	   oknodialogu.setLayout(new GridLayout(2,0));
	   etykieta6=new JLabel("          "+info);
	   przycisk3=new JButton("OK");
	   przycisk3.setBackground(Color.red);
	   przycisk3.setFont(new Font("OK",Font.BOLD,18));
	   oknodialogu.add(etykieta6);
	   oknodialogu.add(przycisk3);
	   przycisk3.addActionListener(this);
	   oknodialogu.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent dzialanie){

		if(dzialanie.getSource() == wybierz_kolor){
			Color wybrany_kolor = JColorChooser.showDialog(null, "Wybor koloru", Color.GREEN);
			poletext1.setForeground(wybrany_kolor);
		}
	
		if(e.getSource() == wybor_figury){
			String figura = wybor_figury.getSelectedItem().toString();
			
			if(figura.equals("Kwadrat")){
				poletext1.setForeground(Color.GREEN);
			}
			if(figura.equals("Trojkat")){

		
	
		if (dzialanie.getSource() == przycisk1){
			try{
				if(Float.parseFloat(poletext1.getText())>0 && Float.parseFloat(poletext2.getText())>0 && Float.parseFloat(poletext5.getText())>0){
					float p=(Float.parseFloat(poletext1.getText())+Float.parseFloat(poletext2.getText())+Float.parseFloat(poletext5.getText()))/2;
					float pole=(float)Math.sqrt(p*(p-Float.parseFloat(poletext1.getText()))*(p-Float.parseFloat(poletext2.getText()))*(p-Float.parseFloat(poletext5.getText())));
					poletext3.setText(String.valueOf(pole));
				}else
					dialog("NIEDODATNIE BOKI","Podaj dlugosci bokow jeszcze raz");
			}
			catch (Exception e){
				dialog("BLEDNY FORMAT DANYCH","Podaj liczby!");
			}
		}
		if (dzialanie.getSource() == przycisk2){
			try{
				if(Float.parseFloat(poletext1.getText())>0 && Float.parseFloat(poletext2.getText())>0 && Float.parseFloat(poletext5.getText())>0){
					float obwod=Float.parseFloat(poletext1.getText())+Float.parseFloat(poletext2.getText())+Float.parseFloat(poletext5.getText());
					poletext4.setText(String.valueOf(obwod));
				}else
					dialog("NIEDODATNIE BOKI","Podaj dlugosci bokow jeszcze raz");
			}
			catch (Exception e){
				dialog("BLEDNY FORMAT DANYCH","Podaj liczby!");
			}
		}
			}
		}
		if (dzialanie.getSource() == przycisk3) oknodialogu.setVisible(false);
	}	
}
