package javatest;

import java.util.Scanner;

public class Task3 {
    public static String yesOrNo(String a)
    {
        a = a.replaceAll("\\s+","");
        int count =0;
        String YesOrNo="NO";
        String[][] array = new String[10][10];
            for(int x=0; x<10;x++){
                for(int y=0; y<10;y++){
                    String a_letter = Character.toString(a.charAt(count));
                    array[x][y] = a_letter;
                    count++;
            }
        }

        for(int x=0; x<10; x++){
            for(int y=0; y<10; y++){
                if(y+4<10 && array[x][y].equals("X") && array[x][y+1].equals("X") && array[x][y+2].equals("X") && array[x][y+3].equals("X") && array[x][y+4].equals(".") ||
                   y+4<10 && array[x][y].equals("X") && array[x][y+1].equals("X") && array[x][y+2].equals("X") && array[x][y+3].equals(".") && array[x][y+4].equals("X") ||
                   y+4<10 && array[x][y].equals("X") && array[x][y+1].equals("X") && array[x][y+2].equals(".") && array[x][y+3].equals("X") && array[x][y+4].equals("X") ||
                   y+4<10 && array[x][y].equals("X") && array[x][y+1].equals(".") && array[x][y+2].equals("X") && array[x][y+3].equals("X") && array[x][y+4].equals("X") ||
                   y+4<10 && array[x][y].equals(".") && array[x][y+1].equals("X") && array[x][y+2].equals("X") && array[x][y+3].equals("X") && array[x][y+4].equals("X") ||
                     x+4<10 &&array[x][y].equals("X") && array[x+1][y].equals("X") && array[x+2][y].equals("X") && array[x+3][y].equals("X") && array[x+4][y].equals(".") ||
                     x+4<10 && array[x][y].equals("X") && array[x+1][y].equals("X") && array[x+2][y].equals("X") && array[x+3][y].equals(".") && array[x+4][y].equals("X") ||
                     x+4<10 && array[x][y].equals("X") && array[x+1][y].equals("X") && array[x+2][y].equals(".") && array[x+3][y].equals("X") && array[x+4][y].equals("X") ||
                     x+4<10 && array[x][y].equals("X") && array[x+1][y].equals(".") && array[x+2][y].equals("X") && array[x+3][y].equals("X") && array[x+4][y].equals("X") ||
                     x+4<10 && array[x][y].equals(".") && array[x+1][y].equals("X") && array[x+2][y].equals("X") && array[x+3][y].equals("X") && array[x+4][y].equals("X") ||
                        x+4<10 && y+4<10 && array[x][y].equals("X") && array[x+1][y+1].equals("X") && array[x+2][y+2].equals("X") && array[x+3][y+3].equals("X") && array[x+4][y+4].equals(".") ||
                        x+4<10 && y+4<10 && array[x][y].equals("X") && array[x+1][y+1].equals("X") && array[x+2][y+2].equals("X") && array[x+3][y+3].equals(".") && array[x+4][y+4].equals("X") ||
                        x+4<10 && y+4<10 && array[x][y].equals("X") && array[x+1][y+1].equals("X") && array[x+2][y+2].equals(".") && array[x+3][y+3].equals("X") && array[x+4][y+4].equals("X") ||
                        x+4<10 && y+4<10 && array[x][y].equals("X") && array[x+1][y+1].equals(".") && array[x+2][y+2].equals("X") && array[x+3][y+3].equals("X") && array[x+4][y+4].equals("X") ||
                        x+4<10 && y+4<10 && array[x][y].equals(".") && array[x+1][y+1].equals("X") && array[x+2][y+2].equals("X") && array[x+3][y+3].equals("X") && array[x+4][y+4].equals("X") ||
                          x-4>0 && x+4<10 && y+4<10 && array[x][y].equals("X") && array[x-1][y+1].equals("X") && array[x-2][y+2].equals("X") && array[x-3][y+3].equals("X") && array[x-4][y+4].equals(".") ||
                          x-4>0 && x+4<10 && y+4<10 && array[x][y].equals("X") && array[x-1][y+1].equals("X") && array[x-2][y+2].equals("X") && array[x-3][y+3].equals(".") && array[x-4][y+4].equals("X") ||
                          x-4>0 && x+4<10 && y+4<10 && array[x][y].equals("X") && array[x-1][y+1].equals("X") && array[x-2][y+2].equals(".") && array[x-3][y+3].equals("X") && array[x-4][y+4].equals("X") ||
                          x-4>0 && x+4<10 && y+4<10 && array[x][y].equals("X") && array[x-1][y+1].equals(".") && array[x-2][y+2].equals("X") && array[x-3][y+3].equals("X") && array[x-4][y+4].equals("X") ||
                          x-4>0 && x+4<10 && y+4<10 && array[x][y].equals(".") && array[x-1][y+1].equals("X") && array[x-2][y+2].equals("X") && array[x-3][y+3].equals("X") && array[x-4][y+4].equals("X")
                )
                {
                   YesOrNo = YesOrNo = "YES";
                }
            }
        }
        return YesOrNo;
    }
}
