#!/bin/bash
# Executa a classe principal App

cd "$(dirname "$0")/.." || exit 1
java -cp bin App
