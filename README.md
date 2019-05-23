# libfptr-json-proxy

Программа предназначена для передачи ajax запросов в кассовый аппарат.
<br>Используется в связке с драйверами Атол.

Инсталляция:

скачайте последнюю версию драйвера libfptr с сайта http://fs.atol.ru

создайте структуру папок:
<ul>
	<li>/jsonproxy</li>
	<ul>/java
		<li>/src</li>
		<ul><li>/proxydrv</li></ul>
	</ul>
</ul>

<br>в папку java поместите драйвер libfptr10.jar
<br>в папку proxydrv поместите proxydrv.java

скомпилируйте программу:
<br><b>/usr/bin/javac -cp <путь до драйвера libfptr10.jar> <путь до proxydrv.java></b>

(пример компиляции <b><a href="https://github.com/gardist/libfptr-ajax-proxy/blob/master/src/compile.sh" target="blank">compile.sh</a></b>)

запустите программу:
<br><b>/usr/bin/java -classpath .:<путь до драйвера libfptr10.jar> proxydrv.proxydrv <ajax запрос></b>

(пример запроса <b><a href="https://github.com/gardist/libfptr-ajax-proxy/blob/master/src/run.sh" target="blank">run.sh</a></b>)

подробнее о ajax запросах можно найти на официальной странице интеграции драйвера:
http://integration.atol.ru
