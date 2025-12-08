class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        if (operations.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                list.remove(j - 1);
                j--;
            } else if (operations[i].equals("D")) {
                list.add(2 * list.get(j - 1));
                j++;
            } else if (operations[i].equals("+")) {
                list.add(list.get(j - 1) + list.get(j - 2));
                j++;
            } else {
                int num = Integer.parseInt(operations[i]);
                list.add(num);
                j++;
            }

        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}