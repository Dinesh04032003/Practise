class arr 
{
    arr()
    {
        int n[][]=new int[3][4];
        n[0][0]=1;
        n[0][1]=4;
        n[0][2]=7;
        n[0][3]=8;
        n[1][1]=0;
        n[1][2]=9;
        n[1][3]=4;
        n[1][0]=6;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(n[i][j]);
            }
        }
    }
}
class multidimen
{
public static void main (String[] args) 
    {
        arr obj=new arr();
    }
}