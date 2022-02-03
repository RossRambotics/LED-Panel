// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.LEDPanel;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.LEDPanel.Letters.Phrases;

public class LEDPanel extends SubsystemBase {
  private AddressableLED m_led = null;
  private AddressableLEDBuffer m_ledBuffer = null;

  // number of LEDs
  private final int m_noLEDs = 8 * 32;

  /** Creates a new LEDPanel. */
  public LEDPanel() {

    // PWM port 9
    // Must be a PWM header, not MXP or DIO
    m_led = new AddressableLED(9);

    // Reuse buffer
    // Default to a length the size of LED Panel, start empty output
    // Length is expensive to set, so only set it once, then just update data
    m_ledBuffer = new AddressableLEDBuffer(m_noLEDs);
    m_led.setLength(m_ledBuffer.getLength());

    // Set the data
    m_ledBuffer.setRGB(5, 255, 0, 0);
    m_led.setData(m_ledBuffer);
    m_led.start();

  }

  private int m_index = 0;

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_ledBuffer.setRGB(m_index, 0, 0, 0);

    m_index++;
    if (m_index >= m_noLEDs) {
      m_index = 0;
    }

    // m_ledBuffer.setRGB(m_index, 255, 0, 0);
    Phrases p = new Phrases("TEST");
    Color color[][] = p.getColors();

    int col = 0;
    int row = 0;
    int i = 0;

    // TODO fix 14 to be a calc
    for (col = 0; col < p.size() * 7; col++) {
      for (row = 0; row < 8; row++) {
        i = (row * 32) + col;
        // System.out.println("i: " + i + " col: " + col + " row: " + row);
        m_ledBuffer.setLED(i, color[col][row]);
      }
    }

    m_led.setData(m_ledBuffer);
  }

  public void print(Phrases phrase) {

  }
}
