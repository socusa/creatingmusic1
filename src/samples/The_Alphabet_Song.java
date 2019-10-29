package samples;

import static music.CreatingMusic.*;
import static music.Util.*;

import songs.Song;

public class The_Alphabet_Song extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub

		setTempo(90);
		
		measure(0);
		
		addNotes("C5q C5q G5q G5q",T);
		
		measure(1);
		
		addNotes("A5q A5q G5h",T);
		
		measure(2);
		
		addNotes("F5q F5q E5q E5q",T);
		
		measure(3);
		
		addNotes("D5i D5i D5i D5i C5h",T);
		
		measure(4);
		
		addNotes("G5q G5q F5h",T);
		
		measure(5);
		
		addNotes("E5q E5q D5h",T);
		
		measure(6);
		
		addNotes("G5i G5i G5q F5h",T);
		
		measure(7);
		
		addNotes("E5q E5q D5h",T);
		
		
	}

}
