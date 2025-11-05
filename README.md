# formation-ddd
Support de formation ddd

## Fils rouge
Nous sommes propriétaire d'un garage à vélo qui possède des vélos et des outils pour les entretenir.
Notre business est familial et les clients se présente au garage pour louer des vélos.
À la fin de la location une révision est effectué sur le vélo loué (indispo d'au moins une journée).
Un client ne peut louer plusieurs vélos à la fois.
Un abonnement mensuel est proposé aux clients réguliers.
Un programme de fidélité est mis en place pour récompenser les clients réguliers (50% pour 10 locations).
Notre flotte est de 100 vélos :
    - 50 vélos de ville
    - 30 VTT
    - 20 vélos électriques

Nous avons pour objectif :
 - 1000 clients en 6 mois
 - 90% de vélo disponible à la location
 - Un bénefice de 10% sur chaque location de vélo

Notre activité comprend les services suivants :
- Louer des vélos à la journée
- Louer les vélos au mois

Les tarifs sont les suivants :
 - À la journée :
   - 10€ par jour pour un vélo de ville
   - 15€ par jour pour un VTT
   - 20€ par jour pour un vélo électrique
 - À la journée avec abonnement (5€ par mois) :
   - 7€ par jour pour un vélo de ville
   - 12€ par jour pour un VTT
   - 16€ par jour pour un vélo électrique
 - Au mois :
   - 50 € par mois pour un vélo de ville
   - 75 € par mois pour un VTT
   - 100 € par mois pour un vélo électrique

## timing

- durée : 3 jours

### jour 1 matin
- 9h : Présentation zenika, de moi, leurs attentes, la formations (emergement)
- 9h20 : Présentation du plan et de la logistique
- 9h30 : Introduction au DDD (pourquoi)
  - **Excercice 1** : Pourquoi les apps sont complexes ? (10 mins)
  - Présentation des sources de complexité (5mins)
  - **Excercice 2** : Modélisation naïve (30 mins)
  - Reflexion sur l'excercice (10 mins)
  - Exemple de modélisation (5 mins)
  - principe de la modélisation DDD/Bibliographie
  - Rappel
- 10h45 : Pause
- 11h : Introduction part 2
  - Présentation des méthode du DDD
  - Introduction à l'ubiquitous language
  - **Excercice 3** : termes surchargés (10 mins)
  - Construction de l'ubiquitous language via Impact mapping et Event Storming
  - Présentaion de l'impact mapping
  - **Excercice 4** : Impact mapping (1h)
- 12h30 : Déjeuner

### jour 1 après midi
- 13h30 : Rappel de l'introduction part 2 et emmergement (5 mins)
- 13h35 : knowledge crunching (affinage de la connaissance)
  - Présentation du knowledge crunching
  - Présentation de l'event storming (10 mins)
  - ***Excercice 5*** : Event Storming (1h)
  - Récapitulatif de l'event storming (5 mins)
  - réflexion sur les pratiques (de com avec le métier) dans leur contexte (5 mins)
- 15h15 : Pause
- 16h : Patterns DDD (15 mins)
  - Présentation des patterns DDD (Strategic et Tactical)
  - Présentation du pattens strategic
  - Présentation du pattens tactical
- 16h45 : Résumé de la journée et questions (15 mins)

### jour 2 matin
- 9h : Rappel jour 1 et emmergement (10 mins)
- 9h10 : Rappel des pattern strategique (explication plus précise de wardley mapping)
- 9h30 : Reprise de l'event storming
  - Ajout de notification, de la gestion du stocks, des commandes avants les events et on se concentre sur la réservation
  - Découpage en Bounded Context (event storming Design level) (30 mins)
  - **Excercice 6** : Bounded Context canvas (30 mins)
  - Réflexion sur Domain type de notre fil rouge (5 mins) exemple reservation
- 10h45 : Pause
- 11h : Patterns de communication (10 mins)
  - Présentation des patterns de communication entre Bounded Context (OpenHostService => )
  - **Excercice 7** : Context mapping (1h)
- 12h30 : Déjeuner

### jour 2 après midi (à completer)
- 13h30 : Rappel des différents pattens startegique et emmergement (10 mins)
- Microservice
- Bubble context et ACL
- 13h40 : Présentation des patterns tactical (15 mins)
  - Présentation des concepts (Aggregat, Entity, Value Object, Domain Service, Repository, Factory) (15 mins)
  - **Excercice 8** : Identification des aggregats (event storming) (45 mins)
  - 
### jour 3 matin (à completer)

### jour 3 après midi (à completer)

## Points essentiels

### Jour 1
- Comprendre les sources de complexité dans les applications
- Comprendre l'importance de la modélisation
- Comprendre l'importance de la collaboration (knowledge crunching)
  - Affiner la connaissance du domaine métier avec des experts métier
  - Parler le même langage que le métier (l'ubiquitous language)
- Les patterns DDD (strategic et tactical)

### Jour 2
- Comprendre le Wardley mapping
- Comprendre les patterns strategic
  - Différence entre Domaine, subdomaine et Bounded Context
  - Ubiquitus language
  - Context mapping (avec les différents types de relation)

## Glossaire

***[Impact mapping](https://chatgpt.com/share/69079208-68ac-800d-8b79-48373e37d2de)*** :  
L’impact mapping est un outil stratégique de planification qui aide à relier ce qu’on fait (les livrables) à pourquoi on le fait (les objectifs).  
Il permet de s’assurer que chaque fonctionnalité ou projet contribue réellement à un résultat métier mesurable.  
C'est une carte mentale qui montre comment nos livrables (quoi) vont produire des impacts (comportements) qui permettent d’atteindre un objectif (pourquoi).  

La structure d’un impact map :
 - Goal (Objectif) – le pourquoi (exemple : augmenter les revenus de 20%, taux de location des vélos journalier > 50%, 100 nouveaux clients en 6 mois)
 - Actors (Acteurs) – le qui (exemple : clients, employés du garage, mécaniciens, partenaire)
 - Impacts (Comportements attendus) – le comment (par leur comportement)
 - Deliverables (Livrables / fonctionnalités / initiatives) – le quoi

***[knowledge crunching](https://chatgpt.com/share/69078de4-2df0-800d-83db-87ca743a3a47)*** :  
Étape pour **appronfondir la connaissance du domaine métier**.
Se traduit par des **ateliers avec des experts du métier et tous les acteurs du logiciel**.
L'utilisation de **l'ubiquitous language est très important** lors des ateliers.
Dans notre cas nous allons le faire à travers un event Storming

***[Event Storming](https://chatgpt.com/c/69079328-00c4-832e-bfbf-b1a6adbe688d)*** :  
L’Event Storming est une méthode collaborative de modélisation des processus métier et des systèmes logiciels.  
Au lieu de partir du code ou des diagrammes UML, l’Event Storming part de la réalité métier :
“Qu’est-ce qui se passe d’important dans notre système ?”
Ces événements — appelés Domain Events — sont des faits passés, significatifs pour le métier (Commande passée, Paiement accepté, Article expédié, Client enregistré). 
3 étapes d’un atelier d’Event Storming :
 - Big Picture (vision globale) : avoir une compréhension partagée du processus complet.
 - Process Level (niveau de processus) : comprendre comment et pourquoi les événements se produisent. (relation entre les événements, commandes, acteurs, agrégats et policy)
 - Design Level (niveau de conception) : passer d’une compréhension métier à une architecture modulaire claire. (bounded context)
Exemple d'évents :
 - Location acceptée
 - Location démarrée
 - Location terminée
 - Vélo réservé
 - Vélo retourné
 - Révision effectuée
 - Abonnement souscrit
 - Remise fidélité appliquée
 - Paiement effectué
 - Paiement refusé

***[Wardley Mapping](https://chatgpt.com/share/69078f6e-6c4c-800d-b787-bef3f9b7fd04)*** :  
Le Wardley Mapping est une méthode stratégique pour **comprendre, visualiser et anticiper l’évolution** d’un environnement concurrentiel.  
C’est un outil puissant d’analyse et de prise de décision stratégique  
Un Wardley Map (carte de Wardley) représente :
 - Ce que une organisation fait (les composants de la chaîne de valeur), 
 - Comment ces composants évoluent dans le temps (leur maturité).  

Il comprend deux axes :
 - Axe vertical – La chaîne de valeur (En haut : les besoins des utilisateurs, En bas : les composants invisibles qui permettent de satisfaire ces besoins)
 - Axe horizontal – L’évolution (maturité) (Genesis (invention), Custom-built (fait sur mesure), Product/Rental (produit ou service standardisé), Commodity/Utility (banalisé, automatisé))
 
***[Domaine et subdomaine et Bounded Context](https://chatgpt.com/share/69078db4-8b44-800d-96d3-529869de2bf3)*** :  


- Ubiquitus language
- Context mapping (avec les différents types de relation)
- Aggregats
- Entity/ValueObject
- Microservices et DDD
- Legacy et DDD
