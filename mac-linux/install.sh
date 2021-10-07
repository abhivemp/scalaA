This script installs scala3 to your machine via curl and adding to system paths
curl -fLo cs https://git.io/coursier-cli-"$(uname | tr LD ld)"
chmod +x cs
./cs install cs 
cs update cs
cs install scala3-compiler

