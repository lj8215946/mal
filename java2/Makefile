
SOURCES_LISP = src/vip/connorlu/mal/step0_repl.java
SOURCES = $(SOURCES_LISP)

all:
	mvn install

dist: mal.jar mal

mal.jar: target/classes/vip/connorlu/mal/step0_repl.class
	mvn assembly:assembly
	cp target/mal-0.0.1.jar $@

SHELL := bash
mal: mal.jar
	cat <(echo -e '#!/bin/sh\nexec java -jar "$$0" "$$@"') mal.jar > $@
	chmod +x mal

src/vip/connorlu/mal/%.java:
	mvn install

target/classes/vip/connorlu/mal/step%.class: src/vip/connorlu/mal/step%.java ${SOURCES}
	mvn install

clean:
	mvn clean
	rm -f mal.jar mal
