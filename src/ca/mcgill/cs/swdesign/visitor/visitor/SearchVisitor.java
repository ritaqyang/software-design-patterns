package ca.mcgill.cs.swdesign.visitor.visitor;

public class SearchVisitor extends AbstractVisitor
{
	private final String aQuery;
	private OrgNode aResult = NullOrgNode.instance;
	
	public SearchVisitor(String pQuery)
	{
		aQuery = pQuery;	
	}
	
	OrgNode getResult() {return aResult; }

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		if(pCommittee.getName().equals(aQuery))
		{
			aResult = pCommittee;
		}
		super.visitCommittee(pCommittee);
	}		

}


