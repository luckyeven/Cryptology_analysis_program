package KeyWordCipher;

/**
* <h1>Text</h1>
* The Text implements an interface of text.
*
* @author shifeng song ssong094@uottawa.ca
* @version 1
* @since 2020-08-03
*/


public class Text{
	private String text = "";
	private String key;
	private char chr ='a';

	public  Text(){
		for(char a='a';a<='z';a++){                 //             ***constructor***         *****
			text += String.valueOf(a);               //                                           *
		}  
		                                            //                                       *****
		
	}

	public  Text(String key, char chr){
		this.key = key;
		this.chr = chr;

		for(char a='a';a<='z';a++){                 //             ***constructor***         *****
			text += String.valueOf(a);               //                                           *
		}                                           //                                       *****
		
		String ded = deduplication(key);
	
		substitution(ded);


	}

   /**
   * do substitution with given text, keyword and 
   * starting point. 
   * Ex. origin text"abcdefghizklmnopqrstuvwxyz" 
   * key workd "next" Starting at"k" should result
   * "nextabcdfghijklmopqrsuvwyz"
   *
   * @param ded  the keyword
   */

	private void substitution(String ded){
		char[] tmp1 = text.toCharArray();  // make a deep copy of text
		char[] tmp2 = new char[26];
		char[] dedchr = ded.toCharArray();
		int indexOfstart=0;                  // starting point
		




		for(int i = 0; i< 26;i++){          //find index of startpotin
			if(tmp1[i] == chr){
				indexOfstart = i;
				break;
			}
		}

		
	
		for(int i=0; i<ded.length();i++){		//add ded into tmp2 ,and deledt from tmp1
			if(indexOfstart+i>25){
				tmp2[indexOfstart+i -26]= dedchr[i];
			}else{

				tmp2[indexOfstart+i] = dedchr[i];
			}
			
			for(int j =0;j<26;j++){
				if(tmp1[j] == dedchr[i]){
					tmp1[j] ='0';
				}
			}
		}	
		
	    int count = indexOfstart+ded.length();
	    if(count <26){
	    	count = count;
	    }else if(count ==26){
	    	count = 0;
	    }else{
	    	count = count - 26;
	    }

		for(int i=0;i< 26;i++){
			if(tmp1[i]!='0'){
				if(count <26){					
					tmp2[count] =tmp1[i];
					tmp1[i] = '0';					
					if(count == 25){
						count =0;
					}else{
						count++;
					}				
				}
			}
		}
	
		text ="";
		for(char element: tmp2){
			text+=element;
		}

	}

	
	/**
	* deduplicate keyword. 
	*
	* @param key the keyword given by user
	* @return return a deduplicated string
	*/
	private String deduplication(String key){
		StringBuffer sb = new StringBuffer();

		for(int i =0;i<key.length();i++){

			char charKey = key.charAt(i);
			int firstPosition = key.indexOf(charKey);
			int lastPosition = key.lastIndexOf(charKey);

			if(firstPosition == lastPosition || firstPosition == i){
				sb.append(charKey);
			}
		}
		return sb.toString();
	}

	public String getText(){
		char[] tmp = text.toCharArray();
		String str = String.valueOf(tmp[0]);
		for(int i=1;i<26;i++){
			str+="   "+String.valueOf(tmp[i]);
		}
		return str;
		                                         
	} 
}