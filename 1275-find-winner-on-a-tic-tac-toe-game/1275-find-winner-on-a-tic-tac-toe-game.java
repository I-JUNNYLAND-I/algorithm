class Solution {
    public String tictactoe(int[][] moves) {
        String[][] board = new String[3][3];
        boolean turnA = true;
        for(int[] move : moves) {
            if (turnA) {
                board[move[0]][move[1]] = "A";
            } else {
                board[move[0]][move[1]] = "B";
            }
            turnA = !turnA;
        }
        String result = isEnd(board);
        if (result.equals("Draw") && moves.length < 9) return "Pending";
        return result;
    }
    
    private String isEnd(String[][] board) {
        String candidate;
        candidate = board[0][0];
        if (candidate != null 
            && candidate.equals(board[0][1]) 
            && candidate.equals(board[0][2])) return candidate;
        
        if (candidate != null 
            && candidate.equals(board[1][0]) 
            && candidate.equals(board[2][0])) return candidate;
        
        if (candidate != null 
            && candidate.equals(board[1][1]) 
            && candidate.equals(board[2][2])) return candidate;
        
        candidate = board[1][1];
        if (candidate != null 
            && candidate.equals(board[0][0]) 
            && candidate.equals(board[2][2])) return candidate;
        
        if (candidate != null 
            && candidate.equals(board[0][2]) 
            && candidate.equals(board[2][0])) return candidate;
        
        if (candidate != null 
            && candidate.equals(board[1][0]) 
            && candidate.equals(board[1][2])) return candidate;
        
        if (candidate != null 
            && candidate.equals(board[0][1]) 
            && candidate.equals(board[2][1])) return candidate;
        
        candidate = board[2][2];
        if (candidate != null 
            && candidate.equals(board[0][0]) 
            && candidate.equals(board[1][1])) return candidate;
        
        if (candidate != null 
            && candidate.equals(board[2][0]) 
            && candidate.equals(board[2][1])) return candidate;
        
        if (candidate != null 
            && candidate.equals(board[0][2]) 
            && candidate.equals(board[1][2])) return candidate;
        
        return "Draw";
    }
}