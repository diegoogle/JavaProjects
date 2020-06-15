/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Diego Gómez
 */
public class Inicial extends JFrame implements ActionListener{
    int x=1300, y=720;//Tamaño de la ventana principal
    //Panel de informacion
   
    
    //Panel principal
    int posx = 20, posy = 40, ancho = 60, alto = 60, espaciado = 70;   //Medida de los botones
    int g1a = 7, g2a = 6, gb = 4, la_ac = 15;//cantidad de filas por cada grupo
    Container contenedor;
    JPanel panel;
    JButton botones1a[], botones2a[], botones3b[], botones4b[],
            botones5b[], botones6b[], botones7b[], botones8b1[],
            botones8b2[], botones8b3[], botones1b[], botones2b[],
            botones3a[], botones4a[], botones5a[], botones6a[],
            botones7a[], botones8a[], botonesla[], botonesac[];
    protected String[] grupo1a = {"H","Li","Na","K","Rb","Cs","Fr"};
    protected String[] grupo2a = {"Be","Mg","Ca","Sr","Ba","Ra"};
    protected String[] grupo3b = {"Sc","Y","La","Ac"};
    protected String[] grupo4b = {"Ti","Zr","Hf","Rf"};
    protected String[] grupo5b = {"V","Nb","Ta","Db"};
    protected String[] grupo6b = {"Cr","Mo","W","Sg"};
    protected String[] grupo7b = {"Mn","Tc","Re","Bh"};
    protected String[] grupo8b1 = {"Fe","Ru","Os","Hs"};
    protected String[] grupo8b2 = {"Co","Rh","Ir","Mt"};
    protected String[] grupo8b3 = {"Ni","Pd","Pt","Ds"};
    protected String[] grupo1b = {"Cu","Ag","Au","Rg"};
    protected String[] grupo2b = {"Zn","Cd","Hg","Cn"};
    protected String[] grupo3a = {"B","Al","Ga","In","Tl","Unt"};
    protected String[] grupo4a = {"C","Si","Ge","Sn","Pb","Fl"};
    protected String[] grupo5a = {"N","P","As","Sb","Bi","Uup"};
    protected String[] grupo6a = {"O","S","Se","Te","Po","Lv"};
    protected String[] grupo7a = {"F","Cl","Br","I","At","Uus"};
    protected String[] grupo8a = {"He","Ne","Ar","Kr","Xe","Rn","Uuo"};
    protected String[] lantanidos = {"La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu"};
    protected String[] actinidos = {"Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr"};
    
    //---------------------------Metodos()-----------------------------------------------------
    //Creacion de botones por grupos en tabla periodica
    public void Grupo1a(){
        botones1a = new JButton[g1a];
        int salto = 0;
        for(int i = 0; i < botones1a.length ; i++){
            botones1a[i] = new JButton(grupo1a[i]);
            botones1a[i].setBounds(posx, posy+salto, ancho, alto);
            botones1a[i].addActionListener(this);
            if(i < 1){
                botones1a[i].setBackground(Color.green);
            }else{
                botones1a[i].setBackground(Color.orange);
            }
            panel.add(botones1a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }
    }
    public void Grupo2a(){
        botones2a = new JButton[g2a];
        int salto = 70;
      for(int i = 0; i < botones2a.length ; i++){
            botones2a[i] = new JButton(grupo2a[i]);
            botones2a[i].setBounds(posx+espaciado, posy + salto, ancho, alto);
            botones2a[i].addActionListener(this);
            botones2a[i].setBackground(Color.yellow);
            panel.add(botones2a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
       }
    public void Grupo3b(){
        botones3b = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones3b.length ; i++){
            botones3b[i] = new JButton(grupo3b[i]);
            botones3b[i].setBounds(posx+(espaciado*2), posy + salto, ancho, alto);
            botones3b[i].addActionListener(this);
            if(i <= 1 ){
                botones3b[i].setBackground(Color.red);
            }else{
                 if(i == 2){
                botones3b[i].setBackground(Color.pink);
            }else{
                     if(i == 3){
                         botones3b[i].setBackground(Color.magenta);
                     }
            }
            }
            
            panel.add(botones3b[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo4b(){//Crea los botones que están en el grupo 1A
        botones4b = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones4b.length ; i++){
            botones4b[i] = new JButton(grupo4b[i]);
            botones4b[i].setBounds(posx+(espaciado*3), posy + salto, ancho, alto);
            botones4b[i].addActionListener(this);
            botones4b[i].setBackground(Color.red);
            panel.add(botones4b[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo5b(){//Crea los botones que están en el grupo 1A
        botones5b = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones5b.length ; i++){
            botones5b[i] = new JButton(grupo5b[i]);
            botones5b[i].setBounds(posx+(espaciado*4), posy + salto, ancho, alto);
            botones5b[i].addActionListener(this);
            botones5b[i].setBackground(Color.red);
            panel.add(botones5b[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo6b(){//Crea los botones que están en el grupo 6B
        botones6b = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones6b.length ; i++){
            botones6b[i] = new JButton(grupo6b[i]);
            botones6b[i].setBounds(posx+(espaciado*5), posy + salto, ancho, alto);
            botones6b[i].addActionListener(this);
            botones6b[i].setBackground(Color.red);
            panel.add(botones6b[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo7b(){
        botones7b = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones7b.length ; i++){
            botones7b[i] = new JButton(grupo7b[i]);
            botones7b[i].setBounds(posx+(espaciado*6), posy + salto, ancho, alto);
            botones7b[i].addActionListener(this);
            botones7b[i].setBackground(Color.red);
            panel.add(botones7b[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo8b1(){
        botones8b1 = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones8b1.length ; i++){
            botones8b1[i] = new JButton(grupo8b1[i]);
            botones8b1[i].setBounds(posx+(espaciado*7), posy + salto, ancho, alto);
            botones8b1[i].addActionListener(this);
            botones8b1[i].setBackground(Color.red);
            panel.add(botones8b1[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo8b2(){
        botones8b2 = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones8b2.length ; i++){
            botones8b2[i] = new JButton(grupo8b2[i]);
            botones8b2[i].setBounds(posx+(espaciado*8), posy + salto, ancho, alto);
            botones8b2[i].addActionListener(this);
            botones8b2[i].setBackground(Color.red);
            panel.add(botones8b2[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo8b3(){
        botones8b3 = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones8b3.length ; i++){
            botones8b3[i] = new JButton(grupo8b3[i]);
            botones8b3[i].setBounds(posx+(espaciado*9), posy + salto, ancho, alto);
            botones8b3[i].addActionListener(this);
            botones8b3[i].setBackground(Color.red);
            panel.add(botones8b3[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo1b(){
        botones1b = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones1b.length ; i++){
            botones1b[i] = new JButton(grupo1b[i]);
            botones1b[i].setBounds(posx+(espaciado*10), posy + salto, ancho, alto);
            botones1b[i].addActionListener(this);
            botones1b[i].setBackground(Color.red);
            panel.add(botones1b[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo2b(){
        botones2b = new JButton[gb];
        int salto = 210;
      for(int i = 0; i < botones2b.length ; i++){
            botones2b[i] = new JButton(grupo2b[i]);
            botones2b[i].setBounds(posx+(espaciado*11), posy + salto, ancho, alto);
            botones2b[i].addActionListener(this);
            botones2b[i].setBackground(Color.red);
            panel.add(botones2b[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo3a(){
        botones3a = new JButton[g2a];
        int salto = 70;
      for(int i = 0; i < botones3a.length ; i++){
            botones3a[i] = new JButton(grupo3a[i]);
            botones3a[i].setBounds(posx+(espaciado*12), posy + salto, ancho, alto);
            botones3a[i].addActionListener(this);
            if(i < 1){
                botones3a[i].setBackground(Color.lightGray);
            }else{
                botones3a[i].setBackground(Color.gray);
            }
            panel.add(botones3a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo4a(){
        botones4a = new JButton[g2a];
        int salto = 70;
      for(int i = 0; i < botones4a.length ; i++){
            botones4a[i] = new JButton(grupo4a[i]);
            botones4a[i].setBounds(posx+(espaciado*13), posy + salto, ancho, alto);
            botones4a[i].addActionListener(this);
            if(i < 1){
                botones4a[i].setBackground(Color.green);
            }else{
                if(i >= 1 && i <= 2){
                    botones4a[i].setBackground(Color.lightGray);
                }else{
                    if(i > 2){
                        botones4a[i].setBackground(Color.gray);
                    }
                }
            }
            panel.add(botones4a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo5a(){
        botones5a = new JButton[g2a];
        int salto = 70;
      for(int i = 0; i < botones5a.length ; i++){
            botones5a[i] = new JButton(grupo5a[i]);
            botones5a[i].setBounds(posx+(espaciado*14), posy + salto, ancho, alto);
            botones5a[i].addActionListener(this);
            if(i <= 1){
                botones5a[i].setBackground(Color.green);
            }else{
                if(i >= 2 && i <= 3){
                    botones5a[i].setBackground(Color.lightGray);
                }else{
                    if(i >= 4){
                        botones5a[i].setBackground(Color.gray);
                    }
                }
            }
            panel.add(botones5a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo6a(){
        botones6a = new JButton[g2a];
        int salto = 70;
      for(int i = 0; i < botones6a.length ; i++){
            botones6a[i] = new JButton(grupo6a[i]);
            botones6a[i].setBounds(posx+(espaciado*15), posy + salto, ancho, alto);
            botones6a[i].addActionListener(this);
            if(i <= 2){
                botones6a[i].setBackground(Color.green);
            }else{
                if(i > 2 && i < 5){
                    botones6a[i].setBackground(Color.lightGray);
                }else{
                    if(i > 4){
                        botones6a[i].setBackground(Color.gray);
                    }
                }
            }
            panel.add(botones6a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo7a(){
        botones7a = new JButton[g2a];
        int salto = 70;
      for(int i = 0; i < botones7a.length ; i++){
            botones7a[i] = new JButton(grupo7a[i]);
            botones7a[i].setBounds(posx+(espaciado*16), posy + salto, ancho, alto);
            botones7a[i].addActionListener(this);
            botones7a[i].setBackground(Color.cyan);
            panel.add(botones7a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Grupo8a(){
        botones8a = new JButton[g1a];
        int salto = 0;
      for(int i = 0; i < botones8a.length ; i++){
            botones8a[i] = new JButton(grupo8a[i]);
            botones8a[i].setBounds(posx+(espaciado*17), posy + salto, ancho, alto);
            botones8a[i].addActionListener(this);
            botones8a[i].setBackground(Color.blue);
            panel.add(botones8a[i]);
            contenedor.add(panel);
            salto += espaciado;
        }  
    }
    public void Lantanidos(){
        botonesla = new JButton[la_ac];
        int salto = 3; 
        for(int i = 0; i < botonesla.length; i++){
            botonesla[i] = new JButton(lantanidos[i]);
            botonesla[i].setBounds(posx+(espaciado*salto), posy+500, ancho, alto);
            botonesla[i].addActionListener(this);
            botonesla[i].setBackground(Color.pink);
            panel.add(botonesla[i]);
            contenedor.add(panel);
            salto += 1;
        }
    }  
    public void Actinidos(){
        botonesac = new JButton[la_ac];
        int salto = 3; 
        for(int i = 0; i < botonesac.length; i++){
            botonesac[i] = new JButton(actinidos[i]);
            botonesac[i].setBounds(posx+(espaciado*salto), posy+570, ancho, alto);
            botonesac[i].addActionListener(this);
            botonesac[i].setBackground(Color.magenta);
            panel.add(botonesac[i]);
            contenedor.add(panel);
            salto += 1;
        }
    }
    public void imagenTec(String imagen){
     JButton tec;
     int pos_x = 170, pos_y = 20, tam_x = 192, tam_y = 178;
     tec = new JButton(new ImageIcon(getClass().getResource(imagen)));
     tec.setBounds(pos_x, pos_y, tam_x, tam_y);
     tec.setBackground(Color.white);
     tec.setVisible(true);
     tec.setBorder(null);
     panel.add(tec);  
    }
     public void setInfoColores(){//Inicializa los botones que detallan el significado de cada color
        int cantColores = 10, tamx = 20, tamy = 20, px = 500, py = 40;//Tamaño de los botones de detalles(tamx, tamy) y posicion(px, py)
        int x_tamLayout = 140, y_tamLayout = 15, variable = 0;
        JButton[] boton_colores;
        JLabel[] detalles;
        String[] info = {"Otros no metales","Metales alcalinos","Metales alcalinotérreos","Gases nobles",
        "Metaloides","Halógenos","Metales de transición","Metales del bloque P","Lantánidos","Actíniodos"};
        boton_colores = new JButton[cantColores];
        detalles = new JLabel[cantColores];
        for(int i = 0; i < boton_colores.length; i++){
            boton_colores[i] = new JButton();
            detalles [i] = new JLabel();
            boton_colores[i].setBorder(null);
            switch(i){
                case 0:
                    boton_colores[i].setBackground(Color.green);
                    boton_colores[i].setBounds(px, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+tamx, 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 1:
                    boton_colores[i].setBackground(Color.orange);
                    boton_colores[i].setBounds(px, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+tamx, 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 2:
                    boton_colores[i].setBackground(Color.yellow);
                    boton_colores[i].setBounds(px, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+tamx, 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 3:
                    boton_colores[i].setBackground(Color.blue);
                    boton_colores[i].setBounds(px, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+tamx, 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 4:
                    boton_colores[i].setBackground(Color.lightGray);
                    boton_colores[i].setBounds(px, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+tamx, 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 5:
                    boton_colores[i].setBackground(Color.cyan);
                    boton_colores[i].setBounds(px+tamx+x_tamLayout, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+x_tamLayout+(tamx*2), 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 6:
                    boton_colores[i].setBackground(Color.red);
                    boton_colores[i].setBounds(px+tamx+x_tamLayout, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+x_tamLayout+(tamx*2), 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 7:
                    boton_colores[i].setBackground(Color.gray);
                    boton_colores[i].setBounds(px+tamx+x_tamLayout, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+x_tamLayout+(tamx*2), 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 8:
                    boton_colores[i].setBackground(Color.pink);
                    boton_colores[i].setBounds(px+tamx+x_tamLayout, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+x_tamLayout+(tamx*2), 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                case 9:
                    boton_colores[i].setBackground(Color.magenta);
                    boton_colores[i].setBounds(px+tamx+x_tamLayout, py+variable, tamx, tamy);
                    boton_colores[i].setVisible(true);
                    panel.add(boton_colores[i]);
                    detalles[i].setText(info[i]);
                    detalles[i].setVisible(true);
                    detalles[i].setBounds(px+x_tamLayout+(tamx*2), 5+py+variable, x_tamLayout, y_tamLayout);
                    panel.add(detalles[i]);
                    break;
                    
            }
            variable += tamy+10;
            if(i == 4){variable = 0;}
        }
        
    }//Inicializa los botones que detallan el significado de cada color
    
    public Inicial(){//Iniciador del panel principal
     setTitle("Tabla Periódica");
     contenedor = getContentPane();
     panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.white);
     setInfoColores();
     imagenTec("/imagenes/tec.jpg");
     etiquetar();
     Grupo1a();
     Grupo2a();
     Grupo3b();
     Grupo4b();
     Grupo5b();
     Grupo6b();
     Grupo7b();
     Grupo8b1();
     Grupo8b2();
     Grupo8b3();
     Grupo1b();
     Grupo2b();
     Grupo3a();
     Grupo4a();
     Grupo5a();
     Grupo6a();
     Grupo7a();
     Grupo8a();
     Lantanidos();
     Actinidos();
     setVisible(true);
     setSize(x, y);
     setLocation(10,10);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Funcion para salir desde el boton X de la ventana del JFrame
    }
    public void etiquetar(){//Iniciar etiqueta
     JLabel etiqueta, escuela, titulo;
     JLabel[] gpos;
     int tamx=40, tamy=15, v=1, cent = 15;
     String []grupos = {"IA","IIA","IIIB","IVB","VB","VIB","VIIB","VIIIB","VIIIB","VIIIB","IB","IIB","IIIA",
     "IVA","VA","VIA","VIIA","VIIIA"};
     gpos = new JLabel[18];
     for(int i = 0; i < grupos.length; i++){
         if(i<1){
         gpos[i] = new JLabel(grupos[i]);
         gpos[i].setBounds(posx+cent, posy-15, tamx, tamy);
         panel.add(gpos[i]);
         }else{
         if(i > 0 && i < 2){
         gpos[i] = new JLabel(grupos[i]);
         gpos[i].setBounds(cent+posx+(espaciado*v), posy+espaciado-cent, tamx, tamy);
         panel.add(gpos[i]);
         v++;
         }else{
         if(i>1 && i<12){
         gpos[i] = new JLabel(grupos[i]);
         gpos[i].setBounds(cent+posx+(espaciado*v), posy+190, tamx, tamy);
         panel.add(gpos[i]);
         v++;
         }else{
         if(i > 11 && i < 17){
         gpos[i] = new JLabel(grupos[i]);
         gpos[i].setBounds(cent+posx+(espaciado*v), posy+espaciado-cent, tamx, tamy);
         panel.add(gpos[i]);
         v++;
         }else{
         if(i > 16){
         gpos[i] = new JLabel(grupos[i]);
         gpos[i].setBounds(cent+posx+(espaciado*v), posy-cent, tamx, tamy);
         panel.add(gpos[i]);
             }
         }
         }
         }
         }
     }
     titulo = new JLabel();
     etiqueta = new JLabel();
     escuela = new JLabel();
     etiqueta.setText("By Diego Gómez, Erick Estrada & Oscar Ramos");
     escuela.setText("Instituto Tecnológico de Nuevo León");
     titulo.setText("Tabla Periódica de los Elementos");
     panel.add(etiqueta);
     panel.add(escuela);
     panel.add(titulo);
     titulo.setFont(new java.awt.Font("Arial", 2, 20));
     titulo.setBounds(400, 5, 300, 20);
     etiqueta.setBounds(950, 680, 300, 15);
     escuela.setBounds(10, 680, 400, 15);
     
    }//Termina la etiqueta

    
    public static void main(String[] args){
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        }catch(Exception e){
            System.out.println("No se pudo establecer el aspecto deseado "+e);
        }
        
        Inicial menu = new Inicial();  
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PanelDeInfo info = new PanelDeInfo();
        for(int i = 0; i < botones1a.length; i++){
        if(e.getSource() == botones1a[i]){
           info.setElementoG1A(i);
        }
        }
        for(int i = 0; i < botones2a.length; i++){
        if(e.getSource() == botones2a[i]){
           info.setElementoG2A(i);
        }
        }
        for(int i = 0; i < botones3b.length; i++){
        if(e.getSource() == botones3b[i]){
           info.setElementoG3B(i);
        }
        }
        for(int i = 0; i < botones4b.length; i++){
        if(e.getSource() == botones4b[i]){
           info.setElementoG4B(i);
        }
        }
        for(int i = 0; i < botones5b.length; i++){
        if(e.getSource() == botones5b[i]){
           info.setElementoG5B(i);
        }
        }
        for(int i = 0; i < botones6b.length; i++){
        if(e.getSource() == botones6b[i]){
           info.setElementoG6B(i);
        }
        }
        for(int i = 0; i < botones7b.length; i++){
        if(e.getSource() == botones7b[i]){
           info.setElementoG7B(i);
        }
        }
        for(int i = 0; i < botones8b1.length; i++){
        if(e.getSource() == botones8b1[i]){
           info.setElementoG8B1(i);
        }
        }
        for(int i = 0; i < botones8b2.length; i++){
        if(e.getSource() == botones8b2[i]){
           info.setElementoG8B2(i);
        }
        }
        for(int i = 0; i < botones8b3.length; i++){
        if(e.getSource() == botones8b3[i]){
           info.setElementoG8B3(i);
        }
        }
        for(int i = 0; i < botones1b.length; i++){
        if(e.getSource() == botones1b[i]){
           info.setElementoG1B(i);
        }
        }
        for(int i = 0; i < botones2b.length; i++){
        if(e.getSource() == botones2b[i]){
           info.setElementoG2B(i);
        }
        }
        for(int i = 0; i < botones3a.length; i++){
        if(e.getSource() == botones3a[i]){
           info.setElementoG3A(i);
        }
        }
        for(int i = 0; i < botones4a.length; i++){
        if(e.getSource() == botones4a[i]){
           info.setElementoG4A(i);
        }
        }
        for(int i = 0; i < botones5a.length; i++){
        if(e.getSource() == botones5a[i]){
           info.setElementoG5A(i);
        }
        }
        for(int i = 0; i < botones6a.length; i++){
        if(e.getSource() == botones6a[i]){
           info.setElementoG6A(i);
        }
        }
        for(int i = 0; i < botones7a.length; i++){
        if(e.getSource() == botones7a[i]){
           info.setElementoG7A(i);
        }
        }
        for(int i = 0; i < botones8a.length; i++){
        if(e.getSource() == botones8a[i]){
           info.setElementoG8A(i);
        }
        }
        for(int i = 0; i < botonesla.length; i++){
        if(e.getSource() == botonesla[i]){
           info.setElementoGLA(i);
        }
        }
        for(int i = 0; i < botonesac.length; i++){
        if(e.getSource() == botonesac[i]){
           info.setElementoGAC(i);
        }
        }
}
    
    
}