from unittest import findTestCases

from tdd.Account import Account

class testAccount(testCases):
    def test_create_accout_balance_is_zero(self):
        mfon_account: Account = Account("name", 0, "pin")
        self.assertEqual(0, mfon_account.check_balance("pin"))

    def test_deposit_2k_twice_balance_is_4k(self):
        mfon_amount: Account = Account("name", 0, "pin")
        mfon_account.deposit(2_000)
        self.assertEquals(2_000, mfon_account.check_balance("pin"))
        mfon_account.deposit(5_000)
        self.asserEquals(5_000, mfon_account.deposit("pin"))