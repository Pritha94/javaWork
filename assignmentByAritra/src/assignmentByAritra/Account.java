package assignmentByAritra;

public class Account {
	
		int accno;
		String name;
		float amount;
		
		Account(int accno, String name, float amount) {
			this.accno=accno;
			this.name=name;
			this.amount=amount;
		}
		
		Account(float amount) {
			this.amount=this.amount+amount;
			System.out.println("deposited " +amount);
		}
		
		void withdraw(float amount) {
			if(this.amount<amount) {
				System.out.println("Insufficient Balance.");
			}else {
				this.amount=this.amount-amount;
				System.out.println("withdraw "+amount);
				}
			}
		
		void checkBalance() {
			System.out.println("Balance is "+this.amount);
		}
		
		void display() {
			System.out.println("Account Number: "+accno+"\n Account Holder Name: "+name+"\n opening balance: "+amount);
		}
	}

