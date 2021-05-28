# GUI

This directory contains GUI demo code that may help you complete your Final Project.
- Demo.fxml: Structure and formatting for GUI written using JavaFXML
- Demo.java: Accessible GUI written using JavaFX that incluces
  - Menu Bar with various features including
    - File Chooser
    - Launch Browser
    - Alert Box
    - Exit
  - Images
  - Text including some Unicode characters and hyperlinks
  - Responding to characters from keyboard
  - Shapes that respond to mouse events
  - Music controlled by buttons
- [open-iconic](https://useiconic.com/open): A collection of icons under the MIT license. I removed all but the PNGs to save repo size. 

Please delete this directory by your final commit.

## Installation
JavaFX is no longer part of the standard Java SDK. Please download the JavaFX SDK zip file for your OS from [Gluon](https://gluonhq.com/products/javafx/).
Unzip the file and place the folder in either the root of your Java SDK or in your home directory.
Examples

Windows: C:\Program Files\Java\javafx-sdk-16

Unix: /home/aveliz/javafx-sdk-16

Note: Some linux distros may also require installing GTK-4, FFMPEG, and libavcodec. I don't have a *real* linux machine so have been unable to test sound.

## Compile and Execute
You need to tell Java where to find JavaFX when you compile and execute the GUI demo. Don't forget to substitute your path to JavaFX/lib.


### CLI: 

javac --module-path="/home/aveliz/javafx-sdk-16/lib" --add-modules="javafx.controls,javafx.media,javafx.fxml" Demo.java

java --module-path="/home/aveliz/javafx-sdk-16/lib" --add-modules="javafx.controls,javafx.media,javafx.fxml" Demo

### Geany: Configure Build Commands 

javafxc: javac --module-path="/home/aveliz/javafx-sdk-16/lib" --add-modules="javafx.controls,javafx.media,javafx.fxml" "%f"

javafx: java --module-path="/home/aveliz/javafx-sdk-16/lib" --add-modules="javafx.controls,javafx.media,javafx.fxml" "%e"
