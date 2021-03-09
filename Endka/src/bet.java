public class bet implements AituBet{
	int money=1000;
	int bet=0;
	int deposit;
	public bet(int bet,int deposit) {
		this.bet=bet;
		this.deposit=deposit;
	}
	
	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet=bet;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	@Override
	public void win() {
		money=money-bet;
		bet=bet*2;
		money=money+bet;
		
		
	}

	

	@Override
	public void lose() {
		money=money-bet;
		
	}
	@Override
	public void deposit() {
		money=money+deposit;
	}
	
	
	
}