class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();

        for (String query : queries) {
            for (String word : dictionary) {

                int diff = 0;

                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != word.charAt(i)) {
                        diff++;
                    }

                    // Early break if more than 2 edits needed
                    if (diff > 2) break;
                }

                // Valid match found
                if (diff <= 2) {
                    result.add(query);
                    break; // Move to next query
                }
            }
        }

        return result;
    }
}