# Lab1 - Programmation avec l’API HDFS

## 🎯 Objectif du TP
L’objectif de ce laboratoire est de découvrir la programmation avec l’API **HDFS (Hadoop Distributed File System)** à travers trois programmes Java :

1. **HadoopFileStatus** : obtenir des informations sur un fichier stocké sur HDFS et le renommer.  
2. **ReadHDFS** : lire et afficher le contenu d’un fichier sur HDFS.  
3. **WriteHDFS** : créer et écrire un fichier sur HDFS.

---

## 🧱 Structure du projet
Lab1/
├── pom.xml
├── src/
│    └── main/java/edu/supmti/hadoop/
│          ├── HadoopFileStatus.java
│          ├── ReadHDFS.java
│          └── WriteHDFS.java
├── target/
│    ├── HadoopFileStatus.jar
│    ├── ReadHDFS.jar
│    └── WriteHDFS.jar
└── README.md

---

## ⚙️ Compilation et génération des JARs

Le projet est configuré avec **Maven**.  
Chaque classe principale peut être packagée en JAR à l’aide de la commande :

```bash
mvn clean package
```
Les fichiers JAR générés se trouvent dans le dossier target/.

🚀 Exécution sur Hadoop
Les fichiers JAR doivent être placés dans le répertoire partagé du conteneur Hadoop
(ex. /shared_volume), puis exécutés à l’intérieur du conteneur hadoop-master.
1️⃣ Informations et renommage de fichier (HadoopFileStatus)
hadoop jar /shared_volume/HadoopFileStatus.jar /user/root/input purchases.txt achats.txt

2️⃣ Lecture d’un fichier (ReadHDFS)
hadoop jar /shared_volume/ReadHDFS.jar /user/root/input/achats.txt

3️⃣ Écriture d’un fichier (WriteHDFS)
hadoop jar /shared_volume/WriteHDFS.jar /user/root/input/bonjour.txt "Bonjour tout le monde !"


📊 Résultats attendus
Exemple de sortie pour HadoopFileStatus
2549 bytes
File Name: purchases.txt
File Size: 2549
File owner: root
File permission: rw-r--r--
File Replication: 2
File Block Size: 134217728
Block offset: 0
Block length: 2549
Block hosts: hadoop-slave1 hadoop-slave2

Exemple de sortie pour ReadHDFS
Le contenu du fichier HDFS est affiché ligne par ligne.
Exemple de sortie pour WriteHDFS
File written: /user/root/input/bonjour.txt


📘 Conclusion
Ce laboratoire démontre comment :


Interagir avec le système de fichiers distribué HDFS via l’API Java.


Configurer un projet Maven Hadoop.


Lire, écrire et manipuler des fichiers sur HDFS.


Exécuter des programmes Java sur un cluster Hadoop dans Docker.



🗂️ Commandes utiles
# Lister les fichiers sur HDFS
hdfs dfs -ls /user/root/input

# Lire un fichier sur HDFS
hdfs dfs -cat /user/root/input/achats.txt

# Supprimer un fichier sur HDFS
hdfs dfs -rm /user/root/input/bonjour.txt


---

Would you like me to make you a **second version of the README** that’s shorter (1-page summary format) — useful if you need to print or submit it as part of a report?
