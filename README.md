# Lab1 - Programmation avec l’API HDFS

## 🎯 Objectif
Ce TP a pour but de se familiariser avec la programmation Java utilisant l’API HDFS de Hadoop.  
Les objectifs sont :
- Accéder au système de fichiers HDFS.
- Lire et écrire des fichiers sur HDFS.
- Manipuler les métadonnées d’un fichier (taille, propriétaire, permissions, etc.).

---

## 🧱 Structure du projet
Trois classes Java ont été développées dans un projet Maven :

| Classe | Fonctionnalité principale |
|---------|---------------------------|
| **HadoopFileStatus** | Affiche les informations d’un fichier HDFS et le renomme. |
| **ReadHDFS** | Lit et affiche le contenu d’un fichier sur HDFS. |
| **WriteHDFS** | Crée et écrit un nouveau fichier sur HDFS. |

---

## ⚙️ Commandes d’exécution

Depuis le conteneur `hadoop-master` :

### 1️⃣ HadoopFileStatus

```bash
hadoop jar /shared_volume/HadoopFileStatus.jar /user/root/input purchases.txt achats.txt
```

### 2️⃣ ReadHDFS
```bash
hadoop jar /shared_volume/ReadHDFS.jar /user/root/input/achats.txt
```

### 3️⃣ WriteHDFS
```bash
hadoop jar /shared_volume/WriteHDFS.jar /user/root/input/bonjour.txt "Bonjour tout le monde !"
```

### 📊 Exemple de sortie
File Name: purchases.txt
File Size: 2549 bytes
Owner: root
Permission: rw-r--r--
Replication: 2
Block hosts: hadoop-slave1 hadoop-slave2

### 🧠 Conclusion

Ce premier TP a permis de :

 - Mettre en place un projet Java Maven pour Hadoop.
 - Manipuler HDFS via les classes FileSystem, FileStatus, et FSDataStream.
 - Comprendre le fonctionnement des blocs, de la réplication et de la configuration Hadoop.
