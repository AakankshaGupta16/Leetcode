import java.util.*;

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> ans = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordList);

        if (!wordSet.contains(endWord)) return ans;

        Map<String, List<String>> reverse = new HashMap<>();

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> currentLevelVisited = new HashSet<>();
        boolean found = false;

        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            currentLevelVisited.clear();

            for (int s = 0; s < size; s++) {
                String word = queue.poll();

                char[] arr = word.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    char original = arr[i];

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        arr[i] = ch;
                        String next = new String(arr);

                        if (wordSet.contains(next)) {

                            reverse.computeIfAbsent(next, k -> new ArrayList<>()).add(word);

                            if (next.equals(endWord)) {
                                found = true;
                            }

                            if (!currentLevelVisited.contains(next)) {
                                queue.add(next);
                                currentLevelVisited.add(next);
                            }
                        }
                    }
                    arr[i] = original;
                }
            }

            wordSet.removeAll(currentLevelVisited);
        }

        if (!found) return ans;

        List<String> path = new ArrayList<>();
        path.add(endWord);

        dfs(endWord, beginWord, reverse, path, ans);

        return ans;
    }

    private void dfs(String word, String beginWord,
                     Map<String, List<String>> reverse,
                     List<String> path,
                     List<List<String>> ans) {

        if (word.equals(beginWord)) {
            List<String> temp = new ArrayList<>(path);
            Collections.reverse(temp);
            ans.add(temp);
            return;
        }

        if (!reverse.containsKey(word)) return;

        for (String prev : reverse.get(word)) {
            path.add(prev);
            dfs(prev, beginWord, reverse, path, ans);
            path.remove(path.size() - 1);
        }
    }
}