######################
## Checkout instructions
######################
1/ Convertir le projet en maven project si eclipse ne le fait pas

2/ Clic droit / properties / tomcat / est un projet tomcat 
+ cocher le devloader 
+ toutes les librairie .m2 
+ /proxystat/target/classes 
+ /proxystat/target/test-classes

3/ Changer le path dans fichier serverConfig/proxstat-server.xml pour mettre chemin local

4/ Eclipse / préférences / tomcat / coche dans server.xml -> fichier proxystat-server.xml

5/ Si vous etes sur windows avec postgresql et que le service ne démarre pas 
il faut ajouter le contrôle total au user Network sur votre répertoire postgre.
et démarrer le serveur cf doc en ligne postgresql

6/ Démarrer tomcat avec plugin sysdeo

7/ Si pb au lancement - checker
* clic droit projet > propriétés > dev loader : valider que servlet api et .M2 CLASSPATH ne sont pas cochées, toutes les autres doivent l'être
* base démarrée

######################
## Unit test
######################
Deux solutions :
1/ mvn test

2/ clic droit > run as > Junit test
Attention dans ce cas à 
- exécuter tout les tests pour valider non-régression
- problème possible avec le script sql pour avoir jeux de données qui ne s'exécute pas

La solution 1 est donc à préferer

######################
## Integration test
######################
Steps pour executer :
1/ Déployer le projet sur tomcat avec plugin sysdeo (comme pour développer)
2/ mvn verify

Si problème :
* Check que firefox est bien installé sur la machine
* Check que postgresql est démarré
* Check que l'application est déployée sur tomcat en y accédant

Steps pour configurer un test :
1/ Identifier dans quelle classe IntegrationTest il faut ajouter le test en fonction du périmètre fonctionnel
2/ Développer le test avec Selenium IDE en plugin firefox
3/ Exporter depuis le plugin selenium IDE en format Java
4/ Copier les steps dans un test
5/ Lancer un mvn verify
6/ Si build success commit


######################
## Hibernate tools
######################

Steps pour générer UML
1/ Clic droit projet > Configure > Convert to JPA project
2/ Laisser ce qui est coché - normalement Java + JPA
3/ Chosir
- Platform: JPA 2.0
- User configuration: Disable user configuration
- Cocher uniquement discover annoted classes automatically
4/ Ouvrir la vue hibernate sous eclipse
5/ Aller dans onglet "Hibernate Configuration" puis clic droit projet > Mapping diagram




