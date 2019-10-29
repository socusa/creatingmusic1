package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class Old_MacDonald extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		setTempo(240);
		
		measure(0);
		
		addNotes("G5q G5q G5q D5q",T);
		
		measure(1);
		
		addNotes("E5q E5q D5h",T);
		
		measure(2);
		
		addNotes("B5q B5q A5q A5q",T);
		
		measure(3);
		
		addNotes("G5h. D5q",T);
		
		measure(4);
		
		addNotes("G5q G5q G5q D5q",T);
		
		measure(5);
		
		addNotes("E5q E5q D5h",T);
		
		measure(6);
		
		addNotes("B5q B5q A5q A5q",T);
		
		measure(7);
		
		addNotes("G5h. D5i D5i",T);
		
		measure(8);
		
		addNotes("G5q G5q G5q D5i D5i",T);
		
		measure(9);
		
		addNotes("G5q G5q G5q",T);
		addRest("q",T);
		
		measure(10);
		
		addNotes("G5i G5i G5q G5i G5i G5q",T);
		
		measure(11);
		
		addNotes("G5i G5i G5i G5i G5q G5q",T);
		
		measure(12);
		
		addNotes("G5q G5q G5q D5q",T);
		
		measure(13);
		
		addNotes("E5q E5q D5h",T);
		
		measure(14);
		
		addNotes("B5q B5q A5q A5q",T);
		
		measure(15);
		
		addNote("G5w",A,T);
		
		measure(16);

	}

}
