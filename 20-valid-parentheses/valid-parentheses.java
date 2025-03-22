class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> temp = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (temp.empty()) {
                    return false;
                }
                char top = temp.pop();
                if (map.get(c) != top) {
                    return false;
                }

            } else {
                temp.push(c);
            }

        }
        return temp.empty();
    }
}