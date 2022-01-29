public class LongestCommonPrefix {

    public String findLongestCommonPrefix(ArrayList<String> strings) {
        // get the longest prefix as just the first one

        //Step 3 code fixed by adding try and catch if the arraylist is empty
        String prefix;
        try {
            prefix = strings.get(0);
        }
        catch (Exception e){
            return "";
        }
            // loop through all of the strings
            for (String string : strings) {
                // do a temp string builder to keep track of current prefix
                StringBuilder tempPrefix = new StringBuilder();
                // loop through the length of the prefix (the longest prefix can't be longer than the first string
                for (int i = 0; i < prefix.length();  i++) {
                    // make sure you aren't going out of bounds
                    if (string.length() > i) {
                        // compare them
                        if (prefix.charAt(i) == string.charAt(i)) {
                            // add if the match
                            tempPrefix.append(prefix.charAt(i));
                        } else {
                            // break out of the loop if they don't
                            break;
                        }
                    }
                }
                // update the prefix
                prefix = tempPrefix.toString();
            }

        // return the prefix
        return prefix;
    }
}
