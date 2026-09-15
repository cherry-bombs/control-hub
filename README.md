> [!NOTE]
> This file *needs work.* In the meantime, for an LLM (GPT-5.6 Sol) generated file, please see [README.ai.md](/README.ai.md).

For some info to get started, we use Android Studio and Kotlin. We have a flat hierarchy, though, please refer to Kayo to assist with coding team wide organization.

As it stands right now, our current bottleneck is the robot itself. We're waiting on plans and construction, the latter being the task of our wonderful Engineering team. Ergo, our current focus is to make some skeleton code, which we'll be able to adapt and flesh out once the robot is ready.

<sup><strike>\# to do\<br>- build robot map\<br>    - so, a document that allows us to declare which parts are which on the robot, and use the variables as placeholders in the meantime. Think, port xyz = left motor.\<br>    - Talk with Engineering\<br>- Setup robot controls (mecanum) with a controller\<br>    - Talk with Drivers\<br>    - Presumably left stick for translation, right stick for rotation\<br>        - Absolute or relative?\<br>    - Check this out it's hecka cool: https://thumb.wikimedia.org/wikipedia/commons/thumb/c/c4/Mecanum_wheel_control_principle.svg/1280px-Mecanum_wheel_control_principle.svg.png\<br>    - I think electronic breaking may be cool idk lol :3\<br>Ok, so, more professionally</strike></sup>

- Robot Port Map
  - Talk with Engineering Team
  - Allow us to code using placeholders, setup a file which maps placeholders to the actual robot ports.
- Move robot using controller
  - Talk with Driving Team
  - Left stick
    - Theta controls angle
    - Radius controls speed
    - Use basic trigonometry to convert from Cartesian to Polar coordinates
  - Right stick
    - Rotate the robot (e.g.: spin left; spin right.).
  - Two modes:
    - Absolute. The robot moves in relation to the map/driver.
    - Relative. The robot moves in relation to itself.


Portions of this repository derived from the *FIRST®* Tech Challenge FtcRobotController repository are licensed under the BSD-3-Clause-Clear license. Original TeamCode developed by Team 24409 is licensed under the Apache License 2.0 unless otherwise noted.
