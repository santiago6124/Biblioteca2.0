import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class ventanarevistas extends javax.swing.JFrame {
    private JComboBox comboBox1;
    private JPanel ventanarevistasp;
    private JLabel label;

    public ventanarevistas(Biblioteca bib, Revista selected_libro) {
        setSize(new Dimension(1200, 600));
        setResizable(false);
        setLocationRelativeTo(null);

        setTitle("Biblioteca de Préstamos");
        add(ventanarevistasp);

        List<Revista> revistas = bib.getRevistas();
        int selected_index = -1;
        Vector comboBox_items = new Vector();
        for (Revista revista : revistas) {
            if (revista == selected_libro) {
                selected_index = comboBox_items.size();
            }
            comboBox_items.add(new ComboBoxItem(revista.pGetTitulo(), revista));
        }
        comboBox1.setModel(new DefaultComboBoxModel(comboBox_items));

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Optional<Revista> optionalRevista = ComboBoxItem.getSelectedContent(comboBox1).map(o -> (Revista) o);
                optionalRevista.ifPresent(libro -> {
                    label.setText(revistas.toString());
                });
            }
        });
        comboBox1.setSelectedIndex(selected_index);
    }
}
