#!/usr/bin/env bash


rootDir="$(cd "$(dirname "$0")" && pwd)"
scriptDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

cinterop -def ${scriptDir}/../src/cinterop/glfw.def -o ${scriptDir}/../src/lib/glfw