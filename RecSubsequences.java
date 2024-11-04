class RecSubsequences {
    
    public static void subSequences(String str, int index, String newString)
    {
        if(index == str.length())
        {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        
        //to be
        subSequences(str, index+1, newString+currentChar);
        
        //to not be
        subSequences(str, index+1, newString);  
    }
    
    public static void main(String[] args) 
    {
        String str = "abc";
        subSequences(str, 0, "");
    }
}
