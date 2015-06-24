package acdemic.dao;

import java.util.List;

import javax.ejb.Remote;
@Remote
public interface AcdemicDao {
	
	
	public List find(String id);
	
	
}
