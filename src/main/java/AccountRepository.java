import java.util.List;

public interface AccountRepository {

	public List<Account> getAll();
	public Account getAccount(String id);
	
}
