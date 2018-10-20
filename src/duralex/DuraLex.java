/**
Program pomaga w analizowaniu tekstów ustaw
* oraz wyszukiwaniu relacji między przepisami prawa.
 */
package duralex;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.datatransfer.Clipboard;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.event.TreeModelListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import org.apache.pdfbox.debugger.pagepane.PagePane;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author dizel
 */
public class DuraLex {
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings(value = "PDFBox")
    public static void main(String[] args)  {
        wybierzDziałanie();
    }

    static String[] zbiórOdnośników(String[] pages, String początek, String koniec, boolean monit){

        String ok[]=new String[pages.length],t;
        
        for (int p=0;p<pages.length;++p){ ok[p]="";
            String page=pages[p],temp="";
            int pi=0,kj=0,delta=30,max=page.length();
            int pl=początek.length(),kl=koniec.length()
                    ,ti,tj,ą=-1;
            char c;

                    Pattern patent=Pattern.compile("Dz\\.");
                    Matcher mmm = patent.matcher(page.replace('\n', ' '));
                        while(mmm.find()){
                                temp+=mmm.group()+"||";
                                outl(mmm.group());
                ok[p]+=p+": "+temp+"\n";
            }
                        
        }
        return ok;
    }
    
    
//oferta
    /**
     * Menu z metodami, używanymi bez kontekstu.
     */
    static void wybierzDziałanie(){
        JFrame fr=new javax.swing.JFrame("",null);
        JPanel p=new javax.swing.JPanel(null,true);
        
        JComboBox c= new javax.swing.JComboBox<>(new String[]{
            "wybierz akcję",
            "DuraLex",
            "Developer_helper",
            "getText(\"http://isap.sejm.gov.pl/Download?id=WDU20140000002&type=2\")",
            "getText(\"http://isap.sejm.gov.pl/Download?id=WDU20111110652&type=2\")",
            "analizujDlaISAP()",
            "System.getenv()..."
        });
        JButton b=new javax.swing.JButton("uruchom");
        JEditorPane t=new javax.swing.JEditorPane("plain/text", "");
        JScrollPane s=new javax.swing.JScrollPane(t);
        fr.setBounds(0,0,330,540);
        p.setBounds(fr.getBounds());
        c.setBounds(0,0,200,40);
        b.setBounds(200,0,130,40);
        t.setBounds(0,40,330,500);
        
        s.setBounds(t.getBounds());
        s.setMinimumSize(new Dimension(150,150));
        s.setMaximumSize(new Dimension(1050,1500));
        t.setMinimumSize(s.getMinimumSize());
        t.setMaximumSize(s.getMaximumSize());
        
        fr.setLayout(p.getLayout());
        fr.add(c);fr.add(b);fr.add(s); fr.add(new PopupMenu());
        //fr.add(p);
       // t.validate();

        b.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            //    if(b.getBounds().contains(e.getLocationOnScreen())){
                    JFrame o;
                   
                    switch(c.getSelectedIndex()){
                        case 1: {(o=new Okno()).setVisible(true);o.setState(0);o.toFront();}    break;
                        case 2: {(o=new Developer_helper()).setVisible(true);o.setState(0);o.toFront();}    break;
                        case 3: outl(Arrays.toString(getTexts("file:/home/dizel/Pulpit/przykład.pdf")));    break;
                        case 4: outl(getText("http://isap.sejm.gov.pl/Download?id=WDU20140000002&type=2"));    break;
                        case 5: outl(getText("http://isap.sejm.gov.pl/Download?id=WDU20111110652&type=2"));    break;
                        case 6: analizujDlaISAP();    break;
                        case 7: outl(System.getenv().toString().replace(", ", "\n"));    break;
                        default: b.setText("brak wyboru");    break;
                    }
            //    }
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
 //               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
  //              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
 //               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
      
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(3);
        t.setText("gotowe");
    }
  /** @param ścieżka PDF url
     * @return Parsed PDF
     */
    static String   getText (String ścieżka) {
        outl("DuraLex.getText(String) started");
        try (PDDocument pdf=PDDocument.load(( new URL(ścieżka) ).openStream())) {
            return new PDFTextStripper().getText(pdf);
        } catch (IOException ioe) {
            return "Nie udało się wczytać pliku";
        }
    }
   /**@param ścieżka PDF url
    * @return parsed PDF's array
    */
    static String []getTexts(String ścieżka){
        outl("DuraLex getTexts(String) started");
        try( PDDocument pdf=PDDocument.load( (new URL(ścieżka)).openStream());PDDocument page=new PDDocument()){
            int i=0;
            String[] pages= new String[pdf.getNumberOfPages()];
            //;
            for(PDPage p:pdf.getPages()){
                page.addPage(p);
                pages[i++]=new PDFTextStripper().getText(page);
                page.removePage(p);
            }
            page.close();
            return pages;
            
        }catch(IOException ioe){
            outl("nie udało się otworzyć pliku");
            return null;
        }
    }
   /**
    * @param plik pdfFile
    * @return equal to PDFStripper.parse();
    */
    static String   getText (File plik) {
        outl("DuraLex.getText(File) started");
        try (PDDocument pdf=PDDocument.load(plik)) {
            PDFTextStripper strip=new PDFTextStripper();
            return strip.getText(pdf);
        } catch (IOException ex) {
            Logger.getLogger(DuraLex.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        }
    /**
     * @param PDF selected PDF files 
     * @return String array of set PDF array
     */
    static String   getTexts (File[] PDF) {
        try {
            outl("DuraLex.getText(File[]) started");
            String wynik="";
            PDFTextStripper strip = new PDFTextStripper();
            
            for (File plik: PDF) {
                try (PDDocument pdf=PDDocument.load(plik)) {
                    wynik+=strip.getText(pdf);
                    pdf.close();
                } catch (Exception ioe) {}

                return wynik;
            }
            return null;
        } catch (IOException ex) {
            Logger.getLogger(DuraLex.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /** Use of "new Scanner(File);"
     * @param file
     * @return file content
     */
    static String   openTXT (File file) {
        outl("DuraLex.openTXT(File) started");
        try {
            String txt;
            try (Scanner s=new Scanner(file)) {
                txt="";
                while (s.hasNext())
                    txt+=s.nextLine()+"\n";
            }
            return txt;
        } catch (FileNotFoundException ex) {
            return "nie udało się odczytać pliku";
        }
    }
    /**
     * Liczy każde słowo w Biblii bez rozpoznawania koniugacji.
     */
 
//cegiełki ofert
    void pokażDokument(URL plik) throws IOException {
        outl("DuraLex.pokażDokument(URL) started");
       // PDDocument pdf=PDDocument.load(plik.openStream());
        PDPage page;
        PDFParser pars;
        PDFTextStripper par;
        PDFParser g;
    }

    static void analizujWgSłów(String string) {
        outl("DuraLex.analizuj(String) started");
        try (PDDocument pdf=PDDocument.load(new java.io.File(string))) {
            String tekst=new PDFTextStripper().getText(pdf);
            String[] wynik=tekst.split(" ");
            String[] WYNIK=new String[wynik.length];
            int[] ilość=new int[wynik.length];
            int i=0;
            int j=0;
            for (String słowo: wynik) {
                while (( wynik[i]==null?WYNIK[j]!=null:!wynik[i].equals(WYNIK[j]) )&&WYNIK[j]!=null)
                    j++;
                WYNIK[j]=wynik[i];
                j=0;
                ilość[i]+=1;

            }
            System.out.println(wynik[244]+":"+ilość[244]);
            System.out.println(wynik[103]+":"+ilość[103]);
            System.out.println(wynik[22]+":"+ilość[22]);
        } catch (IOException ex) {
            Logger.getLogger(DuraLex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void setTxt(File plik, JTabbedPane TABlp, int tab) {
        outl("DuraLex.setTxt(File,JTabbedPane,int) started");
        ( (JTextPane) ( (JViewport) ( (JScrollPane) TABlp.getSelectedComponent() )
                .getComponent(tab) ).getComponent(0) )
                .setText(DuraLex.getText(plik));
    }
    
    boolean contains(String query, String...m){
        for(String s:m)if(query.contains(s)) return true;
        return false;
    }
    static int LP=0;
//próbki
    
//RC
//eksperymenty
    static void ładowarkaPDF(JPanel cel,PDPage[]pgs,int p){
        int t=p;
        
    }
    static void analizujDlaISAP(){
            
        JFrame f=new javax.swing.JFrame();
        javax.swing.JFileChooser c=new javax.swing.JFileChooser();
        f.setBounds(0, 0, 300, 300);
        c.setBounds(0,0,300,300);
        f.add(c);
        f.setVisible(true);
        
        outl("start");
        for(int i=0,l=c.getSelectedFiles().length;i<l;i++) try (PDDocument pdf=PDDocument.load(c.getSelectedFiles()[i])){
            PDFParser parse;
            PDFTextStripper strip =  new PDFTextStripper();
            String[] in =strip.getText(pdf).split("\n");
            int j=0;
            for(String s:in)System.out.print(s+"\n"+s.length()+"\n");
        
    }       catch (IOException ex) {
                Logger.getLogger(DuraLex.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    static String szukajLinku(String[] wzór, JEditorPane txt) {
        int caret=txt.getCaretPosition();
        String S=txt.getText().substring(caret, caret+25);
        for (int s=0; s<50; s++) {
        }
        return null;
    }
 
    /**
     *
     */
    public static String[] ISAPlista=new String[]{"href=\"VolumeServlet?type=wdu","href=\'DetailsServlet?id=WDU","<td width=\"70%\"><"};
    
    /**
     * 
     * @param url - of site to parse
     * @param poszlaka - scheme after whitch it takes String to the element
     * @param startPo Begins read after that string
     * @param koniecPrzed ends read before this string
     * @param offset offset of poszlaka's possible location
     * @return the java.lang.String[] 
    */
    static String[] menu(String url, String poszlaka, String startPo, String koniecPrzed, int offset) {
        try(
            BufferedReader buf = new BufferedReader(new InputStreamReader(new URL(url).openStream()))){
            String in,t="",temp[],out[];
            int i,u=url.length(),s=startPo.length(),k=koniecPrzed.length();//i=indexOf
            
            while(buf.ready()){
                if((in=buf.readLine())!=null&&(i=(in).indexOf(poszlaka,offset>-1?offset:0))>-1){
                    t+= in.substring(in.indexOf(startPo,i)+s,  in.indexOf(koniecPrzed,i+s)   );
                    t+=" ";// (t.length()!=0?" ":"");
            }
            if(offset==-1)outl(""+(in.length()>200?in:in.length()));
        }
            
        //outl("___menu(string,string,int) ended");
        return t.split(" ");
    }catch(IOException ioe){outl("error");return new String[]{};}
        
    }
//testy
    static String[][] słowaKluczowe(){
        String u[] ={"ABCDEFGHIJKLŁMNOPRSŚTUWZŻ","http://isap.sejm.gov.pl/KeyWordServlet?viewName=thas","&passName=","%20"},
        out[][]=new String[ u[0].length()]  [];
        
        for(int i=0;i<u[0].length();i++){
            
            out[i]=menu("http://isap.sejm.gov.pl/KeyWordServlet?viewName=thas"+u[0].charAt(i)
                    ,"&nbsp;<a"
                    ,"&passName="
                    ,"\"><img border=\"0\"", 0
            );
        }
        return out;
    }
    
    
    
    static Method[] reflect(Object o){return o.getClass().getMethods();}
    static int tab, mouX=0, mouY=0,pHmax=0,pH=-1;
    static JTabbedPane TAB;
    static JComponent dragDrop;
    static LocalTime start, stop;
    static Object skupienie;
    static String link="";
    static int retry=0;
    static boolean jump=false;
    final static String LINK_ROKNUMER="http://isap.sejm.gov.pl/VolumeServlet?type=wdu"
            ,LINK_POZYCJA="http://isap.sejm.gov.pl/DetailsServlet?id=WDU"
            ,LINK_TYP="http://isap.sejm.gov.pl/Download?id=WDU";
    static String[]pHistoria=new String[1];    
    
        //interfejsy
    static FileFilter FF_TXT=new FileFilter() {
        @Override
        public boolean accept(File f) {
            return f.toString().toLowerCase(Locale.getDefault()).endsWith("txt")
                    ||f.isDirectory();
        }

        @Override
        public String getDescription() {
            return "folder and \"*.txt\"";
        }
    };
    static FileFilter FF_PDF=new FileFilter() {
        @Override
        public boolean accept(File f) {
            return f.toString().toLowerCase(Locale.getDefault()).endsWith("pdf")
                    ||f.isDirectory();
        }

        @Override
        public String getDescription() {
            return "folder and \"*.pdf\"";
        }
    };
    static TreeModel getTree(String[] el,String ttl){
        String[][]temp=new String[el.length][];
        for(int i=0;i<el.length;i++)    temp[i]=el[i].split("||");
        
        TreeModel out=new TreeModel() {
            @Override
            public Object getRoot() {
                return ttl;
            }

            @Override
            public Object getChild(Object parent, int index) {
                return temp[index];
            }

            @Override
            public int getChildCount(Object parent) {
                return ((String[])parent).length;
                
                
            }

            @Override
            public boolean isLeaf(Object node) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void valueForPathChanged(TreePath path, Object newValue) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getIndexOfChild(Object parent, Object child) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void addTreeModelListener(TreeModelListener l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeTreeModelListener(TreeModelListener l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        } ;
    return out;}

//monitoring
       /** skrót System.out.println(Object o)
     * @param o 
     */
    public static void outl(Object o) {System.out.println(o);}
  
    static void start() {
        System.out.println(( start=LocalTime.now() ).toString());
    }
    static void stop() {
        System.out.println(( stop=LocalTime.now() )+"\n"+( stop.compareTo(start) ));
    }
    static void start(String s) {
        System.out.println(s);
        start();
    }
    static void stop(String s) {
        stop();
        System.out.println(s);
    }
    static void generujLink(int rok, int numer, int pozycja, int typ) {
        link="http://isap.sejm.gov.pl/Download?id=WDU";
    }
    static JEditorPane asText(URL url) {
        return new JEditorPane("text", getText(url.toString()));
    }
    static JEditorPane asText(File file) {
        return new JEditorPane("text", getText(file));
    }
    static JPanel asPDF(URL url, JTabbedPane jTab, JLabel pasekStanu) {
        JPanel jpan;
        jpan = new JPanel(null);//.addMouseListener(TAB.getMouseListeners()[0]);

        try {
            PDDocument pdf=PDDocument.load(url.openStream());
            int numOfPgs=pdf.getNumberOfPages();
            int i=numOfPgs;
            int w=(int) pdf.getPage(0).getArtBox().getWidth()+1;
            int h=(int) pdf.getPage(0).getArtBox().getHeight()+1;
            
            Component jc;
            while (i-->0){//numOfPgs) {
                (jc=new org.apache.pdfbox.debugger.pagepane.PagePane(pdf, pdf.getPage(i).getCOSObject(), pasekStanu).getPanel()).addMouseListener(jTab.getMouseListeners()[0]);
                jc.setBounds(0, i*h-30,w,h);// w, h);
                jpan.add(jc);
            }
            
            jpan.setPreferredSize(new Dimension(w, h*numOfPgs));
            
            return jpan;

        } catch (IOException ex) {
            outl("asPDF(URL) nie powiodło się");
            return null;
        }
    }
    static JPanel asTXT(URL url) throws IOException {
        PDDocument PDF=PDDocument.load(url.openStream());
        PDDocument pdf=new PDDocument();
        JPanel jp=new JPanel(null);
        jp.setDoubleBuffered(true);
        JEditorPane e;

        PDFTextStripper strip=new PDFTextStripper();
        int numOfPgs=PDF.getNumberOfPages();
        int i=0, h=0, w=0;

        JSeparator sep=new javax.swing.JSeparator(0);
        sep.setPreferredSize(new Dimension(w, 20));
        for (PDPage p: PDF.getPages()) {
            if (pdf.getNumberOfPages()>0)
                pdf.removePage(0);
            pdf.addPage(p);
            h=(int) p.getArtBox().getHeight()+10;
            w=(int) p.getArtBox().getWidth()+1;
            e=new javax.swing.JEditorPane("text/plain", strip.getText(pdf));
            e.setBounds(0, i*20+i++*h, w, h);
            e.setDoubleBuffered(true);
            jp.add(e);
            sep.setBorder(new javax.swing.border.MatteBorder(new Insets(5, 5, 5, 5), Color.GREEN));
            sep.setBounds(0, i*h, w, 20);

            jp.add(sep);
        }
        jp.setPreferredSize(new Dimension(w, i*h));
        return jp;
    }
    static PagePane asPDF(URL url, int page, JLabel pasekStanu) {
        try {
            PDDocument PDF=PDDocument.load(url.openStream());
            return new PagePane(PDF, PDF.getPage(page).getCOSObject(), pasekStanu);
        } catch (IOException ex) {
            outl("asPDF nie powiodło się");
            return null;
        }
    }

//test
    static Clipboard clip = new java.awt.datatransfer.Clipboard("Clipboard - imię");
    static InputVerifier iv=new InputVerifier() {
        @Override
        public boolean verify(JComponent c) {
            
            char[] in=( (JTextField) c ).getText().toCharArray();
            for (char i: in)
                if (i>9||i<0)
                    return false;
            return true;
        }
    };
   
//ŚMIETNIK
    void v(){}
}