<?xml version="1.0" encoding="UTF-8"?>

<!--
  Copyright (c) 2015, 2019, Gluon and/or its affiliates.
  All rights reserved. Use is subject to license terms.

  This file is available and licensed under the following license:

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions
  are met:

  - Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
  - Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in
    the documentation and/or other materials provided with the distribution.
  - Neither the name of Oracle Corporation nor the names of its
    contributors may be used to endorse or promote products derived
    from this software without specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
  A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
  OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
  LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
-->

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ChoiceBox?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.Menu?>
<?import javafx.scene.control.MenuBar?>
<?import javafx.scene.control.MenuItem?>
<?import javafx.scene.control.SeparatorMenuItem?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.text.Font?>

<VBox prefHeight="400.0" prefWidth="640.0" xmlns="http://javafx.com/javafx/16" xmlns:fx="http://javafx.com/fxml/1">
  <children>
    <MenuBar VBox.vgrow="NEVER">
      <menus>
        <Menu mnemonicParsing="false" text="File">
          <items>
            <MenuItem mnemonicParsing="false" text="New" />
            <MenuItem mnemonicParsing="false" text="Open…" />
            <Menu mnemonicParsing="false" text="Open Recent" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Close" />
            <MenuItem mnemonicParsing="false" text="Save" />
            <MenuItem mnemonicParsing="false" text="Save As…" />
            <MenuItem mnemonicParsing="false" text="Revert" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Preferences…" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Quit" />
          </items>
        </Menu>
        <Menu mnemonicParsing="false" text="Edit">
          <items>
            <MenuItem mnemonicParsing="false" text="Undo" />
            <MenuItem mnemonicParsing="false" text="Redo" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Cut" />
            <MenuItem mnemonicParsing="false" text="Copy" />
            <MenuItem mnemonicParsing="false" text="Paste" />
            <MenuItem mnemonicParsing="false" text="Delete" />
            <SeparatorMenuItem mnemonicParsing="false" />
            <MenuItem mnemonicParsing="false" text="Select All" />
            <MenuItem mnemonicParsing="false" text="Unselect All" />
          </items>
        </Menu>
        <Menu mnemonicParsing="false" text="Help">
          <items>
            <MenuItem mnemonicParsing="false" text="About MyHelloApp" />
          </items>
        </Menu>
      </menus>
    </MenuBar>
    <AnchorPane maxHeight="-1.0" maxWidth="-1.0" prefHeight="-1.0" prefWidth="-1.0" VBox.vgrow="ALWAYS">
      <children>
        <Label alignment="CENTER" layoutX="155.0" layoutY="177.0" style="&#10;" text="Drag components from Library here…" textAlignment="CENTER" textFill="#9f9f9f" wrapText="false">
          <font>
            <Font size="18.0" />
          </font>
        </Label>
            <ChoiceBox layoutX="482.0" layoutY="14.0" prefWidth="150.0" />
            <Button layoutX="557.0" layoutY="84.0" mnemonicParsing="false" text="Button" />
            <Button layoutX="557.0" layoutY="127.0" mnemonicParsing="false" prefHeight="7.0" prefWidth="62.0" text="Button" />
      </children>
    </AnchorPane>
  </children>
</VBox>
