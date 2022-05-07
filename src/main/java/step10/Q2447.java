package step10;

import java.io.IOException;

import Function.*;

public class Q2447 {
    static char[][] starPanel;

    public static void main(String[] args) throws IOException {
        int input = Cast.StoInt(IO.input());

        starPanel = new char[input][input];
        
        DrawStar(0, 0, input, false);

        for(int i = 0; i < input; i++){
            IO.write(starPanel[i]);
            IO.write("\n");
        }
        
        IO.endProg();
    }

    public static void DrawStar(int x, int y, int panelSize, boolean blank){
        if(blank){
            for(int i = x; i < x + panelSize; i++){
                for(int j = y; j < y + panelSize; j++){
                    starPanel[i][j] = ' ';
                }
            }
            return;
        }

        if(panelSize == 1){
            starPanel[x][y] = '*';
            return;
        }

        int size = panelSize / 3;
        int count = 0;

        for(int i = x; i < x + panelSize; i += size){
            for(int j = y; j < y + panelSize; j += size){
                count++;

                if(count == 5){
                    DrawStar(i, j, size, true);
                }else{
                    DrawStar(i, j, size, false);
                }
            }
        }
    }
}