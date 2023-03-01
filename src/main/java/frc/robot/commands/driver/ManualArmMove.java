// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.driver;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.basic.ArmManual;
import frc.robot.commands.basic.TelescopeManual;

public class ManualArmMove extends ParallelCommandGroup {

  /** Creates a new ManualArmMove. */
  public ManualArmMove(CommandXboxController controller) {
    
    addCommands(
      new ArmManual(controller),
      new TelescopeManual(controller));
  }

}
