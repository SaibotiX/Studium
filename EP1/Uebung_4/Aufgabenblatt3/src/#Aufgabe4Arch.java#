public class asdf {

    public static boolean isStartAndEndSeq(String text, String sequence) {
	int textLength = text.length();
	int sequenceLength = sequence.length();
	int moduloTextLength = textLength % sequenceLength;
	boolean validateEnd = true;

	if(textLength != 0){
	    validateEnd = isStartAndEndSeq(text.substring(1), sequence);
	    if(textLength <= sequenceLength){
		
		if(text.charAt(0) == sequence.charAt(sequenceLength - textLength) && validateEnd){
		    validateEnd = true;
		}
		else{
		    return false;
		}
	    }

	    char currTextChar = text.charAt(0);
	    int currSequChar = ((sequence.length() - text.length() % sequence.length() - 1) + 1) % sequenceLength;

	    System.out.println(currTextChar + " " + sequence.charAt(currSequChar));

	    validateEnd = true;
	    if(textLength > sequenceLength && validateEnd){
		
		
		if(currTextChar == sequence.charAt(currSequChar)){
		    validateEnd = true;
		}
		else{
		    validateEnd = false;
		}
	    }
	    
	}
	
	return validateEnd;
    }

    public static void main(String[] args) {
	System.out.println(isStartAndEndSeq("ABBAB", "AB"));
//
//        System.out.println(isStartAndEndSeq("", "1"));
//        System.out.println(isStartAndEndSeq("AA", "A"));
//        System.out.println(isStartAndEndSeq("ABBBA", "AB"));
//        System.out.println(isStartAndEndSeq("ottootto", "otto"));
//        System.out.println(isStartAndEndSeq("otto", "otto"));
//        System.out.println(isStartAndEndSeq("ottotto", "otto"));
//        System.out.println(isStartAndEndSeq("ottoottt", "otto"));
//        System.out.println(isStartAndEndSeq("test1234test", "test"));
//        System.out.println(isStartAndEndSeq("NEN", "NEEN"));
//
//        //DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODE.
//        //**********************************************************************
//        assert (isStartAndEndSeq("", "1") == false);
//        assert (isStartAndEndSeq("AA", "A") == true);
//        assert (isStartAndEndSeq("ABBAB", "AB") == true);
//        assert (isStartAndEndSeq("ABBBA", "AB") == false);
//        assert (isStartAndEndSeq("ottootto", "otto") == true);
//        assert (isStartAndEndSeq("otto", "otto") == false);
//        assert (isStartAndEndSeq("ottotto", "otto") == false);
//        assert (isStartAndEndSeq("ottoottt", "otto") == false);
//        assert (isStartAndEndSeq("test1234test", "test") == true);
//        assert (isStartAndEndSeq("NEN", "NEEN") == false);
//        //**********************************************************************
    }
}

//
//	    if(textLength <= sequenceLength){
//		
//		System.out.println(text.charAt(0) + " " + sequence.charAt(sequenceLength - textLength));
//		
//		if(text.charAt(0) == sequence.charAt(sequenceLength - textLength) && validate){
//		    validate = true;
//		}
//		else{
//		    validate = false;
//		}
//	    }
