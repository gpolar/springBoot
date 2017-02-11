import java.util.List;
//https://docs.google.com/document/d/1EtD5RljX7PD-123i_bEXHqZ-c1Lobai_L8KLl9dtgWs/pub

public class RemoteAccountRepository implements AccountRepository{

	public String val = "";
	public RemoteAccountRepository(String val){
		this.val = val;
	}
	
	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccount(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
