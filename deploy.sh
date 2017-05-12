rsync --progress -a html/ base:../seriouslyseylerius-html
cd ../seriouslyseylerius-html/
git commit -a
git push origin master
