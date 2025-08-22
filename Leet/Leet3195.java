package MY_DSA.Leet;

public class Leet3195 {
    public int minimumArea(int[][] grid) {
        int ans=0;
        int row=grid.length;
        int col=grid[0].length;

        boolean[] gridrow=new boolean[row];
        boolean[] gridcol=new boolean[col];
        for(int i=0;i<row;i++){
            gridrow[i]=false;
        }
        for(int i=0;i<col;i++){
            gridcol[i]=false;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    gridrow[i]=true;
                    gridcol[j]=true;
                }
            }
        }

        int minrow=0,mincol=0;
        int srs=row,sre=0;
        int scs=col,sce=0;
        for(int i=0;i<row;i++){
            if(gridrow[i]==true ){
                srs=Math.min(srs,i);
                sre=Math.max(sre,i);
            }
        }
        minrow=sre-srs+1;
        for(int i=0;i<col;i++){
            if(gridcol[i]==true){
                scs=Math.min(scs,i);
                sce=Math.max(sce,i);
            }
        }
        mincol=sce-scs+1;

        return minrow*mincol;
    }
}
