This script installs scala3 to your machine via curl and adding to system paths
curl -fLo cs https://git.io/coursier-cli-"$(uname | tr LD ld)"
chmod +x cs
./cs install cs &> test1.txt
tag=$( tail -n 1 test1.txt )
eval $tag
echo "coursier added to system path"
rm test1.txt
cs update cs
cs install scala3-compiler
cs install scala
