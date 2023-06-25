package bev;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Lūdzu, atbildiet uz jautājumiem, ievadot atbildes ar vienu lielo burtu no saraksta A-D.");
        
        Jautajums[] jautajumi = {
                new Jautajums("1# Kas ir superklase Java programmēšanā?", new String[]{"A) Superklase ir apakšklase.", "B) Superklase ir augšklase.", "C) Superklase ir visa klases hierarhijas augstākā klase.", "D) Superklase ir speciāla klase, kas atļauj piekļūt privātiem atribūtiem."}, 'C'),
                new Jautajums("2# Kas ir mantošana Java programmēšanā?", new String[]{"A) Mantošana nodrošina iespēju vienai klasei iemantot citas klases atribūtus un metodes.", "B) Mantošana nodrošina iespēju izveidot objektus no klases.", "C) Mantošana ir mehānisms, kas ļauj klasei pārrakstīt superklases metodes.", "D) Mantošana ir mehānisms, kas ļauj izveidot vairākas kopijas vienas klases objektam."}, 'A'),
                new Jautajums("3# Kāda ir atšķirība starp mantošanu un implementāciju Java programmēšanā?", new String[]{"A) Mantošana ļauj iemantot atribūtus un metodes no citas klases, bet implementācija ļauj realizēt metodes no interfeisa.", "B) Mantošana un implementācija ir identiskas koncepts Java programmēšanā.", "C) Mantošana manto gan atribūtus, gan metodes, bet implementācija tikai metodes.", "D) Mantošana atļauj mantošanu tikai no klases, bet implementācija atļauj implementēt tikai no interfeisa."}, 'A'),
                new Jautajums("4# Vai Java atbalsta vairāku mantošanu?", new String[]{"A) Jā, Java atbalsta vairāku mantošanu.", "B) Nē, Java neatbalsta vairāku mantošanu.", "C) Java atbalsta vairāku mantošanu tikai ar interfeisiem.", "D) Vairāku mantošanu var izmantot tikai ar īpašu klases anotāciju."}, 'B'),
                new Jautajums("5# Kas notiks, ja apakšklase mēģina pārrakstīt superklases metodi?", new String[]{"A) Mantojums būs atļauts, un superklases metodes tiks izpildītas.", "B) Mantojums nebūs atļauts, un būs kompilācijas kļūda.", "C) Mantojums būs atļauts, bet superklases metodes tiks ignorētas.", "D) Programma beigsies ar izņēmumu."}, 'A'),
                new Jautajums("6# Kā Java apzīmē superklases konstruktoru?", new String[]{"A) super()", "B) this()", "C) super.constructor()", "D) super.init()"}, 'A'),
                new Jautajums("7# Vai superklasei ir piekļuve apakšklases privātajiem atribūtiem?", new String[]{"A) Jā, superklasei ir pilna piekļuve apakšklases privātajiem atribūtiem.", "B) Nē, superklasei nav piekļuves apakšklases privātajiem atribūtiem.", "C) Piekļuve apakšklases privātajiem atribūtiem ir atļauta tikai, izmantojot atbilstošus getterus un setterus.", "D) Piekļuve apakšklases privātajiem atribūtiem ir atļauta tikai, izmantojot refleksiju."}, 'B'),
                new Jautajums("8# Kas ir vārdkopa 'super' Java programmēšanā?", new String[]{"A) 'super' ir atslēgas vārds, kas atļauj piekļūt superklases metodei.", "B) 'super' ir atslēgas vārds, kas atļauj piekļūt apakšklases metodei.", "C) 'super' ir atslēgas vārds, kas atļauj piekļūt objekta atribūtiem.", "D) 'super' ir atslēgas vārds, kas atļauj piekļūt interfeisa metodei."}, 'A'),
                new Jautajums("9# Vai Java atbalsta divvirzienu mantošanu?", new String[]{"A) Jā, Java atbalsta divvirzienu mantošanu.", "B) Nē, Java neatbalsta divvirzienu mantošanu.", "C) Divvirzienu mantošana ir iespējama tikai starp interfeisiem.", "D) Divvirzienu mantošana ir iespējama tikai ar īpašu klases anotāciju."}, 'B'),
                new Jautajums("10# Kāda ir mantošanas nozīme objektorientētā programmēšanā?", new String[]{"A) Mantošana ļauj izveidot jaunas klases, pamatojoties uz esošām klasēm.", "B) Mantošana ļauj veikt datu pārraidi starp objektiem.", "C) Mantošana ļauj realizēt interfeisus.", "D) Mantošana ļauj apstrādāt izņēmumus."}, 'A')
        };

        Tests tests = new Tests(jautajumi);
        tests.izpilditTestu();
        tests.paradiRezultatu();
    }
}
