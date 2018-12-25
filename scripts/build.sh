#!/usr/bin/env bash


function showHelp () {
read -r -d '' HELP<<-"EOF"
  usage: build.sh [options]
  options:
    -l, build library
    -e, build example
    -r, run example
EOF
  echo "${HELP}"
  exit 1
}

while getopts 'ler' flag; do
  case "${flag}" in
    l)
      lib=true
      ;;
    e)
      example=true
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

if [[ -n $lib ]]; then
    echo
    echo "Building K3D Library"
    kotlinc-native src/kotlin/K3D/K3D.kt -opt -p library -o ./lib/K3D
    exitOnError "Library Built: ./lib/K3D.klib"
fi

if [[ -n $example ]]; then
    echo
    echo "Building K3D Example"
    kotlinc-native src/kotlin/example/Example.kt -o bin/example -opt -e example.main -l ./lib/K3D
    exitOnError "Example Built: ./bin/Example.kexe"
fi

if [[ -n $run ]]; then
    echo
    echo "Running K3D Example"
    ./bin/example.kexe
fi