package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class We_Wish_You_A_Merry_Christmas extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		setTempo(240);
		
		key = "G";
		
		measure(0);
		
		addNote("D5q",A,T);
		
		addRest("q",B);
		
		measure(1);
		
		addNotes("G5q G5i A5i G5i F5i",T);
		
		addRest("q",B);
		addNotes("B3q G4q",B);
		
		measure(2);
		
		addNotes("E5q E5q E5q",T);
		
		addNotes("C4h+E4h",B);
		addRest("q",B);
		
		measure(3);
		
		addNotes("A5q A5i B5i A5i G5i",T);
		
		addRest("q",B);
		addNotes("C#4q A4q",B);
		
		measure(4);
		
		addNotes("F5q D5q D5q",T);
		
		addNotes("D4h+F4h",B);
		addRest("q",B);
		
		measure(5);
		
		addNotes("B5q B5i C6i B5i A5i",T);
		
		addRest("q",B);
		addNotes("G4q D5q",B);
		
		measure(6);
		
		addNotes("G5q E5q D5i D5i",T);
		
		addNotes("C5h+E5h",B);
		addRest("q",B);
		
		measure(7);
		
		addNotes("E5q A5q F5q",T);
		
		addNotes("C5h D5q",B);
		
		measure(8);
		
		addNotes("G5h D5q",T);
		
		addNotes("G4h+B4h",B);
		addRest("q",B);
		
		measure(9);
		
		addNotes("G5q G5q G5q",T);
		
		addNote("B4h.",A,B);
		
		measure(10);
		
		addNotes("F5h F5q",T);
		
		addNotes("A4h A4q",B);
		
		measure(11);
		
		addNotes("G5q F5q E5q",T);
		
		addNotes("B4q A4q G4q",B);
		
		measure(12);
		
		addNotes("D5h A5q",T);
		
		addNotes("F4h A4q",B);
		
		measure(13);
		
		addNotes("B5q A5q G5q",T);
		
		addNotes("B4q A4q G4q",B);
		
		measure(14);
		
		addNotes("D6q D5q D5i D5i",T);
		
		addNotes("D5q D4q",B);
		addRest("q",B);
		
		measure(15);
		
		addNotes("E5q A5q F5q",T);
		
		addNotes("C5h D5q",B);
		
		measure(16);
		
		addNote("G5h",A,T);
		addRest("q",T);
		
		addNotes("G4h+B4h",B);
		addRest("q",B);
		
		measure(17);
	}

}
