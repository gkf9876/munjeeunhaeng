package 문제은행.SqlService;

public interface SqlService {
	String getSql(String key) throws SqlRetrievalFailureException;
}
