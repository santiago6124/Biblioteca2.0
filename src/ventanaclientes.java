import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class ventanaclientes extends javax.swing.JFrame  {
    private JComboBox comboBox1;
    private JPanel ventanaclientesp;
    private JComboBox comboBox2;
    private JLabel label;

    public ventanaclientes(Biblioteca bib, Cliente selected_libro) {
        setSize(new Dimension(1200, 600));
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Biblioteca de Préstamos");
        add(ventanaclientesp);

        List<Cliente> clientes = bib.GetClientes();
        int selected_index = -1;
        Vector comboBox_items = new Vector();
        for (Cliente cliente : clientes) {
            if (cliente == selected_libro) {
                selected_index = comboBox_items.size();
            }
            comboBox_items.add(new ComboBoxItem(cliente.getNombre(), cliente));
        }
        comboBox1.setModel(new DefaultComboBoxModel(comboBox_items));

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = clientes.get(comboBox1.getSelectedIndex());

                Vector comboBox_items_prestamos = new Vector();

                for (Prestamo prestamo : bib.getPrestamos()) {
                    List<Publicacion> publicaciones = prestamo.getPublications();
                    if (prestamo.getClientes() == cliente) {
                        for (Publicacion publicacion : publicaciones) {
                            comboBox_items_prestamos.add(new ComboBoxItem(publicacion.pGetTitulo(), publicacion));
                        }
                    }
                }
                comboBox2.setModel(new DefaultComboBoxModel(comboBox_items_prestamos));
                comboBox2.setSelectedIndex(-1);
            }
        });



    }
}

