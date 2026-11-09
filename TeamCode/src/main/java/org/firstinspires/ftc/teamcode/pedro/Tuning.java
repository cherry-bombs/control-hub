package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.tuning.autotune.Procedure;
import com.pedropathing.tuning.autotune.Tuner;

import org.firstinspires.ftc.teamcode.pedro.procedures.ForesightTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.MecanumTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.Tests;
import org.firstinspires.ftc.teamcode.pedro.procedures.TwoWheelTuner;

@SuppressWarnings("unused")
public class Tuning {
    @Tuner
    public static Procedure mecanumTuner() {
        return new MecanumTuner();
    }

    @Tuner
    public static Procedure twoWheelTuner() {
        return new TwoWheelTuner();
    }

    @Tuner
    public static Procedure foresightTuner() {
        return new ForesightTuner(
                Constants::createLocalizer,
                Constants::createDrivetrain
        );
    }

    @Tuner
    public static Procedure tests() {
        return new Tests(
                Constants.drivetrainConfig != null ? Constants::createDrivetrain : null,
                Constants.localizerConfig != null ? Constants::createLocalizer : null,
                Constants.foresightConfig != null ? Constants::createForesight : null
        );
    }
}
