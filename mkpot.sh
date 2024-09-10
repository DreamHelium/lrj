#!/bin/bash

xgettext -k__ -kN_ --default-domain=lrj --package-name=lrj --output=src/main/resources/cn/dh/lrj/lang.pot src/main/java/cn/dh/lrj/*
cd src/main/resources/cn/dh/lrj
msgmerge --no-fuzzy-matching -U zh_CN.po lang.pot
msgcat zh_CN.po --properties-output -o lang_zh_CN.properties