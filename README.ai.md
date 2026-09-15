> [!WARNING]
> This file is *LLM generated* by *GPT-5.6 Sol.* It serves as a reference alternative while we make the human authored file more robust, as can be seen here: [README.md](/README.md).

# Cherry Bombs Control Hub

Robot code for FIRST Tech Challenge Team 24409, the Cherry Bombs. This repository is based on the official FTC SDK and builds an Android app for a REV Control Hub.

The robot is still being designed and built. Current team code is intentionally skeletal so it can be adapted once hardware decisions are final.

## Project layout

- `TeamCode/` contains code maintained by the team.
- `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/` is the canonical source directory.
- `TeamCode/teamcode` is a convenience symlink to that source directory.
- `FtcRobotController/` is vendored from the official FTC SDK. Team changes do not belong there.
- `archives/` contains reference material from previous seasons and earlier work. It is not active robot code.

Archived code may target older FTC SDK APIs or different hardware. Treat it as historical reference rather than copying it into the current robot unchanged.

## Getting started

Use Android Studio Narwhal 3 Feature Drop or later. The project currently uses Gradle 9.1 and Android Gradle Plugin 8.13.2; decline any prompt to downgrade the plugin.

Clone the repository, open its root directory in Android Studio, and allow Gradle sync to finish. Command-line checks can be run from the repository root:

```bash
./gradlew :TeamCode:assembleDebug
./gradlew lint
./gradlew build
```

The TeamCode assemble task is the fastest compile check. The full build and lint tasks provide broader project checks.

## Adding robot code

Add Kotlin or Java files under `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/`. OpModes must have an appropriate `@TeleOp` or `@Autonomous` annotation to appear on the Driver Station.

Do not guess hardware configuration names. Strings passed to `hardwareMap.get(...)` must exactly match the configuration stored on the Control Hub. Ask the programming and engineering teams to confirm names when the robot design is ready.

Keep active loops responsive and check `opModeIsActive()`. Avoid blocking the OpMode thread.

## Verification and safety

A successful Gradle build proves that the code compiles; it does not prove that the robot behaves correctly.

Before treating motor, servo, drivetrain, or autonomous changes as verified:

1. Deploy the app to the Control Hub.
2. Select the intended OpMode on the Driver Station.
3. Put the robot on blocks or move it to a clear test area.
4. Keep people, hair, clothing, and cables away from moving mechanisms.
5. Test at conservative power before increasing speed.

When hardware testing has not been performed, report the result as **compiles, not run on hardware**.

## Contributing

See [.github/CONTRIBUTING.md](.github/CONTRIBUTING.md) before starting a change. Use a branch and pull request, keep each change focused, and describe both automated checks and hardware testing honestly.

## Licensing

Portions derived from the *FIRST®* Tech Challenge FtcRobotController repository are licensed under the BSD 3-Clause Clear License; see [LICENSE-FIRST](LICENSE-FIRST).

Original TeamCode developed by Team 24409 is licensed under the Apache License 2.0 unless otherwise noted; see [LICENSE](LICENSE).
