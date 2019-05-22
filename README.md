# libfptr-ajax-proxy

Программа предназначена для передачи ajax запросов в кассовый аппарат.
Используется в связке с драйверами Атол.

Инсталляция:

скачайте последнюю версию драйвера libfptr с сайта http://fs.atol.ru

создайте структуру папок:

/ajaxproxy
	/java
	/src
		/proxydrv

в папку java поместите драйвер libfptr10.jar
в папку proxydrv поместите proxydrv.java

скомпилируйте программу:
/usr/bin/javac -cp <путь до драйвера libfptr10.jar> <путь до proxydrv.java>

(пример компиляции compile.sh)

запустите программу:

/usr/bin/java -classpath .:<путь до драйвера libfptr10.jar> proxydrv.proxydrv <ajax запрос>

(пример запроса run.sh)

подробнее о ajax запросах можно найти на официальной странице интеграции драйвера:
http://integration.atol.ru
