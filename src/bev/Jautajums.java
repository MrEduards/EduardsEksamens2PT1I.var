package bev;

import javax.swing.JOptionPane;

public class Jautajums {

	
		public String 	Jautajums;
	    public String[] atbVarianti;
	    public char pareizaAtb;
	    public Jautajums(String Jautajums, String[] atbVarianti, char pareizaAtb) {
	        this.Jautajums = Jautajums;
	        this.atbVarianti = atbVarianti;
	        this.pareizaAtb = pareizaAtb;
	    }

	    public String getJautajums() {
	        return Jautajums;
	    }

	    public String[] getAtbildesVarianti() {
	        return atbVarianti;
	    }

	    public char getPareizaAtbilde() {
	        return pareizaAtb;
	    }
	}
	class Tests {
		public Jautajums[] jautajumi;
		public int pareizasAtbSkaits;
		public StringBuilder nepareizasAtb;

	    public Tests(Jautajums[] jautajumi) {
	        this.jautajumi = jautajumi;
	        this.pareizasAtbSkaits = 0;
	        this.nepareizasAtb= new StringBuilder();
	    }
	    public void izpilditTestu() {
	        for (int i = 0; i < jautajumi.length; i++) {
	            Jautajums jautajums = jautajumi[i];
	            String[] varianti = jautajums.getAtbildesVarianti();
	            char pareizaAtb = jautajums.getPareizaAtbilde();

	            char izveletaAtb = ' ';
	            boolean validAtb = false;

	            while (!validAtb) {
	                String izveletasAtbildes = JOptionPane.showInputDialog(null, jautajums.getJautajums() + "\n" + varianti[0] + "\n" + varianti[1] + "\n" + varianti[2] + "\n" + varianti[3]);

	                if (izveletasAtbildes == null) {
	                    
	                    int izvele = JOptionPane.showOptionDialog(null, "Vai vēlaties iziet vai turpināt?", "Iziet vai turpināt", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
	                    if (izvele == JOptionPane.YES_OPTION) {
	                        paradiRezultatu();
	                        return;
	                    } else {
	                        continue;
	                    }
	                } else if (izveletasAtbildes.length() == 1 && izveletasAtbildes.matches("[A-D]")) {
	                    izveletaAtb = izveletasAtbildes.charAt(0);
	                    validAtb = true;
	                } else {
	                    JOptionPane.showMessageDialog(null, "Lūdzu, ievadiet tikai vienu no atļautajiem burtiem A, B, C vai D atbildēs!");
	                }
	            }

	            if (izveletaAtb == pareizaAtb) {
	                pareizasAtbSkaits++;
	            } else {
	                nepareizasAtb.append("Jautājums ").append(i + 1).append("\n");
	                nepareizasAtb.append("Ievadītā atbilde: ").append(izveletaAtb).append("\n");
	                nepareizasAtb.append("Pareizā atbilde: ").append(pareizaAtb).append("\n\n");
	            }
	        }
	    }

	    public void paradiRezultatu() {
	        String rezultats = "Pareizas atbildes: " + pareizasAtbSkaits + "/" + jautajumi.length + "\n";
	        if (nepareizasAtb.length() > 0) {
	            rezultats += "Nepareizi atbildētie jautājumi:\n" + nepareizasAtb.toString();
	        } else {
	            rezultats += "Viss ir pareizi atbildēts!";
	        }

	        JOptionPane.showMessageDialog(null, rezultats);
	    }
	}
	