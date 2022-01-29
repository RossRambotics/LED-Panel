// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.LEDPanel.Letters;

import java.util.*;

import edu.wpi.first.wpilibj.util.Color;

/** Add your docs here. */
public class Phrases {

    List<LetterBase> phrase;

    public Phrases(String p) {

        phrase = LetterFactory.getLetterList(p);

    }

    public void print() {

        ListIterator<LetterBase> itr = phrase.listIterator();
        while (itr.hasNext()) {

            System.out.println("index:" + itr.nextIndex() + "value: ");
            itr.next().print();

        }

    }

    public Color[][] getColors() {
        // Creating an array of colors. The 1st dimension is corresponds to the x-axis
        // on the LED panel.
        // The 2nd dimension corresponds to the y-axis on the LED panel

        Color colors[][] = new Color[phrase.size() * 7][8];

        for (int col = 0; col < phrase.size() * 7; col++) {
            for (int row = 0; row < 8; row++) {
                colors[col][row] = Color.kBlack;
            }
        }

        colors[0][0] = Color.kBlue;
        colors[1][0] = Color.kBlue;
        colors[4][0] = Color.kBlue;
        colors[5][0] = Color.kBlue;
        colors[0][1] = Color.kBlue;
        colors[1][1] = Color.kBlue;
        colors[4][1] = Color.kBlue;
        colors[5][1] = Color.kBlue;
        colors[1][2] = Color.kBlue;
        colors[2][2] = Color.kBlue;
        colors[3][2] = Color.kBlue;
        colors[4][2] = Color.kBlue;
        colors[1][3] = Color.kBlue;
        colors[2][3] = Color.kBlue;
        colors[3][3] = Color.kBlue;
        colors[4][3] = Color.kBlue;
        colors[0][4] = Color.kBlue;
        colors[1][4] = Color.kBlue;
        colors[4][4] = Color.kBlue;
        colors[5][4] = Color.kBlue;
        colors[0][5] = Color.kBlue;
        colors[1][5] = Color.kBlue;
        colors[4][5] = Color.kBlue;
        colors[5][5] = Color.kBlue;
        return colors;

    }
}
