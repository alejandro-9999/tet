package Modelo;

import android.content.Context;

public class Figure_L extends  Figure {

    public Figure_L(Context context, String borderColor, String backgroundColor) {
        super(context,borderColor,backgroundColor,3,3);

        this.DataFrame = new int[][]{
                {0,1,0},
                {0,1,0},
                {0,1,1}
        };
        GenerateFigure();
    }
}
