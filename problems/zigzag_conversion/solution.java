class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) {
			return s;
		}
		StringBuilder[] arr = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++) {
			arr[i] = new StringBuilder();
		}
		int direction = 1;
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[index].append(ch);
			if (index == 0) {
				direction = 1;
			} else if (index == numRows - 1) {
				direction = -1;
			}
			index += direction;
		}
		StringBuilder zigzag = new StringBuilder();
		for (StringBuilder str : arr) {
			zigzag.append(str);
		}
		return zigzag.toString();
    }
}