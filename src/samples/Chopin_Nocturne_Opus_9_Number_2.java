package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class Chopin_Nocturne_Opus_9_Number_2 extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		factor = 2400;
		
		setTempo(120*factor);
		
		key = "Eb";
		
		measure(0);
		
		addNote("B5i",A,T);
		addRest("i",B);
		
		measure(1);
		
		tie(A,T,"G6q.","G6i");
		addNotes("F6i G6i F6q. E6q B5i",T);
		addNotes("E3i G4i+E5i B4i+C5i+E5i E4i A4i+D5i Cb5i+D5i+A5i E3i G4i+E5i B4i+E5i+G5i E3i G4i+E5i B4i+E5i+G5i",B);
		
		measure(2);
		
		addNotes("G6q C6i C7q G6i B6q. A6q G6i",T);
		
		addNotes("C3i G4i+En5i B4i+E5i+G5i B3i G4i+E5i C5i+E5i+B5i F3i F4i+Db4i B4i+D5i+E5i F3i F4i+C5i A4i+C5i+F5i",B);
		
		measure(3);
		
		addNotes("F6q. G6q D6i E6q. C6q.",T);
		
		addNotes("B3i F4i+Dn5i B4i+D5i+A5i Bn3i G4i+F5i D5i+F5i+G5i C4i G4i+E5i C5i+E5i+G5i An3i Gb4i+E5i C5i+E5i+Gb5i",B);
		
		measure(4);
		
		addNotes("B5i D7i C7i B6s A6s G6s A6s C6s D6s E6q.",T);
		addRest("q",T);
		addNote("B5i",A,T);
		
		addNotes("B3i F4i+E5i B4i+E5i+Ab5i B2i F4i+D5i B4i+Ab5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
		
		measure(5);
		
		addNotes("G6q. F6s G6s F6s En6s F6s G6s F6i",T);
		tie(A,T,"F6q","F6s");
		addNotes("F6s E6s D6s E6s F6s",T);
		
		addNotes("E4i G4i+E5i B4i+E5i+G5i E4i A4i+D5i Cb5i+D5i+A5i E4i G4i+E5i B4i+E5i+G5i D4i G4i+E5i B4i+E5i+G5i",B);
		 
	    measure(6);
	    
	    addNotes("G6s Bn5s C6s Db6s C6s F6s En6s A6s G6s Db7s C7s G6s Bb6q. A6q G6i",T);
	    
	    addNotes("C4i G4i+En5i B4i+E5i+G5i C4i G4i+E5i C5i+E5i+B5i F3i F4i+Db5i B4i+Dn5i+E5i F3i F4i+C5i A4i+C5i+F5i",B);
	    		
	    measure(7);
	    
		addNotes("F6q. G6i G6i D6i Eb6q. C6q.",T);
		
		addNotes("B3i F4i+Dn5i B4i+D5i+A5i Bn3i G4i+F5i D5i+F5i+G5i C4i G4i+E5i C5i+E5i+G5i An3i Gb4i+E5i C5i+E5i+G5i",B);
				
		measure(8);
		
		addNotes("B5i D7i C7i B6s A6s G6s A6s C6s D6s",T);
		tie(A,T,"E6q.","E6i");
		addNotes("D6i E6i",T);
		
		addNotes("B3i F4i+E5i B4i+E5i+Ab5i B2i F4i+D5i B4i+Ab5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
		
        measure(9);
        
        addNotes("F6q. G6q F6i F6q. C6q.",T);
        
        addNotes("B3i F4i+D5i B4i+D5i+F5i B3i F4i+D5i B4i+D5i+F5i An3i F4i+C5i C5i+F5i A3i F4i+C5i C5i+F5i",B);
        
        measure(10);    
        
        addNotes("E6i E6i E6i E6i D6s E6s F6s. E6t E6q. B5q.",T);
        
        addNotes("A3i E4i+C5i A4i+C5i+E5i A2i E4i+Cb5i A4i+Cb5i+E5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(11);
        
        addNotes("B6q. An6q G6i An5q.+F6q. B5q.+D6q.",T);
        
        addNotes("En3i En4i+Db5i B4i+Db5i+G5i E3i E4i+C5i B4i+C5i+G5i F3i F4i+Eb5i C5i+E5i+F5i G3i G4i+Dn5i B4i+D5i+G5i",B);
        
        measure(12);
        
        addNotes("G5q.+E6q. An5i+D6i A5i+C6i A5i+D6i F5i+B5i F#5i+Bn5i En5i+B5i E5i+Bb5i+A5i F5i+A5i+C6i Ab5i+D6i",T);
        
        addNotes("C2i G4i+E5i C5i+E5i+G5i F3i F4i+E5i C5i+E5i+F5i B4i+D5i An4i+D#5i G#4i G4i F4i+C5i+Eb5i B4i+F5i",B);
        
        measure(13);
        
        addNotes("G6q An5s B5s Cb6s B5s C#6s D6s G6s. F6t F6q E6i E6s F6s E6s D6s E6s F6s",T);
        
        addNotes("E3i G4i+E5i B4i+E5i+G5i E4i A4i+D5i B4i+D5i+A5i E4i G4i+E5i B4i+G5i D4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(14);
		
        addNotes("G6s Bn5s C6s Db6s C6s F6s En6s A6s G6s D7s C7s G6s Bb6q. A6q G6i",T);
        
        addNotes("C4i G4i+En5i B4i+E5i+G5i C4i G4i+E5i C5i+E5i+B5i F3i F4i+Db5i B4i+Dn5i+E5i F3i F4i+C5i A4i+C5i+F5i",B);
        
        measure(15);
        
        addNotes("F6q. G6i G6i D6i Eb6q. C6q.",T);
        
        addNotes("B3i F4i+Dn5i B4i+D5i+A5i Bn3i G4i+F5i D5i+F5i+G5i C4i G4i+E5i C5i+E5i+G5i An3i Gb4i+E5i C5i+E5i+Gb5i",B);
        
        measure(16);
        
        addNotes("F6q. G6i G6i D6i Eb6q. C6q.",T);
        
        addNotes("B3i F4i+Dn5i B4i+D5i+A5i Bn3i G4i+F5i D5i+F5i+G5i C4i G4i+E5i C5i+E5i+G5i An3i Gb4i+E5i C5i+E5i+Gb5i",B);
        
        measure(17);
        
        addNotes("B5i D7i C#7i Cn7t Bn6t Bb6t An6t Ab6t F6t D6t Cb6t B5t D6t",T);
        
        tupletFactor = 2;
        
        addNotes("G6t F6t E6t",T);
        
        tupletFactor = 1;
        
        tie(A,T,"E6q.","E6i");
        
        addNotes("D6i E6i",T);
        
        addNotes("B3i F4i+E5i B4i+E5i+A5i C3i F4i+D5i B4i+D5i+A5i E3i G4i+E5i B4i+G5i E4i G4i+E5i B4i+G5i",B);
        
        measure(18);
        
        addNotes("F6q. G6q F6i F6q. C6q.",T);
        
        addNotes("B3i F4i+D5i B4i+D5i+F5i B3i F4i+D5i B4i+D5i+F5i An3i F4i+C5i C5i+F5i A3i F4i+C5i C5i+F5i",B);
        
        measure(19);
        
        tupletFactor = 3;
        
        addNotes("E6i E6i E6i E6i",T);
        
        tupletFactor = 1;
        
        addNotes("E6i D6s E6s F6s. E6t E6q. B5q.",T);
        
        addNotes("Ab3i E4i+C5i A4i+C5i+E5i A2i E4i+Cb5i A4i+C5i+E5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(20);
        
        addNotes("B6q. An6q G6i An5q.+F6q. B5q.+D6q.",T);
        
        addNotes("En3i En4i Db5i E3i E4i+C5i B4i+C5i+G5i F3i F4i+Eb5i C5i+E5i+An5i G3i G4i+Dn5i B4i+D5i+B5i",B);
        
        measure(21);
        
        addNotes("G5q.+E6q. An5i+D6i A5i+C6i A5i+D6i F5i+G5i F#6i+Gn5i En5i+B5i E5i+Bb5i+C6i Fn5i+A5i+C6i Ab5i+D6i",T);
        
        addNotes("C2i G4i+E5i C5i+E5i+G5i F3i F4i+E5i C5i+E5i+F5i B4i+D5i An4i+D#5i G#4i Gn4i F4i+C5i+Eb5i B4i+F5i",B);
        
        measure(22);
        
        addNotes("G6q An5s B5s Cb6s B5s C#6s D6s G6s. F6t F6q",T);
        
        tie(A,T,"E6i","E6s");
        
        addNotes("F6s E6s D6s E6s F6s",T);
        
        addNotes("E3i G4i+E5i B4i+E5i+G5i E4i A4i+D5i B4i+D5i+A5i E4i G4i+E5i B4i+E5i+G5i D4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(23);
        
        addNotes("G6s Bn5s C6s Db6s C6s F6s En6s A6s G6s Db7s C7s G6s Bb6q. A6q G6i",T);
        
        addNotes("C4i G4i+En5i B4i+E5i+G5i C4i G4i+E5i C5i+E5i+B5i F3i F4i+B4i+Db5i B4i+Dn5i+E5i F3i F4i+C5i A4i+C5i+F5i",B);
        
        measure(24);
        
        addNotes("F6q. G6i G6i D6i Eb6q. C6q.",T);
        
        addNotes("B3i F4i+Dn5i B4i+D5i+A5i Bn3i G4i+F5i D5i+F5i+G5i C4i G4i+E5i C5i+E5i+G5i An3i Gb4i+E5i C5i+E5i+G5i",B);
        
        measure(25);
        
        addNotes("B5s D7i C#7s Cn7s Bn6t Bb6s An6s Ab6t An5t B5t Bn5t C6t C#6t D6t",T);
        		
        tupletFactor = 2;
        
        addNotes("G6t F6t E6t",T);
        
        tupletFactor = 1;
        
        addNote("E6h.",A,T);
        
        addNotes("B3i F4i+E5i B4i+E5i+Ab5i B2i F4i+D5i B4i+D5i+A5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(26);
        
        addNotes("E6q. F6i E6i F6i G6h.",T);
        
        addNotes("E3i A4i+Cb5i+E5i C5i+E5i+A5i E4i A4i+C5i+E5i C5i+E5i+A5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(27);
        
        tie(A,T,"E6q.","E6s");
        
        addNotes("F6s E6s F6s E6s F6s G6q E6i E7i D7i C7i",T);
        
        addNotes("E3i A4i+Cb5i+E5i E4i A4i+C5i+E5i C5i+E5i+A5i E3i G4i+B4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(28);
        
        addNotes("B6q An6i Ab6i C6i D6i F6s E6s D6s E6s G7i F7s E7s D7s C7s",T);
        
        addNotes("E4i F4i+D5i B4i+Ab5i E4i F4i+D5i B4i+A5i E4i G4i+E5i B4i+G5i An3i F4i+E5i C5i+E5i+F5i",B);
        
        measure(29);
        
        addNotes("C7i B6i A6i B6s A6s A6s G6s G6s. F6t E6h.",T);
        
        addNotes("B3i F4i+E5i B4i+E5i+Ab5i B2i F4i+D5i B4i+D5i+A5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(30);
        
        addNote("E6q.",A,T);
        
        tupletFactor = 7;
        
        addNotes("E6s F6s E6s F6s E6s F6s E6s F6s G6q.",T);
        
        tupletFactor = 1;
        
        addRest("q",T);
        addRest("i",T);
        
        addNotes("A2i E4i+A4i+Cb5i A4i+C5i+E5i C5i+E5i+A5i A4i+C5i+E5i E4i+A4i+C5i E3i G4i+E5i B4i+E5i+G5i E4i G4i+E5i B4i+E5i+G5i",B);
        
        measure(31);
        
        addNotes("E6i A5s B5s A5s G5s A5s Cb6s E6s A6s E7s",T);
        
        addRest("t",T);
        
        addNotes("F7t G7i E7i E7q+E8q D7i+D8i Cn7i+Cn8i",T);
        
        addNotes("A2i E4i+B4i+Cb5i A4i+C5i+E5i E4i+A4i+C5i B4i+C5i+E5i E4i+A4i+C5i E3i G4i+E5i B4i+E5i+G5i An3i F4i+E5i C5i+E5i+F5i",B);
        
        measure(32);
        
        addNotes("Cb7i+Cb8i B6i+B7i A6i+A7i Ab6i+Ab7i G6i+G7i D6i+D7i F6i+E7i E7q.+E8q. F7i+F8i Cn7i+Cn8i",T);
        
        addNotes("B3i F4i+B4i+E5i B4i+E5i+Ab5i Bn3i G4i+F5i D5i+F5i+G5i C4i G4i+E5i C5i+F5i An3i C5i+E5i C5i+E5i+F5i",B);
        
        addRest("i",10,B,B);
        
        addNote("D4q",A,B,B);
        
        measure(33);
        
        addNotes("Cb7h.+Cb8h.",T);
        
        addRest("i",2,T);
        
        addNotes("B6h.+B7h.",T);
        
        for (int counter=0;counter<8;counter++)
        	addNotes("Cb8s B8s C8s A7s",T);
        
        addNotes("B2i B3i F4i Ab4i D5i B4i F5i A5i D6h.",B);
        
        addRest("s",32,B);
        
        measure(34);
        
        for (int counter=0;counter<4;counter++)
        	addNotes("Cb8s B7s C8s A7s",T);
        
        addNotes("Cb8s B7s Bb7s G7s B7s A7s Ab7s G7s F7s D7s E7s C8s B6i A6i C6i D6i",T);
        
        addRest("s",28,B);
        addRest("i",4,B);
        
        measure(35);
        
        addNotes("G5i+E6i B5i G6i G5i+E6i B5i G6i B5i+E6i B5i G6i G5i+E6i B5i G6i",T);
        
        addNotes("E3i B4i B3i E4i B4i B3i E3i B4i B3i E4i B4i B3i",B);
        
        measure(36);
        
        addNotes("G5q.+E6q. B4q.+E7q. B4h.+E5h.",T);
        
        addNotes("E4q.+B4q. D5q.+B5q. E3h.+B3h.",B);
        
        measure(37);
        
        
        
		

	}

}
