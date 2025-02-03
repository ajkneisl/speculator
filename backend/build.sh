#!/bin/zsh

#
# Builds all components of the backend.
#

PROJECTS=(
  "ai"
  "goals"
  "transactions"
  "user"
)

BASE_DIR="$(pwd)"
DEST_DIR="$BASE_DIR/build"
rm -rf "$DEST_DIR"
mkdir -p "$DEST_DIR"

for project in "${PROJECTS[@]}"; do
    if [ -d "$project" ]; then
        cd "$project" || continue
        sh gradlew shadowJar
        JAR_FILE=$(ls -t build/libs/*.jar 2>/dev/null | head -n 1)
        if [ -n "$JAR_FILE" ]; then
          cp "${JAR_FILE}" "$DEST_DIR"
          echo "${BASH_REMATCH[1]}"
        fi
        cd "$BASE_DIR" || exit
    fi
done