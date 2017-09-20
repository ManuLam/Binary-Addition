public class DuplicateEncoder {
	static String encode(String word){
  word = word.toLowerCase();
  char[] array = word.toCharArray();
  String temp = "";

  for(int i=0; i<word.length(); i++) {
    int count = 0;
  for(int j=0; j<array.length; j++) {

    if(word.charAt(i)==array[j]) {
        count++;
        if(count>1) {
        temp += ")";
        break;
            }
          }
      }
      if(count==1) temp += "(";
    }
    word = temp;
    return word;

  }

}