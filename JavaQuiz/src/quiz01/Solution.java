package quiz01;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
        	arr[i] += my_string.charAt(i);
        }
        
        for(int i = 0; i < arr.length; i++) {
        	
        	char abc = 65;
        	
        	for(int j = 0; j<=25; j++) {
        		
        		if(arr[i]==abc) {
        			answer[j]++;	
        		}
        		abc++;
        	}
        	
        	char abc2 = 97;
        	
        	for(int j =26; j<=51; j++) {
        	
	        	if(arr[i] == abc2) {
	        		answer[j]++;
	        	}
	        	abc2++;
        	}
        }
        
        return answer;
    }
}








	
	
