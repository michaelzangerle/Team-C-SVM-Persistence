Persistence Layer
============

Um die anderen Schichten von der Persistenz Schicht zu trennen wurde eine Zentrale Klasse PersistenceFacade erstellt. Über diese Klasse können alle benötigten Operationen durchgeführt werden.
Diese Operationen beinhalten:
• Erzeugung und abholen von DAO Objekten
• Datenbanksessionhandling und Transactionhandling

DAO Objekte 
==========

Die AbstractDAO implementiert die Methoden des IDAO Interfaces sodass es von allen DAO Objekten genutzt werden kann
Die eigentlichen DAO Klassen erweitern die AbstractDAO und implementieren ein eigenes Interface, über dieses zusätzliche Methoden für die spezifischen Entities definiert werden können.
