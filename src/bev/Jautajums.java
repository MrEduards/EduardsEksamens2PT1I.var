package bev;

public class Jautajums {

	public static void main(String[] args) {
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
	