#!/usr/bin/env bash


function showHelp () {
read -r -d '' HELP<<-"EOF"
  usage: build.sh [options]
  options:
    -l, build library
    -e [Simple|TeaPot], build the specified example
EOF
  echo "${HELP}"
  exit 1
}

examples=(Simple TeaPot)

while getopts 'le:' flag; do
  case "${flag}" in
    l)
      target=lib
      ;;
    e)
      target=example
      buildExample=""
      for example in ${examples[@]}; do
        if [[ ${OPTARG} == ${example} ]]; then
          buildExample=${OPTARG}
        fi
      done
      [[ -z ${buildExample} ]] && (echo "Invalid Example: ${OPTARG}"; showHelp) ||:
      ;;
    *)
      showHelp
      ;;
  esac
done

case "${target}" in
  lib)
    echo "Building K3D Library"
    kotlinc-native src/kotlin/K3D/K3D.kt -opt -p library -o ./lib/K3D
    echo "Library Built: ./lib/K3D.klib"
    ;;
  example)
    echo "Building K3D Example ${buildExample}"
    kotlinc src/kotlin/examples/${buildExample}/${buildExample}.kt -o bin/${buildExample} -opt -e examples.${buildExample}.main -l ./lib/K3D
    [[ $? -lt 1 ]] && echo "Example ${buildExample} Built: ./bin/${buildExample}.kexe" || echo Build Failed...
    ;;
esac