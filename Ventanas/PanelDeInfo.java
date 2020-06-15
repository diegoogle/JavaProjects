/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Diego Gómez
 */
public class PanelDeInfo extends JFrame implements ActionListener{
    JPanel panelInfo;
    Container conten;
    JButton boton, botonCerrar;
    int x = 425, y= 600, posx = 300, posy = 100;
    //---------------Metodos()--------------------------
    public void exitForm(java.awt.event.WindowEvent evt){
		System.exit(0);
	}
    public PanelDeInfo(){
        addWindowListener(new java.awt.event.WindowAdapter(){
			public void windowClosing(java.awt.event.WindowEvent evt){
				exitForm(evt);
			}
			
		});
     setTitle("Información");
     conten = getContentPane();
     panelInfo = new JPanel();
     panelInfo.setLayout(null);
     panelInfo.setBackground(Color.white);
     setVisible(true);
     setSize(x, y);
     setLocation(posx,posy);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cerrarPanelInfo(){
        botonCerrar = new JButton("Cerrar");
        botonCerrar.setBounds(x-425, y-90, 410, 50);
        panelInfo.add(botonCerrar);
        botonCerrar.setBackground(Color.yellow);
        botonCerrar.addActionListener(this);
    }
    public void Info(String imagen){
        panelInfo.setVisible(true);
        boton = new JButton(new ImageIcon(getClass().getResource(imagen)));
        boton.setBounds(1, 1, 410, 510);
        panelInfo.add(boton);
        conten.add(panelInfo);
    }
    
    public void setElementoG1A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Hidrogeno.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Litio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Sodio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Potasio.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Rubidio.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Cesio.jpg");
                cerrarPanelInfo();
                break;
            case 6:
                Info("/imagenes/Francio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }//Invocacion de imagen con información
    public void setElementoG2A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Berilio.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Magnesio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Calcio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Estroncio.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Bario.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Radio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG3B(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Escandio.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Itrio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Lantanidos.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Actinidos.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG4B(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Titanio.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Circonio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Hafnio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Rutherfordio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG5B(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Vanadio.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Niobio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Tantalio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Dubnio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG6B(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Cromo.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Molibdeno.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Tungsteno.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Seaborgio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG7B(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Manganeso.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Tecnecio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Renio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Bohrio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG8B1(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Hierro.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Rutenio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Osmio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Hassio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG8B2(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Cobalto.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Rodio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Iridio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Meitnero.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG8B3(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Niquel.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Paladio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Platino.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Dramstadtio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG1B(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Cobre.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Plata.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Oro.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Roentgenio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG2B(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Zinc.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Cadmio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Mercurio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Copernicio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG3A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Boro.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Aluminio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Galio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Indio.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Talio.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Ununtrio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG4A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Carbono.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Silicio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Germanio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Estaño.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Plomo.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Flerovio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG5A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Nitrogeno.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Fosforo.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Arsenico.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Antimonio.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Bismuto.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Unumpentio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG6A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Oxigeno.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Azufre.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Selenio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Telurio.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Polonio.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Livermorio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG7A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Fluor.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Cloro.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Bromo.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Yodo.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Astato.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Ununseptio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoG8A(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Helio.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Neon.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Argon.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Xenon.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Kripton.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Radon.jpg");
                cerrarPanelInfo();
                break;
            case 6:
                Info("/imagenes/Ununoctium.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoGLA(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/La.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Ce.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Pr.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Nd.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Pm.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Sm.jpg");
                cerrarPanelInfo();
                break;
            case 6:
                Info("/imagenes/Eu.jpg");
                cerrarPanelInfo();
                break;
            case 7:
                Info("/imagenes/Gd.jpg");
                cerrarPanelInfo();
                break;
            case 8:
                Info("/imagenes/Tb.jpg");
                cerrarPanelInfo();
                break;
            case 9:
                Info("/imagenes/Dy.jpg");
                cerrarPanelInfo();
                break;
            case 10:
                Info("/imagenes/Ho.jpg");
                cerrarPanelInfo();
                break;
            case 11:
                Info("/imagenes/Er.jpg");
                cerrarPanelInfo();
                break;
            case 12:
                Info("/imagenes/Tm.jpg");
                cerrarPanelInfo();
                break;
            case 13:
                Info("/imagenes/Yb.jpg");
                cerrarPanelInfo();
                break;
            case 14:
                Info("/imagenes/Lu.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    public void setElementoGAC(int cont){
        switch(cont){
            case 0:
                Info("/imagenes/Actinio.jpg");
                cerrarPanelInfo();
                break;
            case 1:
                Info("/imagenes/Terio.jpg");
                cerrarPanelInfo();
                break;
            case 2:
                Info("/imagenes/Protactinio.jpg");
                cerrarPanelInfo();
                break;
            case 3:
                Info("/imagenes/Uranio.jpg");
                cerrarPanelInfo();
                break;
            case 4:
                Info("/imagenes/Neptunio.jpg");
                cerrarPanelInfo();
                break;
            case 5:
                Info("/imagenes/Plutonio.jpg");
                cerrarPanelInfo();
                break;
            case 6:
                Info("/imagenes/Americio.jpg");
                cerrarPanelInfo();
                break;
            case 7:
                Info("/imagenes/Curio.jpg");
                cerrarPanelInfo();
                break;
            case 8:
                Info("/imagenes/Berkelio.jpg");
                cerrarPanelInfo();
                break;
            case 9:
                Info("/imagenes/Californio.jpg");
                cerrarPanelInfo();
                break;
            case 10:
                Info("/imagenes/Einstenio.jpg");
                cerrarPanelInfo();
                break;
            case 11:
                Info("/imagenes/Fermio.jpg");
                cerrarPanelInfo();
                break;
            case 12:
                Info("/imagenes/Mendelevio.jpg");
                cerrarPanelInfo();
                break;
            case 13:
                Info("/imagenes/Nobelio.jpg");
                cerrarPanelInfo();
                break;
            case 14:
                Info("/imagenes/Lawrencio.jpg");
                cerrarPanelInfo();
                break;
                }    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== botonCerrar){
            this.hide();
        }
    }

    
}
