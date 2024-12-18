class RecStringDuplicate {
    public static boolean[] map = new boolean[26];
   
    public static void removeDuplicate(String str, int index, String newString)
    {
        if(index == str.length()) 
        {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar-'a'] == true)
        {
            removeDuplicate(str, index+1, newString);
        }
        else
        {
            newString += currentChar;
            map[currentChar-'a'] = true;
            
            removeDuplicate(str, index+1, newString);
        }
    }
    public static void main(String[] args) 
    {
        String str = "abbcddeff";
        removeDuplicate(str, 0, "");
    }
}
