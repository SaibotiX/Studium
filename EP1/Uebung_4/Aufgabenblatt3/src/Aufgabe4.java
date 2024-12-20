public class Aufgabe4 {


	public static boolean isStartAndEndSeq(String text, String sequence) {
		int textLength = text.length() - 1;
		int sequenceLength = sequence.length() - 1;
		boolean last = false;
		boolean first = false;

		if(textLength < sequenceLength * 2){
		    return false;
		}

		if(text.isEmpty()){
		}
		else{
		    
		    last = isStartAndEndSeq(text.substring(1), sequence);

		    if(textLength <= sequenceLength){
			    
			if(text.charAt(0) == sequence.charAt(sequenceLength - textLength)){
			    last = true;
			}
			else{
			    last = false;
			}
		    }
			
	
		}
		return last;
	}

	public static void main(String[] args) {
		//	System.out.println(isStartAndEndSeq("", "1"));
		System.out.println(isStartAndEndSeq("AB", "AB"));
//	System.out.println(isStartAndEndSeq("AA", "A"));
//	System.out.println(isStartAndEndSeq("ABBBA", "AB"));
//	System.out.println(isStartAndEndSeq("ottootto", "otto"));
//	System.out.println(isStartAndEndSeq("otto", "otto"));
//	System.out.println(isStartAndEndSeq("ottotto", "otto"));
//	System.out.println(isStartAndEndSeq("ottoottt", "otto"));
//	System.out.println(isStartAndEndSeq("test1234test", "test"));
//	System.out.println(isStartAndEndSeq("NEN", "NEEN"));

		//DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODE.
		//**********************************************************************
		assert (isStartAndEndSeq("", "1") == false);
		assert (isStartAndEndSeq("AA", "A") == true);
		assert (isStartAndEndSeq("ABBAB", "AB") == true);
		assert (isStartAndEndSeq("ABBBA", "AB") == false);
		assert (isStartAndEndSeq("ottootto", "otto") == true);
		assert (isStartAndEndSeq("otto", "otto") == false);
		assert (isStartAndEndSeq("ottotto", "otto") == false);
		assert (isStartAndEndSeq("ottoottt", "otto") == false);
		assert (isStartAndEndSeq("test1234test", "test") == true);
		assert (isStartAndEndSeq("NEN", "NEEN") == false);
		//**********************************************************************
	}
}
