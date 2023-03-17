Appium testautomation for Todo mobile app

## Problem definition:
To perform black box testing on mobile application using Appium automation tool along with Maven (building tool), TestNG (report generation) and selenium(automation).

## Tools
1. Xcode and Commandline tools
2. Android Studio and Android SDK
3. Appium Server/Desktop

## Technologies used:
1.	Appium
2.	Maven
3.  TestNG
4.  Selenium

### Path for app
Path to the apk(Android) File.

   App Path = src/main/resources/app-mock-debug.apk


### Server url
If not set, the local appium server http://127.0.0.1:4723/wd/hub will be set.

# Devices

## Android
For Android, we use a simulator Pixel 4a with Android Version  11

# To start the Test,

mvn clean test -PworkflowTest





