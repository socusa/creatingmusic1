package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class Elite_Syncopations extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		setTempo(170);

		key = "F";
		
		measure(0);
		
		addNotes("C6s+C7s A5s+A6s G5s+G6s",T);
		tie(D,T,"F5s","F5s");
		tie(A,T,"F6s","F6s");
		addNotes("A5s+A6s G5s+G6s F5s+F6s",T);
		
		addRest("s",8,B);
		
		measure(1);
		
		addNotes("G5s+G6s F5s+F6s D5s+D6s",T);
		tie(D,T,"C5s","C5s");
		tie(A,T,"C6s","C6s");
		addNotes("F4s+F5s",T);
		addNotes("G4s+G5s",T);
		addNotes("A4s+A5s",T);
		
		addRest("s",8,B);
		
		measure(2);
		
		addNotes("C5s G5i F5s F5i G5i",T);
		addNotes("C4s G4i F4s E4i G4i",B);
		
		measure(3);
		
		addNotes("E5i+G5i+C6i",T);
		addRest("s",T);
		addNote("C5s",A,T);
		addRest("s",T);
		addNote("D5s",A,T);
		addRest("s",T);
		addNote("F5s",A,T);
		
		addNotes("C5i C3i+C4i D3i+D4i E3i+E4i",B);
		
		measure(4);
		
		int measureNumber = 4;
		
		for (int counter=0;counter<2;counter++) {		
			addRest("s",T);
			addNotes("F5s D6s",T);
			tie(D,T,"F5s","F5s");
			tie(D,T,"A5s","A5s");
			tie(A,T,"C6s","C6s");
			addNotes("D6s D#5i+A5i+C6i",T);
		
			addNotes("F3q.+F4q. F#3i+F#4i",B);
		
			measure(measureNumber++);
		
			addRest("s",T);
			addNotes("E5s D6s",T);
			tie(D,T,"E5s","E5s");
			tie(D,T,"B5s","B5s");
			tie(A,T,"C6s","C6s");
			addNotes("D6s E5i+B5i+C6i",T);
		
			addNotes("G3q.+G4q. G#3i+G#4i",B);
		
			measure(measureNumber++);
		
			addRest("s",T);
			addNotes("E5s+A5s+C6s",T);
			addRest("s",T);
			addNotes("A5s+C6s",T);
			addRest("s",T);
			addNotes("Ab5s+Cb6s",T);
			addRest("s",T);
			addNotes("G5s+B5s",T);
		
			addNotes("A3i+A4i Eb4i+Eb5i D4i+D5i Db4i+Db5i",B);
		
			measure(measureNumber++);
		
			addNotes("A5s C6s D6s F6s G5i+C6i+E6i B5i+E6i+G6i",T);
			addNotes("F5i Ab5i",T,T);
			addRest("i",2,T,T);
		
			addNotes("C4i+C5i Bn3i+Bn4i Bb3i+Bb4i C3i+C4i",B);
		
			measure(measureNumber++);
		
			addNotes("A5s+F6s+A6s G#6s A6s",T);
			tie(A,T,"C7s","C7s");
			addNotes("A6s Gn6s F6s",T);
		
			addNotes("F3i A4i+C5i+F5i A3i A4i+C5i+F5i",B);
		
			measure(measureNumber++);
		
			addNotes("G6s F6s D6s",T);
			tie(A,T,"F6s","F6s");
			addNotes("D6s C6s A5s",T);
		
			addNotes("B3i B4i+D5i+F5i A3i A4i+C5i+F5i",B);
		
			measure(measureNumber++);
		
			addNotes("G5s G6s F6s E6s D6s A5i Bn5s",T);
		
			addNotes("Bn3i G4i+Bn4i+F5i G3i G4i+B4i+F5i",B);
		
			measure(measureNumber++);
		
			addNote("C6i",A,T);
			addRest("i",T);
			addNotes("C6i+E6i+C7i",T);
			addRest("i",T);
		
			addNotes("C5i+E5i",B);
			addRest("i",B);
			addNotes("C4i+C5i C3i+C4i",B);
		
			measure(measureNumber++);
		
			addRest("s",T);
			addNotes("E5s D6s",T);
			tie(D,T,"F5s","F5s");
			tie(D,T,"A5s","A5s");
			tie(A,T,"C6s","C6s");
			addNotes("D6s D#5i+A5i+C6i",T);
		
			addNotes("F3q.+F4q. F#3i+F#4i",B);
		
			measure(measureNumber++);
		
			addRest("s",T);
			addNotes("E5s D6s",T);
			tie(D,T,"E5s","E5s");
			tie(D,T,"B5s","B5s");
			tie(A,T,"C6s","C6s");
			addNotes("D6s E5i+B5i+C6i",T);
		
			addNotes("G3q.+G4q. G#3i+G#4i",B);
		
			measure(measureNumber++);
		
			addRest("s",T);
			addNotes("E5s+A5s+C6s",T);
			addRest("s",T);
			addNotes("A5s+C6s",T);
			addRest("s",T);
			addNotes("Ab5s+Cb6s",T);
			addRest("s",T);
			addNotes("G5s+B5s",T);
		
			addNotes("G3i+G4i Eb4i+Eb5i D4i+D5i Db4i+Db5i",B);
		
			measure(measureNumber++);
		
			addNotes("A5s C6s D6s F6s G5i+C6i+E6i B5i+E6i+G6i",T);
			addNotes("F5i Ab5i",T,T);
			addRest("i",2,T,T);
		
			addNotes("C4i+C5i Bn3i+Bn4i Bb3i+Bb4i C3i+C4i",B);
		
			measure(measureNumber++);
		
			addNotes("A5s+F6s+A6s G#6s A6s",T);
			tie(A,T,"C7s","C7s");
			addNotes("A6s Gb6s F6s",T);
		
			addNotes("F3i A4i+C5i+F5i A3i A4i+C5i+F5i",B);
		
			measure(measureNumber++);
		
			addNotes("G6s F6s D6s",T);
			tie(A,T,"C6s","C6s");
			addNotes("D6s A5s G5s",T);
		
			addNotes("B3i B4i+D5i+F5i A3i A4i+C5i+F5i",B);
		
			measure(measureNumber++);
		
			addNotes("Bn4s+E5s G5s B4i+F5i+A5i Bb4s+E5s+G5s Bb4i+E5i+G5i Bb4s+C5s",T);
        
			addNotes("D3i+D4i D3i+D4i C3i+C4i E3i+E4i",B);
		
			measure(measureNumber++);
			
			if (counter == 0) {
				addNotes("A4i+F5i",T);
				addRest("s",T);
				addNote("C5s",A,T);
				addRest("s",T);
				addNote("D5s",A,T);
				addRest("s",T);
				addNote("E5s",A,T);
		
				addNotes("F3i+F4i C3i+C4i D3i+D4i E3i+E4i",B);
			} else {
				addNotes("A4i+F5i C6s C6s C6i C6i",T);
			
				addNotes("F3i+F4i",B);
				addRest("i",B);
				addRest("q",B);
			}
			
			measure(measureNumber++);
		}
		
		addNotes("E6s D6s C6s B5s A5s B5i G5s",T);
		
		addNotes("G4i B4i+C5i+E5i C4i B4i+C5i+E5i",B);
		
		measure(measureNumber++);
		
		addNotes("F5s G5s A5s",T);
		tie(A,T,"C5s","C5s");
		addNotes("A5s G5s F5s",T);
		
		addNotes("F4i G4i+C5i C4i A4i+C5i",B);
		
		measure(measureNumber++);
		
		addNotes("E5s F5s G5s",T);
		tie(A,T,"C5s","C5s");
		addNotes("B5s A5s G5s",T);
		
		addNotes("G4i B4i+C5i C4i B4i+C5i",B);
		
		measure(measureNumber++);
		
		addNotes("F5s A5s D6s",T);
		tie(A,T,"C6s","C6i");
		addNote("C6i",A,T);
		
		addNotes("F4i A4i+C5i A4i C5i+F5i",B);
		
		measure(measureNumber++);
		
		addNotes("E6s D6s C6s B5s A5s B5i E5s",T);
		
		addNotes("G4i B4i+C5i+E5i E4i G4i+B#4i+C5i",B);
		
		measure(measureNumber++);
		
		addNotes("F5s E5s F5s",T);
		tie(A,T,"A5s","A5s");
		addNotes("A5s G5s F5s",T);
		
		addNotes("D4i F4i+A4i+F5i D4i F4i+A4i+F5i",B);
		
		measure(measureNumber++);
		
		addNotes("E5s C6s Bn5s A5s G#5s B5i E5s",T);
		
		addNotes("E4i A4i+B4i E4i G#4i+F5i",B);
		
		measure(measureNumber++);
		
		addNote("A5i",A,T);
		addRest("i",T);
		addNotes("E5q+B5q+C6q",T);
		
		addNotes("A4i+C5i",B);
		addRest("i",B);
		addNotes("C4q+C5q",B);
		
		measure(measureNumber++);
		
		addNotes("E6s D6s C6s B5s A5s G5i G5s",T);
		
		addNotes("G4i B4i+C5i+E5i C4i B4i+C5i+E5i",B);
		
		measure(measureNumber++);
		
		addNotes("F5s G5s A5s",T);
		tie(A,T,"C5s","C5s");
		addNotes("A5s G5s F5s",T);
		
		addNotes("F4i A4i+C5i C4i A4i+C5i",B);
		
		measure(measureNumber++); // 7/20
		
		addNotes("E5s F5s G5s",T);
		tie(A,T,"C5s","C5s");
		addNotes("B5s A5s G5s",T);
		
		addNotes("G4i B4i+C5i C4i B4i+C5i",B);
		
		measure(measureNumber++);
		
		addNotes("E5s A5s D6s",T);
		tie(A,T,"C6s","C6i");
		addNote("C6i",A,T);
		
		addNotes("F4i A4i+C5i C4i A4i+C5i",B);
		
		measure(measureNumber++);
		
		addNotes("B5s+D6s G6i",T);
		tie(D,T,"B5s","B5s");
		tie(A,T,"D6s","D6s");
		addNotes("G6s B5i+D6i",T);
		
		addNotes("B3i G4i+B4i+D5i B3i G4i+B4i+D5i",B);
		
		measure(measureNumber++);
		
		addNotes("A5s+C6s F6i",T);
		tie(D,T,"A5s","A5s");
		tie(A,T,"C6s","C6s");
		addNotes("F6s A5i+C6i",T);
		
		addNotes("C4i A4i+C5i C4i A4i+C5i",B);
		
		measure(measureNumber++);
		
		addNotes("B5s G5s D6s",T);
		tie(A,T,"C6s","C6s");
		addNotes("B5s E5i",T);
		
		addNotes("C4i B4i+C5i+E5i C4i G4i+B4i+C5i",B); // 8/20
		
		
		
		
	}

}
