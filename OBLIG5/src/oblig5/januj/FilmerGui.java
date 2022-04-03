package oblig5.januj;
import oblig5.januj.models.FilmSerie;
import oblig5.januj.tools.FilmerCSVFileHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FilmerGui extends JFrame {
    FilmerCSVFileHandler k = new FilmerCSVFileHandler();
    private JPanel mainPanel;
    private JTextField navnTextField;
    private JLabel navnLabel;
    private JTextField ratingTextField;
    private JLabel ratingLabel;
    private JTextField sjangerTextField;
    private JLabel sjangerLabel;
    private JButton lagreKnapp;
    private JButton print;
    private JTabbedPane tab;
    private JLabel tabLabel;
    private JLabel mainLabel;
    List<FilmSerie> filmer = new ArrayList<>();

    public FilmerGui(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        
        lagreKnapp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String navn = navnTextField.getText();
                double rating = Double.parseDouble(ratingTextField.getText());
                String sjanger = sjangerTextField.getText();
                FilmSerie film = new FilmSerie(navn, rating, sjanger);
                filmer.add(film);
                k.writeObjectsToFile(filmer);
                filmer.remove(0);
            }
        });
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(k.readObjectsFromFile());
            }
        });
    }
}
