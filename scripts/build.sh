#!/usr/bin/env bash


function showHelp () {
read -r -d '' HELP<<-"EOF"
  usage: build.sh [options]
  options:
    -l, build library
    -b, build example -- defaault: Simple
    -e, name of example
    -r, run example
EOF
  echo "${HELP}"
  exit 1
}

while getopts 'lbe:r' flag; do
  case "${flag}" in
    l)
      lib=true
      ;;
    b)
      build=true
      ;;
    e)
      binName=${OPTARG}
      ;;
    r)
      run=true
      ;;
    *)
      showHelp
      ;;
  esac
done

function exitOnError () {
  if [[ $? -lt 1 ]]; then
   echo $1
  else
    echo Build Failed...
    exit 1
  fi
}

libDir=./lib
libFile=${libDir}/K3D.klib
libSrc=./src/main/kotlin/K3D/K3D.kt

if [[ -n $lib ]]; then
    echo
    echo "Building K3D Library"
    kotlinc-native ${libSrc} -opt -p library -o ${libDir}/K3D
    exitOnError "Library Built: ${libFile}"
fi

binDir=./bin
[[ -z ${binName} ]] && binName=Cube ||:
binFile=${binDir}/${binName}.kexe
binSrc=./src/main/kotlin/example/${binName}.kt

if [[ -n $build ]]; then
    echo
    echo "Building K3D Example: ${binName}"
    kotlinc-native ${binSrc} -o ${binDir}/${binName} -opt -e ${binName}.main -l ${libDir}/K3D
    exitOnError "Example Built: ${binFile}"
fi

if [[ -n $run ]]; then
    echo
    echo "Running K3D Example"
    ${binFile}
fi