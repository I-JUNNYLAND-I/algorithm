class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int num : students) {
            q.add(num);
        }
        int index = 0;
        while (true) {
            int target = sandwiches[index];
            if (q.peek() == target) {
                index++;
                q.poll();
                if (q.size() == 0) return 0;
            } else {
                if (q.contains(target)) {
                    q.add(q.poll());
                } else {
                    break;
                }
            }
        }
        return q.size();
    }
}

/**
    학생 1 1 0 0 1  샌드위치 0 0 0 1 1
    
    ...
    
    학생 0 0 1 1 1  샌드위치 0 0 0 1 1
    
    학생 0 1 1 1    샌드위치 0 0 1 1
    
    학생 1 1 1      샌드위치 0 1 1
    
    
*/