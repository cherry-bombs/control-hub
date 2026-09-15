# Contributing to Cherry Bombs Robot Code

## Team organization

The Cherry Bombs coding team has a flat hierarchy. Maintainers coordinate work, help resolve design questions, and review contributions; they are not the only people who can propose or implement improvements.

Be patient with teammates, explain unfamiliar concepts, and review code with the understanding that contributors are learning.

## Before you start

For anything beyond a minor documentation or typo fix, open an issue or talk with a maintainer before investing significant time. Another contributor may already be working on it, and robot behavior often depends on decisions from both the programming and engineering teams.

Do not guess hardware device names or mechanical limits. The robot configuration is stored on the Control Hub and is not represented completely in this repository.

Active team code belongs in:

```text
TeamCode/src/main/java/org/firstinspires/ftc/teamcode/
```

`TeamCode/teamcode` is a convenience symlink to the same directory. Do not modify `FtcRobotController/`; it is vendored FTC SDK code and is replaced during upstream updates. Code under `archives/` is historical reference, not active robot code.

## Branches and pull requests

- Do not commit or push directly to `main`.
- Never force-push to `main` or another contributor's branch.
- Create a branch for each logical change and open a pull request.
- Keep unrelated formatting, renaming, and cleanup out of focused changes.
- Bring your branch up to date with `main` before it is merged.
- If you need help with Git, ask before using a destructive command.

Use a short, descriptive, imperative commit subject. For example, `Document hardware verification steps` is more useful than `changes` or `fix stuff`.

A pull request should explain:

- What changed and why.
- Which files or robot systems are affected.
- What automated checks were run.
- Whether the change was run on robot hardware.
- Any known risks, follow-up work, or reviewer decisions needed.

Large changes should be divided into reviewable commits or pull requests when practical. A clear summary and verification evidence are more useful to reviewers than raw shell history.

## Build and verification

Run the relevant checks from the repository root:

```bash
./gradlew :TeamCode:assembleDebug
./gradlew lint
```

Use `./gradlew build` when a full project build is appropriate.

A green build only shows that the project compiles. It does not verify physical robot behavior. For motor, servo, drivetrain, or autonomous changes, deploy to the Control Hub and test through the Driver Station with the robot on blocks or in a clear area.

Report verification precisely:

- **Compiles, not run on hardware** when only Gradle checks were completed.
- **Tested on hardware** only when the relevant OpMode and mechanism were actually exercised, including a brief description of the test.

## Review

A maintainer may approve the pull request, request changes, continue design discussion, or close it. Address feedback in the existing branch rather than opening replacement pull requests unless asked.

Robot code controls a physical machine around people. Safety concerns outweigh schedule pressure: stop and ask when behavior, hardware limits, or configuration is uncertain.
