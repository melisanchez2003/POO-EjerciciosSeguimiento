
package com.mycompany.pooe81;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private ListaPersonas lista; // El objeto ListaPersonas de la aplicación
    private Container contenedor; 
    private JLabel nombre, apellidos, telefono, direccion;
    // Campos de ingreso de texto
    private JTextField campoNombre, campoApellidos, campoTelefono,
    campoDireccion;
    private JButton añadir, eliminar, borrarLista; // Botones
    private JList listaNombres; // Lista de personas
    private DefaultListModel modelo; // Objeto que modela la lista
    private JScrollPane scrollLista; // Barra de desplazamiento vertical
    
    public VentanaPrincipal(){
        lista = new ListaPersonas(); // Crea la lista de personas
        inicio();
        setTitle("Personas"); // Establece el título de la ventana
        setSize(270,350); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el
        centro de la pantalla */
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); /* Establece que el tamaño de la ventana no
        se puede cambiar */
}
    
    private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de
        contenidos de la ventana */
        contenedor.setLayout(null); /* Establece que el panel no tiene
        asociado ningún layout */
        // Establece la etiqueta y el campo nombre
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20, 20, 135, 23); /* Establece la posición de
        la etiqueta nombre */
        campoNombre = new JTextField();
        // Establece la posición del campo de texto nombre
        campoNombre.setBounds(105, 20, 135, 23);
        // Establece la etiqueta y el campo apellidos
        apellidos = new JLabel();
        apellidos.setText("Apellidos:"); /* Establece la posición de la
        etiqueta apellidos */
        apellidos.setBounds(20, 50, 135, 23);
        campoApellidos = new JTextField();
        // Establece la posición del campo de texto apellidos
        campoApellidos.setBounds(105, 50, 135, 23);
        // Establece la etiqueta y el campo teléfono
        telefono = new JLabel();
        telefono.setText("Teléfono:");
        telefono.setBounds(20, 80, 135, 23); /* Establece la posición de
        la etiqueta teléfono */
        campoTelefono = new JTextField();
        // Establece la posición del campo de texto teléfono
        campoTelefono.setBounds(105, 80, 135, 23);
        // Establece la etiqueta y el campo dirección
        direccion = new JLabel();
        direccion.setText("Dirección:");
        direccion.setBounds(20, 110, 135, 23); /* Establece la posición
        de la etiqueta dirección */
        campoDireccion = new JTextField();
        // Establece la posición del campo de texto dirección
        campoDireccion.setBounds(105, 110, 135, 23);
        // Establece el botón Añadir persona
        añadir = new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(105, 150, 80, 23); /* Establece la posición del
        botón Añadir persona */
        /* Agrega al botón un ActionListener para que gestione eventos
        del botón */
        añadir.addActionListener(this);
        // Establece el botón Eliminar persona
        eliminar= new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23); /* Establece la posición del
        botón Eliminar persona */
        /* Agrega al botón un ActionListener para que gestione eventos
        del botón */
        eliminar.addActionListener(this);
        // Establece el botón Borrar lista
        borrarLista= new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(120, 280, 120, 23); /* Establece la
        posición del botón Borrar lista */
        /* Agrega al botón un ActionListener para que gestione eventos
        del botón */
        borrarLista.addActionListener(this);
        
        listaNombres = new JList();
        /* Establece que se pueda seleccionar solamente un elemento de
        la lista */
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();
        scrollLista = new JScrollPane();
        // Establece la posición de la barra de desplazamiento vertical
        scrollLista.setBounds(20, 190 ,220, 80);
        // Asocia la barra de desplazamiento vertical a la lista de personas
        scrollLista.setViewportView(listaNombres);
        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
        }
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) { // Si se pulsa el botón añadir
            añadirPersona(); // Se invoca añadir persona
        }
        if (evento.getSource() == eliminar) {
           eliminarNombre(listaNombres.getSelectedIndex() );
        }
        if (evento.getSource() == borrarLista) { 
            borrarLista(); 
        }
    }
    
    private void añadirPersona() {

        Persona p = new Persona(campoNombre.getText(),campoApellidos.getText(),campoTelefono.getText(), campoDireccion.getText());lista.añadirPersona(p); /* Se añade una persona al vector de
        personas */
        String elemento = campoNombre.getText() + "-" + campoApellidos.getText() + "-" + campoTelefono.getText() + "-" + campoDireccion.getText();
        modelo.addElement(elemento); /* Se agrega el texto con los
        datos de la persona al JList */
        listaNombres.setModel(modelo);
        // Se colocan todos los campos de texto nulos
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
}
    private void eliminarNombre(int indice) {
        if (indice >= 0) { // Si la posición existe
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice); }
        else { 
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",JOptionPane.ERROR_MESSAGE);
        }
}
    private void borrarLista() {
        lista.borrarLista(); // Se eliminan todas las personas del vector
        modelo.clear(); // Limpia el JList, la lista gráfica de personas
    }   
    
}
