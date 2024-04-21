Task 1: Constructors
====================
Implement a Matrix class that has a constructor which initializes the dimensions of a matrix and a method to fill the matrix with values.


   public class Matrix 
     {
      private int rows;
      private int cols;
      private int[][] data;
      public Matrix(int rows, int cols) 
       {
        if (rows <= 0 || cols <= 0) 
         {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
       }
        public void fillMatrix(int[][] values) 
         {
        if (values.length != rows || values[0].length != cols) 
           {
            throw new IllegalArgumentException("Input values dimensions must match matrix dimensions");
           }
           for (int i = 0; i<rows; i++) 
           {
            for (int j = 0; j<cols; j++) 
             {
                data[i][j] = values[i][j];
            }
        }
    }
        
    public void displayMatrix() 
        {
        for (int i = 0; i<rows; i++) 
          {
            for (int j = 0; j<cols; j++) 
              {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
      {
        Matrix matrix = new Matrix(2, 3);
        int[][] values = {{1, 2, 3}, {4, 5, 6}};
         matrix.fillMatrix(values);
         System.out.println("The matrix is:");
         matrix.displayMatrix();
    }
}
