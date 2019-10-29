package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class Take_Me_Out_To_The_Ballgame extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		setTempo(240);
		
		addRest("q",T);
		addNote("G5q",A,T);
		

	}

}
