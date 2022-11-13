from car import Car
from account import Account
from uberX import UberX
from uberPool import UberPool
from uberVan import UberVan
from uberBlack import UberBlack

if __name__ == "__main__":
    print("hola mundo")
    
    UberDeJuan = UberBlack("ABC123",vars(Account("Juan", "JUAN123")), "Chevy", "Chino")
    print(vars(UberDeJuan))

    UberDeAntonio = UberPool("CVB123",vars(Account("Antonio", "JUAN123")), "Chevy", "Chino")
    print(vars(UberDeAntonio))

    UberDePedro = UberX("SDF567",vars(Account("Pedro", "JUAN123")), "Chevy", "Chino")
    print(vars(UberDePedro))

    UberDeLuis = UberVan("KLJ456",vars(Account("Luis", "JUAN123")), "Chevy", "Chino")
    print(vars(UberDeLuis))