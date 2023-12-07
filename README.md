# SumaDeTransacciones

https://github.com/PabloRoher/SumaDeTransacciones/tree/MongoDB

Enunciado de la Práctica: Implementación de Programación Concurrente en Bases de Datos NoSQL

Objetivos de la práctica:

En esta práctica, nuestro objetivo será obtener una comprensión práctica de cómo aplicar los principios de la programación concurrente en un entorno de base de datos NoSQL. Implementaremos diferentes estrategias de programación concurrente y evaluaremos su rendimiento al manejar grandes volúmenes de datos.

En la era actual de Big Data, las organizaciones generan y consumen cantidades enormes de información diariamente. Con tanta información disponible, las bases de datos tradicionales SQL pueden resultar ineficientes para manejar volúmenes de datos tan masivos y estructuras de datos complejas. Por lo tanto, las bases de datos NoSQL se han convertido en una elección popular debido a su escalabilidad y flexibilidad. Sin embargo, la eficiencia de estas bases de datos puede mejorarse aún más con el uso de la programación concurrente.

Detalles de la tarea:

Para la base de datos NoSQL, puedes optar por utilizar MongoDB, que es una base de datos orientada a documentos, o Apache Cassandra, que es una base de datos orientada a columnas. Ambas opciones son open-source y tienen amplia documentación disponible.

En cuanto a los datos, puedes utilizar conjuntos de datos públicos disponibles en recursos como Kaggle, Google Dataset Search o el Portal de Datos Abiertos del Gobierno. Sin embargo, elige un conjunto de datos que sea lo suficientemente grande para que sea relevante el uso de programación concurrente.

Podrías optar por un conjunto de datos relacionados con transacciones de comercio electrónico, tweets de Twitter, datos meteorológicos históricos, registros de sensores de IoT, etc. Recuerda, cuanto más grande y complejo sea el conjunto de datos, más interesantes serán los desafíos al implementar la programación concurrente.

Para la implementación de la programación concurrente, puedes usar herramientas y bibliotecas como ExecutorService y Future en Java, o ThreadPoolExecutor en Python. Estas herramientas te permiten gestionar la creación de hilos, su ejecución y la recolección de resultados de manera eficiente.

En cuanto a las pruebas de rendimiento, existen varias herramientas que puedes usar para monitorear y registrar el rendimiento de tu aplicación, como JMeter, Gatling o incluso las herramientas de monitoreo integradas en tu IDE.

Detalles de la tarea:

Configuración inicial: Inicia configurando una base de datos NoSQL (puedes elegir entre una base de datos clave-valor, orientada a documentos, orientada a columnas o una base de datos de grafos).

Modelado de datos: Modela un conjunto de datos para tu base de datos NoSQL elegida. Los datos deben ser lo suficientemente complejos para requerir el uso de programación concurrente (por ejemplo, un número significativo de registros o una estructura de datos compleja).

Implementación de programación concurrente: Implementa la programación concurrente para realizar operaciones en tu base de datos. Esto puede implicar el uso de múltiples hilos o procesos para manejar las operaciones de lectura y escritura, la implementación de bloqueos y otras estrategias de control de concurrencia, o el uso de bibliotecas de programación concurrente de alto nivel.

Pruebas y evaluación de rendimiento: Realiza pruebas de rendimiento en tu implementación. ¿Cómo se compara el rendimiento de tu implementación con y sin programación concurrente? Considera el tiempo de ejecución, el uso de recursos y cualquier otro factor de rendimiento relevante.

Informe de la práctica: Escribe un informe que documente tu enfoque, los desafíos que encontraste y cómo los resolviste, los resultados de tus pruebas de rendimiento y cualquier hallazgo o conclusión interesante que hayas obtenido de la práctica.
