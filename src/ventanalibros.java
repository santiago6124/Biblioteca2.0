import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class ventanalibros extends javax.swing.JFrame {
    private JComboBox comboBox1;
    private JLabel editorialLabel;
    private JLabel cateogríaLabel;
    private JLabel autorLabel;
    private JLabel títuloLabel;
    private JPanel ventanadelibros;


    public ventanalibros(Biblioteca bib, Libro selected_libro) {
        setSize(new Dimension(1200, 600));
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Biblioteca de Préstamos");
        add(ventanadelibros);

        List<Libro> libros = bib.getLibros();
        int selected_index = -1;
        Vector comboBox_items = new Vector();
        for (Libro libro : libros) {
            if (libro == selected_libro) {
                selected_index = comboBox_items.size();
            }
            comboBox_items.add(new ComboBoxItem(libro.pGetTitulo(), libro));
        }
        comboBox1.setModel(new DefaultComboBoxModel(comboBox_items));

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Optional<Libro> optionalLibro = ComboBoxItem.getSelectedContent(comboBox1).map(o -> (Libro) o);
                optionalLibro.ifPresent(libro -> {
                    títuloLabel.setText(libro.toString());
                });
            }
        });
        comboBox1.setSelectedIndex(selected_index);
    }

}
