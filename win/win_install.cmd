@REM Windows script to install scala and add3 to path
bitsadmin /transfer cs-cli https://git.io/coursier-cli-windows-exe "%cd%\cs.exe"
.\cs --help
.\cs install.\cs update
cs install scala3-compiler
cs install scala
echo "Testing example program"
cd ..
scala3-compiler testInstallation.scala
scala testInstallation
