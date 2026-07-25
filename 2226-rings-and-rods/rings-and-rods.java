class Solution {
    public int countPoints(String rings) {
        int count = 0;

        // Iterate through every possible rod number from '0' to '9'
        for (char rod = '0'; rod <= '9'; rod++) {
            
            boolean hasR = false;
            boolean hasG = false;
            boolean hasB = false;

            // Scan the rings string for the current rod
            for (int i = 1; i < rings.length(); i += 2) {
                
                // If the rod in the string matches the rod we are currently checking
                if (rings.charAt(i) == rod) {
                    char color = rings.charAt(i - 1);
                    
                    // Update our boolean flags using just if/else if
                    if (color == 'R') {
                        hasR = true;
                    } else if (color == 'G') {
                        hasG = true;
                    } else if (color == 'B') {
                        hasB = true;
                    }
                }
            }

            // If we found all three colors for this specific rod, increase count
            if (hasR && hasG && hasB) {
                count++;
            }
        }

        return count;
    }
}