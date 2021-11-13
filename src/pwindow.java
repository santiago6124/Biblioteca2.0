import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pwindow extends javax.swing.JFrame {


    public pwindow(Biblioteca bib) {
        setTitle("Biblioteca de la UNC");
        setSize(new Dimension(1200, 600));
        setResizable(false);
        setLocationRelativeTo(null);
        add(panel1);
        String stringcantidaddelibros = String.valueOf(bib.getCantidadDeLibros());
        cant_libros_lblLabel.setText(stringcantidaddelibros);

        String stringcantidadderevistas = String.valueOf(bib.getCantidadDeRevistas());
        cant_revistas_lblLabel.setText(stringcantidadderevistas);

        String stringcantidaddepublicaciones = String.valueOf(bib.getCantidadDePublicaciiones());
        cant_pub_lblLabel.setText(stringcantidaddepublicaciones);

        librosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                new ventanalibros(bib, null).setVisible(true);
            }
        });
        clientesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                new ventanaclientes(bib, null).setVisible(true);

            }
        });
        revistasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                new ventanarevistas(bib, null).setVisible(true);
            }
        });
    }



    private JPanel panel1;
    private JButton librosButton;
    private JButton clientesButton;
    private JButton revistasButton;
    private JLabel cant_pub_lblLabel;
    private JLabel cant_revistas_lblLabel;
    private JLabel cant_libros_lblLabel;

}


