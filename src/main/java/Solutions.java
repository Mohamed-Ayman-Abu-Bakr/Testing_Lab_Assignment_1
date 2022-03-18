import java.util.Scanner;

public class Solutions {
    public String solve_Watermelon(int x){
        if(x<=2||x%2==1){
            return "NO";
        }else{
            return "YES";
        }
    }
    public String solve_Young_Physicist(int[][] arr){
        int x =0,y=0,z=0;
        for(int i=0;i<arr.length;i++){
            x+=arr[i][0];
            y+=arr[i][1];
            z+=arr[i][2];
        }
        if(x==0&&y==0&&z==0)return "YES";
        else return "NO";
    }
}
