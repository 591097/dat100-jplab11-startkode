package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;

public class Blogg{

	int nesteledig;
	Innlegg[] innleggtabell;

	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
	return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < nesteledig; i++) {
            if(innleggtabell[i].erLik(innlegg)) {
                 return i;
                 }
            }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		 if(finnInnlegg(innlegg) >= 0) {
			 return true;
			 }
             return false;
	}
	
	
	public boolean ledigPlass() {
		for(int i = 0; i < innleggtabell.length; i++) {
            if(innleggtabell[i] == null) {
                return true;
                }
            }
             return false;
        }
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg) && ledigPlass()) {
	        innleggtabell[nesteledig] = innlegg;
	        nesteledig++;
	        return true;
	    }
	            return false;
	}
	
	public String toString() {
        String tall  = getAntall() + "\n";
        for(int i=0; i < innleggtabell.length; i++) {
            tall += innleggtabell[i];
        }
            return tall + "\n" + "TEKST" + "\n" ;
		
	}

	// Frivillig
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}