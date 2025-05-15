@echo off
rem Este script é utilizado para executar o Gradle no Windows.

set DIR=%~dp0
if "%DIR%"=="" set DIR=.

set GRADLE_HOME=%DIR%gradle\wrapper
set PATH=%GRADLE_HOME%;%PATH%

gradle %*