#!/bin/zsh

sh build.sh

JAR_DIR="./build"

for jar in "$JAR_DIR"/*.jar; do
    if [[ -f "$jar" ]]; then
        echo "Running: $jar"
        java -jar "$jar" &
    fi
done

wait