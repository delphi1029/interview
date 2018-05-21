package dl.datastructures.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatedCharacter {
	
	
	public Character findFirstNonRepeatedCharacter(String str) {
		List<Character> list = new ArrayList<>();
		Set<Character> set = new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			Character c = str.charAt(i);
			if(!set.contains(c)) {
				list.add(c);
				set.add(c);
			} else {
				list.remove(c);
			}
		}
		return list.get(0);
	}

}
