// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.LEDPanel.Letters;
import java.util.*;

/** Add your docs here. */
public class Phrases {

    List<LetterBase>phrase;
    public Phrases(String p){

        phrase = LetterFactory.getLetterList(p);

    }

    public void print(){

        ListIterator<LetterBase> itr=phrase.listIterator();
        while(itr.hasNext()){

            System.out.println("index:" +itr.nextIndex()+ "value: ");
            itr.next().print();

        }

    }
}

