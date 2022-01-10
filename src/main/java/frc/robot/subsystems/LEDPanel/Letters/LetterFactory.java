// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.LEDPanel.Letters;

/** Add your docs here. */
public class LetterFactory {
    public static LetterBase[] getLetters(String phrase){
      int length = phrase.length();
        LetterBase[] letters = new LetterBase[length];

        for (int c = 0; c < length; c++){
            letters[c] = getLetter(phrase.charAt(c));
        }
       
        return letters;
   }
    public static LetterBase getLetter(char l){
        switch (l) {
            case 'A':
                return new LetterA();
            case 'B':
                return new LetterB();
            case 'C':
                return new LetterC();
            case 'D':
                return new LetterD();
            case 'E':
                return new LetterE();
            case 'F':
                return new LetterF();
            case 'G':
                return new LetterG();
            case 'H':
                return new LetterH();
            case 'I':
                return new LetterI();
            case 'J':
                return new LetterJ();
            case '_':
                return new Letter_();
            case 'K':
                return new LetterK();
            case 'L':
                return new LetterL();
            case 'M':
                return new LetterM();
            case 'N':
                return new LetterN();
            case 'O':
                return new LetterO();
            case 'P':
                return new LetterP();

                    }
        return null;
    }
}

