package com.github.barteksc.pdfviewer.model;

import java.util.ArrayList;

public class SearchRecord {
	public final int pageIdx;
	public  int currentPage=-1;
	public final int findStart;
	public ArrayList<SearchRecordItem> data;
	public SearchRecord(int pageIdx, int findStart) {
		this.pageIdx = pageIdx;
		this.findStart = findStart;
	}

	@Override
	public String toString() {
		return "SearchRecord{" +
				"pageIdx=" + pageIdx +
				", currentPage=" + currentPage +
				", findStart=" + findStart +
				", data=" + data +
				'}';
	}
}
