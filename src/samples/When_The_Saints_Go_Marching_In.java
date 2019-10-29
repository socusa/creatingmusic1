package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class When_The_Saints_Go_Marching_In extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		setTempo(240);
		
		measure(0);
		
		addNotes("C5q E5q F5q",T);
		
		addRest("q",3,B);
		
		measure(1);
		
		addNote("G5w",A,T);
		
		addRest("h",B);
		addNotes("F4h+A4h",B);
		
		measure(2);
		
		addRest("q",T);
		addNotes("C5q E5q F5q",T);
		
		addNotes("E4q+G4q",B);
		addRest("q",3,B);
		
		measure(3);
		
		addNote("G5w",A,T);
		
		addRest("h",B);
		addNotes("F4h+A4h",B);
		
		measure(4);
		
		addRest("q",T);
		addNotes("C5q E5q F5q",T);
		
		addNotes("E4q+G4q",B);
		addRest("q",3,B);
		
		measure(5);
		
		addNotes("G5h E5h",T);
		
		addRest("q",B);
		addNotes("E4q+G4q",B);
		addRest("q",B);
		addNotes("E4q+G4q",B);
		
		measure(6);
		
		addNotes("C5h E5h",T);
		
		addRest("q",B);
		addNotes("E4q+G4q",B);
		addRest("q",B);
		addNotes("E4q+G4q",B);
		
		measure(7);
		
		tie(A,T,"D5w","D5h");
		addNotes("F5q D5q",T);
		
		addRest("h",B);
		addNotes("F4h+G4h F4q+G4q",B);
		addRest("q",3,B);
		
		measure(8);
		
		addNotes("C5h. C5q E5h G5h",T);
		
		addRest("h",B);
		tie(D,B,"E4h","E4w");
		tie(A,B,"G4h","G4w");
		
		measure(9);
		
		addNotes("G5q E5h.",T);
		
		addRest("q",B);
	    addNotes("D4q D4q E4q",B);
	    
	    measure(10);
	    
	    addRest("h",T);
	    addNotes("E5q F5q",T);
	    
	    addNote("F4h",A,B);
	    addRest("q",2,B);
	    
	    measure(11);
	    
	    addNotes("G5h E5h",T);
	    
	    addRest("q",B);
	    addNotes("E4q+G4q",B);
	    addRest("q",B);
	    addNotes("E4q+G4q",B);
	    
	    measure(12);
	    
	    addNotes("D5h D5h",T);
	    
	    addRest("q",B);
	    addNotes("F4q+G4q",B);
	    addRest("q",B);
	    addNotes("F4q+G4q",B);
	    
	    measure(13);
	    
	    tie(A,T,"C5w","C5q");
	    addRest("q",T);
	    addRest("h",T);
	    
	    addRest("h",B);
	    addNotes("F4h+G4h E4q+G4q",B);
	    addRest("q",B);
	    addRest("h",B);
	    
	    measure(14);
		
		

	}

}
