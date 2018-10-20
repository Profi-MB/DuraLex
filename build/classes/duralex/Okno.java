/**
 * 
 */
package duralex;

import static duralex.DuraLex.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Dizel
 */
public class Okno extends JFrame {

    /**
     * Creates new form Okno
     */
    public Okno() {
        initComponents();
        TAB=TAB_L;
//        LINKcombo= new JComboBox[]{linkRok,linkNumer,linkPozycja,linkTyp,linkPodgląd};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serfuj = new javax.swing.JFrame();
        pScroll = new javax.swing.JScrollPane();
        pStrona = new javax.swing.JEditorPane();
        pURL = new java.awt.TextField();
        pStan = new java.awt.Label();
        pZaładuj = new javax.swing.JButton();
        pPoprzednia = new javax.swing.JButton();
        pOdświerz = new javax.swing.JButton();
        pNastępna = new javax.swing.JButton();
        Notatnik = new javax.swing.JFrame();
        nScroll = new javax.swing.JScrollPane();
        nNotatki = new javax.swing.JEditorPane();
        Linkownik = new javax.swing.JFrame();
        linPolecenie = new javax.swing.JLabel();
        linRok = new javax.swing.JLabel();
        linNr = new javax.swing.JLabel();
        linPoz = new javax.swing.JLabel();
        linTyp = new javax.swing.JLabel();
        linPodgląd = new javax.swing.JLabel();
        linOtwórz = new javax.swing.JButton();
        linkRok = new javax.swing.JComboBox<>();
        linkNumer = new javax.swing.JComboBox<>();
        linkPozycja = new javax.swing.JComboBox<>();
        linkTyp = new javax.swing.JComboBox<>();
        linkPodgląd = new javax.swing.JComboBox<>();
        linOdświerz = new javax.swing.JButton();
        linKopiujLink = new javax.swing.JButton();
        TAB_jakoTekst = new javax.swing.JMenuItem();
        TAB_jakoPDF = new javax.swing.JMenuItem();
        TAB_zamknij = new javax.swing.JMenuItem();
        TAB_zapiszTXT = new javax.swing.JMenuItem();
        TAB_nowaKarta = new javax.swing.JMenuItem();
        TAB_otwórzNotatkę = new javax.swing.JMenuItem();
        notatnik_Otwórz = new javax.swing.JMenuItem();
        n_Zapisz = new javax.swing.JMenuItem();
        n_kopiuj = new javax.swing.JMenuItem();
        n_wytnij = new javax.swing.JMenuItem();
        n_wklej = new javax.swing.JMenuItem();
        dev = new javax.swing.JPanel();
        dev1 = new javax.swing.JTextField();
        scr1 = new javax.swing.JScrollBar();
        dev2 = new javax.swing.JTextField();
        scr2 = new javax.swing.JScrollBar();
        dev3 = new javax.swing.JTextField();
        scr3 = new javax.swing.JScrollBar();
        dev4 = new javax.swing.JTextField();
        scr4 = new javax.swing.JScrollBar();
        cnv1 = new java.awt.Canvas();
        txt1 = new javax.swing.JTextField();
        btt1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        pasekStanu = new javax.swing.JLabel();
        splitPan = new javax.swing.JSplitPane();
        TAB_L = new javax.swing.JTabbedPane();
        TAB_P = new javax.swing.JTabbedPane();
        menu = new javax.swing.JMenu();
        ustawienia = new javax.swing.JMenuItem();
        sesja = new javax.swing.JMenu();
        zapisz = new javax.swing.JMenuItem();
        otwórz = new javax.swing.JMenuItem();
        zakończ = new javax.swing.JMenuItem();
        plik = new javax.swing.JMenu();
        Otwórz = new javax.swing.JMenu();
        jakoPDF1 = new javax.swing.JMenuItem();
        jakoTXT = new javax.swing.JMenuItem();
        hybrydowo = new javax.swing.JMenuItem();
        otwórzTXT = new javax.swing.JMenuItem();
        Zapisz = new javax.swing.JMenu();
        zapiszZakładkę = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        otwórzURL = new javax.swing.JMenuItem();
        notatnik = new javax.swing.JMenuItem();
        ISAP = new javax.swing.JMenuItem();
        //Menu.add(Box.createHorizontalGlue());
        oProgramie = new javax.swing.JMenu();
        oProgram = new javax.swing.JMenuItem();
        oAutor = new javax.swing.JMenuItem();
        oPomoc = new javax.swing.JMenuItem();
        oWersja = new javax.swing.JMenuItem();
        oPełna = new javax.swing.JMenuItem();
        oAktualizacje = new javax.swing.JMenuItem();
        RC = new javax.swing.JMenu();
        deweloperka = new javax.swing.JMenu();
        narzędzia = new javax.swing.JMenuItem();

        wskażPlik.setApproveButtonMnemonic(10);
        wskażPlik.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        wskażPlik.setCurrentDirectory(new java.io.File("C:\\home\\dizel\\PDF"));

        serfuj.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                serfujWindowClosed(evt);
            }
        });

        pScroll.setDoubleBuffered(true);
        pScroll.setPreferredSize(new java.awt.Dimension(500, 500));

        pStrona.setEditable(false);
        pStrona.setContentType("text/css");
        pStrona.setDoubleBuffered(true);
        pStrona.setFocusable(false);
        pStrona.setMinimumSize(new java.awt.Dimension(500, 500));
        pStrona.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                pStronaHyperlinkUpdate(evt);
            }
        });
        pScroll.setViewportView(pStrona);

        pURL.setMaximumSize(new java.awt.Dimension(32767, 10));
        pURL.setMinimumSize(new java.awt.Dimension(200, 10));
        pURL.setName(""); // NOI18N
        pURL.setPreferredSize(new java.awt.Dimension(75, 10));
        pURL.setText("http://isap.sejm.gov.pl/VolumeServlet?type=wdu");
        pURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pURLActionPerformed(evt);
            }
        });
        pURL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pURLKeyPressed(evt);
            }
        });

        pStan.setMaximumSize(new java.awt.Dimension(100, 10));
        pStan.setMinimumSize(new java.awt.Dimension(15, 10));
        pStan.setName(""); // NOI18N

        pZaładuj.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        pZaładuj.setText("%");
        pZaładuj.setAlignmentY(0.0F);
        pZaładuj.setBorder(null);
        pZaładuj.setBorderPainted(false);
        pZaładuj.setDefaultCapable(false);
        pZaładuj.setFocusPainted(false);
        pZaładuj.setFocusable(false);
        pZaładuj.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pZaładuj.setRequestFocusEnabled(false);
        pZaładuj.setRolloverEnabled(false);
        pZaładuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pZaładujActionPerformed(evt);
            }
        });

        pPoprzednia.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        pPoprzednia.setText("<");
        pPoprzednia.setAlignmentY(0.0F);
        pPoprzednia.setBorder(null);
        pPoprzednia.setBorderPainted(false);
        pPoprzednia.setDefaultCapable(false);
        pPoprzednia.setEnabled(false);
        pPoprzednia.setFocusPainted(false);
        pPoprzednia.setFocusable(false);
        pPoprzednia.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pPoprzednia.setRequestFocusEnabled(false);
        pPoprzednia.setRolloverEnabled(false);
        pPoprzednia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPoprzedniaActionPerformed(evt);
            }
        });

        pOdświerz.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        pOdświerz.setText("↻");
        pOdświerz.setAlignmentY(0.0F);
        pOdświerz.setBorder(null);
        pOdświerz.setBorderPainted(false);
        pOdświerz.setDefaultCapable(false);
        pOdświerz.setFocusable(false);
        pOdświerz.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pOdświerz.setRequestFocusEnabled(false);
        pOdświerz.setRolloverEnabled(false);
        pOdświerz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pOdświerzActionPerformed(evt);
            }
        });

        pNastępna.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        pNastępna.setText(">");
        pNastępna.setAlignmentY(0.0F);
        pNastępna.setBorder(null);
        pNastępna.setBorderPainted(false);
        pNastępna.setDefaultCapable(false);
        pNastępna.setEnabled(false);
        pNastępna.setFocusPainted(false);
        pNastępna.setFocusable(false);
        pNastępna.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pNastępna.setRequestFocusEnabled(false);
        pNastępna.setRolloverEnabled(false);
        pNastępna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNastępnaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout serfujLayout = new javax.swing.GroupLayout(serfuj.getContentPane());
        serfuj.getContentPane().setLayout(serfujLayout);
        serfujLayout.setHorizontalGroup(
            serfujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pStan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addGroup(serfujLayout.createSequentialGroup()
                .addComponent(pURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pZaładuj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pPoprzednia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pOdświerz, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pNastępna, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        serfujLayout.setVerticalGroup(
            serfujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serfujLayout.createSequentialGroup()
                .addGroup(serfujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pURL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(serfujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pNastępna, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pOdświerz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pPoprzednia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pZaładuj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(pScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pStan, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Notatnik.setAutoRequestFocus(false);
        Notatnik.setFocusable(false);
        Notatnik.setLocation(Menu.getX()+Menu.getWidth(),Menu.getY()
        );
        Notatnik.setMinimumSize(new java.awt.Dimension(10, 10));
        Notatnik.setName(""); // NOI18N
        Notatnik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NotatnikMouseReleased(evt);
            }
        });
        Notatnik.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                NotatnikWindowClosed(evt);
            }
        });

        nScroll.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        nScroll.setName(""); // NOI18N
        nScroll.setPreferredSize(new java.awt.Dimension(250, 250));

        nNotatki.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        nNotatki.setName(""); // NOI18N
        nNotatki.setPreferredSize(new java.awt.Dimension(250, 250));
        nNotatki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nNotatkiMouseReleased(evt);
            }
        });
        nScroll.setViewportView(nNotatki);

        javax.swing.GroupLayout NotatnikLayout = new javax.swing.GroupLayout(Notatnik.getContentPane());
        Notatnik.getContentPane().setLayout(NotatnikLayout);
        NotatnikLayout.setHorizontalGroup(
            NotatnikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotatnikLayout.createSequentialGroup()
                .addComponent(nScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        NotatnikLayout.setVerticalGroup(
            NotatnikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotatnikLayout.createSequentialGroup()
                .addComponent(nScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        Linkownik.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Linkownik.setMinimumSize(new java.awt.Dimension(410, 115));
        Linkownik.setResizable(false);
        Linkownik.setSize(new java.awt.Dimension(410, 115));
        Linkownik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LinkownikKeyPressed(evt);
            }
        });

        linPolecenie.setBackground(new java.awt.Color(255, 255, 204));
        linPolecenie.setForeground(new java.awt.Color(0, 0, 204));
        linPolecenie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linPolecenie.setText("Wpisz wymagane pola, akceptując klawiszem [ENTER]");
        linPolecenie.setAlignmentY(0.0F);
        linPolecenie.setIconTextGap(0);
        linPolecenie.setOpaque(true);
        linPolecenie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linPolecenieMouseClicked(evt);
            }
        });

        linRok.setBackground(new java.awt.Color(255, 255, 204));
        linRok.setForeground(new java.awt.Color(0, 0, 204));
        linRok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linRok.setText("Rok");
        linRok.setOpaque(true);

        linNr.setBackground(new java.awt.Color(255, 255, 204));
        linNr.setForeground(new java.awt.Color(0, 0, 204));
        linNr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linNr.setText("Numer");
        linNr.setOpaque(true);

        linPoz.setBackground(new java.awt.Color(255, 255, 204));
        linPoz.setForeground(new java.awt.Color(0, 0, 204));
        linPoz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linPoz.setText("Pozycja");
        linPoz.setOpaque(true);

        linTyp.setBackground(new java.awt.Color(255, 255, 204));
        linTyp.setForeground(new java.awt.Color(0, 0, 204));
        linTyp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linTyp.setText("Typ");
        linTyp.setOpaque(true);

        linPodgląd.setBackground(new java.awt.Color(255, 255, 204));
        linPodgląd.setForeground(new java.awt.Color(0, 0, 204));
        linPodgląd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linPodgląd.setText("Podgląd");
        linPodgląd.setOpaque(true);

        linOtwórz.setBackground(new java.awt.Color(204, 204, 255));
        linOtwórz.setForeground(new java.awt.Color(0, 0, 204));
        linOtwórz.setText("otwórz");
        linOtwórz.setAlignmentY(0.0F);
        linOtwórz.setInheritsPopupMenu(true);
        linOtwórz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linOtwórzActionPerformed(evt);
            }
        });

        linkRok.setSelectedItem(linkRok.getItemCount()-1);
        linkRok.setName("linkRok"); // NOI18N
        linkRok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkRokActionPerformed(evt);
            }
        });

        linkNumer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "wybierz rok" }));
        linkNumer.setEnabled(false);
        linkNumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkNumerActionPerformed(evt);
            }
        });

        linkPozycja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "wybierz numer" }));
        linkPozycja.setEnabled(false);
        linkPozycja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkPozycjaActionPerformed(evt);
            }
        });

        linkTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"treść aktu","ogłoszony","ujednolicony"}));
        linkTyp.setEnabled(false);
        linkTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkTypActionPerformed(evt);
            }
        });

        linkPodgląd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"pdf","hybrydowo","tekst"}));
        linkPodgląd.setEnabled(false);
        linkPodgląd.setInheritsPopupMenu(true);
        linkPodgląd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkPodglądActionPerformed(evt);
            }
        });

        linOdświerz.setBackground(new java.awt.Color(204, 204, 255));
        linOdświerz.setForeground(new java.awt.Color(0, 0, 204));
        linOdświerz.setText("odśwież");
        linOdświerz.setAlignmentY(0.0F);
        linOdświerz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linOdświerzActionPerformed(evt);
            }
        });

        linKopiujLink.setBackground(new java.awt.Color(204, 204, 255));
        linKopiujLink.setForeground(new java.awt.Color(0, 0, 204));
        linKopiujLink.setText("kopiuj link");
        linKopiujLink.setAlignmentY(0.0F);
        linKopiujLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linKopiujLinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LinkownikLayout = new javax.swing.GroupLayout(Linkownik.getContentPane());
        Linkownik.getContentPane().setLayout(LinkownikLayout);
        LinkownikLayout.setHorizontalGroup(
            LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linPolecenie, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(LinkownikLayout.createSequentialGroup()
                .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linkRok, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linRok, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linNr, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linkNumer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linkPozycja, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linPoz, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linkTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linPodgląd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linkPodgląd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linOtwórz, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(linOdświerz, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(linKopiujLink, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        LinkownikLayout.setVerticalGroup(
            LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LinkownikLayout.createSequentialGroup()
                .addComponent(linPolecenie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LinkownikLayout.createSequentialGroup()
                        .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(linRok, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(linNr, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(linPoz, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(linkRok, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linkNumer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linkPozycja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(LinkownikLayout.createSequentialGroup()
                            .addComponent(linTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(linkTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(LinkownikLayout.createSequentialGroup()
                            .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(linPodgląd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(linOtwórz, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LinkownikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(LinkownikLayout.createSequentialGroup()
                                    .addComponent(linKopiujLink, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(linOdświerz, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(linkPodgląd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        linPolecenie.getAccessibleContext().setAccessibleDescription("Wpisz wymagane pola, akceptując klawiszem [ENTER]");

        PPM_TAB.setAlignmentY(0.0F);
        PPM_TAB.setBorder(null);
        PPM_TAB.setBorderPainted(false);
        PPM_TAB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PPM_TAB.setFocusable(false);
        PPM_TAB.setInheritsPopupMenu(true);
        PPM_TAB.setPreferredSize(new java.awt.Dimension(120, 100));

        TAB_jakoTekst.setText("otwórz jako tekst");
        TAB_jakoTekst.setComponentPopupMenu(PPM_TAB);
        TAB_jakoTekst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_jakoTekstActionPerformed(evt);
            }
        });
        PPM_TAB.add(TAB_jakoTekst);

        TAB_jakoPDF.setText("otwórz jako obraz");
        TAB_jakoPDF.setComponentPopupMenu(PPM_TAB);
        TAB_jakoPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_jakoPDFActionPerformed(evt);
            }
        });
        PPM_TAB.add(TAB_jakoPDF);

        TAB_zamknij.setText("zamknij kartę");
        TAB_zamknij.setComponentPopupMenu(PPM_TAB);
        TAB_zamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_zamknijActionPerformed(evt);
            }
        });
        PPM_TAB.add(TAB_zamknij);

        TAB_zapiszTXT.setText("zapisz");
        TAB_zapiszTXT.setComponentPopupMenu(PPM_TAB);
        TAB_zapiszTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_zapiszTXTActionPerformed(evt);
            }
        });
        PPM_TAB.add(TAB_zapiszTXT);

        TAB_nowaKarta.setText("nowa karta");
        TAB_nowaKarta.setComponentPopupMenu(PPM_TAB);
        TAB_nowaKarta.setRolloverEnabled(true);
        TAB_nowaKarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_nowaKartaActionPerformed(evt);
            }
        });
        PPM_TAB.add(TAB_nowaKarta);

        TAB_otwórzNotatkę.setText("otwórz notatkę");
        TAB_otwórzNotatkę.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_otwórzNotatkęActionPerformed(evt);
            }
        });
        PPM_TAB.add(TAB_otwórzNotatkę);

        PPM_notatnik.setAlignmentY(0.0F);
        PPM_notatnik.setBorder(null);
        PPM_notatnik.setBorderPainted(false);
        PPM_notatnik.setCursor(new java.awt.Cursor(0));//java.awt.Cursor.HAND_CURSOR));
PPM_notatnik.setFocusable(false);
PPM_notatnik.setInheritsPopupMenu(true);

notatnik_Otwórz.setText("otwórz");
notatnik_Otwórz.setBorder(null);
notatnik_Otwórz.setComponentPopupMenu(PPM_notatnik);
notatnik_Otwórz.setMaximumSize(new java.awt.Dimension(120, 12));
notatnik_Otwórz.setMinimumSize(new java.awt.Dimension(80, 12));
notatnik_Otwórz.setPreferredSize(new java.awt.Dimension(85, 12));
notatnik_Otwórz.setRolloverEnabled(true);
notatnik_Otwórz.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        notatnik_OtwórzActionPerformed(evt);
    }
    });
    PPM_notatnik.add(notatnik_Otwórz);

    n_Zapisz.setText("zapisz");
    n_Zapisz.setBorder(null);
    n_Zapisz.setComponentPopupMenu(PPM_notatnik);
    n_Zapisz.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    n_Zapisz.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    n_Zapisz.setMaximumSize(new java.awt.Dimension(120, 12));
    n_Zapisz.setMinimumSize(new java.awt.Dimension(80, 12));
    n_Zapisz.setPreferredSize(new java.awt.Dimension(85, 12));
    n_Zapisz.setRolloverEnabled(true);
    n_Zapisz.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            n_ZapiszActionPerformed(evt);
        }
    });
    PPM_notatnik.add(n_Zapisz);

    n_kopiuj.setText("kopiuj");
    n_kopiuj.setBorder(null);
    n_kopiuj.setComponentPopupMenu(PPM_notatnik);
    n_kopiuj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    n_kopiuj.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    n_kopiuj.setMaximumSize(new java.awt.Dimension(120, 12));
    n_kopiuj.setMinimumSize(new java.awt.Dimension(80, 12));
    n_kopiuj.setPreferredSize(new java.awt.Dimension(85, 12));
    n_kopiuj.setRolloverEnabled(true);
    n_kopiuj.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            n_kopiujActionPerformed(evt);
        }
    });
    PPM_notatnik.add(n_kopiuj);

    n_wytnij.setText("wytnij");
    n_wytnij.setBorder(null);
    n_wytnij.setComponentPopupMenu(PPM_notatnik);
    n_wytnij.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    n_wytnij.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    n_wytnij.setMaximumSize(new java.awt.Dimension(120, 12));
    n_wytnij.setMinimumSize(new java.awt.Dimension(80, 12));
    n_wytnij.setPreferredSize(new java.awt.Dimension(85, 12));
    n_wytnij.setRolloverEnabled(true);
    n_wytnij.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            n_wytnijActionPerformed(evt);
        }
    });
    PPM_notatnik.add(n_wytnij);

    n_wklej.setText("wklej");
    n_wklej.setBorder(null);
    n_wklej.setComponentPopupMenu(PPM_notatnik);
    n_wklej.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    n_wklej.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    n_wklej.setMaximumSize(new java.awt.Dimension(120, 12));
    n_wklej.setMinimumSize(new java.awt.Dimension(80, 12));
    n_wklej.setPreferredSize(new java.awt.Dimension(85, 12));
    n_wklej.setRolloverEnabled(true);
    n_wklej.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            n_wklejActionPerformed(evt);
        }
    });
    PPM_notatnik.add(n_wklej);

    dev.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            devMouseClicked(evt);
        }
    });

    dev1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            dev1KeyPressed(evt);
        }
    });

    scr1.setMaximum(1000);
    scr1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
    scr1.setValue(50);
    scr1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
        public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
            scr1AdjustmentValueChanged(evt);
        }
    });

    dev2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dev2ActionPerformed(evt);
        }
    });
    dev2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            dev2KeyPressed(evt);
        }
    });

    scr2.setMaximum(1000);
    scr2.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
    scr2.setValue(50);
    scr2.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
        public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
            scr2AdjustmentValueChanged(evt);
        }
    });

    dev3.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            dev3KeyPressed(evt);
        }
    });

    scr3.setMaximum(1000);
    scr3.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
    scr3.setValue(50);
    scr3.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
        public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
            scr3AdjustmentValueChanged(evt);
        }
    });

    dev4.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            dev4KeyPressed(evt);
        }
    });

    scr4.setMaximum(1000);
    scr4.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
    scr4.setValue(50);
    scr4.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
        public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
            scr4AdjustmentValueChanged(evt);
        }
    });

    cnv1.setBackground(new java.awt.Color(102, 102, 0));
    cnv1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            cnv1MousePressed(evt);
        }
    });
    cnv1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
        public void mouseMoved(java.awt.event.MouseEvent evt) {
            cnv1MouseMoved(evt);
        }
    });
    cnv1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            cnv1PropertyChange(evt);
        }
    });

    txt1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt1ActionPerformed(evt);
        }
    });

    btt1.setText("wyślij");
    btt1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btt1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout devLayout = new javax.swing.GroupLayout(dev);
    dev.setLayout(devLayout);
    devLayout.setHorizontalGroup(
        devLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(scr1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(dev1, javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(dev2, javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(scr2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(dev3, javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(scr3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(dev4, javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(scr4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(devLayout.createSequentialGroup()
            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btt1))
        .addComponent(cnv1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    devLayout.setVerticalGroup(
        devLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(devLayout.createSequentialGroup()
            .addComponent(dev1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(scr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dev2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(scr2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dev3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(scr3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dev4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(scr4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(devLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(devLayout.createSequentialGroup()
                    .addGroup(devLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnv1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(devLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    jScrollPane1.setViewportView(jTree1);

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setExtendedState(1);
    setLocationByPlatform(true);
    setMinimumSize(new java.awt.Dimension(100, 200));
    setName("Dura Lex (sed lex)"); // NOI18N
    setState(1);
    addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            formMouseClicked(evt);
        }
    });
    addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            formKeyPressed(evt);
        }
    });

    pasekStanu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
    pasekStanu.setDoubleBuffered(true);
    pasekStanu.setEnabled(false);
    pasekStanu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pasekStanu.setRequestFocusEnabled(false);
    pasekStanu.setVerifyInputWhenFocusTarget(false);

    splitPan.setDividerLocation((splitPan.getWidth()-5)/2);
    splitPan.setResizeWeight(0.5);
    splitPan.setToolTipText("");
    splitPan.setAutoscrolls(true);
    splitPan.setContinuousLayout(true);
    splitPan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    splitPan.setDoubleBuffered(true);
    splitPan.setMaximumSize(new java.awt.Dimension(0, 0));
    splitPan.setMinimumSize(new java.awt.Dimension(0, 0));
    splitPan.setPreferredSize(new java.awt.Dimension(0, 0));

    TAB_L.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
    TAB_L.setToolTipText("");
    TAB_L.setAutoscrolls(true);
    TAB_L.setDoubleBuffered(true);
    TAB_L.setMinimumSize(new java.awt.Dimension(50, 100));
    TAB_L.setPreferredSize(new java.awt.Dimension(400, 600));
    TAB_L.setRequestFocusEnabled(false);
    TAB_L.setVerifyInputWhenFocusTarget(false);
    TAB_L.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            TAB_LMouseClicked(evt);
        }
    });
    TAB_L.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            TAB_LKeyPressed(evt);
        }
    });
    splitPan.setLeftComponent(TAB_L);

    TAB_P.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
    TAB_P.setToolTipText("");
    TAB_P.setAutoscrolls(true);
    TAB_P.setDoubleBuffered(true);
    TAB_P.setMinimumSize(new java.awt.Dimension(50, 100));
    TAB_P.setPreferredSize(new java.awt.Dimension(400, 600));
    TAB_P.setRequestFocusEnabled(false);
    TAB_P.setVerifyInputWhenFocusTarget(false);
    TAB_P.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            TAB_PMouseClicked(evt);
        }
    });
    TAB_P.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            TAB_PKeyPressed(evt);
        }
    });
    splitPan.setRightComponent(TAB_P);

    Menu.setFocusable(false);

    menu.setText("Menu*");

    ustawienia.setText("*Ustawienia");
    menu.add(ustawienia);

    sesja.setText("*sesja");

    zapisz.setText("*zapisz");
    sesja.add(zapisz);

    otwórz.setText("*otwórz");
    sesja.add(otwórz);

    menu.add(sesja);

    zakończ.setText("zakończ pracę");
    zakończ.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            zakończActionPerformed(evt);
        }
    });
    menu.add(zakończ);

    Menu.add(menu);

    plik.setText("Dokument");
    plik.setFocusable(false);

    Otwórz.setText("Otwórz");

    jakoPDF1.setText("jako PDF");
    jakoPDF1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jakoPDF1ActionPerformed(evt);
        }
    });
    Otwórz.add(jakoPDF1);

    jakoTXT.setText("jako tekst");
    jakoTXT.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jakoTXTActionPerformed(evt);
        }
    });
    Otwórz.add(jakoTXT);

    hybrydowo.setText("hybrydowo");
    hybrydowo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            hybrydowoActionPerformed(evt);
        }
    });
    Otwórz.add(hybrydowo);

    otwórzTXT.setText("notatkę");
    otwórzTXT.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            otwórzTXTActionPerformed(evt);
        }
    });
    Otwórz.add(otwórzTXT);

    plik.add(Otwórz);

    Zapisz.setText("Zapisz");

    zapiszZakładkę.setText("zapisz zakładkę");
    zapiszZakładkę.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            zapiszZakładkęActionPerformed(evt);
        }
    });
    Zapisz.add(zapiszZakładkę);

    plik.add(Zapisz);

    Menu.add(plik);

    jMenu1.setText("Narzędzia");

    otwórzURL.setText("WEB");
    otwórzURL.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            otwórzURLActionPerformed(evt);
        }
    });
    jMenu1.add(otwórzURL);

    notatnik.setText("notatnik");
    notatnik.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            notatnikActionPerformed(evt);
        }
    });
    jMenu1.add(notatnik);

    ISAP.setText("ISAP ");
    ISAP.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ISAPActionPerformed(evt);
        }
    });
    jMenu1.add(ISAP);

    Menu.add(jMenu1);

    oProgramie.setBorder(null);
    oProgramie.setText("!O programie");
    oProgramie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    oProgramie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    oProgramie.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    oProgramie.setMinimumSize(new java.awt.Dimension(77, 17));
    oProgramie.setLocation(30, 30);

    oProgram.setText("*Informacje");
    oProgramie.add(oProgram);

    oAutor.setText("*O autorze");
    oProgramie.add(oAutor);

    oPomoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
    oPomoc.setText("*Pomoc");
    oPomoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            oPomocActionPerformed(evt);
        }
    });
    oProgramie.add(oPomoc);

    oWersja.setText("*Wersja");
    oProgramie.add(oWersja);

    oPełna.setText("*Pełna wersja");
    oProgramie.add(oPełna);

    oAktualizacje.setText("*Aktualizacje");
    oProgramie.add(oAktualizacje);

    Menu.add(oProgramie);

    RC.setText("RC");
    Menu.add(RC);

    deweloperka.setText("deweloperka");

    narzędzia.setText("***********");
    narzędzia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            narzędziaActionPerformed(evt);
        }
    });
    deweloperka.add(narzędzia);

    Menu.add(deweloperka);

    setJMenuBar(Menu);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(splitPan, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        .addComponent(pasekStanu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(splitPan, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addGap(0, 0, 0)
            .addComponent(pasekStanu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void zapiszZakładkęActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapiszZakładkęActionPerformed
        wskażPlik.setFileFilter(FF_TXT);
        wskażPlik.setApproveButtonText("zapisz");
        wskażPlik.showSaveDialog(Menu);
        // TODO add your handling code here:

        try (FileOutputStream file
                    =new FileOutputStream(
                            wskażPlik.getSelectedFile()
                            +( wskażPlik.getSelectedFile().getName().endsWith(".txt")?"":".txt" ))){
            jep(tab).getText();
            file.write(jep(tab).getText().getBytes());
            
        } catch (IOException|IndexOutOfBoundsException ex) {
        }
    }//GEN-LAST:event_zapiszZakładkęActionPerformed

    private void pURLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pURLKeyPressed
        if(pHmax==pH||+pHmax==pHistoria.length)pHistoria=Arrays.copyOf(pHistoria, (int)(pHistoria.length+10));
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
                
                pStrona.setPage( pHistoria[ pHmax=pHistoria[pH] == null?pH:++pH]=pURL.getText() );//sets pHistoria url andd pStrona page
                pPoprzednia.setEnabled(pH>0);
                pNastępna.setEnabled(false);
                //pURL.getText());
            } catch (IOException ex) {
                Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_pURLKeyPressed

    private void pStronaHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_pStronaHyperlinkUpdate
        if(pHmax==pH||+pHmax==pHistoria.length)pHistoria=Arrays.copyOf(pHistoria, (int)(pHistoria.length+10));
        pStan.setText(evt.getURL().toString());
        if (( (MouseEvent) evt.getInputEvent() ).getButton()==1){
           
            //pURL&pHistoria setText
            pURL.setText(pHistoria[ pHmax=pHistoria[pH] == null?pH:++pH]=evt.getURL().toString()); 
            pNastępna.setEnabled(false);
            pPoprzednia.setEnabled(pH>0);
            
            try {
                String u;
                pStan.setText("otwieranie - początek");
                if ((u=evt.getURL().toString()).substring(u.length()-6).matches("TYPE=\\d")
                        ||evt.getURL().openConnection().getContentType().contains("pdf"))
                    try {
                        addWithScroll(asText(evt.getURL()), TAB);//==-1?0:TAB.getSelectedIndex());
                        pStan.setText("otwarto w zakładce");
                    } catch (NullPointerException|IndexOutOfBoundsException ex) {
                        addWithNewScroll(asText(evt.getURL()), TAB);
                        pStan.setText("otwarto w nowej zakładce");
                    }
                else
                    try {
                        pStrona.setPage(evt.getURL());
                        

                    } catch (IOException ex) {
                        pStrona.setText("Nie udało się otworzyć źródła");
                        pStan.setText(ex.getMessage());
                    }
            } catch (IOException ex) {
                pStrona.setText("Prawdopodobnie brak połączenia z internetem.\n"
                        +"Sprawdź połączenie lub zapoznaj się z poniższym raportem:\n\n"
                        +ex.getLocalizedMessage());
                Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
    }//GEN-LAST:event_pStronaHyperlinkUpdate

    private void TAB_jakoTekstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_jakoTekstActionPerformed
        for (File f: nawiX(FF_PDF))
            addWithScroll(asText(f), TAB);
    }//GEN-LAST:event_TAB_jakoTekstActionPerformed

    private void TAB_zapiszTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_zapiszTXTActionPerformed
        zapiszZakładkęActionPerformed(evt);
    }//GEN-LAST:event_TAB_zapiszTXTActionPerformed

    private void TAB_zamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_zamknijActionPerformed
        TAB.remove(TAB.getSelectedIndex());
    }//GEN-LAST:event_TAB_zamknijActionPerformed

    private void TAB_nowaKartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_nowaKartaActionPerformed
        addWithNewScroll(null, TAB);
    }//GEN-LAST:event_TAB_nowaKartaActionPerformed

    private void TAB_jakoPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_jakoPDFActionPerformed
        try {
            addWithScroll(asPDF(new URL("file:///"+nawi1(FF_PDF).toString()),TAB_L,pasekStanu), TAB);
        } catch (IOException ex) {
            Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TAB_jakoPDFActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        PPM_TAB.setVisible(true);
    }//GEN-LAST:event_formMouseClicked

    private void notatnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notatnikActionPerformed
        Notatnik.setBounds(
                Menu.getX()+Menu.getWidth(),
                Menu.getY(),
                500,
                500);
        Notatnik.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_notatnikActionPerformed

    private void NotatnikWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_NotatnikWindowClosed
        wskażPlik.showSaveDialog(Notatnik);
        try (FileWriter fw=new FileWriter(wskażPlik.getSelectedFile(), true)) {
            if (nNotatki.getSelectedText()!=null)
                fw.append(nNotatki.getSelectedText(), nNotatki.getSelectionStart(), nNotatki.getSelectionEnd());
            else
                fw.append(nNotatki.getText());
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }

    }//GEN-LAST:event_NotatnikWindowClosed

    private void NotatnikMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotatnikMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_NotatnikMouseReleased

    private void nNotatkiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nNotatkiMouseReleased

        if (evt.getButton()==3) {
            PPM_notatnik.setSize(80, 105);
            PPM_notatnik.show(nNotatki, evt.getX(), evt.getY());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_nNotatkiMouseReleased

    private void notatnik_OtwórzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notatnik_OtwórzActionPerformed
        nNotatki.setText(openTXT(nawi1(FF_TXT)));
    }//GEN-LAST:event_notatnik_OtwórzActionPerformed

    private void n_ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_ZapiszActionPerformed
        try {
            wskażPlik.showSaveDialog(Notatnik);
            String fString=wskażPlik.getSelectedFile().toString();
            String txt=nNotatki.getSelectedText();

            fString+=fString.toLowerCase(Locale.getDefault()).endsWith("txt")?"":".txt";

            if (txt==null)
                txt=nNotatki.getText();

            try (FileWriter fw=new FileWriter(fString)) {
                fw.write(txt);
            }
        } catch (IOException ex) {
            outl("nie można zapisać");
        }
    }//GEN-LAST:event_n_ZapiszActionPerformed

    private void n_kopiujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_kopiujActionPerformed

    }//GEN-LAST:event_n_kopiujActionPerformed

    private void n_wytnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_wytnijActionPerformed
        System.out.println("działa");        // TODO add your handling code here:
    }//GEN-LAST:event_n_wytnijActionPerformed

    private void n_wklejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_wklejActionPerformed
        System.out.println("działa");        // TODO add your handling code here:
    }//GEN-LAST:event_n_wklejActionPerformed

    private void serfujWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_serfujWindowClosed
        serfuj.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_serfujWindowClosed

    private void otwórzTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otwórzTXTActionPerformed
        for (File f: nawiX(FF_TXT))
            addWithNewScroll(new JEditorPane("", openTXT(f)), TAB);
    }//GEN-LAST:event_otwórzTXTActionPerformed

    private void TAB_otwórzNotatkęActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_otwórzNotatkęActionPerformed
        for (File f: nawiX(FF_TXT))
            addWithScroll(new JEditorPane("", openTXT(f)), TAB);
    }//GEN-LAST:event_TAB_otwórzNotatkęActionPerformed

    private void pURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pURLActionPerformed

    private void jakoPDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jakoPDF1ActionPerformed

        try {
            pasekStanu.setVisible(true);
            for (File f: nawiX(FF_PDF))
                addWithNewScroll(asPDF(new URL("file:///"+f.getPath()),TAB_L,pasekStanu), TAB);

        } catch (IOException ex) {
            Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pasekStanu.setVisible(false);
        }

    }//GEN-LAST:event_jakoPDF1ActionPerformed

    private void jakoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jakoTXTActionPerformed
        for (File f: nawiX(FF_PDF))
            try {
                addWithScroll(asTXT(new URL("file:///"+f.toString())), TAB);
            } catch (IOException ex) {
                Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jakoTXTActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        tab=TAB.getSelectedIndex();
        outl("pressed "+evt.getComponent()+"\n"+evt.getKeyChar());
        if (evt.getModifiersEx()==KeyEvent.CTRL_DOWN_MASK) {

            if (evt.getKeyCode()==KeyEvent.VK_LEFT&&tab>0) {
                TAB.setComponentZOrder(TAB.getSelectedComponent(), --tab);//TAB.setLocation(tab,--tab);
                outl("[CTRL]+left");
            }

            if (evt.getKeyCode()==KeyEvent.VK_RIGHT
                    &&tab<TAB.getTabCount()-1) {
                TAB.setComponentZOrder(TAB.getSelectedComponent(), ++tab);
                outl("[CTRL]+right");
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void ISAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISAPActionPerformed
        Linkownik.setBounds(scr1.getValue(), scr2.getValue(), scr3.getValue(), scr4.getValue());
        retry=0;
        int i,l;
        String[] a
                ,b;
        
        String  r=""+LocalDate.now().getYear();
        //do  a=menu(dev1.getText(),dev2.getText(),dev3.getText(),dev4.getText());
        do  a=menu(LINK_ROKNUMER
                    ,"                                &nbsp;<a class=\"cel_black11\" href=\"VolumeServlet?type=wdu&rok="
                    ,"grey.gif\">"
                    ,"</a>", 0 );
        while   (retry++<20&&
                (   a==null 
                ||  !(a[a.length-1].equals(r))   ));//LocalDate.now().getYear()+"")));
        
        if(!a[a.length-1].equals(r)){
            linPolecenie.setForeground(Color.red);
            linPolecenie.setText("Problemy z połączoniem - zamknij i otwórz linkownik jeszcze raz.");
            outl("Sprawdź połączenie - nie można odczytać zasobów.\n    Sprawdź połączenie lub ponownie lub rok");
        }
        
        else{
            for(b=new String[l=-a.length],i=0;l>0;) b[i++]=a[--l];
            linkRok.setModel(new javax.swing.DefaultComboBoxModel<>(b));
        }
        //for(JComboBox c:LINKcombo){c.setSelectedIndex(0);c.actionPerformed(evt);}
        
        Linkownik.setVisible(true);
//canvas1.setVisible(true);
    }//GEN-LAST:event_ISAPActionPerformed

    private void devMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devMouseClicked
        TAB_P.setSelectedIndex(-1);        // TODO add your handling code here:
    }//GEN-LAST:event_devMouseClicked

    private void scr1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scr1AdjustmentValueChanged
        dev1.setText(scr1.getValue()+"");
        Linkownik.setBounds(scr1.getValue(), scr2.getValue(), scr3.getValue(), scr4.getValue());
    }//GEN-LAST:event_scr1AdjustmentValueChanged

    private void scr2AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scr2AdjustmentValueChanged
        dev2.setText(""+scr2.getValue());
        Linkownik.setBounds(scr1.getValue(), scr2.getValue(), scr3.getValue(), scr4.getValue());
    }//GEN-LAST:event_scr2AdjustmentValueChanged

    private void scr3AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scr3AdjustmentValueChanged
        dev3.setText(""+scr3.getValue());
        Linkownik.setBounds(scr1.getValue(), scr2.getValue(), scr3.getValue(), scr4.getValue());
    }//GEN-LAST:event_scr3AdjustmentValueChanged

    private void scr4AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scr4AdjustmentValueChanged
        dev4.setText(scr4.getValue()+"");
        Linkownik.setBounds(scr1.getValue(), scr2.getValue(), scr3.getValue(), scr4.getValue());
    }//GEN-LAST:event_scr4AdjustmentValueChanged

    private void dev1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dev1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            scr1.setValue(Integer.parseInt(dev1.getText()));
    }//GEN-LAST:event_dev1KeyPressed

    private void dev2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dev2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dev2ActionPerformed

    private void dev2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dev2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            scr2.setValue(Integer.valueOf(dev2.getText()));
    }//GEN-LAST:event_dev2KeyPressed

    private void dev3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dev3KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            scr3.setValue(Integer.valueOf(dev3.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_dev3KeyPressed

    private void dev4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dev4KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            scr4.setValue(Integer.valueOf(dev4.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_dev4KeyPressed

    private void cnv1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnv1MousePressed
        mouX=evt.getX();
        mouY=evt.getY();
        /*        if (evt.getButton()==1) {
            scr1.setValue(scr1.getValue()+evt.getX()-canvas1.getWidth()/2);
            dev1.setText(Integer.toString(scr1.getValue()));
            scr2.setValue(scr2.getValue()+evt.getY()-canvas1.getHeight()/2);
            dev2.setText(Integer.toString(scr2.getValue()));
            Linkownik.setSize(scr1.getValue(), scr2.getValue());
        }*/
    }//GEN-LAST:event_cnv1MousePressed

    private void cnv1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cnv1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cnv1PropertyChange

    private void cnv1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnv1MouseMoved

        int mX=0, mY=0;
        if (evt.getButton()==1)
            Linkownik.setSize(evt.getX()-mouX, evt.getY()-mouY);
    }//GEN-LAST:event_cnv1MouseMoved

    private void narzędziaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narzędziaActionPerformed
        TAB.add(dev, -1);
    }//GEN-LAST:event_narzędziaActionPerformed

    private void TAB_PKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TAB_PKeyPressed
        TAB_LKeyPressed(evt);
    }//GEN-LAST:event_TAB_PKeyPressed

    private void TAB_PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TAB_PMouseClicked
        TAB=TAB_P;
        tab=TAB.getSelectedIndex()==-1?0:TAB.getSelectedIndex();
        if (evt.getButton()==3)
            PPM_TAB.show(TAB_P, evt.getX(), evt.getY());
    }//GEN-LAST:event_TAB_PMouseClicked

    private void TAB_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TAB_LMouseClicked
        TAB=TAB_L;
        tab=TAB.getSelectedIndex()==-1?0:TAB.getSelectedIndex();
        if (evt.getButton()==3)
            PPM_TAB.show(TAB_L, evt.getX(), evt.getY());
    }//GEN-LAST:event_TAB_LMouseClicked

    private void hybrydowoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hybrydowoActionPerformed
        URL u;
        for (File f: nawiX(FF_PDF))
            try {
                u=new URL("file:///"+f.getPath());
                addWithNewScroll(asPDF(u,TAB_L,pasekStanu), TAB_L);
                addWithNewScroll(asTXT(u), TAB_P);
            } catch (IOException ioe) {
                outl("Nie znaleziono zasobu");
            }
    }//GEN-LAST:event_hybrydowoActionPerformed

    private void otwórzURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otwórzURLActionPerformed
        serfuj.setSize(1024, 712);
        serfuj.setVisible(true);
    }//GEN-LAST:event_otwórzURLActionPerformed

    private void linOdświerzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linOdświerzActionPerformed
        ISAPActionPerformed(evt);
    }//GEN-LAST:event_linOdświerzActionPerformed

    private void linkPodglądActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkPodglądActionPerformed
        linOdświerz.setEnabled(true);
    }//GEN-LAST:event_linkPodglądActionPerformed

    private void linkPozycjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkPozycjaActionPerformed
        linkTyp.setEnabled(false);linkPodgląd.setEnabled(false);
        linkTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
//              <td width="70%"><img alt="pdf" src="/images/icon_pdf.gif" />&nbsp;<a href="/Download?id=WDU20111110652&amp;type=2">D20110652.pdf</a></td>
        outl("zxc1");
        if(linkPozycja.getSelectedItem().toString().matches("\\d{4}")){
            outl("zxc2");
            retry=0;
            String[]m;
            String end=linkRok.getSelectedItem().toString()+linkNumer.getSelectedItem().toString()+linkPozycja.getSelectedItem().toString();
            outl(LINK_POZYCJA+end);
            
            do  m = menu(//dev1.getText(),dev2.getText(),dev3.getText(),dev4.getText());
                            LINK_POZYCJA+end
                            ,"<td width=\"70%\"><img"
                            ,"&amp;type="
                            ,"\">D"
                            ,16);   while(++retry<10);
            
            outl("n______________"+LINK_POZYCJA+end+"\n______________"+Arrays.toString(m));
            if(m!=null && m.length>0){
                for(int i=0;i<m.length;i++){
                    m[i]=   m[i].equals("0")?"wybierz"
                            :m[i].equals("1")?"treść aktu"
                            :m[i].equals("2")?"ogłoszony"
                            :m[i].equals("3")?"ujednolicony"
                            :m[i];  }
                
                linkTyp.setModel(new DefaultComboBoxModel<>(m));
                linkTyp.setEnabled(true);
                linPolecenie.setForeground(Color.black);
                linPolecenie.setText("Wybierz tryb pracy");
            }else    {
                linPolecenie.setForeground(Color.red);
                linPolecenie.setText("Problem z połączoniem - kliknij wybór ponownie (lista typów tekstu nie wczytana).");
                outl("Sprawdź połączenie - nie można odczytać zasobów.\n    Sprawdź połączenie lub ponownie lub rok");}
        }else {
            linkTyp.setEnabled(false);linkPodgląd.setEnabled(false);
        }
    }//GEN-LAST:event_linkPozycjaActionPerformed

    private void linkNumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkNumerActionPerformed
        retry=0;
        linkPozycja.setEnabled(false);linkTyp.setEnabled(false);linkPodgląd.setEnabled(false);
        linkPozycja.setModel(   new javax.swing.DefaultComboBoxModel<>(new String[]{})  );
        if(linkNumer.getSelectedItem().toString().matches("\\d{3}")){
            String m[];
String p="                                <td width='30%' align='left' valign='top'><a href='DetailsServlet?id=WDU"
                    +linkRok.getSelectedItem().toString()   +   linkNumer.getSelectedItem().toString();
            
            do m=menu(//  dev1.getText(),dev2.getText(),dev3.getText(),dev4.getText());
                    LINK_ROKNUMER+"&rok="+linkRok.getSelectedItem().toString()+"&numer="+linkNumer.getSelectedItem().toString()
                    ,p
                    ,p.substring(73)
                    , "'><img", 0);
            while( m.length<=1&&++retry<10 );

            if( m.length>0    ){
                linkPozycja.setModel(new DefaultComboBoxModel<>(m));
                linkPozycja.setEnabled(true);
                linPolecenie.setForeground(Color.black);
                linPolecenie.setText("wybierz pozycję");
            }else {
                linPolecenie.setForeground(Color.red);
                linPolecenie.setText("Problem z połączoniem - kliknij wybór ponownie (lista pozycji nie wczytana).");
                outl("Sprawdź połączenie - nie można odczytać zasobów.\n    Sprawdź połączenie lub ponownie lub rok");
                //linkPozycja.setEnabled(false);linkTyp.setEnabled(false);linkPodgląd.setEnabled(false);
            }
        }
    }//GEN-LAST:event_linkNumerActionPerformed

    private void linkRokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkRokActionPerformed
        linkPozycja.setEnabled(false);linkTyp.setEnabled(false);linkPodgląd.setEnabled(false);
        linkNumer.setEnabled( linkRok.getSelectedItem().toString().matches("\\d{4}")    );
        
        if( (Integer.valueOf(linkRok.getSelectedItem().toString()))<2012  )   { //for linRok<2012
            String []m;  retry=0;
            do m=menu(link=LINK_ROKNUMER+"&rok="+linkRok.getSelectedItem().toString()
//                                &nbsp;<a class="cel_black11" href="VolumeSer
//vlet?type=wdu&rok=1930"><img border="0" src="images/choice_grey.gif">1930</a>
                    ,"                                &nbsp;<a class=\"cel_black11\" href=\"VolumeSer"
                    ,"grey.gif\">"
                    , "</a>", 0);  while( m.length==0&&++retry<10 );
            
            if  (   m.length>0  ){
                linkNumer.setModel( new DefaultComboBoxModel<>(m)    );
                linPolecenie.setForeground(Color.black);
                linPolecenie.setText("wybierz numer");
            }else    {
                linPolecenie.setForeground(Color.red);
                linPolecenie.setText("Problem z połączoniem - kliknij wybór ponownie (lista pnumerów nie wczytana).");
                outl("Sprawdź połączenie - nie można odczytać zasobów.\n    Sprawdź połączenie lub ponownie lub rok./"+retry);
                }
            }
        else { //linRok>2011
            linkNumer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"000"}));
            linkNumer.setSelectedIndex(0);
            linPolecenie.setForeground(Color.orange);
            linPolecenie.setText("wybierz rok");
            
            linkNumerActionPerformed(evt);
            
            }
    }//GEN-LAST:event_linkRokActionPerformed

    private void linOtwórzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linOtwórzActionPerformed
        linkTyp.setPopupVisible(linkTyp.isPopupVisible());
        String s=linkTyp.getSelectedItem().toString();
        linPolecenie.setForeground(Color.black);
        linPolecenie.setText(link=LINK_TYP+
                linkRok.getSelectedItem().toString()
                +linkNumer.getSelectedItem().toString()
                +linkPozycja.getSelectedItem().toString()
                +(s.equals("treść aktu")?"&type=1"
                        :s.equals("ogłoszony")?"&type=2"
                                :s.equals("ujednolicony")?"&type=3"
                                        :""));

        try{
            URL url=new URL(link);
            int i=linkPodgląd.getSelectedIndex();
            
            if(i==2)    addWithScroll(asText(url), TAB);
            if(i==1) {  addWithNewScroll(asPDF(url,TAB_L,pasekStanu), TAB_L);
                        addWithNewScroll(asTXT(url), TAB_P);  }
            if(i==0)        addWithScroll(asPDF(url,TAB_L,pasekStanu), TAB);
          
        } catch (IOException ex) {
            stop("ISAP nie dostępna lub błędne argumenty");
        }finally {outl(link);}
        outl((String) linkPodgląd.getSelectedItem());
    }//GEN-LAST:event_linOtwórzActionPerformed

    private void linkTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkTypActionPerformed
        linkPodgląd.setEnabled(false);
        linkPodgląd.setEnabled(true);
        link+="&type="+linkTyp.getSelectedIndex()+1;
    }//GEN-LAST:event_linkTypActionPerformed

    private void oPomocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oPomocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oPomocActionPerformed

    private void LinkownikKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LinkownikKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_F5){
            linkNumer.setEnabled(false);linkPozycja.setEnabled(false);linkTyp.setEnabled(false);linkPodgląd.setEnabled(false);
            
        }
    }//GEN-LAST:event_LinkownikKeyPressed

    private void linPolecenieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linPolecenieMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linPolecenieMouseClicked

    private void btt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt1ActionPerformed
        if(evt.getModifiers()==KeyEvent.CTRL_DOWN_MASK)
            System.out.print("dir"+(char)KeyEvent.VK_ACCEPT);
        
        
        
    }//GEN-LAST:event_btt1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void zakończActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zakończActionPerformed
        super.dispose();
    }//GEN-LAST:event_zakończActionPerformed

    private void linKopiujLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linKopiujLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linKopiujLinkActionPerformed

    private void pPoprzedniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPoprzedniaActionPerformed
        try {
            pNastępna.setEnabled(pH>0);
            pURL.setText(pHistoria[--pH]);
            pStrona.setPage(pHistoria[pH]);
            pPoprzednia.setEnabled(pH>0);
        } catch (IOException ex) {
            Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pPoprzedniaActionPerformed

    private void pZaładujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pZaładujActionPerformed
        if(pHmax==pH||+pHmax==pHistoria.length)pHistoria=Arrays.copyOf(pHistoria, (int)(pHistoria.length+10));
        try {
            //sets pHistoria url andd pStrona page
            pStrona.setPage( pHistoria[ pH>-1?pH:++pH]=pURL.getText() );
            pPoprzednia.setEnabled(pH>0);
            pNastępna.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            if(pH>0&&!pHistoria[pH].equals(pURL.getText()))pURL.setText(pHistoria[pHl=++pH]=pURL.getText());
//            pNastępna.setEnabled(false);
//            pPoprzednia.setEnabled(true);
//            if(pHl==pHistoria.length)pHistoria=Arrays.copyOf(pHistoria, (int)(pHl*1.25));
//            pStrona.setPage(pURL.getText());
//        } catch (IOException ex) {  Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex); }
    }//GEN-LAST:event_pZaładujActionPerformed

    private void pOdświerzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pOdświerzActionPerformed
        pStrona.updateUI();
    }//GEN-LAST:event_pOdświerzActionPerformed

    private void pNastępnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNastępnaActionPerformed
        if(+pH<pHmax) try{
            pPoprzednia.setEnabled(true);
            pURL.setText(pHistoria[++pH]);
            pStrona.setPage(pHistoria[pH]);
            pNastępna.setEnabled(+pH<pHmax);
        } catch (IOException ex) {
            Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pNastępnaActionPerformed

    /**
 * CTRL+ALT+TAB - przerzuca kartę między segregatorami
 * ALT+TAB - przenosi na drugi segregator
 * CTRL+TAB - następna karta
 * CTRLALT+BSP - poprzednia karta
 * CTRL+'-'/'w' - zamyka kartę (sprawdzić 'W')
 * @param evt 
 */
    private void TAB_LKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TAB_LKeyPressed
        tab=TAB.getSelectedIndex();
        outl("pressed "+evt.getComponent()+"\n"+evt.getKeyChar());

        if (evt.getKeyCode()==KeyEvent.VK_TAB) {//TAB

            if (evt.isControlDown()&&evt.isAltDown()) {//CTRL + ALT
                ( TAB==TAB_L?TAB_P:TAB_L ).add(TAB.getSelectedComponent());
                TAB=TAB==TAB_L?TAB_P:TAB_L;
            }
            else if (evt.isAltDown())
            TAB=TAB==TAB_L?TAB_P:TAB_L; //TAB+ALT

            else if (evt.isControlDown())   //TAB+CTRL
            TAB.setSelectedIndex(( TAB.getSelectedIndex() )%TAB.getTabCount());
        }

        else if (evt.isAltDown()&&evt.getKeyCode()==KeyEvent.VK_BACK_SPACE) //ALT+BackSP
        TAB.setSelectedIndex(( TAB.getSelectedIndex()+TAB.getTabCount()-1 )%TAB.getTabCount());

        else if (evt.isControlDown()){
            if(evt.getKeyCode()==KeyEvent.VK_MINUS) //CTRL+ "-"
            TAB.remove(TAB.getSelectedComponent());
            else if (evt.getKeyChar()=='w')
            TAB.remove(TAB.getSelectedIndex()); //CTRL + W
        }
    }//GEN-LAST:event_TAB_LKeyPressed


        //___________'WŁASNE'___________\\

    File[] nawiX(FileFilter ff) {
        wskażPlik.setFileFilter(ff);
        wskażPlik.setMultiSelectionEnabled(true);
        wskażPlik.showOpenDialog(Menu);
        return wskażPlik.getSelectedFiles();
    }
    File nawi1(FileFilter ff) {
        wskażPlik.setFileFilter(ff);
        wskażPlik.setMultiSelectionEnabled(false);
        wskażPlik.showOpenDialog(Menu);
        return wskażPlik.getSelectedFile();
    }
    
    static void addWithScroll(Component c, JTabbedPane t) {//komponent do 
        try {
            ((JComponent)c).add(PPM_TAB);
            ( (JScrollPane)t.getSelectedComponent() ).setViewportView(c);
        }
        catch (IndexOutOfBoundsException|NullPointerException ex){
            addWithNewScroll(c, t);
            
            tab=t.getTabCount()-1;
        }
        
//        if (1+t.getSelectedIndex()==t.getTabCount()) {
//            addWithNewScroll(c, t);
//            tab=t.getTabCount()-1;
//        } else {
//            ( (JScrollPane) t.getSelectedComponent() ).setViewportView(c);
//        }
    }
    static void addWithNewScroll(Component c, JTabbedPane t) {//+komponent przez scroll
        JScrollPane s;
        
        if(c!=null){
        ((JComponent)c).add(PPM_TAB);
        s=new JScrollPane(c);}
        else {s=new javax.swing.JScrollPane();}
        
        
        s.setDoubleBuffered(true);
        t.add(s);
        t.setSelectedIndex(t.getTabCount()-1);
        //t.getSelectedComponent().setName(c.getName());
        tab=t.getSelectedIndex();
        ( (JComponent) t.getSelectedComponent() ).add(PPM_TAB);
    }
 
    static JEditorPane jep(int i) throws ClassCastException, IndexOutOfBoundsException {
        return (JEditorPane) ( (JViewport) ( (JScrollPane) TAB.getComponentAt(i) ).getComponent(0) ).getComponent(0);}  
//~WŁASNE
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(() -> {
            Okno program=new Okno();
            program.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ISAP;
    private javax.swing.JFrame Linkownik;
    private static final javax.swing.JMenuBar Menu = new javax.swing.JMenuBar();
    private javax.swing.JFrame Notatnik;
    private javax.swing.JMenu Otwórz;
    private static final javax.swing.JPopupMenu PPM_TAB = new javax.swing.JPopupMenu();
    private static final javax.swing.JPopupMenu PPM_notatnik = new javax.swing.JPopupMenu();
    private javax.swing.JMenu RC;
    private javax.swing.JTabbedPane TAB_L;
    private javax.swing.JTabbedPane TAB_P;
    private javax.swing.JMenuItem TAB_jakoPDF;
    private javax.swing.JMenuItem TAB_jakoTekst;
    private javax.swing.JMenuItem TAB_nowaKarta;
    private javax.swing.JMenuItem TAB_otwórzNotatkę;
    private javax.swing.JMenuItem TAB_zamknij;
    private javax.swing.JMenuItem TAB_zapiszTXT;
    private javax.swing.JMenu Zapisz;
    private javax.swing.JButton btt1;
    private java.awt.Canvas cnv1;
    volatile javax.swing.JPanel dev;
    private javax.swing.JTextField dev1;
    private javax.swing.JTextField dev2;
    private javax.swing.JTextField dev3;
    private javax.swing.JTextField dev4;
    private javax.swing.JMenu deweloperka;
    private javax.swing.JMenuItem hybrydowo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuItem jakoPDF1;
    private javax.swing.JMenuItem jakoTXT;
    private javax.swing.JButton linKopiujLink;
    private javax.swing.JLabel linNr;
    private javax.swing.JButton linOdświerz;
    private javax.swing.JButton linOtwórz;
    private javax.swing.JLabel linPodgląd;
    private javax.swing.JLabel linPolecenie;
    private javax.swing.JLabel linPoz;
    private javax.swing.JLabel linRok;
    private javax.swing.JLabel linTyp;
    private javax.swing.JComboBox<String> linkNumer;
    private javax.swing.JComboBox<String> linkPodgląd;
    private javax.swing.JComboBox<String> linkPozycja;
    private javax.swing.JComboBox<String> linkRok;
    private javax.swing.JComboBox<String> linkTyp;
    private javax.swing.JMenu menu;
    private javax.swing.JEditorPane nNotatki;
    private javax.swing.JScrollPane nScroll;
    private javax.swing.JMenuItem n_Zapisz;
    private javax.swing.JMenuItem n_kopiuj;
    private javax.swing.JMenuItem n_wklej;
    private javax.swing.JMenuItem n_wytnij;
    private javax.swing.JMenuItem narzędzia;
    private javax.swing.JMenuItem notatnik;
    private javax.swing.JMenuItem notatnik_Otwórz;
    private javax.swing.JMenuItem oAktualizacje;
    private javax.swing.JMenuItem oAutor;
    private javax.swing.JMenuItem oPełna;
    private javax.swing.JMenuItem oPomoc;
    private javax.swing.JMenuItem oProgram;
    private javax.swing.JMenu oProgramie;
    private javax.swing.JMenuItem oWersja;
    private javax.swing.JMenuItem otwórz;
    private javax.swing.JMenuItem otwórzTXT;
    private javax.swing.JMenuItem otwórzURL;
    private javax.swing.JButton pNastępna;
    private javax.swing.JButton pOdświerz;
    private javax.swing.JButton pPoprzednia;
    private javax.swing.JScrollPane pScroll;
    private java.awt.Label pStan;
    private javax.swing.JEditorPane pStrona;
    private java.awt.TextField pURL;
    private javax.swing.JButton pZaładuj;
    private javax.swing.JLabel pasekStanu;
    private javax.swing.JMenu plik;
    private javax.swing.JScrollBar scr1;
    private javax.swing.JScrollBar scr2;
    private javax.swing.JScrollBar scr3;
    private javax.swing.JScrollBar scr4;
    private javax.swing.JFrame serfuj;
    private javax.swing.JMenu sesja;
    private javax.swing.JSplitPane splitPan;
    private javax.swing.JTextField txt1;
    private javax.swing.JMenuItem ustawienia;
    private final javax.swing.JFileChooser wskażPlik = new javax.swing.JFileChooser();
    private javax.swing.JMenuItem zakończ;
    private javax.swing.JMenuItem zapisz;
    private javax.swing.JMenuItem zapiszZakładkę;
    // End of variables declaration//GEN-END:variables

   
}
