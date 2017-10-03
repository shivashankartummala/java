import java.util.*;
import org.apache.commons.lang3.StringUtils;
/*
* Reference : https://www.hackerrank.com/challenges/ctci-ransom-note
*/


public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
       String[] m = StringUtils.split(magazine); 
       String[] n = StringUtils.split(note);
        magazineMap= new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
       
        for (String mword : m){
            if(magazineMap.containsKey(mword)) magazineMap.put(mword, magazineMap.get(mword)+1);
            else magazineMap.put(mword, 1);            
        }
        for (String nword : n){
            if(noteMap.containsKey(nword)) noteMap.put(nword, noteMap.get(nword)+1);
            else noteMap.put(nword, 1);            
        }
        
    }
    
    public boolean solve() {
        for(String s : new ArrayList<String>(noteMap.keySet())){
            if (noteMap.get(s) > magazineMap.get(s)) return false;
            }
            return true;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
