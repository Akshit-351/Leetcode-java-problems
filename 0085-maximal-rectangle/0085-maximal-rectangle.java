class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int heights[] = new int[cols];
        int maxArea = 0;
        for(int i = 0; i<rows; i++){
            //update histogram
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == '1'){
                    heights[j]++;
                }else{
                    heights[j] = 0;
                }
            }
            //reuse lc 84
            maxArea = Math.max(maxArea , largestRectangleArea(heights));
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] Left = new int[n];
        int[] Right = new int[n];
        // Previous smaller index
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                Left[i] = -1;
            }else{
                Left[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = n-1; i>= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                Right[i] = n;
            }else{
                Right[i] = st.peek(); 
            }
            st.push(i);
        }
        int max = 0;
        for(int i = 0; i<n; i++){
            int width = Right[i] - Left[i] -1;
            int area = heights[i] * width;
            max = Math.max(max,area);
        }
        return max;
    }
}