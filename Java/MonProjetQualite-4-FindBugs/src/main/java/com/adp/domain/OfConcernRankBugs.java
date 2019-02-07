package com.adp.domain;

/**
 * Of Concern Rank Bugs Sample
 */
public class OfConcernRankBugs {
	
	/** The place holder. */
	private String placeHolder = null;

	/**
	 * The Constructor.
	 */
	public OfConcernRankBugs() {
		this.placeHolder = "Test String";
	}
	
	/**
	 * Gets the place holder.
	 *
	 * @return the place holder
	 */
	private String getPlaceHolder(){
		return this.placeHolder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((placeHolder == null) ? 0 : placeHolder.hashCode());
		return result;
	}


	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		OfConcernRankBugs object = (OfConcernRankBugs) obj;
		return this.getPlaceHolder().equals(object.getPlaceHolder());
	}
	
	
}