package testy;

/**
Program pomaga w analizowaniu tekstów ustaw
* oraz wyszukiwaniu relacji między przepisami prawa.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author dizel
 */
public class DuraLex_basen {
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args)  {
        //new Okno().setVisible(true);
        //outl("dasddasd");
           //outl(getText("http://isap.sejm.gov.pl/Download?id=WDU20140000002&type=2"));
           
        outl(Arrays.toString(drzewoPrzepisów(
                getText("http://isap.sejm.gov.pl/Download?id=WDU20140000002&type=2")
                ,"Dz. U. "
                ," poz. ")));
     
        //analizujDlaISAP();
    }

       
       
//oferta
    /**
     *
     * @param ścieżka for File/URL formatted as URI string
     * @return String of parsed PDF
     */
    static String getText(String ścieżka) {
        outl("DuraLex.getText(String) started");
        try (PDDocument pdf=PDDocument.load(( new URL(ścieżka) ).openStream())) {
            return new PDFTextStripper().getText(pdf);
        } catch (IOException ioe) {
            return "Nie udało się wczytać pliku";
        }
    }

    static String getText(File plik) {
        outl("DuraLex.getText(File) started");
        try (PDDocument pdf=PDDocument.load(plik)) {
            PDFTextStripper strip=new PDFTextStripper();
            return strip.getText(pdf);
        } catch (IOException ioe) {
            // Logger.getLogger(DuraLex.class.getName()).log(Level.SEVERE, null, ioe);
            if (plik.exists())
                return "Nie rozpoznano pliku";
            else
                return "Pusta ścieżka lub brak nazwy protoołu na początku ścieżki";
        }
    }

    static String getText(File[] dokument) {
        outl("DuraLex.getText(File[]) started");
        String wynik="";
        try {
            PDFTextStripper strip=new PDFTextStripper();

            //wczytywanie plików
            for (File plik: dokument) {
                try (PDDocument pdf=PDDocument.load(plik)) {
                    wynik+=strip.getText(pdf);
                    pdf.close();
                    
                } catch (Exception ioe) {

                }

                return wynik;
            }
        } catch (IOException ex) {
        }
        return null;
    }

    static String openTXT(File file_txt) {
        outl("DuraLex.openTXT(File) started");
        try {
            String txt;
            try (Scanner s=new Scanner(file_txt)) {
                txt="";
                while (s.hasNext())
                    txt+=s.nextLine()+"\n";
            }
            return txt;
        } catch (FileNotFoundException ex) {
            return "nie udało się odczytać pliku";
        }
    }

    static void analizujPDF() {
        try {
            FileWriter fw=new java.io.FileWriter(new File("/home/dizel/Pulpit/BBL.TXT"), true);
            fw.write("zaczęto procedurę "+LocalTime.now());
            fw.flush();
            String[] S=naSłowa(getText(new File("/home/dizel/Pulpit/java sciąga/List of Java keywords - Wikipedia_files/BIBLIA TYSIĄCLECIA Z KOMENTARZAMI.pdf"))).split(" ");
            Arrays.sort(S);
            //S=ignoruj(S,3);
            fw.write(policz(S).toString());
        } catch (IOException ioe) {
        }

    }

//oferta rozszerzona
    static PDDocument otwórzJakoPDF(File plik) throws IOException {
        outl("DuraLex.otwórzJakoPDF(File) started");
        try (PDDocument pdf=PDDocument.load(plik)) {
            PDFParser p;

            PDFTextStripper strip=new PDFTextStripper();
            System.out.print(pdf.getNumberOfPages());
            return pdf;
        }
    }

    static PDDocument otwórz(File f) throws IOException {
        outl("DuraLex.otwórz(File) started");
        return PDDocument.load(f);

    }

    static PDDocument otwórz(URL u) throws IOException {
        outl("DuraLex.otwórz(URL) started");
        return PDDocument.load(u.openStream());
    }

    static PDDocument otwórz(String file) throws IOException {
        outl("DuraLex.otwórz(String file) started");
        return PDDocument.load(new java.io.File(file));
    }

    static PDPageTree otwórz(PDDocument pdf) {
        outl("DuraLex.otwórz(PDDocument) started");
        return pdf.getPages();
    }

//cegiełki ofert
    void pokażDokument(URL plik) throws IOException {
        outl("DuraLex.pokażDokument(URL) started");
        PDDocument pdf=PDDocument.load(plik.openStream());
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
            Logger.getLogger(DuraLex_basen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void setTxt(File plik, JTabbedPane TABlp, int tab) {
        outl("DuraLex.setTxt(File,JTabbedPane,int) started");
        ( (JTextPane) ( (JViewport) ( (JScrollPane) TABlp.getSelectedComponent() )
                .getComponent(tab) ).getComponent(0) )
                .setText(DuraLex_basen.getText(plik));
    }

    static int LP=0;
//próbki
//RC
//eksperymenty
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
        }   catch (IOException ex) {
                Logger.getLogger(DuraLex_basen.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    static String szukajLinku(String[] wzór, JEditorPane txt) {
        int caret=txt.getCaretPosition();
        String S=txt.getText().substring(caret, caret+25);
        for (int s=0; s<50; s++) {
        }
        return null;
    }
 
    static boolean należyDo(char arg, char... in) {
        outl("DuraLex.należyDo(char,char...) started");
        for (char c: in)
            if (c==arg)
                return true;
        return false;
    }

    static boolean należyDo(char arg, char offset, char length) {
        outl("DuraLex.należyDo((char,char,char) started");
        for (int i=(int) offset; i<(int) ( offset+length ); i++)
            if ((int) arg==i)
                return true;
        return false;
    }

    static Hashtable<String, Integer> policz(String[] sortedString) {
        outl("DuraLex.policz(String[]) started");
        int count=0;
        Hashtable<String, Integer> out=new Hashtable<String, Integer>(1000, 1f);
        int słów=0;
        for (int i=0, j=0; i<sortedString.length; i++, count=0) {
            for (j=i; j<sortedString.length&&sortedString[i].equals(sortedString[j]); j++, count++);
            out.put(sortedString[i], count);
            i=++j;
            słów+=count;
            count=0;
        }
        out.put("słów", sortedString.length);
        out.put("w puli", słów);

        return out;
    }

    static String naSłowa(String s) {
        outl("DuraLex.naSłowa(String) started");
        LocalTime start, stop;
        char[] C=s.toCharArray();
        String out="";
        for (int i=0; i<C.length; i++)
            out+=należyDo(s.charAt(i), 'A', 'Z')||należyDo(s.charAt(i), 'a', 'z')?s.charAt(i):' ';
        return out;
    }

    static void skaner() {
        Scanner sc=new Scanner(System.in);

    }

    static void rrr() {
        outl("DuraLex.main started "+LocalTime.now());
        String a="abc", n="123";
        System.out.println(a.matches("[\\d]{3}")+"\n"+n.matches("[\\d]{4}"));
        outl("DuraLex.main finished "+LocalTime.now());
    }
    
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
        try{
            BufferedReader buf = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            String in,t="",temp[],out[];
            int i,u=url.length(),s=startPo.length(),k=koniecPrzed.length();//i=indexOf
            
            while(buf.ready()){
                if((i=(in=buf.readLine()).indexOf(poszlaka,offset>-1?offset:0))>-1){
                    t+= in.substring(in.indexOf(startPo,i)+s,  in.indexOf(koniecPrzed,i+s)   );
                    t+=" ";// (t.length()!=0?" ":"");
            }
            if(offset==-1)outl(""+(in.length()>200?in:in.length()));
        }
            
        //outl("___menu(string,string,int) ended");
        return t.split(" ");
    }catch(IOException ioe){outl("error");return new String[]{};}
        
    }
    
    /**
     * Dz. U.
z 2005 r.
            Nr 83, poz. 719,
            Nr 183, poz.1537 i poz. 1538
          i Nr 184, poz. 1539,

z 2006 r.   Nr 157, poz. 1119,
z 2007 r.   Nr 112, poz. 769,
z 2008 r.   Nr 231, poz. 1546,
z 2009 r.   Nr 18, poz. 97,
            Nr 42, poz. 341, 
            Nr 168, poz. 1323 
            i Nr 201,poz. 1540 
oraz z 2010 r. Nr 81, poz. 530
     * @param s
     * @param regex
     * @return 
     */
    
    
//testy
    static String[] drzewoPrzepisów(String pages, String początek, String koniec){

        String surowe[],temp="",odnośniki="";
        int 
                max=pages.length()
          , pi=pages.indexOf(początek), pl=początek.length(),pj=pi+pl
                
          , ki=pages.indexOf(koniec, pi),kl=koniec.length(),kj=ki+kl
          
          , len=kj-pi;
        
        
        do{
            odnośniki=temp=pages.substring(pi,kj+4);
            outl(odnośniki);
            do{odnośniki+=temp;}while (kj+30<max
                //&& !((temp=pages.substring(kj,kj+=30)).contains(początek))
                && pages.substring(kj,kj+=30).contains(koniec)
                   );

outl(odnośniki.length());
            odnośniki=odnośniki.substring(odnośniki.indexOf(początek),odnośniki.lastIndexOf(koniec)+7);
            
            
            
        }while((kj+100)<max);
        
        
        //http://isap.sejm.gov.pl/Download;jsessionid=672E898840F3F039DFD420E7604AEFF0?id=WDU19970980602&type=3
            
            
            
            
//dodawać do tempa aż otrzymamy następny począek
//a wtedy odejmować aż go zabraknie
//ostatni indeks końca wskaże koniec całej referencji
            outl(odnośniki);
            return odnośniki.split("||");
    }
    
    
    
 
//ŚMIETNIK
    /**
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

    static void zxz() throws IOException {
        outl("DuraLex.zxz()/throws IOException/ started ");
        PDPage p=new PDPage();
        PDFTextStripper s=new PDFTextStripper();
        PDDocument d=PDDocument.load(new File("/home/dizel/Pulpit/DŁUGI/transfer_20160512.pdf"));
        PDPageTree t=new PDPageTree();
        PDDocument D=new PDDocument();
        D.addPage(p);
        System.out.println(s.getText(D));

    }
    static String[] ignorujWartościListy(String[] in, int minLen) {
        outl("DuraLex.ignoruj(String[],int) started");
        String[] out=new String[in.length];
        int i=0;
        for (String s: in)
            if (s.length()>minLen)
                out[i++]=s;

        for (int j=out.length-1; out[j]==null&i>0; j--)
            out[j]="";

        System.out.print(out[out.length-1]);
        return out;
    }*/
    static void outl(Object o) {System.out.println(o);}
}
