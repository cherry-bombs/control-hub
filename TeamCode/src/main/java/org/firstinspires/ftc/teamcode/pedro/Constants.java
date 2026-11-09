package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.algorithm.Foresight;
import com.pedropathing.algorithm.ForesightConfig;
import com.pedropathing.follower.Follower;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.pedropathing.revhub.localizers.TwoWheelConfig;
import com.pedropathing.revhub.localizers.TwoWheelLocalizer;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.Objects;

public class Constants {
    // Paste the generated configs from MecanumTuner, TwoWheelTuner, and ForesightTuner below:
    public static MecanumConfig drivetrainConfig;
    public static TwoWheelConfig localizerConfig;
    public static ForesightConfig foresightConfig;

    public static Mecanum createDrivetrain(HardwareMap h) {
        return new Mecanum(
                h,
                Objects.requireNonNull(
                        drivetrainConfig,
                        "Constants.drivetrainConfig is null. Run Mecanum Tuner and paste drivetrainConfig into Constants.java."
                )
        );
    }

    public static TwoWheelLocalizer createLocalizer(HardwareMap h) {
        return new TwoWheelLocalizer(
                h,
                Objects.requireNonNull(
                        localizerConfig,
                        "Constants.localizerConfig is null. Run Two Wheel Tuner and paste localizerConfig into Constants.java."
                )
        );
    }

    public static Foresight createForesight() {
        return new Foresight(
                Objects.requireNonNull(
                        foresightConfig,
                        "Constants.foresightConfig is null. Run Foresight Tuner and paste foresightConfig into Constants.java."
                )
        );
    }

    public static Follower create(HardwareMap h) {
        return new Follower(
                createLocalizer(h),
                createDrivetrain(h),
                createForesight()
        );
    }
}