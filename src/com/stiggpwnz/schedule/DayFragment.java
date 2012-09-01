package com.stiggpwnz.schedule;

import android.os.Bundle;
import android.view.View;

import com.actionbarsherlock.app.SherlockListFragment;

public class DayFragment extends SherlockListFragment {

	public static final String LESSON = "lesson";
	public static final String LESSONS = "lessons";

	public DayFragment() {

	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		String[] lessons = getArguments().getStringArray(LESSONS);
		int lesson = getArguments().getInt(LESSON, -1);
		LessonsAdapter adapter = new LessonsAdapter(getSherlockActivity(), lessons, lesson);
		setListAdapter(adapter);
	}

}