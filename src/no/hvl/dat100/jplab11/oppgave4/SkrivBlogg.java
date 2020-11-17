package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			PrintWriter file = new PrintWriter(mappe + filnavn);
			file.write(samling.toString());
			file.close();
			return true;
		} catch(FileNotFoundException a) {
			a.printStackTrace();
			return false;
		}
	}
}
