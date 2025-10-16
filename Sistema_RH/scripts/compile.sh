#!/bin/bash
# Compila todos os arquivos .java dentro de src/ (incluindo packages)
# e gera .class em bin/

# Navega para o diretório raiz do projeto (um nível acima do diretório do script)
cd "$(dirname "$0")/.." || exit 1

# Garante que o diretório de saída exista
mkdir -p bin

# Encontra todos os arquivos .java recursivamente em src/
# e passa a lista completa para o javac
find src -name "*.java" > sources.txt

# Compila os arquivos.
# -d bin: define 'bin' como o diretório de destino para os .class
# @sources.txt: lê a lista de arquivos a serem compilados
javac -d bin @sources.txt

# Remove o arquivo temporário
rm sources.txt

if [ $? -eq 0 ]; then
    echo "✅ Compilação concluída com sucesso!"
else
    echo "❌ Erro na compilação."
    # O status de saída do último comando (javac) já é 1,
    # mas garantimos a saída com erro.
    exit 1
fi
