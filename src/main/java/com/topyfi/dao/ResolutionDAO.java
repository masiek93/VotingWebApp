package com.topyfi.dao;

public interface ResolutionDAO {
	public void updateYesAnswer();
	public void updateNoAnswer();
	public void updateNoOpinionAnswer();
	
	public void getValueOfYesAnswer();
	public void getValueOfNoAnswer();
	public void getValueOfNoOpinionAnswer();
}
