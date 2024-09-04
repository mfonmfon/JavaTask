class Account:
    def __init__(self, name: Str, balance: int, pin: Str):
        self.balance = balance
        pass

    def check_balance(self, pin: Str)-> int:
        return self.balance;

    def deposit(self, amount: int)->None:
        if amount > 0:
            self.balance = self._balance + amount

    def withdraw(self):




