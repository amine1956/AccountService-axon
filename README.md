# Activité Pratique N°5 : Event Driven Architecture CQRS and Event Sourcing
* Créer une application qui permet de gérer des comptes respectant les patterns CQRS et Event Sourcing avec les Framework AXON et Spring Boot :
## les dépendances  principale  du projet :

![image](https://user-images.githubusercontent.com/73759527/209236416-fb608de1-75f6-4951-94b2-425ec664b41f.png)

## la configuration du fichier application.properties:

![image](https://user-images.githubusercontent.com/73759527/209236498-f62239ef-faa9-4990-94f1-df284b09a454.png)

## l'architecture du projet:

![image](https://user-images.githubusercontent.com/73759527/209236715-78f89c37-0446-4b79-ad56-794d0d9a1c53.png)

## la structure du projet :

![image](https://user-images.githubusercontent.com/73759527/209236797-633bc0f6-7b26-4b34-9a6e-3aaa35ea03f1.png)


## les commandes:

* BaseCommand:

![image](https://user-images.githubusercontent.com/73759527/209236959-fcfdf89f-61d4-48b9-9621-8c31b8676dad.png)

* CreateAccountCommand:

![image](https://user-images.githubusercontent.com/73759527/209236998-776802a6-4dc7-46ff-a86f-bf2ea7b8dddd.png)

* CreditAccounCommand:

![image](https://user-images.githubusercontent.com/73759527/209237033-880142e7-0c87-433c-bc38-16592de42c56.png)

## les DTO:

* CreateAccountRequestDTO:

![image](https://user-images.githubusercontent.com/73759527/209237123-025ced24-7602-42a8-b89f-0dd32de8e449.png)

* CreditAccountDTO

![image](https://user-images.githubusercontent.com/73759527/209237171-95efddef-37ba-4464-bd99-5c3248624be8.png)

## les evenements:

* AccountCreatedEvent:

![image](https://user-images.githubusercontent.com/73759527/209237332-26fc32fc-0858-45c9-8af2-1b665f19daf2.png)
 
* AccountDebitedEvent

![image](https://user-images.githubusercontent.com/73759527/209237362-68d6cae6-8f25-4e83-bdd3-c7a609c888ea.png)

## AccountAgregate:

![image](https://user-images.githubusercontent.com/73759527/209237479-4a5b1371-3975-4c54-b5e6-bec2ac98dfa8.png)

## AccountCommandControllers

![image](https://user-images.githubusercontent.com/73759527/209237513-6c7c6c40-b558-4357-a0eb-1e05938b59d7.png)

## la partie query:

* Les entités JPA :

![image](https://user-images.githubusercontent.com/73759527/209237695-8f804aa8-10f7-438c-8487-f2b805be524e.png)

![image](https://user-images.githubusercontent.com/73759527/209237715-fb2402bb-8ef2-419f-8618-57bb16ae5d62.png)

* AccountEventHandlerService:

![image](https://user-images.githubusercontent.com/73759527/209237814-ce753879-86fa-436c-b4d7-c6ded36e5deb.png)

* AccontQueryController:

![image](https://user-images.githubusercontent.com/73759527/209237867-602e36dd-9a83-41a4-a184-44683c3b0865.png)


![image](https://user-images.githubusercontent.com/73759527/209237918-07f5bed8-524e-42f3-894c-9a5e0b2a0e83.png)

![image](https://user-images.githubusercontent.com/73759527/209237973-90e240a1-034c-4096-b3e7-d6e06897afdf.png)


![image](https://user-images.githubusercontent.com/73759527/209238053-70d35d21-8a43-4972-8a36-ea7f033235aa.png)





