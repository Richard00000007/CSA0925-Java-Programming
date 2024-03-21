class Reverse
{  
    public static void main(String[] args) {  
        String input = "Temple";  
        String reversed = "";   
        for (int i = input.length() - 1; i >= 0; i--) {  
            reversed += input.charAt(i);  // Concatenate each character to the reversed string  
        }   
        System.out.println("Original String: " + input);  
        System.out.println("Reversed String: " + reversed);  
    }  
}  