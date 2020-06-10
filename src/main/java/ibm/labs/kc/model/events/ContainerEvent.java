package ibm.labs.kc.model.events;

import java.util.Date;

public class ContainerEvent<T> extends AbstractEvent {

	// those are the list of event types
	public static final String CONTAINER_ADDED = "ContainerAdded";
	public static final String CONTAINER_ON_MAINTENANCE = "ContainerOnMaintenance";
	public static final String CONTAINER_OFF_MAINTENANCE =  "ContainerOffMaintenance";
	public static final String CONTAINER_ORDER_ASSIGNED = "ContainerAssignedToOrder";
	public static final String CONTAINER_ANOMALY= "ContainerAnomaly";
	public static final String CONTAINER_ANOMALY_RETRY= "ContainerAnomalyRetry";
	public static final String CONTAINER_ANOMALY_DEAD= "ContainerAnomalyDead";
	
	protected String containerID;
	protected T payload;

	public ContainerEvent() {
		this.timestamp = (new Date()).getTime();
	}
	
	public ContainerEvent(String cid) {
		this.timestamp = (new Date()).getTime();
		this.containerID = cid;
	}
	
	public ContainerEvent(String cid,String type) {
		this.containerID = cid;
		this.type = type;
		this.timestamp = (new Date()).getTime();
	}
	
	
	public String getContainerID() {
		return containerID;
	}

	public void setContainerID(String containerID) {
		this.containerID = containerID;
	}

	@Override
	public T getPayload() {
		return this.payload;
	}

}