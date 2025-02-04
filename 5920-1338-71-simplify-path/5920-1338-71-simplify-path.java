class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("..")) { 
                if (!stack.isEmpty()) {
                    stack.pop(); // Go back one directory
                }
            } else if (!part.isEmpty() && !part.equals(".")) { 
                stack.push(part); // Only push valid directory names
            }
        }

        return "/" + String.join("/", stack);
    }
}
