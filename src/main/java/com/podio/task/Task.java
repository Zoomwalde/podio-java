package com.podio.task;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.podio.common.ReferenceType;
import com.podio.user.UserMini;

public class Task {

	/**
	 * The id of the task
	 */
	private int id;

	/**
	 * The status of the task
	 */
	private TaskStatus status;

	/**
	 * The text of the task
	 */
	private String text;

	/**
	 * True if the task is private, false otherwise
	 */
	private boolean priv;

	/**
	 * The due date of the task, if any
	 */
	private LocalDate dueDate;

	/**
	 * The user responsible for the task
	 */
	private UserMini responsible;

	/**
	 * The id of the space the task is on, if any
	 */
	private Integer spaceId;

	/**
	 * The link to the task
	 */
	private String link;

	/**
	 * The date and time the task was created
	 */
	private DateTime createdOn;

	/**
	 * The user who created the task
	 */
	private UserMini createdBy;

	/**
	 * The type of the reference, if any
	 */
	private ReferenceType referenceType;

	/**
	 * The id of the reference, if any
	 */
	private Integer referenceId;

	/**
	 * The title of the reference, if any
	 */
	private String referenceTitle;

	/**
	 * The direct link to the reference, if any
	 */
	private String referenceLink;

	@Override
	public String toString() {
		return "Task [id=" + id + ", status=" + status + ", text=" + text
				+ ", priv=" + priv + ", dueDate=" + dueDate + ", responsible="
				+ responsible + ", spaceId=" + spaceId + ", link=" + link
				+ ", createdOn=" + createdOn + ", createdBy=" + createdBy
				+ ", referenceType=" + referenceType + ", referenceId="
				+ referenceId + ", referenceTitle=" + referenceTitle
				+ ", referenceLink=" + referenceLink + "]";
	}

	@JsonProperty("task_id")
	public int getId() {
		return id;
	}

	@JsonProperty("task_id")
	public void setId(int id) {
		this.id = id;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("private")
	public boolean isPrivate() {
		return priv;
	}

	@JsonProperty("private")
	public void setPrivate(boolean priv) {
		this.priv = priv;
	}

	@JsonProperty("due_date")
	public LocalDate getDueDate() {
		return dueDate;
	}

	@JsonProperty("due_date")
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public UserMini getResponsible() {
		return responsible;
	}

	public void setResponsible(UserMini responsible) {
		this.responsible = responsible;
	}

	@JsonProperty("space_id")
	public Integer getSpaceId() {
		return spaceId;
	}

	@JsonProperty("space_id")
	public void setSpaceId(Integer spaceId) {
		this.spaceId = spaceId;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@JsonProperty("created_on")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	@JsonProperty("created_on")
	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	@JsonProperty("created_by")
	public UserMini getCreatedBy() {
		return createdBy;
	}

	@JsonProperty("created_by")
	public void setCreatedBy(UserMini createdBy) {
		this.createdBy = createdBy;
	}

	@JsonProperty("ref_type")
	public ReferenceType getReferenceType() {
		return referenceType;
	}

	@JsonProperty("ref_type")
	public void setReferenceType(ReferenceType refType) {
		this.referenceType = refType;
	}

	@JsonProperty("ref_id")
	public Integer getReferenceId() {
		return referenceId;
	}

	@JsonProperty("ref_id")
	public void setReferenceId(Integer refId) {
		this.referenceId = refId;
	}

	@JsonProperty("ref_title")
	public String getReferenceTitle() {
		return referenceTitle;
	}

	@JsonProperty("ref_title")
	public void setReferenceTitle(String refTitle) {
		this.referenceTitle = refTitle;
	}

	@JsonProperty("ref_link")
	public String getReferenceLink() {
		return referenceLink;
	}

	@JsonProperty("ref_link")
	public void setReferenceLink(String refLink) {
		this.referenceLink = refLink;
	}
}