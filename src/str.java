

public class str {

    static String findSubString(String str, String pat)
    {
        int no_of_chars = 256;
        int len1 = str.length();
        int len2 = pat.length();
        if (len1 < len2) {
            return "Not Found";
        }

        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];

        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;

        int start = 0, start_index = -1,
                min_len = Integer.MAX_VALUE;

        int count = 0;
        for (int j = 0; j < len1; j++) {


            hash_str[str.charAt(j)]++;

            if (hash_str[str.charAt(j)]
                    <= hash_pat[str.charAt(j)])
                count++;


            if (count == len2) {

                // Try to minimize the window
                while (hash_str[str.charAt(start)]
                        > hash_pat[str.charAt(start)]
                        || hash_pat[str.charAt(start)]
                        == 0) {

                    if (hash_str[str.charAt(start)]
                            > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }

                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1) {

            return "Not Found";
        }

        return str.substring(start_index,
                start_index + min_len);
    }


    public static void main (String[] args)
    {

        String str = "this is a test string";
        String pat = "tstr";
        System.out.println(findSubString(str, pat));
    }
}