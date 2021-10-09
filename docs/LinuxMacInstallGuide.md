# Install Scala3 on Linux and macOS

*Pre-requisites*

- Admin rights on your machine
- JDK installed. Make sure it's >= JDK 8



## macOS

1. Open your terminal

2. If you have homebrew, you can install `sbt` by doing:

   ```
   brew install sbt
   ```

   Alternatively you can install the package as a `.zip` or `.tgz`. Get the universal package [here](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Mac.html)



## Linux

Please see sbt's docs here based on your Linux distribution ([deb](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html#Ubuntu+and+other+Debian-based+distributions) and [rpm](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html#Red+Hat+Enterprise+Linux+and+other+RPM-based+distributions) based)

If you use Arch, check out the sbt docs [here](https://archlinux.org/packages/community/any/sbt/). You can install it via `pacman` like

```bash
pacman -S sbt
```





## Build and Run [On Both Platforms]

Your assignment requires you to submit a zip file of your Scala project.

1. Open your terminal

2. Navigate to your desired directory

3. Run

   ```
   sbt new scala/scala3.g8
   ```

4. You'll be prompted to enter in your project name, say "my_project"
5. Navigate to your project's directory (`cd my_project`)
6. You can code in  will be in`src/main/scala` and edit `main.scala`

### Compile and Run your project

```
sbt run
```

You'll be greeted by the test program. 

You can simply replace the contents of `main.scala` with the template you have been provided with and work on your solution.

