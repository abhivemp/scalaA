# Install Scala3 on Windows

**Pre-reqs**

- Admin rights on your Windows machine
- Make sure you have JDK. Download it [here](https://www.oracle.com/java/technologies/downloads/#java8) if you need it





1. Run `cmd.exe` as an Administrator

2. Run 

   ```
   choco install sbt
   ```

   Alternatively, you can download the installer [here](https://www.scala-sbt.org/download.html)

3. You've installed Scala! Check by doing 

   ```
   sbt --version
   ```

   At the time of this doc creation, you should get

   ```
   sbt version in this project: 1.5.5
   sbt script version: 1.5.5 
   ```

   



## Create and Run a Project

Your assignment requires you to submit a zip file of your Scala project.

1. Open your `cmd.exe`

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

