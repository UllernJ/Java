package oblig5.januj;
import oblig5.januj.models.Film;
import oblig5.januj.models.Serie;
import oblig5.januj.tools.FilmerCSVFileHandler;
import oblig5.januj.tools.SerieCSVFileHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FilmerGui extends JFrame {
    FilmerCSVFileHandler f = new FilmerCSVFileHandler();
    SerieCSVFileHandler s = new SerieCSVFileHandler();
    private JPanel mainPanel;
    private JTextField navnTextField;
    private JLabel navnLabel;
    private JTextField ratingTextField;
    private JLabel ratingLabel;
    private JTextField sjangerTextField;
    private JLabel sjangerLabel;
    private JButton lagreKnapp;
    private JButton print;
    private JTextField dato;
    private JLabel datoLabel;
    private JTextField episoder;
    private JLabel episoderLabel;
    private JTabbedPane tab;
    private JLabel tabLabel;
    private JLabel mainLabel;
    List<Film> filmer = new ArrayList<>();
    List<Serie> serier = new ArrayList<>();

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
                String utgivelsesdato = dato.getText();
                int antallEpisoder = Integer.parseInt(episoder.getText());
                if(episoder.getText().isEmpty()) {
                    Film film = new Film(navn, rating, sjanger, utgivelsesdato);
                    filmer.add(film);
                    f.writeObjectsToFile(filmer);
                    filmer.remove(0);
                }
                else {
                    Serie serie = new Serie(navn, rating, sjanger, utgivelsesdato, antallEpisoder);
                    serier.add(serie);
                    s.writeObjectsToFile(serier);
                    serier.remove(0);
                }
            }
        });
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(f.readObjectsFromFile());
                System.out.println(s.readObjectsFromFile());
            }
        });
    }
}
