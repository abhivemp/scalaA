# Install Scala3 on Linux/macOSw

*Pre-requisites*

- Admin rights on your machine





1. open your terminal

2. Clone this repository:

   ```powershell
   git clone git@github.com:abhivemp/scalaA.git
   ```

   *Note: If you don't have your github ssh key installed, you can clone the repo via https* like this:

   ```powershell
   git clone https://github.com/abhivemp/scalaA.git
   ```

3. `cd` to the directory of the script

   ```powershell
   cd scalaA/mac-linux
   ```

4. On your screen, you should see a warning message towards the end and asks you to export a PATH to your ~/.bashrc

   **Should look something like this**:

   STUFF HERE

5. We've successfully installed the compiler. However, it's not accessible throughout your machine. To enable `scala3-compiler` machine-wide, we need to add its `PATH` to the `.bashrc` file. Add the last line of message, an export command, to your `.bashrc` file.

   

   *Excerpt of a `bashrc` file*:

   

   STUF HERE

   **Note: if you are using zsh for macOS, then you need to add the export command in your.zshrc file**

6. After adding the export command to your file, let's update it

   ```bash
   source ~/.bashrc
   ```

   **Note: zsh users would source their .zshrc file**



## Test Install

To test the installation, simply run

```bash
scala3-compiler --version
```

You can also run the `testInstall.scala` file

```bash
cd .. && scala3-compiler testInstall.scala
```

You should get this

```
```

