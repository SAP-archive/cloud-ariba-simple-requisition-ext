package ariba.buyer.vrealm_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrepareRequisitionParameter {
	public Date needByDate;
	public String shipTo;
	public String businessUnit;
	public String deliverTo;
	public String headerComment;
	public String headerName;
	public String originatingSystem;
	public String originatingSystemId;
	public String passwordAdapter;
	public String preparer;
	public String requester;
	public String headerUniqueName;
	public List<PrepareItemParameter> items = new ArrayList<PrepareItemParameter>();

	public PrepareRequisitionParameter(Date needByDate, String shipTo, String businessUnit, String deliverTo,
			String headerComment, String headerName, String originatingSystem, String originatingSystemId,
			String passwordAdapter, String preparer, String requester, String headerUniqueName) {
		this.needByDate = needByDate;
		this.shipTo = shipTo;
		this.businessUnit = businessUnit;
		this.deliverTo = deliverTo;
		this.headerComment = headerComment;
		this.headerName = headerName;
		this.originatingSystem = originatingSystem;
		this.originatingSystemId = originatingSystemId;
		this.passwordAdapter = passwordAdapter;
		this.preparer = preparer;
		this.requester = requester;
		this.headerUniqueName = headerUniqueName;
	}
}